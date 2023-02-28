//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.3
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Lang.g4 by ANTLR 4.9.3

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Misc;
using DFA = Antlr4.Runtime.Dfa.DFA;

[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.3")]
[System.CLSCompliant(false)]
public partial class LangLexer : Lexer {
	protected static DFA[] decisionToDFA;
	protected static PredictionContextCache sharedContextCache = new PredictionContextCache();
	public const int
		OE=1, CE=2, OB=3, CB=4, AT=5, SEP=6, PLUS=7, MINUS=8, MULT=9, DIV=10, 
		AND=11, OR=12, NOT=13, EQ=14, LT=15, GT=16, LE=17, GE=18, NE=19, BOOL_TRUE=20, 
		BOL_FALSE=21, IF=22, FUNCTION=23, RETURN=24, THEN=25, ELSE=26, WRITE=27, 
		READ=28, STR=29, EOL=30, NUM=31, VAR=32, COMMENT=33, WS=34;
	public static string[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static string[] modeNames = {
		"DEFAULT_MODE"
	};

	public static readonly string[] ruleNames = {
		"OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", "MULT", "DIV", "AND", 
		"OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOL_FALSE", 
		"IF", "FUNCTION", "RETURN", "THEN", "ELSE", "WRITE", "READ", "STR", "EOL", 
		"NUM", "VAR", "COMMENT", "WS"
	};


	public LangLexer(ICharStream input)
	: this(input, Console.Out, Console.Error) { }

	public LangLexer(ICharStream input, TextWriter output, TextWriter errorOutput)
	: base(input, output, errorOutput)
	{
		Interpreter = new LexerATNSimulator(this, _ATN, decisionToDFA, sharedContextCache);
	}

	private static readonly string[] _LiteralNames = {
		null, "'('", "')'", "'{'", "'}'", "'='", "','", "'+'", "'-'", "'*'", "'/'", 
		"'&&'", "'||'", "'!'", "'=='", "'<'", "'>'", "'<='", "'>='", "'!='", "'true'", 
		"'false'", null, null, null, null, null, null, null, null, "';'"
	};
	private static readonly string[] _SymbolicNames = {
		null, "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", "MINUS", "MULT", "DIV", 
		"AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", "NE", "BOOL_TRUE", "BOL_FALSE", 
		"IF", "FUNCTION", "RETURN", "THEN", "ELSE", "WRITE", "READ", "STR", "EOL", 
		"NUM", "VAR", "COMMENT", "WS"
	};
	public static readonly IVocabulary DefaultVocabulary = new Vocabulary(_LiteralNames, _SymbolicNames);

	[NotNull]
	public override IVocabulary Vocabulary
	{
		get
		{
			return DefaultVocabulary;
		}
	}

	public override string GrammarFileName { get { return "Lang.g4"; } }

	public override string[] RuleNames { get { return ruleNames; } }

	public override string[] ChannelNames { get { return channelNames; } }

	public override string[] ModeNames { get { return modeNames; } }

	public override string SerializedAtn { get { return new string(_serializedATN); } }

	static LangLexer() {
		decisionToDFA = new DFA[_ATN.NumberOfDecisions];
		for (int i = 0; i < _ATN.NumberOfDecisions; i++) {
			decisionToDFA[i] = new DFA(_ATN.GetDecisionState(i), i);
		}
	}
	private static char[] _serializedATN = {
		'\x3', '\x608B', '\xA72A', '\x8133', '\xB9ED', '\x417C', '\x3BE7', '\x7786', 
		'\x5964', '\x2', '$', '\xD7', '\b', '\x1', '\x4', '\x2', '\t', '\x2', 
		'\x4', '\x3', '\t', '\x3', '\x4', '\x4', '\t', '\x4', '\x4', '\x5', '\t', 
		'\x5', '\x4', '\x6', '\t', '\x6', '\x4', '\a', '\t', '\a', '\x4', '\b', 
		'\t', '\b', '\x4', '\t', '\t', '\t', '\x4', '\n', '\t', '\n', '\x4', '\v', 
		'\t', '\v', '\x4', '\f', '\t', '\f', '\x4', '\r', '\t', '\r', '\x4', '\xE', 
		'\t', '\xE', '\x4', '\xF', '\t', '\xF', '\x4', '\x10', '\t', '\x10', '\x4', 
		'\x11', '\t', '\x11', '\x4', '\x12', '\t', '\x12', '\x4', '\x13', '\t', 
		'\x13', '\x4', '\x14', '\t', '\x14', '\x4', '\x15', '\t', '\x15', '\x4', 
		'\x16', '\t', '\x16', '\x4', '\x17', '\t', '\x17', '\x4', '\x18', '\t', 
		'\x18', '\x4', '\x19', '\t', '\x19', '\x4', '\x1A', '\t', '\x1A', '\x4', 
		'\x1B', '\t', '\x1B', '\x4', '\x1C', '\t', '\x1C', '\x4', '\x1D', '\t', 
		'\x1D', '\x4', '\x1E', '\t', '\x1E', '\x4', '\x1F', '\t', '\x1F', '\x4', 
		' ', '\t', ' ', '\x4', '!', '\t', '!', '\x4', '\"', '\t', '\"', '\x4', 
		'#', '\t', '#', '\x3', '\x2', '\x3', '\x2', '\x3', '\x3', '\x3', '\x3', 
		'\x3', '\x4', '\x3', '\x4', '\x3', '\x5', '\x3', '\x5', '\x3', '\x6', 
		'\x3', '\x6', '\x3', '\a', '\x3', '\a', '\x3', '\b', '\x3', '\b', '\x3', 
		'\t', '\x3', '\t', '\x3', '\n', '\x3', '\n', '\x3', '\v', '\x3', '\v', 
		'\x3', '\f', '\x3', '\f', '\x3', '\f', '\x3', '\r', '\x3', '\r', '\x3', 
		'\r', '\x3', '\xE', '\x3', '\xE', '\x3', '\xF', '\x3', '\xF', '\x3', '\xF', 
		'\x3', '\x10', '\x3', '\x10', '\x3', '\x11', '\x3', '\x11', '\x3', '\x12', 
		'\x3', '\x12', '\x3', '\x12', '\x3', '\x13', '\x3', '\x13', '\x3', '\x13', 
		'\x3', '\x14', '\x3', '\x14', '\x3', '\x14', '\x3', '\x15', '\x3', '\x15', 
		'\x3', '\x15', '\x3', '\x15', '\x3', '\x15', '\x3', '\x16', '\x3', '\x16', 
		'\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x16', '\x3', '\x17', 
		'\x3', '\x17', '\x3', '\x17', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', 
		'\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', '\x3', '\x18', 
		'\x3', '\x18', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x19', 
		'\x3', '\x19', '\x3', '\x19', '\x3', '\x19', '\x3', '\x1A', '\x3', '\x1A', 
		'\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1A', '\x3', '\x1B', '\x3', '\x1B', 
		'\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1B', '\x3', '\x1C', '\x3', '\x1C', 
		'\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1C', '\x3', '\x1D', 
		'\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1D', '\x3', '\x1E', 
		'\x3', '\x1E', '\a', '\x1E', '\xA9', '\n', '\x1E', '\f', '\x1E', '\xE', 
		'\x1E', '\xAC', '\v', '\x1E', '\x3', '\x1E', '\x3', '\x1E', '\x3', '\x1F', 
		'\x3', '\x1F', '\x3', ' ', '\x6', ' ', '\xB3', '\n', ' ', '\r', ' ', '\xE', 
		' ', '\xB4', '\x3', ' ', '\x3', ' ', '\x6', ' ', '\xB9', '\n', ' ', '\r', 
		' ', '\xE', ' ', '\xBA', '\x5', ' ', '\xBD', '\n', ' ', '\x3', '!', '\x3', 
		'!', '\a', '!', '\xC1', '\n', '!', '\f', '!', '\xE', '!', '\xC4', '\v', 
		'!', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\x3', '\"', '\a', '\"', '\xCA', 
		'\n', '\"', '\f', '\"', '\xE', '\"', '\xCD', '\v', '\"', '\x3', '\"', 
		'\x3', '\"', '\x3', '#', '\x6', '#', '\xD2', '\n', '#', '\r', '#', '\xE', 
		'#', '\xD3', '\x3', '#', '\x3', '#', '\x2', '\x2', '$', '\x3', '\x3', 
		'\x5', '\x4', '\a', '\x5', '\t', '\x6', '\v', '\a', '\r', '\b', '\xF', 
		'\t', '\x11', '\n', '\x13', '\v', '\x15', '\f', '\x17', '\r', '\x19', 
		'\xE', '\x1B', '\xF', '\x1D', '\x10', '\x1F', '\x11', '!', '\x12', '#', 
		'\x13', '%', '\x14', '\'', '\x15', ')', '\x16', '+', '\x17', '-', '\x18', 
		'/', '\x19', '\x31', '\x1A', '\x33', '\x1B', '\x35', '\x1C', '\x37', '\x1D', 
		'\x39', '\x1E', ';', '\x1F', '=', ' ', '?', '!', '\x41', '\"', '\x43', 
		'#', '\x45', '$', '\x3', '\x2', '\x17', '\x4', '\x2', 'K', 'K', 'k', 'k', 
		'\x4', '\x2', 'H', 'H', 'h', 'h', '\x4', '\x2', 'W', 'W', 'w', 'w', '\x4', 
		'\x2', 'P', 'P', 'p', 'p', '\x4', '\x2', '\x45', '\x45', '\x65', '\x65', 
		'\x4', '\x2', 'V', 'V', 'v', 'v', '\x4', '\x2', 'Q', 'Q', 'q', 'q', '\x4', 
		'\x2', 'T', 'T', 't', 't', '\x4', '\x2', 'G', 'G', 'g', 'g', '\x4', '\x2', 
		'J', 'J', 'j', 'j', '\x4', '\x2', 'N', 'N', 'n', 'n', '\x4', '\x2', 'U', 
		'U', 'u', 'u', '\x4', '\x2', 'Y', 'Y', 'y', 'y', '\x4', '\x2', '\x43', 
		'\x43', '\x63', '\x63', '\x4', '\x2', '\x46', '\x46', '\x66', '\x66', 
		'\x3', '\x2', '$', '$', '\x3', '\x2', '\x32', ';', '\x5', '\x2', '\x43', 
		'\\', '\x61', '\x61', '\x63', '|', '\x6', '\x2', '\x32', ';', '\x43', 
		'\\', '\x61', '\x61', '\x63', '|', '\x4', '\x2', '\f', '\f', '\xF', '\xF', 
		'\x5', '\x2', '\v', '\f', '\xF', '\xF', '\"', '\"', '\x2', '\xDD', '\x2', 
		'\x3', '\x3', '\x2', '\x2', '\x2', '\x2', '\x5', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\a', '\x3', '\x2', '\x2', '\x2', '\x2', '\t', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\v', '\x3', '\x2', '\x2', '\x2', '\x2', '\r', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\xF', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x11', '\x3', '\x2', '\x2', '\x2', '\x2', '\x13', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x15', '\x3', '\x2', '\x2', '\x2', '\x2', '\x17', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\x19', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'\x1B', '\x3', '\x2', '\x2', '\x2', '\x2', '\x1D', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '\x1F', '\x3', '\x2', '\x2', '\x2', '\x2', '!', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '#', '\x3', '\x2', '\x2', '\x2', '\x2', '%', '\x3', 
		'\x2', '\x2', '\x2', '\x2', '\'', '\x3', '\x2', '\x2', '\x2', '\x2', ')', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '+', '\x3', '\x2', '\x2', '\x2', '\x2', 
		'-', '\x3', '\x2', '\x2', '\x2', '\x2', '/', '\x3', '\x2', '\x2', '\x2', 
		'\x2', '\x31', '\x3', '\x2', '\x2', '\x2', '\x2', '\x33', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x35', '\x3', '\x2', '\x2', '\x2', '\x2', '\x37', 
		'\x3', '\x2', '\x2', '\x2', '\x2', '\x39', '\x3', '\x2', '\x2', '\x2', 
		'\x2', ';', '\x3', '\x2', '\x2', '\x2', '\x2', '=', '\x3', '\x2', '\x2', 
		'\x2', '\x2', '?', '\x3', '\x2', '\x2', '\x2', '\x2', '\x41', '\x3', '\x2', 
		'\x2', '\x2', '\x2', '\x43', '\x3', '\x2', '\x2', '\x2', '\x2', '\x45', 
		'\x3', '\x2', '\x2', '\x2', '\x3', 'G', '\x3', '\x2', '\x2', '\x2', '\x5', 
		'I', '\x3', '\x2', '\x2', '\x2', '\a', 'K', '\x3', '\x2', '\x2', '\x2', 
		'\t', 'M', '\x3', '\x2', '\x2', '\x2', '\v', 'O', '\x3', '\x2', '\x2', 
		'\x2', '\r', 'Q', '\x3', '\x2', '\x2', '\x2', '\xF', 'S', '\x3', '\x2', 
		'\x2', '\x2', '\x11', 'U', '\x3', '\x2', '\x2', '\x2', '\x13', 'W', '\x3', 
		'\x2', '\x2', '\x2', '\x15', 'Y', '\x3', '\x2', '\x2', '\x2', '\x17', 
		'[', '\x3', '\x2', '\x2', '\x2', '\x19', '^', '\x3', '\x2', '\x2', '\x2', 
		'\x1B', '\x61', '\x3', '\x2', '\x2', '\x2', '\x1D', '\x63', '\x3', '\x2', 
		'\x2', '\x2', '\x1F', '\x66', '\x3', '\x2', '\x2', '\x2', '!', 'h', '\x3', 
		'\x2', '\x2', '\x2', '#', 'j', '\x3', '\x2', '\x2', '\x2', '%', 'm', '\x3', 
		'\x2', '\x2', '\x2', '\'', 'p', '\x3', '\x2', '\x2', '\x2', ')', 's', 
		'\x3', '\x2', '\x2', '\x2', '+', 'x', '\x3', '\x2', '\x2', '\x2', '-', 
		'~', '\x3', '\x2', '\x2', '\x2', '/', '\x81', '\x3', '\x2', '\x2', '\x2', 
		'\x31', '\x8A', '\x3', '\x2', '\x2', '\x2', '\x33', '\x91', '\x3', '\x2', 
		'\x2', '\x2', '\x35', '\x96', '\x3', '\x2', '\x2', '\x2', '\x37', '\x9B', 
		'\x3', '\x2', '\x2', '\x2', '\x39', '\xA1', '\x3', '\x2', '\x2', '\x2', 
		';', '\xA6', '\x3', '\x2', '\x2', '\x2', '=', '\xAF', '\x3', '\x2', '\x2', 
		'\x2', '?', '\xB2', '\x3', '\x2', '\x2', '\x2', '\x41', '\xBE', '\x3', 
		'\x2', '\x2', '\x2', '\x43', '\xC5', '\x3', '\x2', '\x2', '\x2', '\x45', 
		'\xD1', '\x3', '\x2', '\x2', '\x2', 'G', 'H', '\a', '*', '\x2', '\x2', 
		'H', '\x4', '\x3', '\x2', '\x2', '\x2', 'I', 'J', '\a', '+', '\x2', '\x2', 
		'J', '\x6', '\x3', '\x2', '\x2', '\x2', 'K', 'L', '\a', '}', '\x2', '\x2', 
		'L', '\b', '\x3', '\x2', '\x2', '\x2', 'M', 'N', '\a', '\x7F', '\x2', 
		'\x2', 'N', '\n', '\x3', '\x2', '\x2', '\x2', 'O', 'P', '\a', '?', '\x2', 
		'\x2', 'P', '\f', '\x3', '\x2', '\x2', '\x2', 'Q', 'R', '\a', '.', '\x2', 
		'\x2', 'R', '\xE', '\x3', '\x2', '\x2', '\x2', 'S', 'T', '\a', '-', '\x2', 
		'\x2', 'T', '\x10', '\x3', '\x2', '\x2', '\x2', 'U', 'V', '\a', '/', '\x2', 
		'\x2', 'V', '\x12', '\x3', '\x2', '\x2', '\x2', 'W', 'X', '\a', ',', '\x2', 
		'\x2', 'X', '\x14', '\x3', '\x2', '\x2', '\x2', 'Y', 'Z', '\a', '\x31', 
		'\x2', '\x2', 'Z', '\x16', '\x3', '\x2', '\x2', '\x2', '[', '\\', '\a', 
		'(', '\x2', '\x2', '\\', ']', '\a', '(', '\x2', '\x2', ']', '\x18', '\x3', 
		'\x2', '\x2', '\x2', '^', '_', '\a', '~', '\x2', '\x2', '_', '`', '\a', 
		'~', '\x2', '\x2', '`', '\x1A', '\x3', '\x2', '\x2', '\x2', '\x61', '\x62', 
		'\a', '#', '\x2', '\x2', '\x62', '\x1C', '\x3', '\x2', '\x2', '\x2', '\x63', 
		'\x64', '\a', '?', '\x2', '\x2', '\x64', '\x65', '\a', '?', '\x2', '\x2', 
		'\x65', '\x1E', '\x3', '\x2', '\x2', '\x2', '\x66', 'g', '\a', '>', '\x2', 
		'\x2', 'g', ' ', '\x3', '\x2', '\x2', '\x2', 'h', 'i', '\a', '@', '\x2', 
		'\x2', 'i', '\"', '\x3', '\x2', '\x2', '\x2', 'j', 'k', '\a', '>', '\x2', 
		'\x2', 'k', 'l', '\a', '?', '\x2', '\x2', 'l', '$', '\x3', '\x2', '\x2', 
		'\x2', 'm', 'n', '\a', '@', '\x2', '\x2', 'n', 'o', '\a', '?', '\x2', 
		'\x2', 'o', '&', '\x3', '\x2', '\x2', '\x2', 'p', 'q', '\a', '#', '\x2', 
		'\x2', 'q', 'r', '\a', '?', '\x2', '\x2', 'r', '(', '\x3', '\x2', '\x2', 
		'\x2', 's', 't', '\a', 'v', '\x2', '\x2', 't', 'u', '\a', 't', '\x2', 
		'\x2', 'u', 'v', '\a', 'w', '\x2', '\x2', 'v', 'w', '\a', 'g', '\x2', 
		'\x2', 'w', '*', '\x3', '\x2', '\x2', '\x2', 'x', 'y', '\a', 'h', '\x2', 
		'\x2', 'y', 'z', '\a', '\x63', '\x2', '\x2', 'z', '{', '\a', 'n', '\x2', 
		'\x2', '{', '|', '\a', 'u', '\x2', '\x2', '|', '}', '\a', 'g', '\x2', 
		'\x2', '}', ',', '\x3', '\x2', '\x2', '\x2', '~', '\x7F', '\t', '\x2', 
		'\x2', '\x2', '\x7F', '\x80', '\t', '\x3', '\x2', '\x2', '\x80', '.', 
		'\x3', '\x2', '\x2', '\x2', '\x81', '\x82', '\t', '\x3', '\x2', '\x2', 
		'\x82', '\x83', '\t', '\x4', '\x2', '\x2', '\x83', '\x84', '\t', '\x5', 
		'\x2', '\x2', '\x84', '\x85', '\t', '\x6', '\x2', '\x2', '\x85', '\x86', 
		'\t', '\a', '\x2', '\x2', '\x86', '\x87', '\t', '\x2', '\x2', '\x2', '\x87', 
		'\x88', '\t', '\b', '\x2', '\x2', '\x88', '\x89', '\t', '\x5', '\x2', 
		'\x2', '\x89', '\x30', '\x3', '\x2', '\x2', '\x2', '\x8A', '\x8B', '\t', 
		'\t', '\x2', '\x2', '\x8B', '\x8C', '\t', '\n', '\x2', '\x2', '\x8C', 
		'\x8D', '\t', '\a', '\x2', '\x2', '\x8D', '\x8E', '\t', '\x4', '\x2', 
		'\x2', '\x8E', '\x8F', '\t', '\t', '\x2', '\x2', '\x8F', '\x90', '\t', 
		'\x5', '\x2', '\x2', '\x90', '\x32', '\x3', '\x2', '\x2', '\x2', '\x91', 
		'\x92', '\t', '\a', '\x2', '\x2', '\x92', '\x93', '\t', '\v', '\x2', '\x2', 
		'\x93', '\x94', '\t', '\n', '\x2', '\x2', '\x94', '\x95', '\t', '\x5', 
		'\x2', '\x2', '\x95', '\x34', '\x3', '\x2', '\x2', '\x2', '\x96', '\x97', 
		'\t', '\n', '\x2', '\x2', '\x97', '\x98', '\t', '\f', '\x2', '\x2', '\x98', 
		'\x99', '\t', '\r', '\x2', '\x2', '\x99', '\x9A', '\t', '\n', '\x2', '\x2', 
		'\x9A', '\x36', '\x3', '\x2', '\x2', '\x2', '\x9B', '\x9C', '\t', '\xE', 
		'\x2', '\x2', '\x9C', '\x9D', '\t', '\t', '\x2', '\x2', '\x9D', '\x9E', 
		'\t', '\x2', '\x2', '\x2', '\x9E', '\x9F', '\t', '\a', '\x2', '\x2', '\x9F', 
		'\xA0', '\t', '\n', '\x2', '\x2', '\xA0', '\x38', '\x3', '\x2', '\x2', 
		'\x2', '\xA1', '\xA2', '\t', '\t', '\x2', '\x2', '\xA2', '\xA3', '\t', 
		'\n', '\x2', '\x2', '\xA3', '\xA4', '\t', '\xF', '\x2', '\x2', '\xA4', 
		'\xA5', '\t', '\x10', '\x2', '\x2', '\xA5', ':', '\x3', '\x2', '\x2', 
		'\x2', '\xA6', '\xAA', '\a', '$', '\x2', '\x2', '\xA7', '\xA9', '\n', 
		'\x11', '\x2', '\x2', '\xA8', '\xA7', '\x3', '\x2', '\x2', '\x2', '\xA9', 
		'\xAC', '\x3', '\x2', '\x2', '\x2', '\xAA', '\xA8', '\x3', '\x2', '\x2', 
		'\x2', '\xAA', '\xAB', '\x3', '\x2', '\x2', '\x2', '\xAB', '\xAD', '\x3', 
		'\x2', '\x2', '\x2', '\xAC', '\xAA', '\x3', '\x2', '\x2', '\x2', '\xAD', 
		'\xAE', '\a', '$', '\x2', '\x2', '\xAE', '<', '\x3', '\x2', '\x2', '\x2', 
		'\xAF', '\xB0', '\a', '=', '\x2', '\x2', '\xB0', '>', '\x3', '\x2', '\x2', 
		'\x2', '\xB1', '\xB3', '\t', '\x12', '\x2', '\x2', '\xB2', '\xB1', '\x3', 
		'\x2', '\x2', '\x2', '\xB3', '\xB4', '\x3', '\x2', '\x2', '\x2', '\xB4', 
		'\xB2', '\x3', '\x2', '\x2', '\x2', '\xB4', '\xB5', '\x3', '\x2', '\x2', 
		'\x2', '\xB5', '\xBC', '\x3', '\x2', '\x2', '\x2', '\xB6', '\xB8', '\v', 
		'\x2', '\x2', '\x2', '\xB7', '\xB9', '\t', '\x12', '\x2', '\x2', '\xB8', 
		'\xB7', '\x3', '\x2', '\x2', '\x2', '\xB9', '\xBA', '\x3', '\x2', '\x2', 
		'\x2', '\xBA', '\xB8', '\x3', '\x2', '\x2', '\x2', '\xBA', '\xBB', '\x3', 
		'\x2', '\x2', '\x2', '\xBB', '\xBD', '\x3', '\x2', '\x2', '\x2', '\xBC', 
		'\xB6', '\x3', '\x2', '\x2', '\x2', '\xBC', '\xBD', '\x3', '\x2', '\x2', 
		'\x2', '\xBD', '@', '\x3', '\x2', '\x2', '\x2', '\xBE', '\xC2', '\t', 
		'\x13', '\x2', '\x2', '\xBF', '\xC1', '\t', '\x14', '\x2', '\x2', '\xC0', 
		'\xBF', '\x3', '\x2', '\x2', '\x2', '\xC1', '\xC4', '\x3', '\x2', '\x2', 
		'\x2', '\xC2', '\xC0', '\x3', '\x2', '\x2', '\x2', '\xC2', '\xC3', '\x3', 
		'\x2', '\x2', '\x2', '\xC3', '\x42', '\x3', '\x2', '\x2', '\x2', '\xC4', 
		'\xC2', '\x3', '\x2', '\x2', '\x2', '\xC5', '\xC6', '\a', '\x31', '\x2', 
		'\x2', '\xC6', '\xC7', '\a', '\x31', '\x2', '\x2', '\xC7', '\xCB', '\x3', 
		'\x2', '\x2', '\x2', '\xC8', '\xCA', '\n', '\x15', '\x2', '\x2', '\xC9', 
		'\xC8', '\x3', '\x2', '\x2', '\x2', '\xCA', '\xCD', '\x3', '\x2', '\x2', 
		'\x2', '\xCB', '\xC9', '\x3', '\x2', '\x2', '\x2', '\xCB', '\xCC', '\x3', 
		'\x2', '\x2', '\x2', '\xCC', '\xCE', '\x3', '\x2', '\x2', '\x2', '\xCD', 
		'\xCB', '\x3', '\x2', '\x2', '\x2', '\xCE', '\xCF', '\b', '\"', '\x2', 
		'\x2', '\xCF', '\x44', '\x3', '\x2', '\x2', '\x2', '\xD0', '\xD2', '\t', 
		'\x16', '\x2', '\x2', '\xD1', '\xD0', '\x3', '\x2', '\x2', '\x2', '\xD2', 
		'\xD3', '\x3', '\x2', '\x2', '\x2', '\xD3', '\xD1', '\x3', '\x2', '\x2', 
		'\x2', '\xD3', '\xD4', '\x3', '\x2', '\x2', '\x2', '\xD4', '\xD5', '\x3', 
		'\x2', '\x2', '\x2', '\xD5', '\xD6', '\b', '#', '\x2', '\x2', '\xD6', 
		'\x46', '\x3', '\x2', '\x2', '\x2', '\n', '\x2', '\xAA', '\xB4', '\xBA', 
		'\xBC', '\xC2', '\xCB', '\xD3', '\x3', '\b', '\x2', '\x2',
	};

	public static readonly ATN _ATN =
		new ATNDeserializer().Deserialize(_serializedATN);


}
