// Generated from C:/Javalib/Swe514_Project_v2/src\ExprGrammarFile.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MUL=12, DIV=13, MOD=14, ADD=15, SUB=16, ID=17, NUM=18, 
		WS=19;
	public static final int
		RULE_stm = 0, RULE_opt_stmts = 1, RULE_stm_list = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"stm", "opt_stmts", "stm_list", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'begin'", "'end'", "':='", "'print'", "'if'", "'then'", "'while'", 
		"'do'", "';'", "'('", "')'", "'*'", "'/'", "'mod'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"MUL", "DIV", "MOD", "ADD", "SUB", "ID", "NUM", "WS"
	};
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
	public String getGrammarFileName() { return "ExprGrammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprGrammarFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BeginendContext extends StmContext {
		public Opt_stmtsContext opt_stmts() {
			return getRuleContext(Opt_stmtsContext.class,0);
		}
		public BeginendContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterBeginend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitBeginend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitBeginend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfthenContext extends StmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmContext stm() {
			return getRuleContext(StmContext.class,0);
		}
		public IfthenContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterIfthen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitIfthen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitIfthen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhiledoContext extends StmContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmContext stm() {
			return getRuleContext(StmContext.class,0);
		}
		public WhiledoContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterWhiledo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitWhiledo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitWhiledo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StmContext {
		public TerminalNode ID() { return getToken(ExprGrammarFileParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stm);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new BeginendContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				match(T__0);
				setState(9);
				opt_stmts();
				setState(10);
				match(T__1);
				}
				break;
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(ID);
				setState(13);
				match(T__2);
				setState(14);
				expr(0);
				}
				break;
			case T__3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(T__3);
				setState(16);
				expr(0);
				}
				break;
			case T__4:
				_localctx = new IfthenContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(17);
				match(T__4);
				setState(18);
				expr(0);
				setState(19);
				match(T__5);
				setState(20);
				stm();
				}
				break;
			case T__6:
				_localctx = new WhiledoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(22);
				match(T__6);
				setState(23);
				expr(0);
				setState(24);
				match(T__7);
				setState(25);
				stm();
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

	public static class Opt_stmtsContext extends ParserRuleContext {
		public Stm_listContext stm_list() {
			return getRuleContext(Stm_listContext.class,0);
		}
		public Opt_stmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterOpt_stmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitOpt_stmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitOpt_stmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opt_stmtsContext opt_stmts() throws RecognitionException {
		Opt_stmtsContext _localctx = new Opt_stmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_opt_stmts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			stm_list();
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

	public static class Stm_listContext extends ParserRuleContext {
		public StmContext stm() {
			return getRuleContext(StmContext.class,0);
		}
		public Stm_listContext stm_list() {
			return getRuleContext(Stm_listContext.class,0);
		}
		public Stm_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterStm_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitStm_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitStm_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stm_listContext stm_list() throws RecognitionException {
		Stm_listContext _localctx = new Stm_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stm_list);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				stm();
				setState(32);
				match(T__8);
				setState(33);
				stm_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				stm();
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
	public static class DivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(ExprGrammarFileParser.DIV, 0); }
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(ExprGrammarFileParser.ADD, 0); }
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(ExprGrammarFileParser.SUB, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD() { return getToken(ExprGrammarFileParser.MOD, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ExprGrammarFileParser.MUL, 0); }
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(ExprGrammarFileParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode NUM() { return getToken(ExprGrammarFileParser.NUM, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprGrammarFileListener ) ((ExprGrammarFileListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExprGrammarFileVisitor ) return ((ExprGrammarFileVisitor<? extends T>)visitor).visitInt(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(ID);
				}
				break;
			case T__9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(T__9);
				setState(42);
				expr(0);
				setState(43);
				match(T__10);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(48);
						((MulContext)_localctx).op = match(MUL);
						setState(49);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(50);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(51);
						((DivContext)_localctx).op = match(DIV);
						setState(52);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(54);
						((ModContext)_localctx).op = match(MOD);
						setState(55);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(57);
						((AddContext)_localctx).op = match(ADD);
						setState(58);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(60);
						((SubContext)_localctx).op = match(SUB);
						setState(61);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(66);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25F\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\'"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5A\n\5\f\5\16\5D\13\5\3\5\2\3\b\6"+
		"\2\4\6\b\2\2\2M\2\35\3\2\2\2\4\37\3\2\2\2\6&\3\2\2\2\b/\3\2\2\2\n\13\7"+
		"\3\2\2\13\f\5\4\3\2\f\r\7\4\2\2\r\36\3\2\2\2\16\17\7\23\2\2\17\20\7\5"+
		"\2\2\20\36\5\b\5\2\21\22\7\6\2\2\22\36\5\b\5\2\23\24\7\7\2\2\24\25\5\b"+
		"\5\2\25\26\7\b\2\2\26\27\5\2\2\2\27\36\3\2\2\2\30\31\7\t\2\2\31\32\5\b"+
		"\5\2\32\33\7\n\2\2\33\34\5\2\2\2\34\36\3\2\2\2\35\n\3\2\2\2\35\16\3\2"+
		"\2\2\35\21\3\2\2\2\35\23\3\2\2\2\35\30\3\2\2\2\36\3\3\2\2\2\37 \5\6\4"+
		"\2 \5\3\2\2\2!\"\5\2\2\2\"#\7\13\2\2#$\5\6\4\2$\'\3\2\2\2%\'\5\2\2\2&"+
		"!\3\2\2\2&%\3\2\2\2\'\7\3\2\2\2()\b\5\1\2)\60\7\24\2\2*\60\7\23\2\2+,"+
		"\7\f\2\2,-\5\b\5\2-.\7\r\2\2.\60\3\2\2\2/(\3\2\2\2/*\3\2\2\2/+\3\2\2\2"+
		"\60B\3\2\2\2\61\62\f\n\2\2\62\63\7\16\2\2\63A\5\b\5\13\64\65\f\t\2\2\65"+
		"\66\7\17\2\2\66A\5\b\5\n\678\f\b\2\289\7\20\2\29A\5\b\5\t:;\f\7\2\2;<"+
		"\7\21\2\2<A\5\b\5\b=>\f\6\2\2>?\7\22\2\2?A\5\b\5\7@\61\3\2\2\2@\64\3\2"+
		"\2\2@\67\3\2\2\2@:\3\2\2\2@=\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\t"+
		"\3\2\2\2DB\3\2\2\2\7\35&/@B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}