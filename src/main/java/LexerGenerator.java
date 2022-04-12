import grammar.Grammar;
import grammar.TokenPattern;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LexerGenerator {
    private final Grammar grammar;
    private final String path;
    private final String name;
    private final String SEP = System.lineSeparator();
    String TAB = "    ";

    LexerGenerator(Grammar grammar) {
        this.grammar = grammar;
        this.path = "generated/" + grammar.getName().toLowerCase();
        this.name = grammar.getName().substring(0, 1).toUpperCase() + grammar.getName().substring(1);
        generateFile();
    }

    private String writeClass() {
        return String.format("""
                        package %s;
                                        
                        import java.util.regex.Matcher;
                        import java.util.regex.Pattern;
                        import java.util.List;

                        public class %sLexicalAnalyzer {
                            private final String text;
                            private int start, end;
                            private %sToken curToken;
                            private final List<TokenPattern> tokens = List.of(
                        %s
                            private final List<TokenPattern> skipTokens = List.of(
                        %s
                            public %sLexicalAnalyzer(String text) {
                                this.text = text;
                                start = 0;
                                end = 0;
                            }

                            public %sToken curToken() {
                                return curToken;
                            }

                            public String getStringToken() {
                                return text.substring(start, end);
                            }

                            public void nextToken() {
                                while(skip());
                                for (TokenPattern s : tokens) {
                                    Matcher matcher = s.pattern.matcher(text.substring(end));
                                    if (matcher.lookingAt()) {
                                        start = end;
                                        end += matcher.end();
                                        curToken = s.token;
                                        return;
                                    }
                                }
                                if (end != text.length()) {
                                    throw new Error("Wrong token");
                                }
                                curToken = %sToken.END;
                            }

                            private boolean skip() {
                                for (TokenPattern s : skipTokens) {
                                    Matcher matcher = s.pattern.matcher(text.substring(end));
                                    if (matcher.lookingAt()) {
                                        start = end;
                                        end += matcher.end();
                                        return true;
                                    }
                                }
                                return false;
                            }

                            private static class TokenPattern {
                                %sToken token;
                                Pattern pattern;

                                TokenPattern(%sToken token, String pattern) {
                                    this.token = token;
                                    this.pattern = Pattern.compile(pattern);
                                }
                            }
                        }

                        """,
                grammar.getName().toLowerCase(),
                name,
                name,
                writeTokensList(),
                writeSkipList(),
                name,
                name,
                name,
                name,
                name);
    }

    private String writeTokensList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grammar.getTokens().size(); i++) {
            TokenPattern t = grammar.getTokens().get(i);
            sb.append(TAB.repeat(3)).append("new TokenPattern(").append(name).append("Token.").append(t.getName()).append(", ").append(t.getPattern()).append(")");
            if (i != grammar.getTokens().size() - 1) {
                sb.append(",");
            } else {
                sb.append(");");
            }
            sb.append(SEP);
        }
        return sb.toString();
    }

    private String writeSkipList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grammar.getSkip().size(); i++) {
            TokenPattern t = grammar.getSkip().get(i);
            sb.append(TAB.repeat(3)).append("new TokenPattern(").append(name).append("Token.").append(t.getName()).append(", ").append(t.getPattern()).append(")");
            if (i != grammar.getSkip().size() - 1) {
                sb.append(",");
            } else {
                sb.append(");");
            }
            sb.append(SEP);
        }
        return sb.toString();
    }

    private void generateFile() {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(path + "/" + name + "LexicalAnalyzer.java"))) {
            writer.write(writeClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
