package grammar;

import java.util.*;

public class Grammar {
    private String name;
    private String start;
    private final List<String> header = new ArrayList<>();
    private final Map<String, TokenPattern> tokenPatternMap = new HashMap<>();
    private final List<TokenPattern> skip = new ArrayList<>();
    private final List<TokenPattern> tokens = new ArrayList<>();
    private final Map<String, NonTerminal> nonTerminals = new HashMap<>();


    public void addName(String name) {
        this.name = name;
    }

    public void addStart(String start) {
        this.start = start;
    }

    public void addHeader(String s) {
        header.add(s);
    }

    public void addToken(String token, String pattern) {
        tokens.add(new TokenPattern(token, pattern));
        tokenPatternMap.put(token, new TokenPattern(token, pattern));
    }

    public void addSkipToken(String token, String pattern) {
        skip.add(new TokenPattern(token, pattern));
    }

    public void addNonTerminal(NonTerminal s) {
        nonTerminals.put(s.getName(), s);
    }

    public void constructFirstFollowAndCheck() throws Exception {
        constructFirst();
        constructFollow();
        checkLL1();
    }

    private void constructFirst() {
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTerminal nt : nonTerminals.values()) {
                for (Rule rule : nt.getRules()) {
                    for (String s : rule.getStates()) {
                        if (s.equals("EPS")) {
                            changed |= nt.addFirst(s);
                        } else if (tokenPatternMap.containsKey(s)) {
                            changed |= nt.addFirst(s);
                            break;
                        } else if (nonTerminals.containsKey(s)) {
                            NonTerminal curNt = nonTerminals.get(s);
                            changed |= nt.addFirst(curNt.getFirst());
                            if (!curNt.hasEps()) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }

    private void constructFollow() {
        NonTerminal startNt = nonTerminals.get(start);
        startNt.addFollow("END");
        boolean changed = true;
        while (changed) {
            changed = false;
            for (NonTerminal nt : nonTerminals.values()) {
                for (Rule rule : nt.getRules()) {
                    for (int i = 0; i < rule.getStates().size(); i++) {
                        if (!nonTerminals.containsKey(rule.getStates().get(i))) {
                            continue;
                        }
                        Set<String> rightFirst = new HashSet<>();
                        if (i == rule.getStates().size() - 1) {
                            rightFirst.add("EPS");
                        }
                        for (int j = i + 1; j < rule.getStates().size(); j++) {
                            String rightS = rule.getStates().get(j);
                            if (tokenPatternMap.containsKey(rightS)) {
                                rightFirst.add(rightS);
                                break;
                            } else if (nonTerminals.containsKey(rightS)) {
                                NonTerminal curNt = nonTerminals.get(rightS);
                                rightFirst.addAll(curNt.getFirst());
                                if (!curNt.hasEps()) {
                                    break;
                                }
                            } else if (rightS.equals("EPS")) {
                                rightFirst.add("EPS");
                            }
                        }

                        NonTerminal curNt = nonTerminals.get(rule.getStates().get(i));

                        for (String f : rightFirst) {
                            if (!f.equals("EPS")) {
                                changed |= curNt.addFollow(f);
                            }
                        }

                        if (rightFirst.contains("EPS")) {
                            changed |= curNt.addFollow(nt.getFollow());
                        }
                    }
                }
            }
        }
    }

    public Set<String> rightPartFirst(Rule rule) {
        Set<String> first = new HashSet<>();
        for (String s: rule.getStates()) {
            if (tokenPatternMap.containsKey(s)) {
                first.add(s);
                break;
            } else if (nonTerminals.containsKey(s)) {
                NonTerminal nt = nonTerminals.get(s);
                first.addAll(nt.getFirst());
                if (!nt.hasEps()) {
                    break;
                }
            } else if (s.equals("EPS")) {
                first.add("EPS");
            }
        }
        return first;
    }


    void checkLL1() throws Exception {
        for (NonTerminal nt: nonTerminals.values()) {
            Set<String> allFirst = new HashSet<>();
            for (Rule r: nt.getRules()) {
                Set<String> curFirst = rightPartFirst(r);
                int sz = allFirst.size();
                allFirst.addAll(curFirst);
                if (sz + curFirst.size() != allFirst.size()) {
                    throw new Exception("Grammar is not LL1");
                }
            }
            if (allFirst.contains("EPS")) {
                Set<String> follow = nt.getFollow();
                for (Rule r: nt.getRules()) {
                    Set<String> curFirst = rightPartFirst(r);
                    if (!curFirst.contains("EPS")) {
                        for (String s: curFirst) {
                            if (follow.contains(s)) {
                                throw new Exception("Grammar is not LL1");
                            }
                        }
                    }
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getStart() {
        return start;
    }

    public List<String> getHeader() {
        return header;
    }

    public Map<String, TokenPattern> getTokenPatternMap() {
        return tokenPatternMap;
    }

    public List<TokenPattern> getSkip() {
        return skip;
    }

    public List<TokenPattern> getTokens() {
        return tokens;
    }

    public Map<String, NonTerminal> getNonTerminals() {
        return nonTerminals;
    }
}
