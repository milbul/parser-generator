import grammar.Grammar;
import grammar.TokenPattern;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TokenGenerator {
    private final Grammar grammar;
    private final String path;
    private final String SEP = System.lineSeparator();
    private final String TAB = "    ";
    private final String name;

    TokenGenerator(Grammar grammar) {
        this.grammar = grammar;
        this.path = "generated/" + grammar.getName();
        this.name = grammar.getName().substring(0, 1).toUpperCase() + grammar.getName().substring(1);
        generateFile();
    }

    private String writeEnum() {
        return String.format("""
                        package %s;
                                        
                        public enum %sToken {
                        %s
                        }
                        """,
                grammar.getName().toLowerCase(),
                name,
                writeTokens());
    }

    private String writeTokens() {
        StringBuilder sb = new StringBuilder();
        for (String token : grammar.getTokenPatternMap().keySet()) {
            sb.append(TAB).append(token).append(",").append(SEP);
        }
        for (TokenPattern token : grammar.getSkip()) {
            sb.append(TAB).append(token.getName()).append(",").append(SEP);
        }
        sb.append(TAB).append("END");
        return sb.toString();
    }

    private void generateFile() {
        try {
            Files.createDirectories(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(path + "/" + name + "Token.java"))) {
            writer.write(writeEnum());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}