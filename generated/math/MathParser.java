package math;

import java.util.*;

public class MathParser {

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

    private final MathLexicalAnalyzer lexer;
    private Tree resTree;

    public MathParser(MathLexicalAnalyzer lexer) {
        this.lexer = lexer;
        lexer.nextToken();
    }

    public Tree parse() throws Exception {
        resTree = e();
        return resTree;
    }

    private void consume(MathToken token) throws Exception {
        if (lexer.curToken() != token) {
            throw new Exception("Wrong token");
        }
    }

    public static class NodeP extends Tree {
        NodeP() {
           super("P");
        }
        private int val;
    }

    private NodeP p() throws Exception {
        NodeP res = new NodeP();

        switch (lexer.curToken()) {
            case LEFT_BRACKET:
            case NUM:
            case MINUS:
            {
                NodeF x0 = f();
                res.addChild(x0);
                
                NodePS x1 = ps(x0.val);
                res.addChild(x1);
                res.val = x1.val;
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodePS extends Tree {
        NodePS() {
           super("PS");
        }
        private int val;
    }

    private NodePS ps(int acc) throws Exception {
        NodePS res = new NodePS();

        switch (lexer.curToken()) {
            case POW:
            {
                consume(MathToken.POW);
                res.addChild(new Tree("POW"));
                
                lexer.nextToken();
                NodeP x0 = p();
                res.addChild(x0);
                res.val = (int) Math.pow(acc, x0.val);
                return res;
            }
            case DIV:
            case RIGHT_BRACKET:
            case MUL:
            case END:
            case PLUS:
            case MINUS:
            {
                res.val = acc;
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeT extends Tree {
        NodeT() {
           super("T");
        }
        private int val;
    }

    private NodeT t() throws Exception {
        NodeT res = new NodeT();

        switch (lexer.curToken()) {
            case LEFT_BRACKET:
            case NUM:
            case MINUS:
            {
                NodeP x0 = p();
                res.addChild(x0);
                
                NodeTS x1 = ts(x0.val);
                res.addChild(x1);
                res.val = x1.val;
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
        private int val;
    }

    private NodeE e() throws Exception {
        NodeE res = new NodeE();

        switch (lexer.curToken()) {
            case LEFT_BRACKET:
            case NUM:
            case MINUS:
            {
                NodeT x0 = t();
                res.addChild(x0);
                
                NodeES x1 = es(x0.val);
                res.addChild(x1);
                res.val = x1.val;
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeF extends Tree {
        NodeF() {
           super("F");
        }
        private int val;
    }

    private NodeF f() throws Exception {
        NodeF res = new NodeF();

        switch (lexer.curToken()) {
            case NUM:
            {
                consume(MathToken.NUM);
                res.addChild(new Tree("NUM"));
                res.val = Integer.parseInt(lexer.getStringToken());
                lexer.nextToken();
                return res;
            }
            case MINUS:
            {
                consume(MathToken.MINUS);
                res.addChild(new Tree("MINUS"));
                
                lexer.nextToken();
                NodeF x0 = f();
                res.addChild(x0);
                res.val = -x0.val;
                return res;
            }
            case LEFT_BRACKET:
            {
                consume(MathToken.LEFT_BRACKET);
                res.addChild(new Tree("LEFT_BRACKET"));
                
                lexer.nextToken();
                NodeE x0 = e();
                res.addChild(x0);
                res.val = x0.val;
                consume(MathToken.RIGHT_BRACKET);
                res.addChild(new Tree("RIGHT_BRACKET"));
                
                lexer.nextToken();
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeES extends Tree {
        NodeES() {
           super("ES");
        }
        private int val;
    }

    private NodeES es(int acc) throws Exception {
        NodeES res = new NodeES();

        switch (lexer.curToken()) {
            case PLUS:
            {
                consume(MathToken.PLUS);
                res.addChild(new Tree("PLUS"));
                
                lexer.nextToken();
                NodeT x0 = t();
                res.addChild(x0);
                res.val = acc + x0.val;
                NodeES x1 = es(res.val);
                res.addChild(x1);
                res.val = x1.val;
                return res;
            }
            case MINUS:
            {
                consume(MathToken.MINUS);
                res.addChild(new Tree("MINUS"));
                
                lexer.nextToken();
                NodeT x0 = t();
                res.addChild(x0);
                res.val = acc - x0.val;
                NodeES x1 = es(res.val);
                res.addChild(x1);
                res.val = x1.val;
                return res;
            }
            case RIGHT_BRACKET:
            case END:
            {
                res.val = acc;
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }
    public static class NodeTS extends Tree {
        NodeTS() {
           super("TS");
        }
        private int val;
    }

    private NodeTS ts(int acc) throws Exception {
        NodeTS res = new NodeTS();

        switch (lexer.curToken()) {
            case MUL:
            {
                consume(MathToken.MUL);
                res.addChild(new Tree("MUL"));
                
                lexer.nextToken();
                NodeP x0 = p();
                res.addChild(x0);
                res.val = acc * x0.val;
                NodeTS x1 = ts(res.val);
                res.addChild(x1);
                res.val = x1.val;
                return res;
            }
            case DIV:
            {
                consume(MathToken.DIV);
                res.addChild(new Tree("DIV"));
                
                lexer.nextToken();
                NodeP x0 = p();
                res.addChild(x0);
                res.val = acc / x0.val;
                NodeTS x1 = ts(res.val);
                res.addChild(x1);
                res.val = x1.val;
                return res;
            }
            case RIGHT_BRACKET:
            case END:
            case PLUS:
            case MINUS:
            {
                res.val = acc;
                return res;
            }

            default:
                throw new Exception("Wrong token");
        }
    }

    public int getval() {
        return ((NodeE)resTree).val;
    }

}