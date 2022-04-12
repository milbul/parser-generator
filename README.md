# Parser Generator

Generates parsers from LL1 input grammar. Inherited and synthesized attributes are supported.

Grammar example:

```
grammar Math;

!i "import java.util.*;";

!t PLUS = "\\+";
!t MINUS = "-";
!t DIV = "/";
!t POW = "\\*\\*";
!t MUL = "\\*";
!t LEFT_BRACKET = "\\(";
!t RIGHT_BRACKET = "\\)";
!t NUM = "[0-9]+";
!t WS = "[ \n\r]+" -> skip;

!s E;

!nt E returns [int val] : T ES[x0.val] {res.val = x1.val;};

!nt ES [int acc] returns [int val]
    : PLUS T {res.val = acc + x0.val;} ES[res.val] {res.val = x1.val;}
    | MINUS T {res.val = acc - x0.val;} ES[res.val] {res.val = x1.val;}
    | EPS {res.val = acc;};

!nt T returns [int val] : P TS[x0.val] {res.val = x1.val;};

!nt P returns [int val] : F PS[x0.val] {res.val = x1.val;};

!nt PS[int acc] returns [int val]
    : POW P {res.val = (int) Math.pow(acc, x0.val);}
    | EPS {res.val = acc;};

!nt TS [int acc] returns [int val]
    : MUL P {res.val = acc * x0.val;} TS[res.val] {res.val = x1.val;}
    | DIV P {res.val = acc / x0.val;} TS[res.val] {res.val = x1.val;}
    | EPS {res.val = acc;};

!nt F returns [int val]
    : NUM {res.val = Integer.parseInt(lexer.getStringToken());}
    | MINUS F {res.val = -x0.val;}
    | LEFT_BRACKET E {res.val = x0.val;} RIGHT_BRACKET;
```