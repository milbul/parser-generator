grammar GrammarForGrammar;

@header {
import grammar.*;
}

input returns [Grammar gr]
@init {
    $gr = new Grammar();
}
    : input_[$gr] EOF;

input_[Grammar gr] : name[$gr] importBlock[$gr]*  token[$gr]* startNonTerm[$gr] nonTerm[$gr]* ;

name[Grammar gr] : 'grammar' ID ';' {
    $gr.addName($ID.text);
};

importBlock[Grammar gr]
    : '!i' REGEX {$gr.addHeader($REGEX.text.substring(1, $REGEX.text.length() - 1));} ';';

token[Grammar gr] : '!t' tokenBlock[$gr] ;

tokenBlock[Grammar gr] locals [boolean skip]
@init {
    $skip = false;
}
    : ID '=' REGEX ('->' 'skip' {$skip = true;})? ';' {
        if ($skip) {
            $gr.addSkipToken($ID.text, $REGEX.text);
        } else {
            $gr.addToken($ID.text, $REGEX.text);
        }
    };


 startNonTerm[Grammar gr] : '!s' ID ';' {
     $gr.addStart($ID.text);
 };

nonTerm[Grammar gr] : '!nt' nonTermBlock {$gr.addNonTerminal($nonTermBlock.nt);};

nonTermBlock returns [NonTerminal nt]
@init {
    $nt = new NonTerminal();
}
    : ID {$nt.addName($ID.text);}
    ('[' inherited[$nt] ']')?
    ('returns' '[' synthesized[$nt] ']')?
    ':' a=ruleBlock {$nt.addRule($a.r);}
    ('|' b=ruleBlock {$nt.addRule($b.r);})* ';';

inherited[NonTerminal nt]
    : t1=ID n1=ID {$nt.addParam($t1.text, $n1.text);}
    (',' t2=ID n2=ID {$nt.addParam($t2.text, $n2.text);})* ;

synthesized[NonTerminal nt]
    : t1=ID n1=ID {$nt.addReturn($t1.text, $n1.text);}
    (',' t2=ID n2=ID {$nt.addReturn($t2.text, $n2.text);})* ;

ruleBlock returns [Rule r] locals [StringBuilder params, StringBuilder lines]
@init {
    $r = new Rule();
    $params = new StringBuilder();
    $lines = new StringBuilder();
}
    : (ID (ruleInherited[$params])? (codeLine[$lines])?
    {$r.addState($ID.text, $params.toString(), $lines.toString());
    $params = new StringBuilder();
    $lines = new StringBuilder();})+;

ruleInherited[StringBuilder sb]
    : '[' n1=ID {$sb.append($n1.text);}
    (',' n2=ID {$sb.append(", ").append($n2.text);})* ']';

codeLine[StringBuilder s] : CODE {
    s.append($CODE.text.substring(1, $CODE.text.length() - 1));
} ;

ID : [a-zA-Z][a-zA-Z0-9_<>.]* ;
CODE : '{' .*? '}' ;
REGEX : '"' .*? '"' ;
WS : [ \t\n\r]+ -> skip ;