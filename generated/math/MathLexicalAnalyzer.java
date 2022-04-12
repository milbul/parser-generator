package math;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.List;

public class MathLexicalAnalyzer {
    private final String text;
    private int start, end;
    private MathToken curToken;
    private final List<TokenPattern> tokens = List.of(
            new TokenPattern(MathToken.PLUS, "\\+"),
            new TokenPattern(MathToken.MINUS, "-"),
            new TokenPattern(MathToken.DIV, "/"),
            new TokenPattern(MathToken.POW, "\\*\\*"),
            new TokenPattern(MathToken.MUL, "\\*"),
            new TokenPattern(MathToken.LEFT_BRACKET, "\\("),
            new TokenPattern(MathToken.RIGHT_BRACKET, "\\)"),
            new TokenPattern(MathToken.NUM, "[0-9]+"));

    private final List<TokenPattern> skipTokens = List.of(
            new TokenPattern(MathToken.WS, "[ \n\r]+"));

    public MathLexicalAnalyzer(String text) {
        this.text = text;
        start = 0;
        end = 0;
    }

    public MathToken curToken() {
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
        curToken = MathToken.END;
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
        MathToken token;
        Pattern pattern;

        TokenPattern(MathToken token, String pattern) {
            this.token = token;
            this.pattern = Pattern.compile(pattern);
        }
    }
}

