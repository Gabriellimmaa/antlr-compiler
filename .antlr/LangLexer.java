// Generated from c:\Users\carlo\OneDrive\Documentos\GitHub\antlr-compiler\Lang.g4 by ANTLR 4.9.2
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
		OE=1, CE=2, OB=3, CB=4, AT=5, SEP=6, PLUS=7, MINUS=8, MULT=9, DIV=10, 
		AND=11, OR=12, NOT=13, EQ=14, LT=15, GT=16, LE=17, GE=18, NE=19, BOOL_TRUE=20, 
		BOL_FALSE=21, IF=22, WHILE=23, FOR=24, FUNCTION=25, RETURN=26, THEN=27, 
		ELSE=28, WRITE=29, READ=30, INT=31, DOUBLE=32, STRING=33, STR=34, EOL=35, 
		NUM=36, DECIM=37, VAR=38, COMMENT=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", 
			"BOL_FALSE", "IF", "WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", 
			"WRITE", "READ", "INT", "DOUBLE", "STRING", "STR", "EOL", "NUM", "DECIM", 
			"VAR", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'='", "','", "'+'", "'-'", "'*'", 
			"'/'", "'&&'", "'||'", "'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'true'", "'false'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", "MULT", "DIV", 
			"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", 
			"BOL_FALSE", "IF", "WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", 
			"WRITE", "READ", "INT", "DOUBLE", "STRING", "STR", "EOL", "NUM", "DECIM", 
			"VAR", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u010b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\7#\u00d1"+
		"\n#\f#\16#\u00d4\13#\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u00e4"+
		"\n%\3&\6&\u00e7\n&\r&\16&\u00e8\3&\3&\6&\u00ed\n&\r&\16&\u00ee\5&\u00f1"+
		"\n&\3\'\3\'\7\'\u00f5\n\'\f\'\16\'\u00f8\13\'\3(\3(\3(\3(\7(\u00fe\n("+
		"\f(\16(\u0101\13(\3(\3(\3)\6)\u0106\n)\r)\16)\u0107\3)\3)\2\2*\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*\3\2\31\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2GG"+
		"gg\4\2QQqq\4\2TTtt\4\2WWww\4\2PPpp\4\2EEee\4\2VVvv\4\2UUuu\4\2CCcc\4\2"+
		"FFff\4\2DDdd\4\2IIii\3\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17"+
		"\17\5\2\13\f\17\17\"\"\2\u0114\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3\2\2\2\13[\3\2"+
		"\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3"+
		"\2\2\2\31j\3\2\2\2\33m\3\2\2\2\35o\3\2\2\2\37r\3\2\2\2!t\3\2\2\2#v\3\2"+
		"\2\2%y\3\2\2\2\'|\3\2\2\2)\177\3\2\2\2+\u0084\3\2\2\2-\u008a\3\2\2\2/"+
		"\u008d\3\2\2\2\61\u0093\3\2\2\2\63\u0097\3\2\2\2\65\u00a0\3\2\2\2\67\u00a7"+
		"\3\2\2\29\u00ac\3\2\2\2;\u00b1\3\2\2\2=\u00b7\3\2\2\2?\u00bc\3\2\2\2A"+
		"\u00c0\3\2\2\2C\u00c7\3\2\2\2E\u00ce\3\2\2\2G\u00d7\3\2\2\2I\u00e3\3\2"+
		"\2\2K\u00e6\3\2\2\2M\u00f2\3\2\2\2O\u00f9\3\2\2\2Q\u0105\3\2\2\2ST\7*"+
		"\2\2T\4\3\2\2\2UV\7+\2\2V\6\3\2\2\2WX\7}\2\2X\b\3\2\2\2YZ\7\177\2\2Z\n"+
		"\3\2\2\2[\\\7?\2\2\\\f\3\2\2\2]^\7.\2\2^\16\3\2\2\2_`\7-\2\2`\20\3\2\2"+
		"\2ab\7/\2\2b\22\3\2\2\2cd\7,\2\2d\24\3\2\2\2ef\7\61\2\2f\26\3\2\2\2gh"+
		"\7(\2\2hi\7(\2\2i\30\3\2\2\2jk\7~\2\2kl\7~\2\2l\32\3\2\2\2mn\7#\2\2n\34"+
		"\3\2\2\2op\7?\2\2pq\7?\2\2q\36\3\2\2\2rs\7>\2\2s \3\2\2\2tu\7@\2\2u\""+
		"\3\2\2\2vw\7>\2\2wx\7?\2\2x$\3\2\2\2yz\7@\2\2z{\7?\2\2{&\3\2\2\2|}\7#"+
		"\2\2}~\7?\2\2~(\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7w\2\2\u0082\u0083\7g\2\2\u0083*\3\2\2\2\u0084\u0085\7h\2\2\u0085\u0086"+
		"\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088\u0089\7g\2\2\u0089"+
		",\3\2\2\2\u008a\u008b\t\2\2\2\u008b\u008c\t\3\2\2\u008c.\3\2\2\2\u008d"+
		"\u008e\t\4\2\2\u008e\u008f\t\5\2\2\u008f\u0090\t\2\2\2\u0090\u0091\t\6"+
		"\2\2\u0091\u0092\t\7\2\2\u0092\60\3\2\2\2\u0093\u0094\t\3\2\2\u0094\u0095"+
		"\t\b\2\2\u0095\u0096\t\t\2\2\u0096\62\3\2\2\2\u0097\u0098\t\3\2\2\u0098"+
		"\u0099\t\n\2\2\u0099\u009a\t\13\2\2\u009a\u009b\t\f\2\2\u009b\u009c\t"+
		"\r\2\2\u009c\u009d\t\2\2\2\u009d\u009e\t\b\2\2\u009e\u009f\t\13\2\2\u009f"+
		"\64\3\2\2\2\u00a0\u00a1\t\t\2\2\u00a1\u00a2\t\7\2\2\u00a2\u00a3\t\r\2"+
		"\2\u00a3\u00a4\t\n\2\2\u00a4\u00a5\t\t\2\2\u00a5\u00a6\t\13\2\2\u00a6"+
		"\66\3\2\2\2\u00a7\u00a8\t\r\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00aa\t\7\2"+
		"\2\u00aa\u00ab\t\13\2\2\u00ab8\3\2\2\2\u00ac\u00ad\t\7\2\2\u00ad\u00ae"+
		"\t\6\2\2\u00ae\u00af\t\16\2\2\u00af\u00b0\t\7\2\2\u00b0:\3\2\2\2\u00b1"+
		"\u00b2\t\4\2\2\u00b2\u00b3\t\t\2\2\u00b3\u00b4\t\2\2\2\u00b4\u00b5\t\r"+
		"\2\2\u00b5\u00b6\t\7\2\2\u00b6<\3\2\2\2\u00b7\u00b8\t\t\2\2\u00b8\u00b9"+
		"\t\7\2\2\u00b9\u00ba\t\17\2\2\u00ba\u00bb\t\20\2\2\u00bb>\3\2\2\2\u00bc"+
		"\u00bd\t\2\2\2\u00bd\u00be\t\13\2\2\u00be\u00bf\t\r\2\2\u00bf@\3\2\2\2"+
		"\u00c0\u00c1\t\20\2\2\u00c1\u00c2\t\b\2\2\u00c2\u00c3\t\n\2\2\u00c3\u00c4"+
		"\t\21\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00c6\t\7\2\2\u00c6B\3\2\2\2\u00c7"+
		"\u00c8\t\16\2\2\u00c8\u00c9\t\r\2\2\u00c9\u00ca\t\t\2\2\u00ca\u00cb\t"+
		"\2\2\2\u00cb\u00cc\t\13\2\2\u00cc\u00cd\t\22\2\2\u00cdD\3\2\2\2\u00ce"+
		"\u00d2\7$\2\2\u00cf\u00d1\n\23\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6F\3\2\2\2\u00d7\u00d8\7=\2\2\u00d8"+
		"H\3\2\2\2\u00d9\u00e4\t\24\2\2\u00da\u00db\t\24\2\2\u00db\u00e4\t\24\2"+
		"\2\u00dc\u00dd\t\24\2\2\u00dd\u00de\t\24\2\2\u00de\u00e4\t\24\2\2\u00df"+
		"\u00e0\t\24\2\2\u00e0\u00e1\t\24\2\2\u00e1\u00e2\t\24\2\2\u00e2\u00e4"+
		"\t\24\2\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00dc\3\2\2\2"+
		"\u00e3\u00df\3\2\2\2\u00e4J\3\2\2\2\u00e5\u00e7\t\24\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00f0\3\2\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ed\t\24\2\2\u00ec\u00eb\3"+
		"\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1L\3\2\2\2"+
		"\u00f2\u00f6\t\25\2\2\u00f3\u00f5\t\26\2\2\u00f4\u00f3\3\2\2\2\u00f5\u00f8"+
		"\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7N\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f9\u00fa\7\61\2\2\u00fa\u00fb\7\61\2\2\u00fb\u00ff\3"+
		"\2\2\2\u00fc\u00fe\n\27\2\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0102\u0103\b(\2\2\u0103P\3\2\2\2\u0104\u0106\t\30\2\2\u0105\u0104"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010a\b)\2\2\u010aR\3\2\2\2\13\2\u00d2\u00e3\u00e8"+
		"\u00ee\u00f0\u00f6\u00ff\u0107\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}