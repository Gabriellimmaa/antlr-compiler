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
		T__0=1, T__1=2, T__2=3, OE=4, CE=5, OB=6, CB=7, AT=8, SEP=9, PLUS=10, 
		ATRIB_PLUS=11, ATRIB_MINUS=12, MINUS=13, MULT=14, DIV=15, AND=16, OR=17, 
		NOT=18, EQ=19, LT=20, GT=21, LE=22, GE=23, NE=24, BOOL_TRUE=25, BOOL_FALSE=26, 
		IF=27, WHILE=28, FOR=29, FUNCTION=30, RETURN=31, THEN=32, ELSE=33, WRITE=34, 
		READ=35, INT=36, DOUBLE=37, STRING=38, BOOLEAN=39, STR=40, EOL=41, NUM=42, 
		DECIM=43, VAR=44, COMMENT_LINE=45, COMMENT_BLOCK=46, WS=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", 
			"ATRIB_PLUS", "ATRIB_MINUS", "MINUS", "MULT", "DIV", "AND", "OR", "NOT", 
			"EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOOL_FALSE", "IF", 
			"WHILE", "FOR", "FUNCTION", "RETURN", "THEN", "ELSE", "WRITE", "READ", 
			"INT", "DOUBLE", "STRING", "BOOLEAN", "STR", "EOL", "NUM", "DECIM", "VAR", 
			"COMMENT_LINE", "COMMENT_BLOCK", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u0145\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3)\3)\7)\u00f3\n)\f)\16)\u00f6\13)\3)\3)\3*\3*\3+\5+\u00fd\n+\3+"+
		"\6+\u0100\n+\r+\16+\u0101\3,\5,\u0105\n,\3,\6,\u0108\n,\r,\16,\u0109\3"+
		",\3,\6,\u010e\n,\r,\16,\u010f\5,\u0112\n,\3,\5,\u0115\n,\3,\3,\6,\u0119"+
		"\n,\r,\16,\u011a\5,\u011d\n,\3-\3-\7-\u0121\n-\f-\16-\u0124\13-\3.\3."+
		"\3.\3.\7.\u012a\n.\f.\16.\u012d\13.\3.\3.\3/\3/\3/\3/\7/\u0135\n/\f/\16"+
		"/\u0138\13/\3/\3/\3/\3/\3/\3\60\6\60\u0140\n\60\r\60\16\60\u0141\3\60"+
		"\3\60\3\u0136\2\61\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61\3\2\31"+
		"\4\2KKkk\4\2HHhh\4\2YYyy\4\2JJjj\4\2NNnn\4\2GGgg\4\2QQqq\4\2TTtt\4\2W"+
		"Www\4\2PPpp\4\2EEee\4\2VVvv\4\2UUuu\4\2CCcc\4\2FFff\4\2DDdd\4\2IIii\3"+
		"\2$$\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\2\u0152\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2"+
		"\2\17m\3\2\2\2\21o\3\2\2\2\23q\3\2\2\2\25s\3\2\2\2\27u\3\2\2\2\31x\3\2"+
		"\2\2\33{\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2\2#\u0084\3\2"+
		"\2\2%\u0087\3\2\2\2\'\u0089\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2-\u0090"+
		"\3\2\2\2/\u0093\3\2\2\2\61\u0096\3\2\2\2\63\u0099\3\2\2\2\65\u009e\3\2"+
		"\2\2\67\u00a4\3\2\2\29\u00a7\3\2\2\2;\u00ad\3\2\2\2=\u00b1\3\2\2\2?\u00ba"+
		"\3\2\2\2A\u00c1\3\2\2\2C\u00c6\3\2\2\2E\u00cb\3\2\2\2G\u00d1\3\2\2\2I"+
		"\u00d6\3\2\2\2K\u00da\3\2\2\2M\u00e1\3\2\2\2O\u00e8\3\2\2\2Q\u00f0\3\2"+
		"\2\2S\u00f9\3\2\2\2U\u00fc\3\2\2\2W\u011c\3\2\2\2Y\u011e\3\2\2\2[\u0125"+
		"\3\2\2\2]\u0130\3\2\2\2_\u013f\3\2\2\2ab\7h\2\2b\4\3\2\2\2cd\7A\2\2d\6"+
		"\3\2\2\2ef\7<\2\2f\b\3\2\2\2gh\7*\2\2h\n\3\2\2\2ij\7+\2\2j\f\3\2\2\2k"+
		"l\7}\2\2l\16\3\2\2\2mn\7\177\2\2n\20\3\2\2\2op\7?\2\2p\22\3\2\2\2qr\7"+
		".\2\2r\24\3\2\2\2st\7-\2\2t\26\3\2\2\2uv\7-\2\2vw\7?\2\2w\30\3\2\2\2x"+
		"y\7/\2\2yz\7?\2\2z\32\3\2\2\2{|\7/\2\2|\34\3\2\2\2}~\7,\2\2~\36\3\2\2"+
		"\2\177\u0080\7\61\2\2\u0080 \3\2\2\2\u0081\u0082\7(\2\2\u0082\u0083\7"+
		"(\2\2\u0083\"\3\2\2\2\u0084\u0085\7~\2\2\u0085\u0086\7~\2\2\u0086$\3\2"+
		"\2\2\u0087\u0088\7#\2\2\u0088&\3\2\2\2\u0089\u008a\7?\2\2\u008a\u008b"+
		"\7?\2\2\u008b(\3\2\2\2\u008c\u008d\7>\2\2\u008d*\3\2\2\2\u008e\u008f\7"+
		"@\2\2\u008f,\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092\7?\2\2\u0092.\3\2"+
		"\2\2\u0093\u0094\7@\2\2\u0094\u0095\7?\2\2\u0095\60\3\2\2\2\u0096\u0097"+
		"\7#\2\2\u0097\u0098\7?\2\2\u0098\62\3\2\2\2\u0099\u009a\7v\2\2\u009a\u009b"+
		"\7t\2\2\u009b\u009c\7w\2\2\u009c\u009d\7g\2\2\u009d\64\3\2\2\2\u009e\u009f"+
		"\7h\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7u\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a6\t\3\2\2"+
		"\u00a68\3\2\2\2\u00a7\u00a8\t\4\2\2\u00a8\u00a9\t\5\2\2\u00a9\u00aa\t"+
		"\2\2\2\u00aa\u00ab\t\6\2\2\u00ab\u00ac\t\7\2\2\u00ac:\3\2\2\2\u00ad\u00ae"+
		"\t\3\2\2\u00ae\u00af\t\b\2\2\u00af\u00b0\t\t\2\2\u00b0<\3\2\2\2\u00b1"+
		"\u00b2\t\3\2\2\u00b2\u00b3\t\n\2\2\u00b3\u00b4\t\13\2\2\u00b4\u00b5\t"+
		"\f\2\2\u00b5\u00b6\t\r\2\2\u00b6\u00b7\t\2\2\2\u00b7\u00b8\t\b\2\2\u00b8"+
		"\u00b9\t\13\2\2\u00b9>\3\2\2\2\u00ba\u00bb\t\t\2\2\u00bb\u00bc\t\7\2\2"+
		"\u00bc\u00bd\t\r\2\2\u00bd\u00be\t\n\2\2\u00be\u00bf\t\t\2\2\u00bf\u00c0"+
		"\t\13\2\2\u00c0@\3\2\2\2\u00c1\u00c2\t\r\2\2\u00c2\u00c3\t\5\2\2\u00c3"+
		"\u00c4\t\7\2\2\u00c4\u00c5\t\13\2\2\u00c5B\3\2\2\2\u00c6\u00c7\t\7\2\2"+
		"\u00c7\u00c8\t\6\2\2\u00c8\u00c9\t\16\2\2\u00c9\u00ca\t\7\2\2\u00caD\3"+
		"\2\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\t\t\2\2\u00cd\u00ce\t\2\2\2\u00ce"+
		"\u00cf\t\r\2\2\u00cf\u00d0\t\7\2\2\u00d0F\3\2\2\2\u00d1\u00d2\t\t\2\2"+
		"\u00d2\u00d3\t\7\2\2\u00d3\u00d4\t\17\2\2\u00d4\u00d5\t\20\2\2\u00d5H"+
		"\3\2\2\2\u00d6\u00d7\t\2\2\2\u00d7\u00d8\t\13\2\2\u00d8\u00d9\t\r\2\2"+
		"\u00d9J\3\2\2\2\u00da\u00db\t\20\2\2\u00db\u00dc\t\b\2\2\u00dc\u00dd\t"+
		"\n\2\2\u00dd\u00de\t\21\2\2\u00de\u00df\t\6\2\2\u00df\u00e0\t\7\2\2\u00e0"+
		"L\3\2\2\2\u00e1\u00e2\t\16\2\2\u00e2\u00e3\t\r\2\2\u00e3\u00e4\t\t\2\2"+
		"\u00e4\u00e5\t\2\2\2\u00e5\u00e6\t\13\2\2\u00e6\u00e7\t\22\2\2\u00e7N"+
		"\3\2\2\2\u00e8\u00e9\t\21\2\2\u00e9\u00ea\t\b\2\2\u00ea\u00eb\t\b\2\2"+
		"\u00eb\u00ec\t\6\2\2\u00ec\u00ed\t\7\2\2\u00ed\u00ee\t\17\2\2\u00ee\u00ef"+
		"\t\13\2\2\u00efP\3\2\2\2\u00f0\u00f4\7$\2\2\u00f1\u00f3\n\23\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8"+
		"R\3\2\2\2\u00f9\u00fa\7=\2\2\u00faT\3\2\2\2\u00fb\u00fd\7/\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u0100\t\24\2\2"+
		"\u00ff\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102V\3\2\2\2\u0103\u0105\7/\2\2\u0104\u0103\3\2\2\2\u0104\u0105"+
		"\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u0108\t\24\2\2\u0107\u0106\3\2\2\2"+
		"\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0111"+
		"\3\2\2\2\u010b\u010d\7\60\2\2\u010c\u010e\t\24\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112"+
		"\3\2\2\2\u0111\u010b\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u011d\3\2\2\2\u0113"+
		"\u0115\7/\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0118\7\60\2\2\u0117\u0119\t\24\2\2\u0118\u0117\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011d\3\2"+
		"\2\2\u011c\u0104\3\2\2\2\u011c\u0114\3\2\2\2\u011dX\3\2\2\2\u011e\u0122"+
		"\t\25\2\2\u011f\u0121\t\26\2\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2"+
		"\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123Z\3\2\2\2\u0124\u0122\3"+
		"\2\2\2\u0125\u0126\7\61\2\2\u0126\u0127\7\61\2\2\u0127\u012b\3\2\2\2\u0128"+
		"\u012a\n\27\2\2\u0129\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3"+
		"\2\2\2\u012b\u012c\3\2\2\2\u012c\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u012f\b.\2\2\u012f\\\3\2\2\2\u0130\u0131\7\61\2\2\u0131\u0132\7,\2\2"+
		"\u0132\u0136\3\2\2\2\u0133\u0135\13\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0139\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\7,\2\2\u013a\u013b\7\61\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\u013d\b/\2\2\u013d^\3\2\2\2\u013e\u0140\t\30\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0144\b\60\2\2\u0144`\3\2\2\2\21\2\u00f4\u00fc\u0101"+
		"\u0104\u0109\u010f\u0111\u0114\u011a\u011c\u0122\u012b\u0136\u0141\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}