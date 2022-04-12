package python;

import java.util.*;

public class PythonParser {

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

    private final PythonLexicalAnalyzer lexer;
    private Tree resTree;

    public PythonParser(PythonLexicalAnalyzer lexer) {
        this.lexer = lexer;
        lexer.nextToken();
    }

    public Tree parse() throws Exception {
        resTree = s();
        return resTree;
    }

    private void consume(PythonToken token) throws Exception {
        if (lexer.curToken() != token) {
            throw new Exception("Wrong token");
        }
    }

    public static class NodeS extends Tree {
        NodeS() {
           super("S");
        }
    }

    private NodeS s() throws Exception {
        NodeS res = new NodeS();

        switch (lexer.curToken()) {
            case NOT:
            case LEFT_BRACKET:
            case VAR:
            {
                NodeK x0 = k();
                res.addChild(x0);
                
                NodeSP x1 = sp();
                res.addChild(x1);
                
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeKP extends Tree {
        NodeKP() {
           super("KP");
        }
    }

    private NodeKP kp() throws Exception {
        NodeKP res = new NodeKP();

        switch (lexer.curToken()) {
            case AND:
            {
                consume(PythonToken.AND);
                res.addChild(new Tree("AND"));
                
                lexer.nextToken();
                NodeE x0 = e();
                res.addChild(x0);
                
                NodeKP x1 = kp();
                res.addChild(x1);
                
                return res;
            }
            case RIGHT_BRACKET:
            case OR:
            case XOR:
            case END:
            {
                
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeE extends Tree {
        NodeE() {
           super("E");
        }
    }

    private NodeE e() throws Exception {
        NodeE res = new NodeE();

        switch (lexer.curToken()) {
            case NOT:
            {
                consume(PythonToken.NOT);
                res.addChild(new Tree("NOT"));
                
                lexer.nextToken();
                NodeE x0 = e();
                res.addChild(x0);
                
                return res;
            }
            case LEFT_BRACKET:
            {
                consume(PythonToken.LEFT_BRACKET);
                res.addChild(new Tree("LEFT_BRACKET"));
                
                lexer.nextToken();
                NodeS x0 = s();
                res.addChild(x0);
                
                consume(PythonToken.RIGHT_BRACKET);
                res.addChild(new Tree("RIGHT_BRACKET"));
                
                lexer.nextToken();
                return res;
            }
            case VAR:
            {
                consume(PythonToken.VAR);
                res.addChild(new Tree("VAR"));
                
                lexer.nextToken();
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeK extends Tree {
        NodeK() {
           super("K");
        }
    }

    private NodeK k() throws Exception {
        NodeK res = new NodeK();

        switch (lexer.curToken()) {
            case NOT:
            case LEFT_BRACKET:
            case VAR:
            {
                NodeE x0 = e();
                res.addChild(x0);
                
                NodeKP x1 = kp();
                res.addChild(x1);
                
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeSP extends Tree {
        NodeSP() {
           super("SP");
        }
    }

    private NodeSP sp() throws Exception {
        NodeSP res = new NodeSP();

        switch (lexer.curToken()) {
            case OR:
            {
                consume(PythonToken.OR);
                res.addChild(new Tree("OR"));
                
                lexer.nextToken();
                NodeK x0 = k();
                res.addChild(x0);
                
                NodeSP x1 = sp();
                res.addChild(x1);
                
                return res;
            }
            case XOR:
            {
                consume(PythonToken.XOR);
                res.addChild(new Tree("XOR"));
                
                lexer.nextToken();
                NodeK x0 = k();
                res.addChild(x0);
                
                NodeSP x1 = sp();
                res.addChild(x1);
                
                return res;
            }
            case RIGHT_BRACKET:
            case END:
            {
                
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
}