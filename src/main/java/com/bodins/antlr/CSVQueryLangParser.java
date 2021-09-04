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
		T__0=1, T__1=2, WITH=3, WRITE=4, FILE=5, SELECT=6, COL=7, STAR=8, FILE_NAME=9, 
		COL_DIGIT=10, ID=11, WS=12;
	public static final int
		RULE_root = 0, RULE_with_clause = 1, RULE_select_clause = 2, RULE_out_clause = 3, 
		RULE_cols = 4, RULE_col = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "with_clause", "select_clause", "out_clause", "cols", "col"
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
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Select_clauseContext select_clause() {
			return getRuleContext(Select_clauseContext.class,0);
		}
		public Out_clauseContext out_clause() {
			return getRuleContext(Out_clauseContext.class,0);
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
			setState(12);
			with_clause();
			setState(13);
			select_clause();
			setState(14);
			out_clause();
			setState(15);
			match(T__0);
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

	public static class With_clauseContext extends ParserRuleContext {
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
	 
		public With_clauseContext() { }
		public void copyFrom(With_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WithFileContext extends With_clauseContext {
		public TerminalNode WITH() { return getToken(CSVQueryLangParser.WITH, 0); }
		public TerminalNode FILE() { return getToken(CSVQueryLangParser.FILE, 0); }
		public TerminalNode FILE_NAME() { return getToken(CSVQueryLangParser.FILE_NAME, 0); }
		public WithFileContext(With_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterWithFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitWithFile(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_with_clause);
		try {
			_localctx = new WithFileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(WITH);
			setState(18);
			match(FILE);
			setState(19);
			match(FILE_NAME);
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

	public static class Select_clauseContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(CSVQueryLangParser.SELECT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterSelect_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitSelect_clause(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(SELECT);
			setState(22);
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

	public static class Out_clauseContext extends ParserRuleContext {
		public Out_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_clause; }
	 
		public Out_clauseContext() { }
		public void copyFrom(Out_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends Out_clauseContext {
		public PrintContext(Out_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitPrint(this);
		}
	}
	public static class WriteFileContext extends Out_clauseContext {
		public TerminalNode WRITE() { return getToken(CSVQueryLangParser.WRITE, 0); }
		public TerminalNode FILE() { return getToken(CSVQueryLangParser.FILE, 0); }
		public TerminalNode FILE_NAME() { return getToken(CSVQueryLangParser.FILE_NAME, 0); }
		public WriteFileContext(Out_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterWriteFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitWriteFile(this);
		}
	}

	public final Out_clauseContext out_clause() throws RecognitionException {
		Out_clauseContext _localctx = new Out_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_out_clause);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(WRITE);
				setState(25);
				match(FILE);
				setState(26);
				match(FILE_NAME);
				}
				break;
			case T__0:
				_localctx = new PrintContext(_localctx);
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
		enterRule(_localctx, 8, RULE_cols);
		int _la;
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(STAR);
				}
				break;
			case COL:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				col();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(32);
					match(T__1);
					setState(33);
					col();
					}
					}
					setState(38);
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
		enterRule(_localctx, 10, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(COL);
			setState(42);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\37\n\5\3\6\3\6\3\6\3\6\7\6%\n\6\f\6\16"+
		"\6(\13\6\5\6*\n\6\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2+\2\16\3\2\2"+
		"\2\4\23\3\2\2\2\6\27\3\2\2\2\b\36\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16\17"+
		"\5\4\3\2\17\20\5\6\4\2\20\21\5\b\5\2\21\22\7\3\2\2\22\3\3\2\2\2\23\24"+
		"\7\5\2\2\24\25\7\7\2\2\25\26\7\13\2\2\26\5\3\2\2\2\27\30\7\b\2\2\30\31"+
		"\5\n\6\2\31\7\3\2\2\2\32\33\7\6\2\2\33\34\7\7\2\2\34\37\7\13\2\2\35\37"+
		"\3\2\2\2\36\32\3\2\2\2\36\35\3\2\2\2\37\t\3\2\2\2 *\7\n\2\2!&\5\f\7\2"+
		"\"#\7\4\2\2#%\5\f\7\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2) \3\2\2\2)!\3\2\2\2*\13\3\2\2\2+,\7\t\2\2,-\7\f\2\2-\r"+
		"\3\2\2\2\5\36&)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}