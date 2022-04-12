package grammar;

public class TokenPattern {
    private final String name;
    private final String pattern;

    TokenPattern(String name, String pattern) {
        this.name = name;
        this.pattern = pattern;
    }

    public String getName() {
        return name;
    }

    public String getPattern() {
        return pattern;
    }
}
