// Generated from CSVQueryLang.g4 by ANTLR 4.9.2

package com.bodins.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CSVQueryLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN=2, SELECT=3, COL=4, STAR=5, FILE=6, COL_DIGIT=7, ID=8, WS=9;
	public static final int
		RULE_root = 0, RULE_cols = 1, RULE_col = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "cols", "col"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'open'", "'select'", "'col'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN", "SELECT", "COL", "STAR", "FILE", "COL_DIGIT", "ID", 
			"WS"
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
	public String getGrammarFileName() { return "CSVQueryLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CSVQueryLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(CSVQueryLangParser.OPEN, 0); }
		public TerminalNode FILE() { return getToken(CSVQueryLangParser.FILE, 0); }
		public TerminalNode SELECT() { return getToken(CSVQueryLangParser.SELECT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(OPEN);
			setState(7);
			match(FILE);
			setState(8);
			match(SELECT);
			setState(9);
			cols();
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

	public static class ColsContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(CSVQueryLangParser.STAR, 0); }
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitCols(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cols);
		int _la;
		try {
			setState(20);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(STAR);
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				col();
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(13);
					match(T__0);
					setState(14);
					col();
					}
					}
					setState(19);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ColContext extends ParserRuleContext {
		public TerminalNode COL() { return getToken(CSVQueryLangParser.COL, 0); }
		public TerminalNode COL_DIGIT() { return getToken(CSVQueryLangParser.COL_DIGIT, 0); }
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitCol(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(COL);
			setState(23);
			match(COL_DIGIT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\34\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\5\3\27\n\3\3\4\3\4\3\4\3\4\2\2\5\2\4\6\2\2\2\32\2\b\3\2\2\2\4\26"+
		"\3\2\2\2\6\30\3\2\2\2\b\t\7\4\2\2\t\n\7\b\2\2\n\13\7\5\2\2\13\f\5\4\3"+
		"\2\f\3\3\2\2\2\r\27\7\7\2\2\16\23\5\6\4\2\17\20\7\3\2\2\20\22\5\6\4\2"+
		"\21\17\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\27\3\2\2\2"+
		"\25\23\3\2\2\2\26\r\3\2\2\2\26\16\3\2\2\2\27\5\3\2\2\2\30\31\7\6\2\2\31"+
		"\32\7\t\2\2\32\7\3\2\2\2\4\23\26";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}