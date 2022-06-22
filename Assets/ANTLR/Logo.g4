grammar Logo;

@members {
	// using UnityEngine;
 	// using System.Collections;
	public Scheduler scheduler = new Scheduler();
	// public TurtleControl controller = GameObject.Find("Turtle").GetComponent<TurtleControl>();
}

int_type: (DIGIT)+;
float_type: int_type DOT int_type;
string_type: QUOTE (LETTER | DIGIT)* QUOTE;
identifier: LETTER (LETTER)*;

operand: (OPER_ADD | OPER_SUB | OPER_MUL | OPER_DIV);
comparator_gen: (
		COMP_EQ
		| COMP_NE
		| COMP_L
		| COMP_LE
		| COMP_G
		| COMP_GE
		| COMP_NE
	);

num_val: (int_type | float_type);

operation_gen: num_val operand num_val;
value_gen: (
		num_val
		| identifier list_acc
		| identifier DOT
		| num_val operand num_val
	);
list_acc: SQB_L value_gen SQB_R;
cond: value_gen comparator_gen value_gen;

list_type:
	SQB_L (value_gen | list_type) (COMMA (value_gen | list_type))* SQB_R;
move_keyword: (MOVE_FD | MOVE_BK | MOVE_LT | MOVE_RT);
move_command:
	move_keyword value_gen {
		scheduler.AddCommand($move_keyword.text, $value_gen.text);
		};
pen_command: (PEN_UP | PEN_DOWN);
if_command:
	if_faker SQB_L cond SQB_R SQB_L instructions_gen SQB_R { scheduler.AddCommand("IF_END", $cond.text + "%" + $instructions_gen.text); 
		};
if_faker: IF_SYM { scheduler.AddCommand($IF_SYM.text, "qwe"); };

list_gen:
	MAKE_SYM identifier list_type { scheduler.AddCommand("LST", $identifier.text + "%" + $list_type.text ); 
		};
assignment_gen:
	MAKE_SYM identifier value_gen { scheduler.AddCommand("VAR", $identifier.text + "%" + $value_gen.text); 
		};
output_instruction_gen: OUTPUT_SYM COLON value_gen;
instruction_gen: (
		loop_gen
		| move_command
		| list_gen
		| assignment_gen
		| move_command
		| pen_command
		| if_command
		| output_instruction_gen
	) SEMI;
function_instr:
	TO_SYM identifier (COLON identifier)* instructions_gen END_SYM;
repeat_loop:
	repeat_start SQB_L instructions_gen SQB_R { scheduler.AddCommand("REPEAT_END", ""); 
		};
repeat_start:
	REPEAT_SYM value_gen { scheduler.AddCommand($REPEAT_SYM.text, $value_gen.text); };
while_loop:
	WHILE_SYM SQB_L cond SQB_R SQB_L instructions_gen SQB_R;
loop_gen: (repeat_loop | while_loop);

instructions_gen: (instruction_gen)+;

starter: (instructions_gen | function_instr) { scheduler.Execute(); };

/*
 * Lexer rules
 */
DOT: '.';
DIGIT: [0-9];
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
LETTER: (LOWERCASE | UPPERCASE);
COLON: ':';
COMMA: ',';
QUOTE: '"';
OPER_ADD: '+';
OPER_SUB: '-';
OPER_MUL: '*';
OPER_DIV: '/';
BRA_L: '(';
BRA_R: ')';
SQB_L: '[';
SQB_R: ']';
COMP_EQ: '=';
COMP_L: '<';
COMP_LE: '<=';
COMP_G: '>';
COMP_GE: '>=';
COMP_NE: '!=';
SEMI: ';';

MAKE_SYM: 'MAKE';
LOCAL_SYM: 'LOCAL';
TO_SYM: 'TO';
END_SYM: 'END';
IF_SYM: 'IF';
REPEAT_SYM: 'REPEAT';
WHILE_SYM: 'WHILE';
OUTPUT_SYM: 'OUTPUT';

MOVE_FD: 'FD';
MOVE_BK: 'BK';
MOVE_LT: 'LT';
MOVE_RT: 'RT';
PEN_UP: 'PU';
PEN_DOWN: 'PD';

WHITESPACE: (' ' | '\n' | '\r' | '\t') -> skip;