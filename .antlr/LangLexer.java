// Generated from c:\xampp\htdocs\antlr-compiler\Lang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, OE=6, CE=7, OB=8, CB=9, AT=10, 
		SEP=11, PLUS=12, ATRIB_PLUS=13, ATRIB_MINUS=14, MINUS=15, MULT=16, DIV=17, 
		AND=18, OR=19, NOT=20, EQ=21, LT=22, GT=23, LE=24, GE=25, NE=26, BOOL_TRUE=27, 
		BOOL_FALSE=28, IF=29, WHILE=30, FOR=31, FUNCTION=32, RETURN=33, THEN=34, 
		ELSE=35, WRITE=36, READ=37, INT=38, DOUBLE=39, STRING=40, BOOLEAN=41, 
		ARRAY=42, ARRAY_INT=43, ARRAY_DOUBLE=44, ARRAY_STRING=45, STR=46, EOL=47, 
		NUM=48, DECIM=49, VAR=50, POSITION=51, COMMENT_LINE=52, COMMENT_BLOCK=53, 
		WS=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "OE", "CE", "OB", "CB", "AT", 
			"SEP", "PLUS", "ATRIB_PLUS", "ATRIB_MINUS", "MINUS", "MULT", "DIV", "AND", 
			"OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOOL_FALSE", 
			"IF", "WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", "WRITE", 
			"READ", "INT", "DOUBLE", "STRING", "BOOLEAN", "ARRAY", "ARRAY_INT", "ARRAY_DOUBLE", 
			"ARRAY_STRING", "STR", "EOL", "NUM", "DECIM", "VAR", "POSITION", "COMMENT_LINE", 
			"COMMENT_BLOCK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'f'", "'?'", "':'", "'['", "']'", "'('", "')'", "'{'", "'}'", 
			"'='", "','", "'+'", "'+='", "'-='", "'-'", "'*'", "'/'", "'&&'", "'||'", 
			"'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'true'", "'false'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", 
			"PLUS", "ATRIB_PLUS", "ATRIB_MINUS", "MINUS", "MULT", "DIV", "AND", "OR", 
			"NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOOL_FALSE", 
			"IF", "WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", "WRITE", 
			"READ", "INT", "DOUBLE", "STRING", "BOOLEAN", "ARRAY", "ARRAY_INT", "ARRAY_DOUBLE", 
			"ARRAY_STRING", "STR", "EOL", "NUM", "DECIM", "VAR", "POSITION", "COMMENT_LINE", 
			"COMMENT_BLOCK", "WS"
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u018c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3/\3"+
		"/\7/\u0132\n/\f/\16/\u0135\13/\3/\3/\3\60\3\60\3\61\5\61\u013c\n\61\3"+
		"\61\6\61\u013f\n\61\r\61\16\61\u0140\3\62\5\62\u0144\n\62\3\62\6\62\u0147"+
		"\n\62\r\62\16\62\u0148\3\62\3\62\6\62\u014d\n\62\r\62\16\62\u014e\5\62"+
		"\u0151\n\62\3\62\5\62\u0154\n\62\3\62\3\62\6\62\u0158\n\62\r\62\16\62"+
		"\u0159\5\62\u015c\n\62\3\63\3\63\7\63\u0160\n\63\f\63\16\63\u0163\13\63"+
		"\3\64\3\64\6\64\u0167\n\64\r\64\16\64\u0168\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\7\65\u0171\n\65\f\65\16\65\u0174\13\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\7\66\u017c\n\66\f\66\16\66\u017f\13\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\6\67\u0187\n\67\r\67\16\67\u0188\3\67\3\67\3\u017d\28\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8\3\2\32\4\2KK"+
		"kk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2GGgg\4\2QQqq\4\2TTtt\4\2WWww\4\2"+
		"PPpp\4\2EEee\4\2VVvv\4\2UUuu\4\2CCcc\4\2FFff\4\2DDdd\4\2IIii\4\2[[{{\3"+
		"\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\2\u019a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\3o\3\2\2\2\5q\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\r"+
		"y\3\2\2\2\17{\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27\u0083"+
		"\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u008a\3\2\2\2\37\u008d\3"+
		"\2\2\2!\u008f\3\2\2\2#\u0091\3\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u0099"+
		"\3\2\2\2+\u009b\3\2\2\2-\u009e\3\2\2\2/\u00a0\3\2\2\2\61\u00a2\3\2\2\2"+
		"\63\u00a5\3\2\2\2\65\u00a8\3\2\2\2\67\u00ab\3\2\2\29\u00b0\3\2\2\2;\u00b6"+
		"\3\2\2\2=\u00b9\3\2\2\2?\u00bf\3\2\2\2A\u00c3\3\2\2\2C\u00cc\3\2\2\2E"+
		"\u00d3\3\2\2\2G\u00d8\3\2\2\2I\u00dd\3\2\2\2K\u00e3\3\2\2\2M\u00e8\3\2"+
		"\2\2O\u00ec\3\2\2\2Q\u00f3\3\2\2\2S\u00fa\3\2\2\2U\u0102\3\2\2\2W\u0108"+
		"\3\2\2\2Y\u0113\3\2\2\2[\u0121\3\2\2\2]\u012f\3\2\2\2_\u0138\3\2\2\2a"+
		"\u013b\3\2\2\2c\u015b\3\2\2\2e\u015d\3\2\2\2g\u0164\3\2\2\2i\u016c\3\2"+
		"\2\2k\u0177\3\2\2\2m\u0186\3\2\2\2op\7h\2\2p\4\3\2\2\2qr\7A\2\2r\6\3\2"+
		"\2\2st\7<\2\2t\b\3\2\2\2uv\7]\2\2v\n\3\2\2\2wx\7_\2\2x\f\3\2\2\2yz\7*"+
		"\2\2z\16\3\2\2\2{|\7+\2\2|\20\3\2\2\2}~\7}\2\2~\22\3\2\2\2\177\u0080\7"+
		"\177\2\2\u0080\24\3\2\2\2\u0081\u0082\7?\2\2\u0082\26\3\2\2\2\u0083\u0084"+
		"\7.\2\2\u0084\30\3\2\2\2\u0085\u0086\7-\2\2\u0086\32\3\2\2\2\u0087\u0088"+
		"\7-\2\2\u0088\u0089\7?\2\2\u0089\34\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008c"+
		"\7?\2\2\u008c\36\3\2\2\2\u008d\u008e\7/\2\2\u008e \3\2\2\2\u008f\u0090"+
		"\7,\2\2\u0090\"\3\2\2\2\u0091\u0092\7\61\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\7(\2\2\u0094\u0095\7(\2\2\u0095&\3\2\2\2\u0096\u0097\7~\2\2\u0097\u0098"+
		"\7~\2\2\u0098(\3\2\2\2\u0099\u009a\7#\2\2\u009a*\3\2\2\2\u009b\u009c\7"+
		"?\2\2\u009c\u009d\7?\2\2\u009d,\3\2\2\2\u009e\u009f\7>\2\2\u009f.\3\2"+
		"\2\2\u00a0\u00a1\7@\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\7?\2\2\u00a7\64"+
		"\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7?\2\2\u00aa\66\3\2\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7w\2\2\u00ae\u00af\7g\2\2"+
		"\u00af8\3\2\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2"+
		"\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7g\2\2\u00b5:\3\2\2\2\u00b6\u00b7\t"+
		"\2\2\2\u00b7\u00b8\t\3\2\2\u00b8<\3\2\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00bb"+
		"\t\5\2\2\u00bb\u00bc\t\2\2\2\u00bc\u00bd\t\6\2\2\u00bd\u00be\t\7\2\2\u00be"+
		">\3\2\2\2\u00bf\u00c0\t\3\2\2\u00c0\u00c1\t\b\2\2\u00c1\u00c2\t\t\2\2"+
		"\u00c2@\3\2\2\2\u00c3\u00c4\t\3\2\2\u00c4\u00c5\t\n\2\2\u00c5\u00c6\t"+
		"\13\2\2\u00c6\u00c7\t\f\2\2\u00c7\u00c8\t\r\2\2\u00c8\u00c9\t\2\2\2\u00c9"+
		"\u00ca\t\b\2\2\u00ca\u00cb\t\13\2\2\u00cbB\3\2\2\2\u00cc\u00cd\t\t\2\2"+
		"\u00cd\u00ce\t\7\2\2\u00ce\u00cf\t\r\2\2\u00cf\u00d0\t\n\2\2\u00d0\u00d1"+
		"\t\t\2\2\u00d1\u00d2\t\13\2\2\u00d2D\3\2\2\2\u00d3\u00d4\t\r\2\2\u00d4"+
		"\u00d5\t\5\2\2\u00d5\u00d6\t\7\2\2\u00d6\u00d7\t\13\2\2\u00d7F\3\2\2\2"+
		"\u00d8\u00d9\t\7\2\2\u00d9\u00da\t\6\2\2\u00da\u00db\t\16\2\2\u00db\u00dc"+
		"\t\7\2\2\u00dcH\3\2\2\2\u00dd\u00de\t\4\2\2\u00de\u00df\t\t\2\2\u00df"+
		"\u00e0\t\2\2\2\u00e0\u00e1\t\r\2\2\u00e1\u00e2\t\7\2\2\u00e2J\3\2\2\2"+
		"\u00e3\u00e4\t\t\2\2\u00e4\u00e5\t\7\2\2\u00e5\u00e6\t\17\2\2\u00e6\u00e7"+
		"\t\20\2\2\u00e7L\3\2\2\2\u00e8\u00e9\t\2\2\2\u00e9\u00ea\t\13\2\2\u00ea"+
		"\u00eb\t\r\2\2\u00ebN\3\2\2\2\u00ec\u00ed\t\20\2\2\u00ed\u00ee\t\b\2\2"+
		"\u00ee\u00ef\t\n\2\2\u00ef\u00f0\t\21\2\2\u00f0\u00f1\t\6\2\2\u00f1\u00f2"+
		"\t\7\2\2\u00f2P\3\2\2\2\u00f3\u00f4\t\16\2\2\u00f4\u00f5\t\r\2\2\u00f5"+
		"\u00f6\t\t\2\2\u00f6\u00f7\t\2\2\2\u00f7\u00f8\t\13\2\2\u00f8\u00f9\t"+
		"\22\2\2\u00f9R\3\2\2\2\u00fa\u00fb\t\21\2\2\u00fb\u00fc\t\b\2\2\u00fc"+
		"\u00fd\t\b\2\2\u00fd\u00fe\t\6\2\2\u00fe\u00ff\t\7\2\2\u00ff\u0100\t\17"+
		"\2\2\u0100\u0101\t\13\2\2\u0101T\3\2\2\2\u0102\u0103\t\17\2\2\u0103\u0104"+
		"\t\t\2\2\u0104\u0105\t\t\2\2\u0105\u0106\t\17\2\2\u0106\u0107\t\23\2\2"+
		"\u0107V\3\2\2\2\u0108\u0109\t\17\2\2\u0109\u010a\t\t\2\2\u010a\u010b\t"+
		"\t\2\2\u010b\u010c\t\17\2\2\u010c\u010d\t\23\2\2\u010d\u010e\7>\2\2\u010e"+
		"\u010f\t\2\2\2\u010f\u0110\t\13\2\2\u0110\u0111\t\r\2\2\u0111\u0112\7"+
		"@\2\2\u0112X\3\2\2\2\u0113\u0114\t\17\2\2\u0114\u0115\t\t\2\2\u0115\u0116"+
		"\t\t\2\2\u0116\u0117\t\17\2\2\u0117\u0118\t\23\2\2\u0118\u0119\7>\2\2"+
		"\u0119\u011a\t\20\2\2\u011a\u011b\t\b\2\2\u011b\u011c\t\n\2\2\u011c\u011d"+
		"\t\21\2\2\u011d\u011e\t\6\2\2\u011e\u011f\t\7\2\2\u011f\u0120\7@\2\2\u0120"+
		"Z\3\2\2\2\u0121\u0122\t\17\2\2\u0122\u0123\t\t\2\2\u0123\u0124\t\t\2\2"+
		"\u0124\u0125\t\17\2\2\u0125\u0126\t\23\2\2\u0126\u0127\7>\2\2\u0127\u0128"+
		"\t\16\2\2\u0128\u0129\t\r\2\2\u0129\u012a\t\t\2\2\u012a\u012b\t\2\2\2"+
		"\u012b\u012c\t\13\2\2\u012c\u012d\t\22\2\2\u012d\u012e\7@\2\2\u012e\\"+
		"\3\2\2\2\u012f\u0133\7$\2\2\u0130\u0132\n\24\2\2\u0131\u0130\3\2\2\2\u0132"+
		"\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0136\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0136\u0137\7$\2\2\u0137^\3\2\2\2\u0138\u0139"+
		"\7=\2\2\u0139`\3\2\2\2\u013a\u013c\7/\2\2\u013b\u013a\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013f\t\25\2\2\u013e\u013d\3\2\2\2"+
		"\u013f\u0140\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141b\3"+
		"\2\2\2\u0142\u0144\7/\2\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144"+
		"\u0146\3\2\2\2\u0145\u0147\t\25\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u0150\3\2\2\2\u014a"+
		"\u014c\7\60\2\2\u014b\u014d\t\25\2\2\u014c\u014b\3\2\2\2\u014d\u014e\3"+
		"\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150"+
		"\u014a\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u015c\3\2\2\2\u0152\u0154\7/"+
		"\2\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\7\60\2\2\u0156\u0158\t\25\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0143\3\2\2\2\u015b\u0153\3\2\2\2\u015cd\3\2\2\2\u015d\u0161\t\26\2\2"+
		"\u015e\u0160\t\27\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0161\u0162\3\2\2\2\u0162f\3\2\2\2\u0163\u0161\3\2\2\2\u0164"+
		"\u0166\7]\2\2\u0165\u0167\t\25\2\2\u0166\u0165\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u016b\7_\2\2\u016bh\3\2\2\2\u016c\u016d\7\61\2\2\u016d\u016e\7\61\2\2"+
		"\u016e\u0172\3\2\2\2\u016f\u0171\n\30\2\2\u0170\u016f\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0175\u0176\b\65\2\2\u0176j\3\2\2\2\u0177\u0178\7\61\2"+
		"\2\u0178\u0179\7,\2\2\u0179\u017d\3\2\2\2\u017a\u017c\13\2\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e"+
		"\u0180\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\7,\2\2\u0181\u0182\7\61"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\b\66\2\2\u0184l\3\2\2\2\u0185\u0187"+
		"\t\31\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2"+
		"\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\b\67\2\2\u018bn\3"+
		"\2\2\2\22\2\u0133\u013b\u0140\u0143\u0148\u014e\u0150\u0153\u0159\u015b"+
		"\u0161\u0168\u0172\u017d\u0188\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}