// Generated from CSVQueryLang.g4 by ANTLR 4.9.2

package com.bodins.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVQueryLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WITH=2, WRITE=3, FILE=4, SELECT=5, FILTER=6, COL=7, EQUALS=8, 
		COMMA=9, CONTAINS=10, LPAREN=11, RPAREN=12, AND=13, OR=14, NOT=15, ID=16, 
		FILE_NAME=17, COL_DIGIT=18, STRING_CONST=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "WITH", "WRITE", "FILE", "SELECT", "FILTER", "COL", "EQUALS", 
			"COMMA", "CONTAINS", "LPAREN", "RPAREN", "AND", "OR", "NOT", "ID", "FILE_NAME", 
			"COL_DIGIT", "STRING_CONST", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'with'", "'write'", "'file'", "'select'", "'filter'", "'col'", 
			"'='", "','", "'contains'", "'('", "')'", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WITH", "WRITE", "FILE", "SELECT", "FILTER", "COL", "EQUALS", 
			"COMMA", "CONTAINS", "LPAREN", "RPAREN", "AND", "OR", "NOT", "ID", "FILE_NAME", 
			"COL_DIGIT", "STRING_CONST", "WS"
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


	public CSVQueryLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CSVQueryLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\6\21m\n\21\r\21\16\21n\3\22\3\22\3"+
		"\22\5\22t\n\22\3\23\3\23\7\23x\n\23\f\23\16\23{\13\23\3\24\3\24\7\24\177"+
		"\n\24\f\24\16\24\u0082\13\24\3\24\3\24\3\25\6\25\u0087\n\25\r\25\16\25"+
		"\u0088\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\b\4\2C\\c|\3\2"+
		"\63;\3\2\62;\3\2))\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0090\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7\62\3\2\2\2\t8\3\2\2"+
		"\2\13=\3\2\2\2\rD\3\2\2\2\17K\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2"+
		"\2\2\27\\\3\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35d\3\2\2\2\37g\3\2\2\2!l\3"+
		"\2\2\2#p\3\2\2\2%u\3\2\2\2\'|\3\2\2\2)\u0086\3\2\2\2+,\7=\2\2,\4\3\2\2"+
		"\2-.\7y\2\2./\7k\2\2/\60\7v\2\2\60\61\7j\2\2\61\6\3\2\2\2\62\63\7y\2\2"+
		"\63\64\7t\2\2\64\65\7k\2\2\65\66\7v\2\2\66\67\7g\2\2\67\b\3\2\2\289\7"+
		"h\2\29:\7k\2\2:;\7n\2\2;<\7g\2\2<\n\3\2\2\2=>\7u\2\2>?\7g\2\2?@\7n\2\2"+
		"@A\7g\2\2AB\7e\2\2BC\7v\2\2C\f\3\2\2\2DE\7h\2\2EF\7k\2\2FG\7n\2\2GH\7"+
		"v\2\2HI\7g\2\2IJ\7t\2\2J\16\3\2\2\2KL\7e\2\2LM\7q\2\2MN\7n\2\2N\20\3\2"+
		"\2\2OP\7?\2\2P\22\3\2\2\2QR\7.\2\2R\24\3\2\2\2ST\7e\2\2TU\7q\2\2UV\7p"+
		"\2\2VW\7v\2\2WX\7c\2\2XY\7k\2\2YZ\7p\2\2Z[\7u\2\2[\26\3\2\2\2\\]\7*\2"+
		"\2]\30\3\2\2\2^_\7+\2\2_\32\3\2\2\2`a\7c\2\2ab\7p\2\2bc\7f\2\2c\34\3\2"+
		"\2\2de\7q\2\2ef\7t\2\2f\36\3\2\2\2gh\7p\2\2hi\7q\2\2ij\7v\2\2j \3\2\2"+
		"\2km\t\2\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2o\"\3\2\2\2ps\5!\21"+
		"\2qr\7\60\2\2rt\5!\21\2sq\3\2\2\2st\3\2\2\2t$\3\2\2\2uy\t\3\2\2vx\t\4"+
		"\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z&\3\2\2\2{y\3\2\2\2|\u0080"+
		"\t\5\2\2}\177\t\6\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\t\5"+
		"\2\2\u0084(\3\2\2\2\u0085\u0087\t\7\2\2\u0086\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\b\25\2\2\u008b*\3\2\2\2\b\2nsy\u0080\u0088\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}