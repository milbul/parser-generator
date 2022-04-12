import grammar.Grammar;
import grammar.NonTerminal;
import grammar.Rule;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Set;

public class ParserGenerator {
    private final Grammar grammar;
    private final String path;
    private final String TAB = "    ";
    private final String SEP = System.lineSeparator();
    private final String name;

    ParserGenerator(Grammar grammar) {
        this.grammar = grammar;
        this.path = "generated/" + grammar.getName().toLowerCase();
        this.name = grammar.getName().substring(0, 1).toUpperCase() + grammar.getName().substring(1);
        generateFile();
    }

    private String writeHeader() {
        return String.format("""
                        package %s;
                                        
                        %s
                                        
                        """,
                grammar.getName().toLowerCase(),
                String.join(SEP, grammar.getHeader()));
    }

    private String writeTreeClass() {
        return """
                    
                    public static class Tree {
                        private final String node;
                        private final List<Tree> children;

                        public Tree(String node) {
                            this.node = node;
                            this.children = new ArrayList<>();
                        }
                    
                        public void addChild(Tree node) {
                            children.add(node);
                        }

                        public String getNode() {
                            return node;
                        }

                        public List<Tree> getChildren() {
                            return children;
                        }
                    }
                    
                """;
    }

    private String writeFuncs() {
        return String.format("""
                            private final %sLexicalAnalyzer lexer;
                            private Tree resTree;
                                        
                            public %sParser(%sLexicalAnalyzer lexer) {
                                this.lexer = lexer;
                                lexer.nextToken();
                            }
                            
                            public Tree parse() throws Exception {
                                resTree = %s();
                                return resTree;
                            }
                                
                            private void consume(%sToken token) throws Exception {
                                if (lexer.curToken() != token) {
                                    throw new Exception("Wrong token");
                                }
                            }
                            
                        """,
                name,
                name,
                name,
                grammar.getStart().toLowerCase(),
                name);
    }

    private String writeState(NonTerminal nt) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("""
                            public static class Node%s extends Tree {
                                Node%s() {
                                   super("%s");
                                }
                        """,
                nt.getName().toUpperCase(),
                nt.getName().toUpperCase(),
                nt.getName().toUpperCase()
        ));
        for (String r : nt.getReturns()) {
            sb.append(TAB.repeat(2)).append("private ").append(r).append(";").append(SEP);
        }
        sb.append(TAB.repeat(1)).append("}").append(SEP);

        sb.append(String.format("""
                            
                            private Node%s %s(%s) throws Exception {
                                Node%s res = new Node%s();
                                
                                switch (lexer.curToken()) {
                        %s
                                    default:
                                        throw new Exception("Wrong token");
                                }
                            }
                        """,
                nt.getName().toUpperCase(),
                nt.getName().toLowerCase(),
                writeParams(nt),
                nt.getName().toUpperCase(),
                nt.getName().toUpperCase(),
                writeRules(nt)));
        return sb.toString();
    }

    private String writeParams(NonTerminal nt) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nt.getParams().size(); i++) {
            sb.append(nt.getParams().get(i));
            if (i != nt.getParams().size() - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    private String writeRules(NonTerminal nt) {
        StringBuilder sb = new StringBuilder();
        for (Rule rule : nt.getRules()) {
            Set<String> first = grammar.rightPartFirst(rule);
            for (String s : rule.getStates()) {
                if (grammar.getTokenPatternMap().containsKey(s)) {
                    first.add(s);
                    break;
                } else if (grammar.getNonTerminals().containsKey(s)) {
                    first.addAll(grammar.getNonTerminals().get(s).getFirst());
                    if (!first.contains("EPS")) {
                        break;
                    }
                } else if (s.equals("EPS")) {
                    first.add("EPS");
                }
            }

            if (first.contains("EPS")) {
                sb.append(writeFollow(nt, rule));
                first.remove("EPS");
            }

            if (first.isEmpty()) {
                return sb.toString();
            }

            for (String f : first) {
                sb.append(TAB.repeat(3)).append("case ").append(f).append(":").append(SEP);
            }
            sb.append(TAB.repeat(3)).append("{").append(SEP);

            int cur = 0;
            for (int i = 0; i < rule.getStates().size(); i++) {
                String s = rule.getStates().get(i);
                if (grammar.getNonTerminals().containsKey(s)) {
                    sb.append(String.format("""
                                                    Node%s x%s = %s(%s);
                                                    res.addChild(x%s);
                                                    %s
                                    """,
                            s.toUpperCase(),
                            cur,
                            s.toLowerCase(),
                            rule.getParams().get(i),
                            cur,
                            rule.getCode().get(i)));
                    cur++;
                } else if (grammar.getTokenPatternMap().containsKey(s)) {
                    sb.append(String.format("""
                                                    consume(%sToken.%s);
                                                    res.addChild(new Tree("%s"));
                                                    %s
                                                    lexer.nextToken();
                                    """,
                            name,
                            s,
                            s,
                            rule.getCode().get(i)));
                }
            }
            sb.append(TAB.repeat(4)).append("return res;").append(SEP).append(TAB.repeat(3)).append("}").append(SEP);
        }
        return sb.toString();
    }

    private String writeFollow(NonTerminal nt, Rule r) {
        StringBuilder sb = new StringBuilder();
        for (String f : nt.getFollow()) {
            sb.append(TAB.repeat(3)).append("case ").append(f).append(":").append(SEP);
        }
        sb.append(String.format("""
                                    {
                                        %s
                                        return res;
                                    }
                        """,
                r.getCode().get(0)));
        return sb.toString();
    }

    private String writeResValues() {
        StringBuilder sb = new StringBuilder();
        NonTerminal start = grammar.getNonTerminals().get(grammar.getStart());
        for (String s : start.getReturns()) {
            sb.append(String.format("""
                                                
                                public %s get%s() {
                                    return ((Node%s)resTree).%s;
                                }
                               
                            """,
                    s.split(" ")[0],
                    s.split(" ")[1],
                    grammar.getStart().toUpperCase(),
                    s.split(" ")[1]
            ));
        }
        return sb.toString();
    }

    private void generateFile() {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(path + "/" + name + "Parser.java"))) {
            writer.write(writeHeader());
            writer.write("public class " + name + "Parser {\n");
            writer.write(writeTreeClass());
            writer.write(writeFuncs());
            for (NonTerminal nt : grammar.getNonTerminals().values()) {
                writer.write(writeState(nt));
            }
            writer.write(writeResValues());
            writer.write("}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
