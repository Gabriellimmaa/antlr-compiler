// Generated from c:\Users\carlo\OneDrive\Documentos\GitHub\antlr-compiler\Lang.g4 by ANTLR 4.9.2
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
		T__0=1, T__1=2, T__2=3, OE=4, CE=5, OB=6, CB=7, AT=8, SEP=9, PLUS=10, 
		ATRIB_PLUS=11, ATRIB_MINUS=12, MINUS=13, MULT=14, DIV=15, AND=16, OR=17, 
		NOT=18, EQ=19, LT=20, GT=21, LE=22, GE=23, NE=24, BOOL_TRUE=25, BOOL_FALSE=26, 
		IF=27, WHILE=28, FOR=29, FUNCTION=30, RETURN=31, THEN=32, ELSE=33, WRITE=34, 
		READ=35, INT=36, DOUBLE=37, STRING=38, BOOLEAN=39, STR=40, EOL=41, NUM=42, 
		DECIM=43, VAR=44, COMMENT_LINE=45, COMMENT_BLOCK=46, WS=47;
	public static final int
		RULE_prog = 0, RULE_functions = 1, RULE_function = 2, RULE_fnBlock = 3, 
		RULE_fnBody = 4, RULE_params = 5, RULE_line = 6, RULE_funcInvoc = 7, RULE_stmt = 8, 
		RULE_input = 9, RULE_output = 10, RULE_ifst = 11, RULE_ternary = 12, RULE_whilest = 13, 
		RULE_forst = 14, RULE_block = 15, RULE_cond = 16, RULE_atrib = 17, RULE_expr = 18, 
		RULE_term = 19, RULE_factor = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "functions", "function", "fnBlock", "fnBody", "params", "line", 
			"funcInvoc", "stmt", "input", "output", "ifst", "ternary", "whilest", 
			"forst", "block", "cond", "atrib", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", "'?'", "':'", "'('", "')'", "'{'", "'}'", "'='", "','", 
			"'+'", "'+='", "'-='", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'=='", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'true'", "'false'", null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", 
			"ATRIB_PLUS", "ATRIB_MINUS", "MINUS", "MULT", "DIV", "AND", "OR", "NOT", 
			"EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOOL_FALSE", "IF", 
			"WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", "WRITE", "READ", 
			"INT", "DOUBLE", "STRING", "BOOLEAN", "STR", "EOL", "NUM", "DECIM", "VAR", 
			"COMMENT_LINE", "COMMENT_BLOCK", "WS"
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
			setState(42);
			functions();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				line();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OE) | (1L << NOT) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << WRITE) | (1L << READ) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << EOL) | (1L << NUM) | (1L << DECIM) | (1L << VAR) | (1L << COMMENT_LINE) | (1L << COMMENT_BLOCK))) != 0) );
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
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				function();
				setState(49);
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
			setState(54);
			match(FUNCTION);
			setState(55);
			match(VAR);
			setState(56);
			match(OE);
			setState(57);
			params();
			setState(58);
			match(CE);
			setState(59);
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
			setState(61);
			match(OB);
			setState(62);
			fnBody();
			setState(63);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FnBodyLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				line();
				}
				break;
			case 2:
				_localctx = new FnBodyLineMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				line();
				setState(67);
				fnBody();
				}
				break;
			case 3:
				_localctx = new FnReturnExprLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(RETURN);
				setState(70);
				expr();
				setState(71);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new FnReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(RETURN);
				setState(74);
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
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(VAR);
				setState(79);
				match(SEP);
				setState(80);
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

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new LineStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				stmt();
				setState(85);
				match(EOL);
				}
				break;
			case 2:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				ifst();
				}
				break;
			case 3:
				_localctx = new LineWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				whilest();
				}
				break;
			case 4:
				_localctx = new LineForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				forst();
				}
				break;
			case 5:
				_localctx = new LineTernaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				ternary();
				setState(91);
				match(EOL);
				}
				break;
			case 6:
				_localctx = new LineEOLContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(93);
				match(EOL);
				}
				break;
			case 7:
				_localctx = new LineCommentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(94);
				match(COMMENT_LINE);
				}
				break;
			case 8:
				_localctx = new BlockCommentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(95);
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
			setState(98);
			match(VAR);
			setState(99);
			match(OE);
			setState(100);
			params();
			setState(101);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StmtAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				atrib();
				}
				break;
			case 2:
				_localctx = new StmtInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				input();
				}
				break;
			case 3:
				_localctx = new StmtOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				output();
				}
				break;
			case 4:
				_localctx = new LineFuncInvocContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
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
			setState(109);
			match(READ);
			setState(110);
			match(VAR);
			setState(111);
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
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new OutputWriteVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(WRITE);
				setState(114);
				match(VAR);
				}
				break;
			case 2:
				_localctx = new OutputWriteFStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(WRITE);
				setState(116);
				match(T__0);
				setState(117);
				match(STR);
				}
				break;
			case 3:
				_localctx = new OutputWriteStrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(WRITE);
				setState(119);
				match(STR);
				}
				break;
			case 4:
				_localctx = new OutputWriteExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(WRITE);
				setState(121);
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
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfstIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(IF);
				setState(125);
				match(OE);
				setState(126);
				cond(0);
				setState(127);
				match(CE);
				setState(128);
				block();
				}
				break;
			case 2:
				_localctx = new IfstIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(IF);
				setState(131);
				match(OE);
				setState(132);
				cond(0);
				setState(133);
				match(CE);
				setState(134);
				((IfstIfElseContext)_localctx).b1 = block();
				setState(135);
				match(ELSE);
				setState(136);
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
			setState(140);
			cond(0);
			setState(141);
			match(T__1);
			setState(142);
			((TernaryCondContext)_localctx).e1 = match(STR);
			setState(143);
			match(T__2);
			setState(144);
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
			setState(146);
			match(WHILE);
			setState(147);
			match(OE);
			setState(148);
			cond(0);
			setState(149);
			match(CE);
			setState(150);
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
			setState(152);
			match(FOR);
			setState(153);
			match(OE);
			setState(154);
			match(VAR);
			setState(155);
			match(EOL);
			setState(156);
			cond(0);
			setState(157);
			match(EOL);
			setState(158);
			atrib();
			setState(159);
			match(CE);
			setState(160);
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
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(OB);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				line();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OE) | (1L << NOT) | (1L << BOOL_TRUE) | (1L << BOOL_FALSE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << WRITE) | (1L << READ) | (1L << INT) | (1L << DOUBLE) | (1L << STRING) | (1L << BOOLEAN) | (1L << EOL) | (1L << NUM) | (1L << DECIM) | (1L << VAR) | (1L << COMMENT_LINE) | (1L << COMMENT_BLOCK))) != 0) );
			setState(168);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new CondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(171);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new CondRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				((CondRelopContext)_localctx).e1 = expr();
				setState(173);
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
				setState(174);
				((CondRelopContext)_localctx).e2 = expr();
				}
				break;
			case 3:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(NOT);
				setState(177);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(180);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(181);
						match(AND);
						setState(182);
						((CondAndContext)_localctx).c2 = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(183);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(184);
						match(OR);
						setState(185);
						((CondOrContext)_localctx).c2 = cond(3);
						}
						break;
					}
					} 
				}
				setState(190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 34, RULE_atrib);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new AtribStringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(STRING);
				setState(192);
				match(VAR);
				setState(193);
				match(AT);
				setState(194);
				match(STR);
				}
				break;
			case 2:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
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
				setState(196);
				match(VAR);
				setState(197);
				match(AT);
				setState(198);
				expr();
				}
				break;
			case 3:
				_localctx = new AtribPlusContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(VAR);
				setState(200);
				match(ATRIB_PLUS);
				setState(201);
				expr();
				}
				break;
			case 4:
				_localctx = new AtribMinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				match(VAR);
				setState(203);
				match(ATRIB_MINUS);
				setState(204);
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
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				term();
				setState(208);
				match(PLUS);
				setState(209);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				term();
				setState(212);
				match(MINUS);
				setState(213);
				expr();
				}
				break;
			case 3:
				_localctx = new CondTernaryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(215);
				term();
				setState(216);
				match(T__1);
				setState(217);
				expr();
				setState(218);
				match(T__2);
				setState(219);
				expr();
				}
				break;
			case 4:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
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
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				factor();
				setState(225);
				match(MULT);
				setState(226);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				factor();
				setState(229);
				match(DIV);
				setState(230);
				term();
				}
				break;
			case 3:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
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
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OE:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(OE);
				setState(236);
				expr();
				setState(237);
				match(CE);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(VAR);
				}
				break;
			case DECIM:
				_localctx = new FactorDecimContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(DECIM);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(NUM);
				}
				break;
			case BOOL_TRUE:
				_localctx = new FactorBoolTrueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(242);
				match(BOOL_TRUE);
				}
				break;
			case BOOL_FALSE:
				_localctx = new FactorBoolFalseContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(243);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u00f9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\6\2/\n\2\r\2\16\2\60"+
		"\3\3\3\3\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\5\7U\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\6\21\u00a7\n\21\r\21\16\21\u00a8\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b5\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00bd\n\22\f\22\16\22\u00c0\13\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d0\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00e1\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ec"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00f7\n\26\3\26"+
		"\2\3\"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2&)\3\2"+
		"\25\32\4\2&\'))\2\u010a\2,\3\2\2\2\4\66\3\2\2\2\68\3\2\2\2\b?\3\2\2\2"+
		"\nM\3\2\2\2\fT\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22m\3\2\2\2\24o\3\2\2\2"+
		"\26|\3\2\2\2\30\u008c\3\2\2\2\32\u008e\3\2\2\2\34\u0094\3\2\2\2\36\u009a"+
		"\3\2\2\2 \u00a4\3\2\2\2\"\u00b4\3\2\2\2$\u00cf\3\2\2\2&\u00e0\3\2\2\2"+
		"(\u00eb\3\2\2\2*\u00f6\3\2\2\2,.\5\4\3\2-/\5\16\b\2.-\3\2\2\2/\60\3\2"+
		"\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\63\5\6\4\2\63\64\5\4\3"+
		"\2\64\67\3\2\2\2\65\67\3\2\2\2\66\62\3\2\2\2\66\65\3\2\2\2\67\5\3\2\2"+
		"\289\7 \2\29:\7.\2\2:;\7\6\2\2;<\5\f\7\2<=\7\7\2\2=>\5\b\5\2>\7\3\2\2"+
		"\2?@\7\b\2\2@A\5\n\6\2AB\7\t\2\2B\t\3\2\2\2CN\5\16\b\2DE\5\16\b\2EF\5"+
		"\n\6\2FN\3\2\2\2GH\7!\2\2HI\5&\24\2IJ\7+\2\2JN\3\2\2\2KL\7!\2\2LN\7+\2"+
		"\2MC\3\2\2\2MD\3\2\2\2MG\3\2\2\2MK\3\2\2\2N\13\3\2\2\2OU\7.\2\2PQ\7.\2"+
		"\2QR\7\13\2\2RU\5\f\7\2SU\3\2\2\2TO\3\2\2\2TP\3\2\2\2TS\3\2\2\2U\r\3\2"+
		"\2\2VW\5\22\n\2WX\7+\2\2Xc\3\2\2\2Yc\5\30\r\2Zc\5\34\17\2[c\5\36\20\2"+
		"\\]\5\32\16\2]^\7+\2\2^c\3\2\2\2_c\7+\2\2`c\7/\2\2ac\7\60\2\2bV\3\2\2"+
		"\2bY\3\2\2\2bZ\3\2\2\2b[\3\2\2\2b\\\3\2\2\2b_\3\2\2\2b`\3\2\2\2ba\3\2"+
		"\2\2c\17\3\2\2\2de\7.\2\2ef\7\6\2\2fg\5\f\7\2gh\7\7\2\2h\21\3\2\2\2in"+
		"\5$\23\2jn\5\24\13\2kn\5\26\f\2ln\5\20\t\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2"+
		"\2ml\3\2\2\2n\23\3\2\2\2op\7%\2\2pq\7.\2\2qr\t\2\2\2r\25\3\2\2\2st\7$"+
		"\2\2t}\7.\2\2uv\7$\2\2vw\7\3\2\2w}\7*\2\2xy\7$\2\2y}\7*\2\2z{\7$\2\2{"+
		"}\5&\24\2|s\3\2\2\2|u\3\2\2\2|x\3\2\2\2|z\3\2\2\2}\27\3\2\2\2~\177\7\35"+
		"\2\2\177\u0080\7\6\2\2\u0080\u0081\5\"\22\2\u0081\u0082\7\7\2\2\u0082"+
		"\u0083\5 \21\2\u0083\u008d\3\2\2\2\u0084\u0085\7\35\2\2\u0085\u0086\7"+
		"\6\2\2\u0086\u0087\5\"\22\2\u0087\u0088\7\7\2\2\u0088\u0089\5 \21\2\u0089"+
		"\u008a\7#\2\2\u008a\u008b\5 \21\2\u008b\u008d\3\2\2\2\u008c~\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f\5\"\22\2\u008f\u0090\7\4\2"+
		"\2\u0090\u0091\7*\2\2\u0091\u0092\7\5\2\2\u0092\u0093\7*\2\2\u0093\33"+
		"\3\2\2\2\u0094\u0095\7\36\2\2\u0095\u0096\7\6\2\2\u0096\u0097\5\"\22\2"+
		"\u0097\u0098\7\7\2\2\u0098\u0099\5 \21\2\u0099\35\3\2\2\2\u009a\u009b"+
		"\7\37\2\2\u009b\u009c\7\6\2\2\u009c\u009d\7.\2\2\u009d\u009e\7+\2\2\u009e"+
		"\u009f\5\"\22\2\u009f\u00a0\7+\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\7"+
		"\2\2\u00a2\u00a3\5 \21\2\u00a3\37\3\2\2\2\u00a4\u00a6\7\b\2\2\u00a5\u00a7"+
		"\5\16\b\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\t\2\2\u00ab!\3"+
		"\2\2\2\u00ac\u00ad\b\22\1\2\u00ad\u00b5\5&\24\2\u00ae\u00af\5&\24\2\u00af"+
		"\u00b0\t\3\2\2\u00b0\u00b1\5&\24\2\u00b1\u00b5\3\2\2\2\u00b2\u00b3\7\24"+
		"\2\2\u00b3\u00b5\5\"\22\3\u00b4\u00ac\3\2\2\2\u00b4\u00ae\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00be\3\2\2\2\u00b6\u00b7\f\5\2\2\u00b7\u00b8\7\22"+
		"\2\2\u00b8\u00bd\5\"\22\6\u00b9\u00ba\f\4\2\2\u00ba\u00bb\7\23\2\2\u00bb"+
		"\u00bd\5\"\22\5\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf#\3\2\2\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c2\7(\2\2\u00c2\u00c3\7.\2\2\u00c3\u00c4\7\n\2\2\u00c4"+
		"\u00d0\7*\2\2\u00c5\u00c6\t\4\2\2\u00c6\u00c7\7.\2\2\u00c7\u00c8\7\n\2"+
		"\2\u00c8\u00d0\5&\24\2\u00c9\u00ca\7.\2\2\u00ca\u00cb\7\r\2\2\u00cb\u00d0"+
		"\5&\24\2\u00cc\u00cd\7.\2\2\u00cd\u00ce\7\16\2\2\u00ce\u00d0\5&\24\2\u00cf"+
		"\u00c1\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2"+
		"\2\2\u00d0%\3\2\2\2\u00d1\u00d2\5(\25\2\u00d2\u00d3\7\f\2\2\u00d3\u00d4"+
		"\5&\24\2\u00d4\u00e1\3\2\2\2\u00d5\u00d6\5(\25\2\u00d6\u00d7\7\17\2\2"+
		"\u00d7\u00d8\5&\24\2\u00d8\u00e1\3\2\2\2\u00d9\u00da\5(\25\2\u00da\u00db"+
		"\7\4\2\2\u00db\u00dc\5&\24\2\u00dc\u00dd\7\5\2\2\u00dd\u00de\5&\24\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00e1\5(\25\2\u00e0\u00d1\3\2\2\2\u00e0\u00d5\3\2"+
		"\2\2\u00e0\u00d9\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\'\3\2\2\2\u00e2\u00e3"+
		"\5*\26\2\u00e3\u00e4\7\20\2\2\u00e4\u00e5\5(\25\2\u00e5\u00ec\3\2\2\2"+
		"\u00e6\u00e7\5*\26\2\u00e7\u00e8\7\21\2\2\u00e8\u00e9\5(\25\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00ec\5*\26\2\u00eb\u00e2\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb"+
		"\u00ea\3\2\2\2\u00ec)\3\2\2\2\u00ed\u00ee\7\6\2\2\u00ee\u00ef\5&\24\2"+
		"\u00ef\u00f0\7\7\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00f7\7.\2\2\u00f2\u00f7"+
		"\7-\2\2\u00f3\u00f7\7,\2\2\u00f4\u00f7\7\33\2\2\u00f5\u00f7\7\34\2\2\u00f6"+
		"\u00ed\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2"+
		"\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f5\3\2\2\2\u00f7+\3\2\2\2\22\60\66M"+
		"Tbm|\u008c\u00a8\u00b4\u00bc\u00be\u00cf\u00e0\u00eb\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}