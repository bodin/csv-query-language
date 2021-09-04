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
		T__0=1, WITH=2, WRITE=3, FILE=4, SELECT=5, FILTER=6, COL=7, EQUALS=8, 
		COMMA=9, CONTAINS=10, LPAREN=11, RPAREN=12, AND=13, OR=14, NOT=15, ID=16, 
		FILE_NAME=17, COL_DIGIT=18, STRING_CONST=19, WS=20;
	public static final int
		RULE_root = 0, RULE_with_clause = 1, RULE_select_clause = 2, RULE_filter_clause = 3, 
		RULE_expr = 4, RULE_out_clause = 5, RULE_cols = 6, RULE_col = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "with_clause", "select_clause", "filter_clause", "expr", "out_clause", 
			"cols", "col"
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
		public Filter_clauseContext filter_clause() {
			return getRuleContext(Filter_clauseContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			with_clause();
			setState(17);
			filter_clause();
			setState(18);
			select_clause();
			setState(19);
			out_clause();
			setState(20);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitWithFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_with_clause);
		try {
			_localctx = new WithFileContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(WITH);
			setState(23);
			match(FILE);
			setState(24);
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
		public Select_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_clause; }
	 
		public Select_clauseContext() { }
		public void copyFrom(Select_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends Select_clauseContext {
		public SelectAllContext(Select_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSomeContext extends Select_clauseContext {
		public TerminalNode SELECT() { return getToken(CSVQueryLangParser.SELECT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public SelectSomeContext(Select_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterSelectSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitSelectSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitSelectSome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_clauseContext select_clause() throws RecognitionException {
		Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select_clause);
		try {
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new SelectSomeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(SELECT);
				setState(27);
				cols();
				}
				break;
			case T__0:
			case WRITE:
				_localctx = new SelectAllContext(_localctx);
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

	public static class Filter_clauseContext extends ParserRuleContext {
		public Filter_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter_clause; }
	 
		public Filter_clauseContext() { }
		public void copyFrom(Filter_clauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterSomeContext extends Filter_clauseContext {
		public TerminalNode FILTER() { return getToken(CSVQueryLangParser.FILTER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FilterSomeContext(Filter_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterFilterSome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitFilterSome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitFilterSome(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterNoneContext extends Filter_clauseContext {
		public FilterNoneContext(Filter_clauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterFilterNone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitFilterNone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitFilterNone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Filter_clauseContext filter_clause() throws RecognitionException {
		Filter_clauseContext _localctx = new Filter_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_filter_clause);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
				_localctx = new FilterSomeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(FILTER);
				setState(32);
				expr(0);
				}
				break;
			case T__0:
			case WRITE:
			case SELECT:
				_localctx = new FilterNoneContext(_localctx);
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
	public static class ExprAndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CSVQueryLangParser.AND, 0); }
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitExprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitExprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprEqualsContext extends ExprContext {
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(CSVQueryLangParser.EQUALS, 0); }
		public TerminalNode STRING_CONST() { return getToken(CSVQueryLangParser.STRING_CONST, 0); }
		public ExprEqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterExprEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitExprEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitExprEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNestedContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CSVQueryLangParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CSVQueryLangParser.RPAREN, 0); }
		public ExprNestedContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterExprNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitExprNested(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitExprNested(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(CSVQueryLangParser.OR, 0); }
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitExprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitExprOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CSVQueryLangParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprContainsContext extends ExprContext {
		public ColContext col() {
			return getRuleContext(ColContext.class,0);
		}
		public TerminalNode CONTAINS() { return getToken(CSVQueryLangParser.CONTAINS, 0); }
		public TerminalNode STRING_CONST() { return getToken(CSVQueryLangParser.STRING_CONST, 0); }
		public ExprContainsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).enterExprContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CSVQueryLangListener ) ((CSVQueryLangListener)listener).exitExprContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitExprContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				_localctx = new ExprNestedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(37);
				match(LPAREN);
				setState(38);
				expr(0);
				setState(39);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(NOT);
				setState(42);
				expr(5);
				}
				break;
			case 3:
				{
				_localctx = new ExprEqualsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				col();
				setState(44);
				match(EQUALS);
				setState(45);
				match(STRING_CONST);
				}
				break;
			case 4:
				{
				_localctx = new ExprContainsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(47);
				col();
				setState(48);
				match(CONTAINS);
				setState(49);
				match(STRING_CONST);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54);
						match(AND);
						setState(55);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(57);
						match(OR);
						setState(58);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitWriteFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Out_clauseContext out_clause() throws RecognitionException {
		Out_clauseContext _localctx = new Out_clauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_out_clause);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITE:
				_localctx = new WriteFileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(WRITE);
				setState(65);
				match(FILE);
				setState(66);
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
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CSVQueryLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CSVQueryLangParser.COMMA, i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			col();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(71);
				match(COMMA);
				setState(72);
				col();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CSVQueryLangVisitor ) return ((CSVQueryLangVisitor<? extends T>)visitor).visitCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(COL);
			setState(79);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4 \n\4\3\5\3\5\3\5\5\5%\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\66\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6>\n\6\f\6\16\6A\13\6\3\7\3\7\3\7\3\7\5\7G\n\7\3"+
		"\b\3\b\3\b\7\bL\n\b\f\b\16\bO\13\b\3\t\3\t\3\t\3\t\2\3\n\n\2\4\6\b\n\f"+
		"\16\20\2\2\2T\2\22\3\2\2\2\4\30\3\2\2\2\6\37\3\2\2\2\b$\3\2\2\2\n\65\3"+
		"\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20P\3\2\2\2\22\23\5\4\3\2\23\24\5\b\5\2"+
		"\24\25\5\6\4\2\25\26\5\f\7\2\26\27\7\3\2\2\27\3\3\2\2\2\30\31\7\4\2\2"+
		"\31\32\7\6\2\2\32\33\7\23\2\2\33\5\3\2\2\2\34\35\7\7\2\2\35 \5\16\b\2"+
		"\36 \3\2\2\2\37\34\3\2\2\2\37\36\3\2\2\2 \7\3\2\2\2!\"\7\b\2\2\"%\5\n"+
		"\6\2#%\3\2\2\2$!\3\2\2\2$#\3\2\2\2%\t\3\2\2\2&\'\b\6\1\2\'(\7\r\2\2()"+
		"\5\n\6\2)*\7\16\2\2*\66\3\2\2\2+,\7\21\2\2,\66\5\n\6\7-.\5\20\t\2./\7"+
		"\n\2\2/\60\7\25\2\2\60\66\3\2\2\2\61\62\5\20\t\2\62\63\7\f\2\2\63\64\7"+
		"\25\2\2\64\66\3\2\2\2\65&\3\2\2\2\65+\3\2\2\2\65-\3\2\2\2\65\61\3\2\2"+
		"\2\66?\3\2\2\2\678\f\6\2\289\7\17\2\29>\5\n\6\7:;\f\5\2\2;<\7\20\2\2<"+
		">\5\n\6\6=\67\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2"+
		"\2\2A?\3\2\2\2BC\7\5\2\2CD\7\6\2\2DG\7\23\2\2EG\3\2\2\2FB\3\2\2\2FE\3"+
		"\2\2\2G\r\3\2\2\2HM\5\20\t\2IJ\7\13\2\2JL\5\20\t\2KI\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\17\3\2\2\2OM\3\2\2\2PQ\7\t\2\2QR\7\24\2\2R\21\3"+
		"\2\2\2\t\37$\65=?FM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}