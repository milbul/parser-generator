import grammar.Grammar;
import math.MathLexicalAnalyzer;
import math.MathParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        firstTask();
    }

    private static int ind = 0;

    public static void firstTask() {
        try {
            generateFiles("math.txt");
            String expr = "-2 + 2 ** 2 ** 3 * 4";
            MathLexicalAnalyzer lex = new MathLexicalAnalyzer(expr);
            MathParser parser = new MathParser(lex);
            MathParser.Tree t = parser.parse();
            System.out.println(parser.getval());
            ind = 0;
            createDot(t, new File("graphMath.dot"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void generateFiles(String file) {
        try {
            GrammarForGrammarLexer lexer = new GrammarForGrammarLexer(CharStreams.fromFileName(file));
            TokenStream tokenStream = new CommonTokenStream(lexer);
            GrammarForGrammarParser parser = new GrammarForGrammarParser(tokenStream);
            Grammar grammar = parser.input().gr;
            try {
                grammar.constructFirstFollowAndCheck();
            } catch (Exception e) {
                e.printStackTrace();
            }
            new ParserGenerator(grammar);
            new TokenGenerator(grammar);
            new LexerGenerator(grammar);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createDot(MathParser.Tree tree, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("digraph {\n");
            StringBuilder ans = new StringBuilder();
            dfs(tree, 0, ans);
            writer.write(ans + "}");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dfs(MathParser.Tree tree, int v, StringBuilder ans) {
        ans.append("\t").append(v).append(" [label = \"").append(tree.getNode()).append("\"]\n");
        if (tree.getChildren().isEmpty()) {
            ans.append("\t[color = \"violetred4\"]\n");
        }
        for (MathParser.Tree child : tree.getChildren()) {
            ind++;
            ans.append("\t").append(v).append(" -> ").append(ind).append("\n");
            dfs(child, ind, ans);
        }
    }
}
