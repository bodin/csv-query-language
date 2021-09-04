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
		T__0=1, T__1=2, WITH=3, WRITE=4, FILE=5, SELECT=6, COL=7, STAR=8, FILE_NAME=9, 
		COL_DIGIT=10, ID=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "WITH", "WRITE", "FILE", "SELECT", "COL", "STAR", "FILE_NAME", 
			"COL_DIGIT", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "'with'", "'write'", "'file'", "'select'", "'col'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "WITH", "WRITE", "FILE", "SELECT", "COL", "STAR", "FILE_NAME", 
			"COL_DIGIT", "ID", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16T\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\5\n@\n\n\3\13\3\13\7\13D\n\13\f\13\16\13G\13"+
		"\13\3\f\6\fJ\n\f\r\f\16\fK\3\r\6\rO\n\r\r\r\16\rP\3\r\3\r\2\2\16\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\6\3\2\63;\3\2"+
		"\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2W\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2"+
		"\2\2\7\37\3\2\2\2\t$\3\2\2\2\13*\3\2\2\2\r/\3\2\2\2\17\66\3\2\2\2\21:"+
		"\3\2\2\2\23<\3\2\2\2\25A\3\2\2\2\27I\3\2\2\2\31N\3\2\2\2\33\34\7=\2\2"+
		"\34\4\3\2\2\2\35\36\7.\2\2\36\6\3\2\2\2\37 \7y\2\2 !\7k\2\2!\"\7v\2\2"+
		"\"#\7j\2\2#\b\3\2\2\2$%\7y\2\2%&\7t\2\2&\'\7k\2\2\'(\7v\2\2()\7g\2\2)"+
		"\n\3\2\2\2*+\7h\2\2+,\7k\2\2,-\7n\2\2-.\7g\2\2.\f\3\2\2\2/\60\7u\2\2\60"+
		"\61\7g\2\2\61\62\7n\2\2\62\63\7g\2\2\63\64\7e\2\2\64\65\7v\2\2\65\16\3"+
		"\2\2\2\66\67\7e\2\2\678\7q\2\289\7n\2\29\20\3\2\2\2:;\7,\2\2;\22\3\2\2"+
		"\2<?\5\27\f\2=>\7\60\2\2>@\5\27\f\2?=\3\2\2\2?@\3\2\2\2@\24\3\2\2\2AE"+
		"\t\2\2\2BD\t\3\2\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\26\3\2\2\2"+
		"GE\3\2\2\2HJ\t\4\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\30\3\2\2"+
		"\2MO\t\5\2\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\b\r\2"+
		"\2S\32\3\2\2\2\7\2?EKP\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}