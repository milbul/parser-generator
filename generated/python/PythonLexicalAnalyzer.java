package python;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class PythonLexicalAnalyzer {
    private final String text;
    private int start, end;
    private PythonToken curToken;
    private final List<TokenPattern> tokens = List.of(
            new TokenPattern(PythonToken.LEFT_BRACKET, "\\("),
            new TokenPattern(PythonToken.RIGHT_BRACKET, "\\)"),
            new TokenPattern(PythonToken.AND, "and"),
            new TokenPattern(PythonToken.OR, "or"),
            new TokenPattern(PythonToken.XOR, "xor"),
            new TokenPattern(PythonToken.NOT, "not"),
            new TokenPattern(PythonToken.VAR, "[a-z]"));

    private final List<TokenPattern> skipTokens = List.of(
            new TokenPattern(PythonToken.WS, "[ \n\r]+"));

    public PythonLexicalAnalyzer(String text) {
        this.text = text;
        start = 0;
        end = 0;
    }

    public PythonToken curToken() {
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
        curToken = PythonToken.END;
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
        PythonToken token;
        Pattern pattern;

        TokenPattern(PythonToken token, String pattern) {
            this.token = token;
            this.pattern = Pattern.compile(pattern);
        }
    }
}

