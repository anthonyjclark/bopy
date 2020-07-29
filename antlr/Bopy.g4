grammar Bopy;

program : statement+ EOF;

statement:
	(
		constInit
		| varInit
		| assignment
		| ifStmt
		| function
		| procedure
		| data
		|
	) NEWLINE;

type	: 'int' | 'flt' | 'str';
block	: INDENT statement+ DEDENT;

typedName : NAME ':' type;

constInit	: 'let' NAME '=' expression;
varInit		: 'var' NAME '=' expression;
assignment	: NAME '=' expression;

ifStmt : 'if' condition block;

function	: 'func' NAME parameters '->' type block;
procedure	: 'proc' NAME parameters ('->' type)? block;
parameters	: '(' (typedName (',' typedName)*)? ')';

data : 'data' NAME ('(' typedName (',' typedName)* ')');

condition	: 'true' | 'false';
expression	: NAME | INTEGER | FLOAT | STRING | call;

call		: NAME arguments;
arguments	: '(' (expression (',' expression)?) ')';

// ------------------------------------
// Lexing rules
// ------------------------------------
NAME : [a-zA-Z_]+ [a-zA-Z0-9_]*;

STRING : '"' (~'"' | '\\"')* '"';

FLOAT	: '-'? DIGITS ('.' ZERO* DIGITS EXP? | EXP);
INTEGER	: '-'? DIGITS;

fragment EXP	: [Ee] [+\-]? DIGITS;
fragment DIGITS	: ZERO | [1-9] [0-9]*;
fragment ZERO	: '0';

COMMENT : '#' ~'\n'* '\n' -> skip;

// Going with braces for demo purposes
// using whitespace in custom lexer/parser
INDENT	: '{';
DEDENT	: '}';

NEWLINE		: ('\r'? '\n')+;
WHITESPACE	: [ \t]+ -> skip;
