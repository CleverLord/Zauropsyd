// Generated from c:\Users\creep\Documents\GitHub\LogoScanner\Assets\ANTLR\Logo.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOT=1, DIGIT=2, LETTER=3, COLON=4, COMMA=5, QUOTE=6, OPER_ADD=7, OPER_SUB=8, 
		OPER_MUL=9, OPER_DIV=10, BRA_L=11, BRA_R=12, SQB_L=13, SQB_R=14, COMP_EQ=15, 
		COMP_L=16, COMP_LE=17, COMP_G=18, COMP_GE=19, COMP_NE=20, SEMI=21, MAKE_SYM=22, 
		LOCAL_SYM=23, TO_SYM=24, END_SYM=25, IF_SYM=26, REPEAT_SYM=27, WHILE_SYM=28, 
		OUTPUT_SYM=29, MOVE_FD=30, MOVE_BK=31, MOVE_LT=32, MOVE_RT=33, PEN_UP=34, 
		PEN_DOWN=35, WHITESPACE=36;
	public static final int
		RULE_int_type = 0, RULE_float_type = 1, RULE_string_type = 2, RULE_identifier = 3, 
		RULE_operand = 4, RULE_comparator_gen = 5, RULE_num_val = 6, RULE_operation_gen = 7, 
		RULE_value_gen = 8, RULE_list_acc = 9, RULE_cond = 10, RULE_list_type = 11, 
		RULE_move_keyword = 12, RULE_move_command = 13, RULE_pen_command = 14, 
		RULE_if_command = 15, RULE_if_faker = 16, RULE_list_gen = 17, RULE_assignment_gen = 18, 
		RULE_output_instruction_gen = 19, RULE_instruction_gen = 20, RULE_function_instr = 21, 
		RULE_repeat_loop = 22, RULE_repeat_start = 23, RULE_while_loop = 24, RULE_loop_gen = 25, 
		RULE_instructions_gen = 26, RULE_starter = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"int_type", "float_type", "string_type", "identifier", "operand", "comparator_gen", 
			"num_val", "operation_gen", "value_gen", "list_acc", "cond", "list_type", 
			"move_keyword", "move_command", "pen_command", "if_command", "if_faker", 
			"list_gen", "assignment_gen", "output_instruction_gen", "instruction_gen", 
			"function_instr", "repeat_loop", "repeat_start", "while_loop", "loop_gen", 
			"instructions_gen", "starter"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, "':'", "','", "'\"'", "'+'", "'-'", "'*'", "'/'", 
			"'('", "')'", "'['", "']'", "'='", "'<'", "'<='", "'>'", "'>='", "'!='", 
			"';'", "'MAKE'", "'LOCAL'", "'TO'", "'END'", "'IF'", "'REPEAT'", "'WHILE'", 
			"'OUTPUT'", "'FD'", "'BK'", "'LT'", "'RT'", "'PU'", "'PD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DOT", "DIGIT", "LETTER", "COLON", "COMMA", "QUOTE", "OPER_ADD", 
			"OPER_SUB", "OPER_MUL", "OPER_DIV", "BRA_L", "BRA_R", "SQB_L", "SQB_R", 
			"COMP_EQ", "COMP_L", "COMP_LE", "COMP_G", "COMP_GE", "COMP_NE", "SEMI", 
			"MAKE_SYM", "LOCAL_SYM", "TO_SYM", "END_SYM", "IF_SYM", "REPEAT_SYM", 
			"WHILE_SYM", "OUTPUT_SYM", "MOVE_FD", "MOVE_BK", "MOVE_LT", "MOVE_RT", 
			"PEN_UP", "PEN_DOWN", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Logo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		// using UnityEngine;
	 	// using System.Collections;
		public Scheduler scheduler = new Scheduler();
		// public TurtleControl controller = GameObject.Find("Turtle").GetComponent<TurtleControl>();

	public LogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Int_typeContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(LogoParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(LogoParser.DIGIT, i);
		}
		public Int_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_type; }
	}

	public final Int_typeContext int_type() throws RecognitionException {
		Int_typeContext _localctx = new Int_typeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_int_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				match(DIGIT);
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Float_typeContext extends ParserRuleContext {
		public List<Int_typeContext> int_type() {
			return getRuleContexts(Int_typeContext.class);
		}
		public Int_typeContext int_type(int i) {
			return getRuleContext(Int_typeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(LogoParser.DOT, 0); }
		public Float_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_float_type; }
	}

	public final Float_typeContext float_type() throws RecognitionException {
		Float_typeContext _localctx = new Float_typeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_float_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			int_type();
			setState(62);
			match(DOT);
			setState(63);
			int_type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_typeContext extends ParserRuleContext {
		public List<TerminalNode> QUOTE() { return getTokens(LogoParser.QUOTE); }
		public TerminalNode QUOTE(int i) {
			return getToken(LogoParser.QUOTE, i);
		}
		public List<TerminalNode> LETTER() { return getTokens(LogoParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LogoParser.LETTER, i);
		}
		public List<TerminalNode> DIGIT() { return getTokens(LogoParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(LogoParser.DIGIT, i);
		}
		public String_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_type; }
	}

	public final String_typeContext string_type() throws RecognitionException {
		String_typeContext _localctx = new String_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_string_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(QUOTE);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIGIT || _la==LETTER) {
				{
				{
				setState(66);
				_la = _input.LA(1);
				if ( !(_la==DIGIT || _la==LETTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(QUOTE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(LogoParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(LogoParser.LETTER, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LETTER);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(75);
					match(LETTER);
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode OPER_ADD() { return getToken(LogoParser.OPER_ADD, 0); }
		public TerminalNode OPER_SUB() { return getToken(LogoParser.OPER_SUB, 0); }
		public TerminalNode OPER_MUL() { return getToken(LogoParser.OPER_MUL, 0); }
		public TerminalNode OPER_DIV() { return getToken(LogoParser.OPER_DIV, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPER_ADD) | (1L << OPER_SUB) | (1L << OPER_MUL) | (1L << OPER_DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comparator_genContext extends ParserRuleContext {
		public TerminalNode COMP_EQ() { return getToken(LogoParser.COMP_EQ, 0); }
		public TerminalNode COMP_NE() { return getToken(LogoParser.COMP_NE, 0); }
		public TerminalNode COMP_L() { return getToken(LogoParser.COMP_L, 0); }
		public TerminalNode COMP_LE() { return getToken(LogoParser.COMP_LE, 0); }
		public TerminalNode COMP_G() { return getToken(LogoParser.COMP_G, 0); }
		public TerminalNode COMP_GE() { return getToken(LogoParser.COMP_GE, 0); }
		public Comparator_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator_gen; }
	}

	public final Comparator_genContext comparator_gen() throws RecognitionException {
		Comparator_genContext _localctx = new Comparator_genContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparator_gen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMP_EQ) | (1L << COMP_L) | (1L << COMP_LE) | (1L << COMP_G) | (1L << COMP_GE) | (1L << COMP_NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Num_valContext extends ParserRuleContext {
		public Int_typeContext int_type() {
			return getRuleContext(Int_typeContext.class,0);
		}
		public Float_typeContext float_type() {
			return getRuleContext(Float_typeContext.class,0);
		}
		public Num_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_val; }
	}

	public final Num_valContext num_val() throws RecognitionException {
		Num_valContext _localctx = new Num_valContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_num_val);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(85);
				int_type();
				}
				break;
			case 2:
				{
				setState(86);
				float_type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Operation_genContext extends ParserRuleContext {
		public List<Num_valContext> num_val() {
			return getRuleContexts(Num_valContext.class);
		}
		public Num_valContext num_val(int i) {
			return getRuleContext(Num_valContext.class,i);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Operation_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation_gen; }
	}

	public final Operation_genContext operation_gen() throws RecognitionException {
		Operation_genContext _localctx = new Operation_genContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operation_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			num_val();
			setState(90);
			operand();
			setState(91);
			num_val();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_genContext extends ParserRuleContext {
		public List<Num_valContext> num_val() {
			return getRuleContexts(Num_valContext.class);
		}
		public Num_valContext num_val(int i) {
			return getRuleContext(Num_valContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List_accContext list_acc() {
			return getRuleContext(List_accContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LogoParser.DOT, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public Value_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_gen; }
	}

	public final Value_genContext value_gen() throws RecognitionException {
		Value_genContext _localctx = new Value_genContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(93);
				num_val();
				}
				break;
			case 2:
				{
				setState(94);
				identifier();
				setState(95);
				list_acc();
				}
				break;
			case 3:
				{
				setState(97);
				identifier();
				setState(98);
				match(DOT);
				}
				break;
			case 4:
				{
				setState(100);
				num_val();
				setState(101);
				operand();
				setState(102);
				num_val();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_accContext extends ParserRuleContext {
		public TerminalNode SQB_L() { return getToken(LogoParser.SQB_L, 0); }
		public Value_genContext value_gen() {
			return getRuleContext(Value_genContext.class,0);
		}
		public TerminalNode SQB_R() { return getToken(LogoParser.SQB_R, 0); }
		public List_accContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_acc; }
	}

	public final List_accContext list_acc() throws RecognitionException {
		List_accContext _localctx = new List_accContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_list_acc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(SQB_L);
			setState(107);
			value_gen();
			setState(108);
			match(SQB_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public List<Value_genContext> value_gen() {
			return getRuleContexts(Value_genContext.class);
		}
		public Value_genContext value_gen(int i) {
			return getRuleContext(Value_genContext.class,i);
		}
		public Comparator_genContext comparator_gen() {
			return getRuleContext(Comparator_genContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			value_gen();
			setState(111);
			comparator_gen();
			setState(112);
			value_gen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_typeContext extends ParserRuleContext {
		public TerminalNode SQB_L() { return getToken(LogoParser.SQB_L, 0); }
		public TerminalNode SQB_R() { return getToken(LogoParser.SQB_R, 0); }
		public List<Value_genContext> value_gen() {
			return getRuleContexts(Value_genContext.class);
		}
		public Value_genContext value_gen(int i) {
			return getRuleContext(Value_genContext.class,i);
		}
		public List<List_typeContext> list_type() {
			return getRuleContexts(List_typeContext.class);
		}
		public List_typeContext list_type(int i) {
			return getRuleContext(List_typeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LogoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LogoParser.COMMA, i);
		}
		public List_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_type; }
	}

	public final List_typeContext list_type() throws RecognitionException {
		List_typeContext _localctx = new List_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_list_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(SQB_L);
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
			case LETTER:
				{
				setState(115);
				value_gen();
				}
				break;
			case SQB_L:
				{
				setState(116);
				list_type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(119);
				match(COMMA);
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DIGIT:
				case LETTER:
					{
					setState(120);
					value_gen();
					}
					break;
				case SQB_L:
					{
					setState(121);
					list_type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(SQB_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_keywordContext extends ParserRuleContext {
		public TerminalNode MOVE_FD() { return getToken(LogoParser.MOVE_FD, 0); }
		public TerminalNode MOVE_BK() { return getToken(LogoParser.MOVE_BK, 0); }
		public TerminalNode MOVE_LT() { return getToken(LogoParser.MOVE_LT, 0); }
		public TerminalNode MOVE_RT() { return getToken(LogoParser.MOVE_RT, 0); }
		public Move_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_keyword; }
	}

	public final Move_keywordContext move_keyword() throws RecognitionException {
		Move_keywordContext _localctx = new Move_keywordContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_move_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MOVE_FD) | (1L << MOVE_BK) | (1L << MOVE_LT) | (1L << MOVE_RT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_commandContext extends ParserRuleContext {
		public Move_keywordContext move_keyword;
		public Value_genContext value_gen;
		public Move_keywordContext move_keyword() {
			return getRuleContext(Move_keywordContext.class,0);
		}
		public Value_genContext value_gen() {
			return getRuleContext(Value_genContext.class,0);
		}
		public Move_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_command; }
	}

	public final Move_commandContext move_command() throws RecognitionException {
		Move_commandContext _localctx = new Move_commandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_move_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((Move_commandContext)_localctx).move_keyword = move_keyword();
			setState(134);
			((Move_commandContext)_localctx).value_gen = value_gen();

					scheduler.AddCommand((((Move_commandContext)_localctx).move_keyword!=null?_input.getText(((Move_commandContext)_localctx).move_keyword.start,((Move_commandContext)_localctx).move_keyword.stop):null), (((Move_commandContext)_localctx).value_gen!=null?_input.getText(((Move_commandContext)_localctx).value_gen.start,((Move_commandContext)_localctx).value_gen.stop):null));
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pen_commandContext extends ParserRuleContext {
		public TerminalNode PEN_UP() { return getToken(LogoParser.PEN_UP, 0); }
		public TerminalNode PEN_DOWN() { return getToken(LogoParser.PEN_DOWN, 0); }
		public Pen_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pen_command; }
	}

	public final Pen_commandContext pen_command() throws RecognitionException {
		Pen_commandContext _localctx = new Pen_commandContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pen_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_la = _input.LA(1);
			if ( !(_la==PEN_UP || _la==PEN_DOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_commandContext extends ParserRuleContext {
		public CondContext cond;
		public Instructions_genContext instructions_gen;
		public If_fakerContext if_faker() {
			return getRuleContext(If_fakerContext.class,0);
		}
		public List<TerminalNode> SQB_L() { return getTokens(LogoParser.SQB_L); }
		public TerminalNode SQB_L(int i) {
			return getToken(LogoParser.SQB_L, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> SQB_R() { return getTokens(LogoParser.SQB_R); }
		public TerminalNode SQB_R(int i) {
			return getToken(LogoParser.SQB_R, i);
		}
		public Instructions_genContext instructions_gen() {
			return getRuleContext(Instructions_genContext.class,0);
		}
		public If_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_command; }
	}

	public final If_commandContext if_command() throws RecognitionException {
		If_commandContext _localctx = new If_commandContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			if_faker();
			setState(140);
			match(SQB_L);
			setState(141);
			((If_commandContext)_localctx).cond = cond();
			setState(142);
			match(SQB_R);
			setState(143);
			match(SQB_L);
			setState(144);
			((If_commandContext)_localctx).instructions_gen = instructions_gen();
			setState(145);
			match(SQB_R);
			 scheduler.AddCommand("IF_END", (((If_commandContext)_localctx).cond!=null?_input.getText(((If_commandContext)_localctx).cond.start,((If_commandContext)_localctx).cond.stop):null) + "%" + (((If_commandContext)_localctx).instructions_gen!=null?_input.getText(((If_commandContext)_localctx).instructions_gen.start,((If_commandContext)_localctx).instructions_gen.stop):null)); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_fakerContext extends ParserRuleContext {
		public Token IF_SYM;
		public TerminalNode IF_SYM() { return getToken(LogoParser.IF_SYM, 0); }
		public If_fakerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_faker; }
	}

	public final If_fakerContext if_faker() throws RecognitionException {
		If_fakerContext _localctx = new If_fakerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_faker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			((If_fakerContext)_localctx).IF_SYM = match(IF_SYM);
			 scheduler.AddCommand((((If_fakerContext)_localctx).IF_SYM!=null?((If_fakerContext)_localctx).IF_SYM.getText():null), "qwe"); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_genContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List_typeContext list_type;
		public TerminalNode MAKE_SYM() { return getToken(LogoParser.MAKE_SYM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List_typeContext list_type() {
			return getRuleContext(List_typeContext.class,0);
		}
		public List_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_gen; }
	}

	public final List_genContext list_gen() throws RecognitionException {
		List_genContext _localctx = new List_genContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_list_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(MAKE_SYM);
			setState(152);
			((List_genContext)_localctx).identifier = identifier();
			setState(153);
			((List_genContext)_localctx).list_type = list_type();
			 scheduler.AddCommand("LST", (((List_genContext)_localctx).identifier!=null?_input.getText(((List_genContext)_localctx).identifier.start,((List_genContext)_localctx).identifier.stop):null) + "%" + (((List_genContext)_localctx).list_type!=null?_input.getText(((List_genContext)_localctx).list_type.start,((List_genContext)_localctx).list_type.stop):null) ); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assignment_genContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public Value_genContext value_gen;
		public TerminalNode MAKE_SYM() { return getToken(LogoParser.MAKE_SYM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Value_genContext value_gen() {
			return getRuleContext(Value_genContext.class,0);
		}
		public Assignment_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_gen; }
	}

	public final Assignment_genContext assignment_gen() throws RecognitionException {
		Assignment_genContext _localctx = new Assignment_genContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(MAKE_SYM);
			setState(157);
			((Assignment_genContext)_localctx).identifier = identifier();
			setState(158);
			((Assignment_genContext)_localctx).value_gen = value_gen();
			 scheduler.AddCommand("VAR", (((Assignment_genContext)_localctx).identifier!=null?_input.getText(((Assignment_genContext)_localctx).identifier.start,((Assignment_genContext)_localctx).identifier.stop):null) + "%" + (((Assignment_genContext)_localctx).value_gen!=null?_input.getText(((Assignment_genContext)_localctx).value_gen.start,((Assignment_genContext)_localctx).value_gen.stop):null)); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_instruction_genContext extends ParserRuleContext {
		public TerminalNode OUTPUT_SYM() { return getToken(LogoParser.OUTPUT_SYM, 0); }
		public TerminalNode COLON() { return getToken(LogoParser.COLON, 0); }
		public Value_genContext value_gen() {
			return getRuleContext(Value_genContext.class,0);
		}
		public Output_instruction_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_instruction_gen; }
	}

	public final Output_instruction_genContext output_instruction_gen() throws RecognitionException {
		Output_instruction_genContext _localctx = new Output_instruction_genContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_output_instruction_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(OUTPUT_SYM);
			setState(162);
			match(COLON);
			setState(163);
			value_gen();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruction_genContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LogoParser.SEMI, 0); }
		public Loop_genContext loop_gen() {
			return getRuleContext(Loop_genContext.class,0);
		}
		public Move_commandContext move_command() {
			return getRuleContext(Move_commandContext.class,0);
		}
		public List_genContext list_gen() {
			return getRuleContext(List_genContext.class,0);
		}
		public Assignment_genContext assignment_gen() {
			return getRuleContext(Assignment_genContext.class,0);
		}
		public Pen_commandContext pen_command() {
			return getRuleContext(Pen_commandContext.class,0);
		}
		public If_commandContext if_command() {
			return getRuleContext(If_commandContext.class,0);
		}
		public Output_instruction_genContext output_instruction_gen() {
			return getRuleContext(Output_instruction_genContext.class,0);
		}
		public Instruction_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction_gen; }
	}

	public final Instruction_genContext instruction_gen() throws RecognitionException {
		Instruction_genContext _localctx = new Instruction_genContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_instruction_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(165);
				loop_gen();
				}
				break;
			case 2:
				{
				setState(166);
				move_command();
				}
				break;
			case 3:
				{
				setState(167);
				list_gen();
				}
				break;
			case 4:
				{
				setState(168);
				assignment_gen();
				}
				break;
			case 5:
				{
				setState(169);
				move_command();
				}
				break;
			case 6:
				{
				setState(170);
				pen_command();
				}
				break;
			case 7:
				{
				setState(171);
				if_command();
				}
				break;
			case 8:
				{
				setState(172);
				output_instruction_gen();
				}
				break;
			}
			setState(175);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_instrContext extends ParserRuleContext {
		public TerminalNode TO_SYM() { return getToken(LogoParser.TO_SYM, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Instructions_genContext instructions_gen() {
			return getRuleContext(Instructions_genContext.class,0);
		}
		public TerminalNode END_SYM() { return getToken(LogoParser.END_SYM, 0); }
		public List<TerminalNode> COLON() { return getTokens(LogoParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LogoParser.COLON, i);
		}
		public Function_instrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_instr; }
	}

	public final Function_instrContext function_instr() throws RecognitionException {
		Function_instrContext _localctx = new Function_instrContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function_instr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(TO_SYM);
			setState(178);
			identifier();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(179);
				match(COLON);
				setState(180);
				identifier();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			instructions_gen();
			setState(187);
			match(END_SYM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_loopContext extends ParserRuleContext {
		public Repeat_startContext repeat_start() {
			return getRuleContext(Repeat_startContext.class,0);
		}
		public TerminalNode SQB_L() { return getToken(LogoParser.SQB_L, 0); }
		public Instructions_genContext instructions_gen() {
			return getRuleContext(Instructions_genContext.class,0);
		}
		public TerminalNode SQB_R() { return getToken(LogoParser.SQB_R, 0); }
		public Repeat_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_loop; }
	}

	public final Repeat_loopContext repeat_loop() throws RecognitionException {
		Repeat_loopContext _localctx = new Repeat_loopContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_repeat_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			repeat_start();
			setState(190);
			match(SQB_L);
			setState(191);
			instructions_gen();
			setState(192);
			match(SQB_R);
			 scheduler.AddCommand("REPEAT_END", ""); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Repeat_startContext extends ParserRuleContext {
		public Token REPEAT_SYM;
		public Value_genContext value_gen;
		public TerminalNode REPEAT_SYM() { return getToken(LogoParser.REPEAT_SYM, 0); }
		public Value_genContext value_gen() {
			return getRuleContext(Value_genContext.class,0);
		}
		public Repeat_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_start; }
	}

	public final Repeat_startContext repeat_start() throws RecognitionException {
		Repeat_startContext _localctx = new Repeat_startContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_repeat_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			((Repeat_startContext)_localctx).REPEAT_SYM = match(REPEAT_SYM);
			setState(196);
			((Repeat_startContext)_localctx).value_gen = value_gen();
			 scheduler.AddCommand((((Repeat_startContext)_localctx).REPEAT_SYM!=null?((Repeat_startContext)_localctx).REPEAT_SYM.getText():null), (((Repeat_startContext)_localctx).value_gen!=null?_input.getText(((Repeat_startContext)_localctx).value_gen.start,((Repeat_startContext)_localctx).value_gen.stop):null)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE_SYM() { return getToken(LogoParser.WHILE_SYM, 0); }
		public List<TerminalNode> SQB_L() { return getTokens(LogoParser.SQB_L); }
		public TerminalNode SQB_L(int i) {
			return getToken(LogoParser.SQB_L, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> SQB_R() { return getTokens(LogoParser.SQB_R); }
		public TerminalNode SQB_R(int i) {
			return getToken(LogoParser.SQB_R, i);
		}
		public Instructions_genContext instructions_gen() {
			return getRuleContext(Instructions_genContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(WHILE_SYM);
			setState(200);
			match(SQB_L);
			setState(201);
			cond();
			setState(202);
			match(SQB_R);
			setState(203);
			match(SQB_L);
			setState(204);
			instructions_gen();
			setState(205);
			match(SQB_R);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_genContext extends ParserRuleContext {
		public Repeat_loopContext repeat_loop() {
			return getRuleContext(Repeat_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Loop_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_gen; }
	}

	public final Loop_genContext loop_gen() throws RecognitionException {
		Loop_genContext _localctx = new Loop_genContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_loop_gen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEAT_SYM:
				{
				setState(207);
				repeat_loop();
				}
				break;
			case WHILE_SYM:
				{
				setState(208);
				while_loop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instructions_genContext extends ParserRuleContext {
		public List<Instruction_genContext> instruction_gen() {
			return getRuleContexts(Instruction_genContext.class);
		}
		public Instruction_genContext instruction_gen(int i) {
			return getRuleContext(Instruction_genContext.class,i);
		}
		public Instructions_genContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions_gen; }
	}

	public final Instructions_genContext instructions_gen() throws RecognitionException {
		Instructions_genContext _localctx = new Instructions_genContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_instructions_gen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				instruction_gen();
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAKE_SYM) | (1L << IF_SYM) | (1L << REPEAT_SYM) | (1L << WHILE_SYM) | (1L << OUTPUT_SYM) | (1L << MOVE_FD) | (1L << MOVE_BK) | (1L << MOVE_LT) | (1L << MOVE_RT) | (1L << PEN_UP) | (1L << PEN_DOWN))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarterContext extends ParserRuleContext {
		public Instructions_genContext instructions_gen() {
			return getRuleContext(Instructions_genContext.class,0);
		}
		public Function_instrContext function_instr() {
			return getRuleContext(Function_instrContext.class,0);
		}
		public StarterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_starter; }
	}

	public final StarterContext starter() throws RecognitionException {
		StarterContext _localctx = new StarterContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_starter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAKE_SYM:
			case IF_SYM:
			case REPEAT_SYM:
			case WHILE_SYM:
			case OUTPUT_SYM:
			case MOVE_FD:
			case MOVE_BK:
			case MOVE_LT:
			case MOVE_RT:
			case PEN_UP:
			case PEN_DOWN:
				{
				setState(216);
				instructions_gen();
				}
				break;
			case TO_SYM:
				{
				setState(217);
				function_instr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 scheduler.Execute(); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00e1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\6\2<\n\2\r\2\16\2=\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\3\4\3\5\3\5\7\5O\n\5\f"+
		"\5\16\5R\13\5\3\6\3\6\3\7\3\7\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\5\rx\n\r\3\r\3\r\3\r\5\r}\n\r\7\r\177\n\r\f\r"+
		"\16\r\u0082\13\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00b0\n\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\7\27\u00b8\n\27\f\27\16\27\u00bb\13\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\5\33\u00d4\n\33\3\34\6\34\u00d7\n\34\r\34\16\34\u00d8"+
		"\3\35\3\35\5\35\u00dd\n\35\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\7\3\2\4\5\3\2\t\f\3\2\21\26"+
		"\3\2 #\3\2$%\2\u00d9\2;\3\2\2\2\4?\3\2\2\2\6C\3\2\2\2\bL\3\2\2\2\nS\3"+
		"\2\2\2\fU\3\2\2\2\16Y\3\2\2\2\20[\3\2\2\2\22j\3\2\2\2\24l\3\2\2\2\26p"+
		"\3\2\2\2\30t\3\2\2\2\32\u0085\3\2\2\2\34\u0087\3\2\2\2\36\u008b\3\2\2"+
		"\2 \u008d\3\2\2\2\"\u0096\3\2\2\2$\u0099\3\2\2\2&\u009e\3\2\2\2(\u00a3"+
		"\3\2\2\2*\u00af\3\2\2\2,\u00b3\3\2\2\2.\u00bf\3\2\2\2\60\u00c5\3\2\2\2"+
		"\62\u00c9\3\2\2\2\64\u00d3\3\2\2\2\66\u00d6\3\2\2\28\u00dc\3\2\2\2:<\7"+
		"\4\2\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\5\2\2\2@A"+
		"\7\3\2\2AB\5\2\2\2B\5\3\2\2\2CG\7\b\2\2DF\t\2\2\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\b\2\2K\7\3\2\2\2LP\7\5\2"+
		"\2MO\7\5\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2Q\t\3\2\2\2RP\3\2"+
		"\2\2ST\t\3\2\2T\13\3\2\2\2UV\t\4\2\2V\r\3\2\2\2WZ\5\2\2\2XZ\5\4\3\2YW"+
		"\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\5\16\b\2\\]\5\n\6\2]^\5\16\b\2^\21\3"+
		"\2\2\2_k\5\16\b\2`a\5\b\5\2ab\5\24\13\2bk\3\2\2\2cd\5\b\5\2de\7\3\2\2"+
		"ek\3\2\2\2fg\5\16\b\2gh\5\n\6\2hi\5\16\b\2ik\3\2\2\2j_\3\2\2\2j`\3\2\2"+
		"\2jc\3\2\2\2jf\3\2\2\2k\23\3\2\2\2lm\7\17\2\2mn\5\22\n\2no\7\20\2\2o\25"+
		"\3\2\2\2pq\5\22\n\2qr\5\f\7\2rs\5\22\n\2s\27\3\2\2\2tw\7\17\2\2ux\5\22"+
		"\n\2vx\5\30\r\2wu\3\2\2\2wv\3\2\2\2x\u0080\3\2\2\2y|\7\7\2\2z}\5\22\n"+
		"\2{}\5\30\r\2|z\3\2\2\2|{\3\2\2\2}\177\3\2\2\2~y\3\2\2\2\177\u0082\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7\20\2\2\u0084\31\3\2\2\2\u0085\u0086\t\5\2\2\u0086"+
		"\33\3\2\2\2\u0087\u0088\5\32\16\2\u0088\u0089\5\22\n\2\u0089\u008a\b\17"+
		"\1\2\u008a\35\3\2\2\2\u008b\u008c\t\6\2\2\u008c\37\3\2\2\2\u008d\u008e"+
		"\5\"\22\2\u008e\u008f\7\17\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\20\2"+
		"\2\u0091\u0092\7\17\2\2\u0092\u0093\5\66\34\2\u0093\u0094\7\20\2\2\u0094"+
		"\u0095\b\21\1\2\u0095!\3\2\2\2\u0096\u0097\7\34\2\2\u0097\u0098\b\22\1"+
		"\2\u0098#\3\2\2\2\u0099\u009a\7\30\2\2\u009a\u009b\5\b\5\2\u009b\u009c"+
		"\5\30\r\2\u009c\u009d\b\23\1\2\u009d%\3\2\2\2\u009e\u009f\7\30\2\2\u009f"+
		"\u00a0\5\b\5\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\b\24\1\2\u00a2\'\3\2\2"+
		"\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5\7\6\2\2\u00a5\u00a6\5\22\n\2\u00a6"+
		")\3\2\2\2\u00a7\u00b0\5\64\33\2\u00a8\u00b0\5\34\17\2\u00a9\u00b0\5$\23"+
		"\2\u00aa\u00b0\5&\24\2\u00ab\u00b0\5\34\17\2\u00ac\u00b0\5\36\20\2\u00ad"+
		"\u00b0\5 \21\2\u00ae\u00b0\5(\25\2\u00af\u00a7\3\2\2\2\u00af\u00a8\3\2"+
		"\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00af"+
		"\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\7\27\2\2\u00b2+\3\2\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b9"+
		"\5\b\5\2\u00b5\u00b6\7\6\2\2\u00b6\u00b8\5\b\5\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2"+
		"\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\5\66\34\2\u00bd\u00be\7\33\2\2\u00be"+
		"-\3\2\2\2\u00bf\u00c0\5\60\31\2\u00c0\u00c1\7\17\2\2\u00c1\u00c2\5\66"+
		"\34\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\b\30\1\2\u00c4/\3\2\2\2\u00c5\u00c6"+
		"\7\35\2\2\u00c6\u00c7\5\22\n\2\u00c7\u00c8\b\31\1\2\u00c8\61\3\2\2\2\u00c9"+
		"\u00ca\7\36\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd"+
		"\7\20\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\5\66\34\2\u00cf\u00d0\7\20"+
		"\2\2\u00d0\63\3\2\2\2\u00d1\u00d4\5.\30\2\u00d2\u00d4\5\62\32\2\u00d3"+
		"\u00d1\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4\65\3\2\2\2\u00d5\u00d7\5*\26"+
		"\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9"+
		"\3\2\2\2\u00d9\67\3\2\2\2\u00da\u00dd\5\66\34\2\u00db\u00dd\5,\27\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b\35"+
		"\1\2\u00df9\3\2\2\2\17=GPYjw|\u0080\u00af\u00b9\u00d3\u00d8\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}