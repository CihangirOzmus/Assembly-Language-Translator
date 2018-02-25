grammar ExprGrammarFile;

//input syntax is defined
//must include one of the below defined in stm
stm: 'begin' opt_stmts 'end' 	#beginend
    |  ID ':=' expr 		    #assign
	| 'print' expr 				#print
	| 'if' expr 'then' stm 		#ifthen
	| 'while' expr 'do' stm 	#whiledo
	;

opt_stmts : stm_list
          ;

//endline is defined
stm_list : stm ';' stm_list
         | stm
         ;

//details of aritmetic operations are defined
// #operation is used to define visitor methods separetely
expr: expr op = MUL expr 		#mul
	| expr op = DIV expr 		#div
	| expr op = MOD expr 		#mod
	| expr op = ADD expr 		#add
	| expr op = SUB expr 		#sub
	| NUM 						#int
	| ID 						#id
	| '(' expr ')' 				#parens
	;

MUL : '*' ;
DIV : '/' ;
MOD : 'mod' ;
ADD : '+' ;
SUB : '-' ;

//token alternatives are define with skipping whitespaces, newline and carriage return
ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
NUM : [0-9]+ ;
WS : (' ' | '\t' | '\r' | '\n' )+ -> skip ;

