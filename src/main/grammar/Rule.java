package grammar;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private final List<String> states = new ArrayList<>();
    private final List<String> params = new ArrayList<>();
    private final List<String> code = new ArrayList<>();

    public void addState(String st, String param, String lines) {
        states.add(st);
        params.add(param);
        code.add(lines);
    }

    public List<String> getStates() {
        return states;
    }

    public List<String> getParams() {
        return params;
    }

    public List<String> getCode() {
        return code;
    }
}
