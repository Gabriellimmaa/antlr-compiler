// Generated from /home/gabriellima/Documents/GitHub/antlr-compiler/Lang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OE=6, CE=7, OB=8, CB=9, AT=10, 
		SEP=11, PLUS=12, ATRIB_PLUS=13, ATRIB_MINUS=14, ATRIB_MULT=15, MINUS=16, 
		MULT=17, DIV=18, AND=19, OR=20, NOT=21, EQ=22, LT=23, GT=24, LE=25, GE=26, 
		NE=27, BOOL_TRUE=28, BOOL_FALSE=29, IF=30, WHILE=31, FOR=32, FUNCTION=33, 
		RETURN=34, THEN=35, ELSE=36, WRITE=37, READ=38, INT=39, DOUBLE=40, STRING=41, 
		BOOLEAN=42, ARRAY=43, ARRAY_INT=44, ARRAY_DOUBLE=45, ARRAY_STRING=46, 
		STR=47, EOL=48, NUM=49, DECIM=50, VAR=51, POSITION=52, COMMENT_LINE=53, 
		COMMENT_BLOCK=54, WS=55;
	public static final int
		RULE_prog = 0, RULE_functions = 1, RULE_function = 2, RULE_fnBlock = 3, 
		RULE_fnBody = 4, RULE_params = 5, RULE_line = 6, RULE_funcInvoc = 7, RULE_stmt = 8, 
		RULE_input = 9, RULE_output = 10, RULE_ifst = 11, RULE_ternary = 12, RULE_whilest = 13, 
		RULE_forst = 14, RULE_array = 15, RULE_block = 16, RULE_cond = 17, RULE_atrib = 18, 
		RULE_expr = 19, RULE_term = 20, RULE_factor_array_number = 21, RULE_factor_array_string = 22, 
		RULE_factor = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "functions", "function", "fnBlock", "fnBody", "params", "line", 
			"funcInvoc", "stmt", "input", "output", "ifst", "ternary", "whilest", 
			"forst", "array", "block", "cond", "atrib", "expr", "term", "factor_array_number", 
			"factor_array_string", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", "'?'", "':'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"'='", "','", "'+'", "'+='", "'-='", "'*='", "'-'", "'*'", "'/'", "'&&'", 
			"'||'", "'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", 
			"PLUS", "ATRIB_PLUS", "ATRIB_MINUS", "ATRIB_MULT", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", 
			"BOOL_FALSE", "IF", "WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", 
			"WRITE", "READ", "INT", "DOUBLE", "STRING", "BOOLEAN", "ARRAY", "ARRAY_INT", 
			"ARRAY_DOUBLE", "ARRAY_STRING", "STR", "EOL", "NUM", "DECIM", "VAR", 
			"POSITION", "COMMENT_LINE", "COMMENT_BLOCK", "WS"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgLineContext extends ProgContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgLineContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			functions();
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				line();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OE) | (1L << NOT) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << WRITE) | (1L << READ) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << ARRAY) | (1L << EOL) | (1L << NUM) | (1L << DECIM) | (1L << VAR) | (1L << COMMENT_LINE) | (1L << COMMENT_BLOCK))) != 0) );
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

	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				function();
				setState(55);
				functions();
				}
				break;
			case OE:
			case NOT:
			case BOOL_TRUE:
			case BOOL_FALSE:
			case IF:
			case WHILE:
			case FOR:
			case WRITE:
			case READ:
			case INT:
			case DOUBLE:
			case STRING:
			case BOOLEAN:
			case ARRAY:
			case EOL:
			case NUM:
			case DECIM:
			case VAR:
			case COMMENT_LINE:
			case COMMENT_BLOCK:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(LangParser.FUNCTION, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(FUNCTION);
			setState(61);
			match(VAR);
			setState(62);
			match(OE);
			setState(63);
			params();
			setState(64);
			match(CE);
			setState(65);
			fnBlock();
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

	public static class FnBlockContext extends ParserRuleContext {
		public FnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBlock; }
	 
		public FnBlockContext() { }
		public void copyFrom(FnBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FnBlockLineContext extends FnBlockContext {
		public TerminalNode OB() { return getToken(LangParser.OB, 0); }
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public TerminalNode CB() { return getToken(LangParser.CB, 0); }
		public FnBlockLineContext(FnBlockContext ctx) { copyFrom(ctx); }
	}

	public final FnBlockContext fnBlock() throws RecognitionException {
		FnBlockContext _localctx = new FnBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fnBlock);
		try {
			_localctx = new FnBlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OB);
			setState(68);
			fnBody();
			setState(69);
			match(CB);
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

	public static class FnBodyContext extends ParserRuleContext {
		public FnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBody; }
	 
		public FnBodyContext() { }
		public void copyFrom(FnBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FnReturnLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	public static class FnBodyLineContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	public static class FnReturnExprLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public FnReturnExprLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	public static class FnBodyLineMoreContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBodyLineMoreContext(FnBodyContext ctx) { copyFrom(ctx); }
	}

	public final FnBodyContext fnBody() throws RecognitionException {
		FnBodyContext _localctx = new FnBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnBody);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FnBodyLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				line();
				}
				break;
			case 2:
				_localctx = new FnBodyLineMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				line();
				setState(73);
				fnBody();
				}
				break;
			case 3:
				_localctx = new FnReturnExprLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(RETURN);
				setState(76);
				expr();
				setState(77);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new FnReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(RETURN);
				setState(80);
				match(EOL);
				}
				break;
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

	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode SEP() { return getToken(LangParser.SEP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(VAR);
				setState(85);
				match(SEP);
				setState(86);
				params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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

	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LineWhileContext extends LineContext {
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public LineWhileContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineEOLContext extends LineContext {
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineEOLContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineStmtContext extends LineContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineStmtContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class BlockCommentContext extends LineContext {
		public TerminalNode COMMENT_BLOCK() { return getToken(LangParser.COMMENT_BLOCK, 0); }
		public BlockCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineIfContext extends LineContext {
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public LineIfContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineCommentContext extends LineContext {
		public TerminalNode COMMENT_LINE() { return getToken(LangParser.COMMENT_LINE, 0); }
		public LineCommentContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineForContext extends LineContext {
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public LineForContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineTernaryContext extends LineContext {
		public TernaryContext ternary() {
			return getRuleContext(TernaryContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineTernaryContext(LineContext ctx) { copyFrom(ctx); }
	}
	public static class LineArrayContext extends LineContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode EOL() { return getToken(LangParser.EOL, 0); }
		public LineArrayContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new LineStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				stmt();
				setState(91);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				ifst();
				}
				break;
			case 3:
				_localctx = new LineWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				whilest();
				}
				break;
			case 4:
				_localctx = new LineForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				forst();
				}
				break;
			case 5:
				_localctx = new LineTernaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				ternary();
				setState(97);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new LineArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(99);
				array();
				setState(100);
				match(EOL);
				}
				break;
			case 7:
				_localctx = new LineEOLContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				match(EOL);
				}
				break;
			case 8:
				_localctx = new LineCommentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				match(COMMENT_LINE);
				}
				break;
			case 9:
				_localctx = new BlockCommentContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				match(COMMENT_BLOCK);
				}
				break;
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

	public static class FuncInvocContext extends ParserRuleContext {
		public FuncInvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoc; }
	 
		public FuncInvocContext() { }
		public void copyFrom(FuncInvocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncInvocLineContext extends FuncInvocContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FuncInvocLineContext(FuncInvocContext ctx) { copyFrom(ctx); }
	}

	public final FuncInvocContext funcInvoc() throws RecognitionException {
		FuncInvocContext _localctx = new FuncInvocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcInvoc);
		try {
			_localctx = new FuncInvocLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(VAR);
			setState(108);
			match(OE);
			setState(109);
			params();
			setState(110);
			match(CE);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtOutputContext extends StmtContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtOutputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class StmtInputContext extends StmtContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StmtInputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class StmtAtribContext extends StmtContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public StmtAtribContext(StmtContext ctx) { copyFrom(ctx); }
	}
	public static class LineFuncInvocContext extends StmtContext {
		public FuncInvocContext funcInvoc() {
			return getRuleContext(FuncInvocContext.class,0);
		}
		public LineFuncInvocContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StmtAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				atrib();
				}
				break;
			case 2:
				_localctx = new StmtInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				input();
				}
				break;
			case 3:
				_localctx = new StmtOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				output();
				}
				break;
			case 4:
				_localctx = new LineFuncInvocContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				funcInvoc();
				}
				break;
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

	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InputReadContext extends InputContext {
		public Token TYPE;
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(LangParser.BOOLEAN, 0); }
		public InputReadContext(InputContext ctx) { copyFrom(ctx); }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		int _la;
		try {
			_localctx = new InputReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(READ);
			setState(119);
			match(VAR);
			setState(120);
			((InputReadContext)_localctx).TYPE = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN))) != 0)) ) {
				((InputReadContext)_localctx).TYPE = (Token)_errHandler.recoverInline(this);
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

	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OutputWriteFStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public OutputWriteFStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	public static class OutputWriteStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public OutputWriteStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	public static class OutputWriteVarContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode POSITION() { return getToken(LangParser.POSITION, 0); }
		public OutputWriteVarContext(OutputContext ctx) { copyFrom(ctx); }
	}
	public static class OutputWriteExprContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(LangParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputWriteExprContext(OutputContext ctx) { copyFrom(ctx); }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new OutputWriteVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(WRITE);
				setState(123);
				match(VAR);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==POSITION) {
					{
					setState(124);
					match(POSITION);
					}
				}

				}
				break;
			case 2:
				_localctx = new OutputWriteFStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(WRITE);
				setState(128);
				match(T__0);
				setState(129);
				match(STR);
				}
				break;
			case 3:
				_localctx = new OutputWriteStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(WRITE);
				setState(131);
				match(STR);
				}
				break;
			case 4:
				_localctx = new OutputWriteExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(WRITE);
				setState(133);
				expr();
				}
				break;
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

	public static class IfstContext extends ParserRuleContext {
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
	 
		public IfstContext() { }
		public void copyFrom(IfstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfstIfElseContext extends IfstContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstIfElseContext(IfstContext ctx) { copyFrom(ctx); }
	}
	public static class IfstIfContext extends IfstContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfstIfContext(IfstContext ctx) { copyFrom(ctx); }
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifst);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IfstIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(IF);
				setState(137);
				match(OE);
				setState(138);
				cond(0);
				setState(139);
				match(CE);
				setState(140);
				block();
				}
				break;
			case 2:
				_localctx = new IfstIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(IF);
				setState(143);
				match(OE);
				setState(144);
				cond(0);
				setState(145);
				match(CE);
				setState(146);
				((IfstIfElseContext)_localctx).b1 = block();
				setState(147);
				match(ELSE);
				setState(148);
				((IfstIfElseContext)_localctx).b2 = block();
				}
				break;
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

	public static class TernaryContext extends ParserRuleContext {
		public TernaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternary; }
	 
		public TernaryContext() { }
		public void copyFrom(TernaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryCondContext extends TernaryContext {
		public Token e1;
		public Token e2;
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> STR() { return getTokens(LangParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(LangParser.STR, i);
		}
		public TernaryCondContext(TernaryContext ctx) { copyFrom(ctx); }
	}

	public final TernaryContext ternary() throws RecognitionException {
		TernaryContext _localctx = new TernaryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ternary);
		try {
			_localctx = new TernaryCondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			cond(0);
			setState(153);
			match(T__1);
			setState(154);
			((TernaryCondContext)_localctx).e1 = match(STR);
			setState(155);
			match(T__2);
			setState(156);
			((TernaryCondContext)_localctx).e2 = match(STR);
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

	public static class WhilestContext extends ParserRuleContext {
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
	 
		public WhilestContext() { }
		public void copyFrom(WhilestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhilestWhileContext extends WhilestContext {
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilest);
		try {
			_localctx = new WhilestWhileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(WHILE);
			setState(159);
			match(OE);
			setState(160);
			cond(0);
			setState(161);
			match(CE);
			setState(162);
			block();
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

	public static class ForstContext extends ParserRuleContext {
		public ForstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forst; }
	 
		public ForstContext() { }
		public void copyFrom(ForstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForstForContext extends ForstContext {
		public TerminalNode FOR() { return getToken(LangParser.FOR, 0); }
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public List<TerminalNode> EOL() { return getTokens(LangParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(LangParser.EOL, i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForstForContext(ForstContext ctx) { copyFrom(ctx); }
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forst);
		try {
			_localctx = new ForstForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(FOR);
			setState(165);
			match(OE);
			setState(166);
			match(VAR);
			setState(167);
			match(EOL);
			setState(168);
			cond(0);
			setState(169);
			match(EOL);
			setState(170);
			atrib();
			setState(171);
			match(CE);
			setState(172);
			block();
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

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribArrayStringContext extends ArrayContext {
		public TerminalNode ARRAY() { return getToken(LangParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public Factor_array_stringContext factor_array_string() {
			return getRuleContext(Factor_array_stringContext.class,0);
		}
		public AtribArrayStringContext(ArrayContext ctx) { copyFrom(ctx); }
	}
	public static class AtribArrayNumberContext extends ArrayContext {
		public Token TYPE;
		public TerminalNode ARRAY() { return getToken(LangParser.ARRAY, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public Factor_array_numberContext factor_array_number() {
			return getRuleContext(Factor_array_numberContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public AtribArrayNumberContext(ArrayContext ctx) { copyFrom(ctx); }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_array);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new AtribArrayNumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ARRAY);
				setState(175);
				match(LT);
				setState(176);
				((AtribArrayNumberContext)_localctx).TYPE = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
					((AtribArrayNumberContext)_localctx).TYPE = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(177);
				match(GT);
				setState(178);
				match(VAR);
				setState(179);
				match(AT);
				setState(180);
				factor_array_number();
				}
				break;
			case 2:
				_localctx = new AtribArrayStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(ARRAY);
				setState(182);
				match(LT);
				setState(183);
				match(STRING);
				setState(184);
				match(GT);
				setState(185);
				match(VAR);
				setState(186);
				match(AT);
				setState(187);
				factor_array_string();
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BlockLineContext extends BlockContext {
		public TerminalNode OB() { return getToken(LangParser.OB, 0); }
		public TerminalNode CB() { return getToken(LangParser.CB, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockLineContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(OB);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				line();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OE) | (1L << NOT) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << WRITE) | (1L << READ) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << ARRAY) | (1L << EOL) | (1L << NUM) | (1L << DECIM) | (1L << VAR) | (1L << COMMENT_LINE) | (1L << COMMENT_BLOCK))) != 0) );
			setState(196);
			match(CB);
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
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondRelopContext extends CondContext {
		public ExprContext e1;
		public Token RELOP;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public TerminalNode NE() { return getToken(LangParser.NE, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode LE() { return getToken(LangParser.LE, 0); }
		public TerminalNode GE() { return getToken(LangParser.GE, 0); }
		public CondRelopContext(CondContext ctx) { copyFrom(ctx); }
	}
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
	}
	public static class CondAndContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
	}
	public static class CondOrContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
	}
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new CondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new CondRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				((CondRelopContext)_localctx).e1 = expr();
				setState(201);
				((CondRelopContext)_localctx).RELOP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE) | (1L << NE))) != 0)) ) {
					((CondRelopContext)_localctx).RELOP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(202);
				((CondRelopContext)_localctx).e2 = expr();
				}
				break;
			case 3:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(NOT);
				setState(205);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(208);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(209);
						match(AND);
						setState(210);
						((CondAndContext)_localctx).c2 = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(211);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(212);
						match(OR);
						setState(213);
						((CondOrContext)_localctx).c2 = cond(3);
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribPlusContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode ATRIB_PLUS() { return getToken(LangParser.ATRIB_PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribPlusContext(AtribContext ctx) { copyFrom(ctx); }
	}
	public static class AtribStringContext extends AtribContext {
		public TerminalNode STRING() { return getToken(LangParser.STRING, 0); }
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public TerminalNode STR() { return getToken(LangParser.STR, 0); }
		public AtribStringContext(AtribContext ctx) { copyFrom(ctx); }
	}
	public static class AtribMinusContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode ATRIB_MINUS() { return getToken(LangParser.ATRIB_MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribMinusContext(AtribContext ctx) { copyFrom(ctx); }
	}
	public static class AtribMultContext extends AtribContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode ATRIB_MULT() { return getToken(LangParser.ATRIB_MULT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribMultContext(AtribContext ctx) { copyFrom(ctx); }
	}
	public static class AtribVarContext extends AtribContext {
		public Token TYPE;
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public TerminalNode AT() { return getToken(LangParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode INT() { return getToken(LangParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(LangParser.DOUBLE, 0); }
		public TerminalNode BOOLEAN() { return getToken(LangParser.BOOLEAN, 0); }
		public AtribVarContext(AtribContext ctx) { copyFrom(ctx); }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atrib);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new AtribStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				match(STRING);
				setState(220);
				match(VAR);
				setState(221);
				match(AT);
				setState(222);
				match(STR);
				}
				break;
			case 2:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				((AtribVarContext)_localctx).TYPE = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << BOOLEAN))) != 0)) ) {
					((AtribVarContext)_localctx).TYPE = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(224);
				match(VAR);
				setState(225);
				match(AT);
				setState(226);
				expr();
				}
				break;
			case 3:
				_localctx = new AtribPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(VAR);
				setState(228);
				match(ATRIB_PLUS);
				setState(229);
				expr();
				}
				break;
			case 4:
				_localctx = new AtribMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(VAR);
				setState(231);
				match(ATRIB_MINUS);
				setState(232);
				expr();
				}
				break;
			case 5:
				_localctx = new AtribMultContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(233);
				match(VAR);
				setState(234);
				match(ATRIB_MULT);
				setState(235);
				expr();
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMinusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class CondTernaryContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CondTernaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expr);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				term();
				setState(239);
				match(PLUS);
				setState(240);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
				term();
				setState(243);
				match(MINUS);
				setState(244);
				expr();
				}
				break;
			case 3:
				_localctx = new CondTernaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				term();
				setState(247);
				match(T__1);
				setState(248);
				expr();
				setState(249);
				match(T__2);
				setState(250);
				expr();
				}
				break;
			case 4:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				term();
				}
				break;
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TermDivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class TermMultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(LangParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
	}
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_term);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				factor();
				setState(256);
				match(MULT);
				setState(257);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				factor();
				setState(260);
				match(DIV);
				setState(261);
				term();
				}
				break;
			case 3:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
				factor();
				}
				break;
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

	public static class Factor_array_numberContext extends ParserRuleContext {
		public Factor_array_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_array_number; }
	 
		public Factor_array_numberContext() { }
		public void copyFrom(Factor_array_numberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array_numberContext extends Factor_array_numberContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public Array_numberContext(Factor_array_numberContext ctx) { copyFrom(ctx); }
	}

	public final Factor_array_numberContext factor_array_number() throws RecognitionException {
		Factor_array_numberContext _localctx = new Factor_array_numberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_factor_array_number);
		int _la;
		try {
			_localctx = new Array_numberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__3);
			{
			setState(267);
			factor();
			}
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(268);
				match(SEP);
				{
				setState(269);
				factor();
				}
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(T__4);
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

	public static class Factor_array_stringContext extends ParserRuleContext {
		public Factor_array_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_array_string; }
	 
		public Factor_array_stringContext() { }
		public void copyFrom(Factor_array_stringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Array_stringContext extends Factor_array_stringContext {
		public List<TerminalNode> STR() { return getTokens(LangParser.STR); }
		public TerminalNode STR(int i) {
			return getToken(LangParser.STR, i);
		}
		public List<TerminalNode> SEP() { return getTokens(LangParser.SEP); }
		public TerminalNode SEP(int i) {
			return getToken(LangParser.SEP, i);
		}
		public Array_stringContext(Factor_array_stringContext ctx) { copyFrom(ctx); }
	}

	public final Factor_array_stringContext factor_array_string() throws RecognitionException {
		Factor_array_stringContext _localctx = new Factor_array_stringContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factor_array_string);
		int _la;
		try {
			_localctx = new Array_stringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(T__3);
			{
			setState(278);
			match(STR);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEP) {
				{
				{
				setState(279);
				match(SEP);
				{
				setState(280);
				match(STR);
				}
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(T__4);
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class FactorBoolFalseContext extends FactorContext {
		public TerminalNode BOOL_FALSE() { return getToken(LangParser.BOOL_FALSE, 0); }
		public FactorBoolFalseContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class FactorBoolTrueContext extends FactorContext {
		public TerminalNode BOOL_TRUE() { return getToken(LangParser.BOOL_TRUE, 0); }
		public FactorBoolTrueContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class FactorVarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(LangParser.VAR, 0); }
		public FactorVarContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class FactorDecimContext extends FactorContext {
		public TerminalNode DECIM() { return getToken(LangParser.DECIM, 0); }
		public FactorDecimContext(FactorContext ctx) { copyFrom(ctx); }
	}
	public static class FactorExprContext extends FactorContext {
		public TerminalNode OE() { return getToken(LangParser.OE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CE() { return getToken(LangParser.CE, 0); }
		public FactorExprContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_factor);
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OE:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(OE);
				setState(289);
				expr();
				setState(290);
				match(CE);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				match(VAR);
				}
				break;
			case DECIM:
				_localctx = new FactorDecimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				match(DECIM);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				match(NUM);
				}
				break;
			case BOOL_TRUE:
				_localctx = new FactorBoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				match(BOOL_TRUE);
				}
				break;
			case BOOL_FALSE:
				_localctx = new FactorBoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				match(BOOL_FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u012e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\6\2\65\n\2\r\2\16\2\66\3\3\3\3\3\3\3\3\5\3=\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\5\6T\n\6\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\5\nw\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\5\f\u0080\n\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u0099\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u00bf\n\21\3\22\3\22\6\22\u00c3\n\22\r\22\16\22\u00c4\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d1\n\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u00d9\n\23\f\23\16\23\u00dc\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00ef\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u0100\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u010b\n\26\3\27\3\27\3\27\3\27\7\27\u0111\n\27\f"+
		"\27\16\27\u0114\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u011c\n\30\f"+
		"\30\16\30\u011f\13\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u012c\n\31\3\31\2\3$\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\2\6\3\2),\3\2)*\3\2\30\35\4\2)*,,\2\u0142\2\62\3\2\2\2"+
		"\4<\3\2\2\2\6>\3\2\2\2\bE\3\2\2\2\nS\3\2\2\2\fZ\3\2\2\2\16k\3\2\2\2\20"+
		"m\3\2\2\2\22v\3\2\2\2\24x\3\2\2\2\26\u0088\3\2\2\2\30\u0098\3\2\2\2\32"+
		"\u009a\3\2\2\2\34\u00a0\3\2\2\2\36\u00a6\3\2\2\2 \u00be\3\2\2\2\"\u00c0"+
		"\3\2\2\2$\u00d0\3\2\2\2&\u00ee\3\2\2\2(\u00ff\3\2\2\2*\u010a\3\2\2\2,"+
		"\u010c\3\2\2\2.\u0117\3\2\2\2\60\u012b\3\2\2\2\62\64\5\4\3\2\63\65\5\16"+
		"\b\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\3\3\2"+
		"\2\289\5\6\4\29:\5\4\3\2:=\3\2\2\2;=\3\2\2\2<8\3\2\2\2<;\3\2\2\2=\5\3"+
		"\2\2\2>?\7#\2\2?@\7\65\2\2@A\7\b\2\2AB\5\f\7\2BC\7\t\2\2CD\5\b\5\2D\7"+
		"\3\2\2\2EF\7\n\2\2FG\5\n\6\2GH\7\13\2\2H\t\3\2\2\2IT\5\16\b\2JK\5\16\b"+
		"\2KL\5\n\6\2LT\3\2\2\2MN\7$\2\2NO\5(\25\2OP\7\62\2\2PT\3\2\2\2QR\7$\2"+
		"\2RT\7\62\2\2SI\3\2\2\2SJ\3\2\2\2SM\3\2\2\2SQ\3\2\2\2T\13\3\2\2\2U[\7"+
		"\65\2\2VW\7\65\2\2WX\7\r\2\2X[\5\f\7\2Y[\3\2\2\2ZU\3\2\2\2ZV\3\2\2\2Z"+
		"Y\3\2\2\2[\r\3\2\2\2\\]\5\22\n\2]^\7\62\2\2^l\3\2\2\2_l\5\30\r\2`l\5\34"+
		"\17\2al\5\36\20\2bc\5\32\16\2cd\7\62\2\2dl\3\2\2\2ef\5 \21\2fg\7\62\2"+
		"\2gl\3\2\2\2hl\7\62\2\2il\7\67\2\2jl\78\2\2k\\\3\2\2\2k_\3\2\2\2k`\3\2"+
		"\2\2ka\3\2\2\2kb\3\2\2\2ke\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3"+
		"\2\2\2mn\7\65\2\2no\7\b\2\2op\5\f\7\2pq\7\t\2\2q\21\3\2\2\2rw\5&\24\2"+
		"sw\5\24\13\2tw\5\26\f\2uw\5\20\t\2vr\3\2\2\2vs\3\2\2\2vt\3\2\2\2vu\3\2"+
		"\2\2w\23\3\2\2\2xy\7(\2\2yz\7\65\2\2z{\t\2\2\2{\25\3\2\2\2|}\7\'\2\2}"+
		"\177\7\65\2\2~\u0080\7\66\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0089"+
		"\3\2\2\2\u0081\u0082\7\'\2\2\u0082\u0083\7\3\2\2\u0083\u0089\7\61\2\2"+
		"\u0084\u0085\7\'\2\2\u0085\u0089\7\61\2\2\u0086\u0087\7\'\2\2\u0087\u0089"+
		"\5(\25\2\u0088|\3\2\2\2\u0088\u0081\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\27\3\2\2\2\u008a\u008b\7 \2\2\u008b\u008c\7\b\2\2"+
		"\u008c\u008d\5$\23\2\u008d\u008e\7\t\2\2\u008e\u008f\5\"\22\2\u008f\u0099"+
		"\3\2\2\2\u0090\u0091\7 \2\2\u0091\u0092\7\b\2\2\u0092\u0093\5$\23\2\u0093"+
		"\u0094\7\t\2\2\u0094\u0095\5\"\22\2\u0095\u0096\7&\2\2\u0096\u0097\5\""+
		"\22\2\u0097\u0099\3\2\2\2\u0098\u008a\3\2\2\2\u0098\u0090\3\2\2\2\u0099"+
		"\31\3\2\2\2\u009a\u009b\5$\23\2\u009b\u009c\7\4\2\2\u009c\u009d\7\61\2"+
		"\2\u009d\u009e\7\5\2\2\u009e\u009f\7\61\2\2\u009f\33\3\2\2\2\u00a0\u00a1"+
		"\7!\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a3\5$\23\2\u00a3\u00a4\7\t\2\2\u00a4"+
		"\u00a5\5\"\22\2\u00a5\35\3\2\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7\b\2"+
		"\2\u00a8\u00a9\7\65\2\2\u00a9\u00aa\7\62\2\2\u00aa\u00ab\5$\23\2\u00ab"+
		"\u00ac\7\62\2\2\u00ac\u00ad\5&\24\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5"+
		"\"\22\2\u00af\37\3\2\2\2\u00b0\u00b1\7-\2\2\u00b1\u00b2\7\31\2\2\u00b2"+
		"\u00b3\t\3\2\2\u00b3\u00b4\7\32\2\2\u00b4\u00b5\7\65\2\2\u00b5\u00b6\7"+
		"\f\2\2\u00b6\u00bf\5,\27\2\u00b7\u00b8\7-\2\2\u00b8\u00b9\7\31\2\2\u00b9"+
		"\u00ba\7+\2\2\u00ba\u00bb\7\32\2\2\u00bb\u00bc\7\65\2\2\u00bc\u00bd\7"+
		"\f\2\2\u00bd\u00bf\5.\30\2\u00be\u00b0\3\2\2\2\u00be\u00b7\3\2\2\2\u00bf"+
		"!\3\2\2\2\u00c0\u00c2\7\n\2\2\u00c1\u00c3\5\16\b\2\u00c2\u00c1\3\2\2\2"+
		"\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\u00c7\7\13\2\2\u00c7#\3\2\2\2\u00c8\u00c9\b\23\1\2\u00c9"+
		"\u00d1\5(\25\2\u00ca\u00cb\5(\25\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\5("+
		"\25\2\u00cd\u00d1\3\2\2\2\u00ce\u00cf\7\27\2\2\u00cf\u00d1\5$\23\3\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00da\3\2"+
		"\2\2\u00d2\u00d3\f\5\2\2\u00d3\u00d4\7\25\2\2\u00d4\u00d9\5$\23\6\u00d5"+
		"\u00d6\f\4\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00d9\5$\23\5\u00d8\u00d2\3"+
		"\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db%\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7+\2\2\u00de"+
		"\u00df\7\65\2\2\u00df\u00e0\7\f\2\2\u00e0\u00ef\7\61\2\2\u00e1\u00e2\t"+
		"\5\2\2\u00e2\u00e3\7\65\2\2\u00e3\u00e4\7\f\2\2\u00e4\u00ef\5(\25\2\u00e5"+
		"\u00e6\7\65\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00ef\5(\25\2\u00e8\u00e9\7"+
		"\65\2\2\u00e9\u00ea\7\20\2\2\u00ea\u00ef\5(\25\2\u00eb\u00ec\7\65\2\2"+
		"\u00ec\u00ed\7\21\2\2\u00ed\u00ef\5(\25\2\u00ee\u00dd\3\2\2\2\u00ee\u00e1"+
		"\3\2\2\2\u00ee\u00e5\3\2\2\2\u00ee\u00e8\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef"+
		"\'\3\2\2\2\u00f0\u00f1\5*\26\2\u00f1\u00f2\7\16\2\2\u00f2\u00f3\5(\25"+
		"\2\u00f3\u0100\3\2\2\2\u00f4\u00f5\5*\26\2\u00f5\u00f6\7\22\2\2\u00f6"+
		"\u00f7\5(\25\2\u00f7\u0100\3\2\2\2\u00f8\u00f9\5*\26\2\u00f9\u00fa\7\4"+
		"\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7\5\2\2\u00fc\u00fd\5(\25\2\u00fd"+
		"\u0100\3\2\2\2\u00fe\u0100\5*\26\2\u00ff\u00f0\3\2\2\2\u00ff\u00f4\3\2"+
		"\2\2\u00ff\u00f8\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100)\3\2\2\2\u0101\u0102"+
		"\5\60\31\2\u0102\u0103\7\23\2\2\u0103\u0104\5*\26\2\u0104\u010b\3\2\2"+
		"\2\u0105\u0106\5\60\31\2\u0106\u0107\7\24\2\2\u0107\u0108\5*\26\2\u0108"+
		"\u010b\3\2\2\2\u0109\u010b\5\60\31\2\u010a\u0101\3\2\2\2\u010a\u0105\3"+
		"\2\2\2\u010a\u0109\3\2\2\2\u010b+\3\2\2\2\u010c\u010d\7\6\2\2\u010d\u0112"+
		"\5\60\31\2\u010e\u010f\7\r\2\2\u010f\u0111\5\60\31\2\u0110\u010e\3\2\2"+
		"\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\7\2\2\u0116-\3\2\2\2\u0117"+
		"\u0118\7\6\2\2\u0118\u011d\7\61\2\2\u0119\u011a\7\r\2\2\u011a\u011c\7"+
		"\61\2\2\u011b\u0119\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7\7"+
		"\2\2\u0121/\3\2\2\2\u0122\u0123\7\b\2\2\u0123\u0124\5(\25\2\u0124\u0125"+
		"\7\t\2\2\u0125\u012c\3\2\2\2\u0126\u012c\7\65\2\2\u0127\u012c\7\64\2\2"+
		"\u0128\u012c\7\63\2\2\u0129\u012c\7\36\2\2\u012a\u012c\7\37\2\2\u012b"+
		"\u0122\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2\u012b\u0128\3\2"+
		"\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2\2\u012c\61\3\2\2\2\26\66<S"+
		"Zkv\177\u0088\u0098\u00be\u00c4\u00d0\u00d8\u00da\u00ee\u00ff\u010a\u0112"+
		"\u011d\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}