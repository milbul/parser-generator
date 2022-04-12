package grammar;

import java.util.*;

public class NonTerminal {
    private String name;
    private final List<Rule> rules = new ArrayList<>();
    private final Set<String> first = new HashSet<>();
    private final Set<String> follow = new HashSet<>();
    private final List<String> params = new ArrayList<>();
    private final List<String> returns = new ArrayList<>();
    private boolean hasEps = false;

    public void addName(String name) {
        this.name = name;
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public boolean addFirst(String s) {
        hasEps |= s.equals("EPS");
        return first.add(s);
    }

    public boolean addFirst(Set<String> s) {
        hasEps |= s.contains("EPS");
        return first.addAll(s);
    }

    public boolean addFollow(String s) {
        return follow.add(s);
    }

    public boolean addFollow(Set<String> s) {
        return follow.addAll(s);
    }

    public void addParam(String type, String s) {
        params.add(type + " " + s);
    }

    public void addReturn(String type, String s) {
        returns.add(type + " " + s);
    }

    public String getName() {
        return name;
    }

    public List<Rule> getRules() {
        return rules;
    }

    public Set<String> getFirst() {
        return first;
    }

    public Set<String> getFollow() {
        return follow;
    }

    public List<String> getParams() {
        return params;
    }

    public List<String> getReturns() {
        return returns;
    }

    public boolean hasEps() {
        return hasEps;
    }
}
