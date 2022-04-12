// Generated from /Users/milenabulkina/IdeaProjects/lab4/GrammarForGrammar.g4 by ANTLR 4.9.2

import grammar.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarForGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, CODE=17, 
		REGEX=18, WS=19;
	public static final int
		RULE_input = 0, RULE_input_ = 1, RULE_name = 2, RULE_importBlock = 3, 
		RULE_token = 4, RULE_tokenBlock = 5, RULE_startNonTerm = 6, RULE_nonTerm = 7, 
		RULE_nonTermBlock = 8, RULE_inherited = 9, RULE_synthesized = 10, RULE_ruleBlock = 11, 
		RULE_ruleInherited = 12, RULE_codeLine = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "input_", "name", "importBlock", "token", "tokenBlock", "startNonTerm", 
			"nonTerm", "nonTermBlock", "inherited", "synthesized", "ruleBlock", "ruleInherited", 
			"codeLine"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "';'", "'!i'", "'!t'", "'='", "'->'", "'skip'", "'!s'", 
			"'!nt'", "'['", "']'", "'returns'", "':'", "'|'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "CODE", "REGEX", "WS"
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
	public String getGrammarFileName() { return "GrammarForGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarForGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InputContext extends ParserRuleContext {
		public Grammar gr;
		public Input_Context input_() {
			return getRuleContext(Input_Context.class,0);
		}
		public TerminalNode EOF() { return getToken(GrammarForGrammarParser.EOF, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);

		    ((InputContext)_localctx).gr =  new Grammar();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			input_(_localctx.gr);
			setState(29);
			match(EOF);
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

	public static class Input_Context extends ParserRuleContext {
		public Grammar gr;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public StartNonTermContext startNonTerm() {
			return getRuleContext(StartNonTermContext.class,0);
		}
		public List<ImportBlockContext> importBlock() {
			return getRuleContexts(ImportBlockContext.class);
		}
		public ImportBlockContext importBlock(int i) {
			return getRuleContext(ImportBlockContext.class,i);
		}
		public List<TokenContext> token() {
			return getRuleContexts(TokenContext.class);
		}
		public TokenContext token(int i) {
			return getRuleContext(TokenContext.class,i);
		}
		public List<NonTermContext> nonTerm() {
			return getRuleContexts(NonTermContext.class);
		}
		public NonTermContext nonTerm(int i) {
			return getRuleContext(NonTermContext.class,i);
		}
		public Input_Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Input_Context(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_input_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterInput_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitInput_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitInput_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_Context input_(Grammar gr) throws RecognitionException {
		Input_Context _localctx = new Input_Context(_ctx, getState(), gr);
		enterRule(_localctx, 2, RULE_input_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			name(_localctx.gr);
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(32);
				importBlock(_localctx.gr);
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(38);
				token(_localctx.gr);
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44);
			startNonTerm(_localctx.gr);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(45);
				nonTerm(_localctx.gr);
				}
				}
				setState(50);
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

	public static class NameContext extends ParserRuleContext {
		public Grammar gr;
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarForGrammarParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NameContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name(Grammar gr) throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState(), gr);
		enterRule(_localctx, 4, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__0);
			setState(52);
			((NameContext)_localctx).ID = match(ID);
			setState(53);
			match(T__1);

			    _localctx.gr.addName((((NameContext)_localctx).ID!=null?((NameContext)_localctx).ID.getText():null));

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

	public static class ImportBlockContext extends ParserRuleContext {
		public Grammar gr;
		public Token REGEX;
		public TerminalNode REGEX() { return getToken(GrammarForGrammarParser.REGEX, 0); }
		public ImportBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ImportBlockContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_importBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterImportBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitImportBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitImportBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBlockContext importBlock(Grammar gr) throws RecognitionException {
		ImportBlockContext _localctx = new ImportBlockContext(_ctx, getState(), gr);
		enterRule(_localctx, 6, RULE_importBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__2);
			setState(57);
			((ImportBlockContext)_localctx).REGEX = match(REGEX);
			_localctx.gr.addHeader((((ImportBlockContext)_localctx).REGEX!=null?((ImportBlockContext)_localctx).REGEX.getText():null).substring(1, (((ImportBlockContext)_localctx).REGEX!=null?((ImportBlockContext)_localctx).REGEX.getText():null).length() - 1));
			setState(59);
			match(T__1);
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

	public static class TokenContext extends ParserRuleContext {
		public Grammar gr;
		public TokenBlockContext tokenBlock() {
			return getRuleContext(TokenBlockContext.class,0);
		}
		public TokenContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TokenContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitToken(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitToken(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenContext token(Grammar gr) throws RecognitionException {
		TokenContext _localctx = new TokenContext(_ctx, getState(), gr);
		enterRule(_localctx, 8, RULE_token);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__3);
			setState(62);
			tokenBlock(_localctx.gr);
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

	public static class TokenBlockContext extends ParserRuleContext {
		public Grammar gr;
		public boolean skip;
		public Token ID;
		public Token REGEX;
		public TerminalNode ID() { return getToken(GrammarForGrammarParser.ID, 0); }
		public TerminalNode REGEX() { return getToken(GrammarForGrammarParser.REGEX, 0); }
		public TokenBlockContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TokenBlockContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_tokenBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterTokenBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitTokenBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitTokenBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TokenBlockContext tokenBlock(Grammar gr) throws RecognitionException {
		TokenBlockContext _localctx = new TokenBlockContext(_ctx, getState(), gr);
		enterRule(_localctx, 10, RULE_tokenBlock);

		    ((TokenBlockContext)_localctx).skip =  false;

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			((TokenBlockContext)_localctx).ID = match(ID);
			setState(65);
			match(T__4);
			setState(66);
			((TokenBlockContext)_localctx).REGEX = match(REGEX);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(67);
				match(T__5);
				setState(68);
				match(T__6);
				((TokenBlockContext)_localctx).skip =  true;
				}
			}

			setState(72);
			match(T__1);

			        if (_localctx.skip) {
			            _localctx.gr.addSkipToken((((TokenBlockContext)_localctx).ID!=null?((TokenBlockContext)_localctx).ID.getText():null), (((TokenBlockContext)_localctx).REGEX!=null?((TokenBlockContext)_localctx).REGEX.getText():null));
			        } else {
			            _localctx.gr.addToken((((TokenBlockContext)_localctx).ID!=null?((TokenBlockContext)_localctx).ID.getText():null), (((TokenBlockContext)_localctx).REGEX!=null?((TokenBlockContext)_localctx).REGEX.getText():null));
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

	public static class StartNonTermContext extends ParserRuleContext {
		public Grammar gr;
		public Token ID;
		public TerminalNode ID() { return getToken(GrammarForGrammarParser.ID, 0); }
		public StartNonTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StartNonTermContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_startNonTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterStartNonTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitStartNonTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitStartNonTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartNonTermContext startNonTerm(Grammar gr) throws RecognitionException {
		StartNonTermContext _localctx = new StartNonTermContext(_ctx, getState(), gr);
		enterRule(_localctx, 12, RULE_startNonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__7);
			setState(76);
			((StartNonTermContext)_localctx).ID = match(ID);
			setState(77);
			match(T__1);

			     _localctx.gr.addStart((((StartNonTermContext)_localctx).ID!=null?((StartNonTermContext)_localctx).ID.getText():null));
			 
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

	public static class NonTermContext extends ParserRuleContext {
		public Grammar gr;
		public NonTermBlockContext nonTermBlock;
		public NonTermBlockContext nonTermBlock() {
			return getRuleContext(NonTermBlockContext.class,0);
		}
		public NonTermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public NonTermContext(ParserRuleContext parent, int invokingState, Grammar gr) {
			super(parent, invokingState);
			this.gr = gr;
		}
		@Override public int getRuleIndex() { return RULE_nonTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterNonTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitNonTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitNonTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTermContext nonTerm(Grammar gr) throws RecognitionException {
		NonTermContext _localctx = new NonTermContext(_ctx, getState(), gr);
		enterRule(_localctx, 14, RULE_nonTerm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__8);
			setState(81);
			((NonTermContext)_localctx).nonTermBlock = nonTermBlock();
			_localctx.gr.addNonTerminal(((NonTermContext)_localctx).nonTermBlock.nt);
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

	public static class NonTermBlockContext extends ParserRuleContext {
		public NonTerminal nt;
		public Token ID;
		public RuleBlockContext a;
		public RuleBlockContext b;
		public TerminalNode ID() { return getToken(GrammarForGrammarParser.ID, 0); }
		public List<RuleBlockContext> ruleBlock() {
			return getRuleContexts(RuleBlockContext.class);
		}
		public RuleBlockContext ruleBlock(int i) {
			return getRuleContext(RuleBlockContext.class,i);
		}
		public InheritedContext inherited() {
			return getRuleContext(InheritedContext.class,0);
		}
		public SynthesizedContext synthesized() {
			return getRuleContext(SynthesizedContext.class,0);
		}
		public NonTermBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTermBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterNonTermBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitNonTermBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitNonTermBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonTermBlockContext nonTermBlock() throws RecognitionException {
		NonTermBlockContext _localctx = new NonTermBlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonTermBlock);

		    ((NonTermBlockContext)_localctx).nt =  new NonTerminal();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((NonTermBlockContext)_localctx).ID = match(ID);
			_localctx.nt.addName((((NonTermBlockContext)_localctx).ID!=null?((NonTermBlockContext)_localctx).ID.getText():null));
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(86);
				match(T__9);
				setState(87);
				inherited(_localctx.nt);
				setState(88);
				match(T__10);
				}
			}

			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(92);
				match(T__11);
				setState(93);
				match(T__9);
				setState(94);
				synthesized(_localctx.nt);
				setState(95);
				match(T__10);
				}
			}

			setState(99);
			match(T__12);
			setState(100);
			((NonTermBlockContext)_localctx).a = ruleBlock();
			_localctx.nt.addRule(((NonTermBlockContext)_localctx).a.r);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(102);
				match(T__13);
				setState(103);
				((NonTermBlockContext)_localctx).b = ruleBlock();
				_localctx.nt.addRule(((NonTermBlockContext)_localctx).b.r);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__1);
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

	public static class InheritedContext extends ParserRuleContext {
		public NonTerminal nt;
		public Token t1;
		public Token n1;
		public Token t2;
		public Token n2;
		public List<TerminalNode> ID() { return getTokens(GrammarForGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarForGrammarParser.ID, i);
		}
		public InheritedContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public InheritedContext(ParserRuleContext parent, int invokingState, NonTerminal nt) {
			super(parent, invokingState);
			this.nt = nt;
		}
		@Override public int getRuleIndex() { return RULE_inherited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterInherited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitInherited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitInherited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InheritedContext inherited(NonTerminal nt) throws RecognitionException {
		InheritedContext _localctx = new InheritedContext(_ctx, getState(), nt);
		enterRule(_localctx, 18, RULE_inherited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((InheritedContext)_localctx).t1 = match(ID);
			setState(114);
			((InheritedContext)_localctx).n1 = match(ID);
			_localctx.nt.addParam((((InheritedContext)_localctx).t1!=null?((InheritedContext)_localctx).t1.getText():null), (((InheritedContext)_localctx).n1!=null?((InheritedContext)_localctx).n1.getText():null));
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(116);
				match(T__14);
				setState(117);
				((InheritedContext)_localctx).t2 = match(ID);
				setState(118);
				((InheritedContext)_localctx).n2 = match(ID);
				_localctx.nt.addParam((((InheritedContext)_localctx).t2!=null?((InheritedContext)_localctx).t2.getText():null), (((InheritedContext)_localctx).n2!=null?((InheritedContext)_localctx).n2.getText():null));
				}
				}
				setState(124);
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

	public static class SynthesizedContext extends ParserRuleContext {
		public NonTerminal nt;
		public Token t1;
		public Token n1;
		public Token t2;
		public Token n2;
		public List<TerminalNode> ID() { return getTokens(GrammarForGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarForGrammarParser.ID, i);
		}
		public SynthesizedContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public SynthesizedContext(ParserRuleContext parent, int invokingState, NonTerminal nt) {
			super(parent, invokingState);
			this.nt = nt;
		}
		@Override public int getRuleIndex() { return RULE_synthesized; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterSynthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitSynthesized(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitSynthesized(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynthesizedContext synthesized(NonTerminal nt) throws RecognitionException {
		SynthesizedContext _localctx = new SynthesizedContext(_ctx, getState(), nt);
		enterRule(_localctx, 20, RULE_synthesized);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((SynthesizedContext)_localctx).t1 = match(ID);
			setState(126);
			((SynthesizedContext)_localctx).n1 = match(ID);
			_localctx.nt.addReturn((((SynthesizedContext)_localctx).t1!=null?((SynthesizedContext)_localctx).t1.getText():null), (((SynthesizedContext)_localctx).n1!=null?((SynthesizedContext)_localctx).n1.getText():null));
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(128);
				match(T__14);
				setState(129);
				((SynthesizedContext)_localctx).t2 = match(ID);
				setState(130);
				((SynthesizedContext)_localctx).n2 = match(ID);
				_localctx.nt.addReturn((((SynthesizedContext)_localctx).t2!=null?((SynthesizedContext)_localctx).t2.getText():null), (((SynthesizedContext)_localctx).n2!=null?((SynthesizedContext)_localctx).n2.getText():null));
				}
				}
				setState(136);
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

	public static class RuleBlockContext extends ParserRuleContext {
		public Rule r;
		public StringBuilder params;
		public StringBuilder lines;
		public Token ID;
		public List<TerminalNode> ID() { return getTokens(GrammarForGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarForGrammarParser.ID, i);
		}
		public List<RuleInheritedContext> ruleInherited() {
			return getRuleContexts(RuleInheritedContext.class);
		}
		public RuleInheritedContext ruleInherited(int i) {
			return getRuleContext(RuleInheritedContext.class,i);
		}
		public List<CodeLineContext> codeLine() {
			return getRuleContexts(CodeLineContext.class);
		}
		public CodeLineContext codeLine(int i) {
			return getRuleContext(CodeLineContext.class,i);
		}
		public RuleBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterRuleBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitRuleBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitRuleBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleBlockContext ruleBlock() throws RecognitionException {
		RuleBlockContext _localctx = new RuleBlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ruleBlock);

		    ((RuleBlockContext)_localctx).r =  new Rule();
		    ((RuleBlockContext)_localctx).params =  new StringBuilder();
		    ((RuleBlockContext)_localctx).lines =  new StringBuilder();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				((RuleBlockContext)_localctx).ID = match(ID);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(138);
					ruleInherited(_localctx.params);
					}
				}

				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODE) {
					{
					setState(141);
					codeLine(_localctx.lines);
					}
				}

				_localctx.r.addState((((RuleBlockContext)_localctx).ID!=null?((RuleBlockContext)_localctx).ID.getText():null), _localctx.params.toString(), _localctx.lines.toString());
				    ((RuleBlockContext)_localctx).params =  new StringBuilder();
				    ((RuleBlockContext)_localctx).lines =  new StringBuilder();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class RuleInheritedContext extends ParserRuleContext {
		public StringBuilder sb;
		public Token n1;
		public Token n2;
		public List<TerminalNode> ID() { return getTokens(GrammarForGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarForGrammarParser.ID, i);
		}
		public RuleInheritedContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RuleInheritedContext(ParserRuleContext parent, int invokingState, StringBuilder sb) {
			super(parent, invokingState);
			this.sb = sb;
		}
		@Override public int getRuleIndex() { return RULE_ruleInherited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterRuleInherited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitRuleInherited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitRuleInherited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleInheritedContext ruleInherited(StringBuilder sb) throws RecognitionException {
		RuleInheritedContext _localctx = new RuleInheritedContext(_ctx, getState(), sb);
		enterRule(_localctx, 24, RULE_ruleInherited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(T__9);
			setState(150);
			((RuleInheritedContext)_localctx).n1 = match(ID);
			_localctx.sb.append((((RuleInheritedContext)_localctx).n1!=null?((RuleInheritedContext)_localctx).n1.getText():null));
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(152);
				match(T__14);
				setState(153);
				((RuleInheritedContext)_localctx).n2 = match(ID);
				_localctx.sb.append(", ").append((((RuleInheritedContext)_localctx).n2!=null?((RuleInheritedContext)_localctx).n2.getText():null));
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(T__10);
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

	public static class CodeLineContext extends ParserRuleContext {
		public StringBuilder s;
		public Token CODE;
		public TerminalNode CODE() { return getToken(GrammarForGrammarParser.CODE, 0); }
		public CodeLineContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CodeLineContext(ParserRuleContext parent, int invokingState, StringBuilder s) {
			super(parent, invokingState);
			this.s = s;
		}
		@Override public int getRuleIndex() { return RULE_codeLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).enterCodeLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarForGrammarListener ) ((GrammarForGrammarListener)listener).exitCodeLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarForGrammarVisitor ) return ((GrammarForGrammarVisitor<? extends T>)visitor).visitCodeLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeLineContext codeLine(StringBuilder s) throws RecognitionException {
		CodeLineContext _localctx = new CodeLineContext(_ctx, getState(), s);
		enterRule(_localctx, 26, RULE_codeLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			((CodeLineContext)_localctx).CODE = match(CODE);

			    s.append((((CodeLineContext)_localctx).CODE!=null?((CodeLineContext)_localctx).CODE.getText():null).substring(1, (((CodeLineContext)_localctx).CODE!=null?((CodeLineContext)_localctx).CODE.getText():null).length() - 1));

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7I\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n]\n\n\3\n\3\n\3\n\3\n\3\n\5\nd\n\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\7\nm\n\n\f\n\16\np\13\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\7\13{\n\13\f\13\16\13~\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0087\n\f\f\f\16\f\u008a\13\f\3\r\3\r\5\r\u008e\n\r\3\r\5"+
		"\r\u0091\n\r\3\r\6\r\u0094\n\r\r\r\16\r\u0095\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\7\16\u009e\n\16\f\16\16\16\u00a1\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\2\2\u00a6\2\36\3\2"+
		"\2\2\4!\3\2\2\2\6\65\3\2\2\2\b:\3\2\2\2\n?\3\2\2\2\fB\3\2\2\2\16M\3\2"+
		"\2\2\20R\3\2\2\2\22V\3\2\2\2\24s\3\2\2\2\26\177\3\2\2\2\30\u0093\3\2\2"+
		"\2\32\u0097\3\2\2\2\34\u00a4\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2"+
		"\2\2!%\5\6\4\2\"$\5\b\5\2#\"\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&+"+
		"\3\2\2\2\'%\3\2\2\2(*\5\n\6\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2"+
		",.\3\2\2\2-+\3\2\2\2.\62\5\16\b\2/\61\5\20\t\2\60/\3\2\2\2\61\64\3\2\2"+
		"\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\7\3\2"+
		"\2\66\67\7\22\2\2\678\7\4\2\289\b\4\1\29\7\3\2\2\2:;\7\5\2\2;<\7\24\2"+
		"\2<=\b\5\1\2=>\7\4\2\2>\t\3\2\2\2?@\7\6\2\2@A\5\f\7\2A\13\3\2\2\2BC\7"+
		"\22\2\2CD\7\7\2\2DH\7\24\2\2EF\7\b\2\2FG\7\t\2\2GI\b\7\1\2HE\3\2\2\2H"+
		"I\3\2\2\2IJ\3\2\2\2JK\7\4\2\2KL\b\7\1\2L\r\3\2\2\2MN\7\n\2\2NO\7\22\2"+
		"\2OP\7\4\2\2PQ\b\b\1\2Q\17\3\2\2\2RS\7\13\2\2ST\5\22\n\2TU\b\t\1\2U\21"+
		"\3\2\2\2VW\7\22\2\2W\\\b\n\1\2XY\7\f\2\2YZ\5\24\13\2Z[\7\r\2\2[]\3\2\2"+
		"\2\\X\3\2\2\2\\]\3\2\2\2]c\3\2\2\2^_\7\16\2\2_`\7\f\2\2`a\5\26\f\2ab\7"+
		"\r\2\2bd\3\2\2\2c^\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\17\2\2fg\5\30\r\2g"+
		"n\b\n\1\2hi\7\20\2\2ij\5\30\r\2jk\b\n\1\2km\3\2\2\2lh\3\2\2\2mp\3\2\2"+
		"\2nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\4\2\2r\23\3\2\2\2st\7\22"+
		"\2\2tu\7\22\2\2u|\b\13\1\2vw\7\21\2\2wx\7\22\2\2xy\7\22\2\2y{\b\13\1\2"+
		"zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~|\3\2\2\2\177\u0080"+
		"\7\22\2\2\u0080\u0081\7\22\2\2\u0081\u0088\b\f\1\2\u0082\u0083\7\21\2"+
		"\2\u0083\u0084\7\22\2\2\u0084\u0085\7\22\2\2\u0085\u0087\b\f\1\2\u0086"+
		"\u0082\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\27\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\7\22\2\2\u008c\u008e"+
		"\5\32\16\2\u008d\u008c\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2"+
		"\u008f\u0091\5\34\17\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\b\r\1\2\u0093\u008b\3\2\2\2\u0094\u0095\3\2\2\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\31\3\2\2\2\u0097\u0098\7\f\2"+
		"\2\u0098\u0099\7\22\2\2\u0099\u009f\b\16\1\2\u009a\u009b\7\21\2\2\u009b"+
		"\u009c\7\22\2\2\u009c\u009e\b\16\1\2\u009d\u009a\3\2\2\2\u009e\u00a1\3"+
		"\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\23\2"+
		"\2\u00a5\u00a6\b\17\1\2\u00a6\35\3\2\2\2\17%+\62H\\cn|\u0088\u008d\u0090"+
		"\u0095\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}