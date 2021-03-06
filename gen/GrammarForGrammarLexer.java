// Generated from /Users/milenabulkina/IdeaProjects/lab4/GrammarForGrammar.g4 by ANTLR 4.9.2

import grammar.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarForGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ID=16, CODE=17, 
		REGEX=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ID", "CODE", "REGEX", 
			"WS"
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


	public GrammarForGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GrammarForGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\7\21_\n\21\f\21\16\21b\13\21\3\22\3"+
		"\22\7\22f\n\22\f\22\16\22i\13\22\3\22\3\22\3\23\3\23\7\23o\n\23\f\23\16"+
		"\23r\13\23\3\23\3\23\3\24\6\24w\n\24\r\24\16\24x\3\24\3\24\4gp\2\25\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25\3\2\5\4\2C\\c|\t\2\60\60\62;>>@@C\\aac|\5\2\13\f"+
		"\17\17\"\"\2\177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5\61\3\2\2\2\7"+
		"\63\3\2\2\2\t\66\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17>\3\2\2\2\21C\3\2\2"+
		"\2\23F\3\2\2\2\25J\3\2\2\2\27L\3\2\2\2\31N\3\2\2\2\33V\3\2\2\2\35X\3\2"+
		"\2\2\37Z\3\2\2\2!\\\3\2\2\2#c\3\2\2\2%l\3\2\2\2\'v\3\2\2\2)*\7i\2\2*+"+
		"\7t\2\2+,\7c\2\2,-\7o\2\2-.\7o\2\2./\7c\2\2/\60\7t\2\2\60\4\3\2\2\2\61"+
		"\62\7=\2\2\62\6\3\2\2\2\63\64\7#\2\2\64\65\7k\2\2\65\b\3\2\2\2\66\67\7"+
		"#\2\2\678\7v\2\28\n\3\2\2\29:\7?\2\2:\f\3\2\2\2;<\7/\2\2<=\7@\2\2=\16"+
		"\3\2\2\2>?\7u\2\2?@\7m\2\2@A\7k\2\2AB\7r\2\2B\20\3\2\2\2CD\7#\2\2DE\7"+
		"u\2\2E\22\3\2\2\2FG\7#\2\2GH\7p\2\2HI\7v\2\2I\24\3\2\2\2JK\7]\2\2K\26"+
		"\3\2\2\2LM\7_\2\2M\30\3\2\2\2NO\7t\2\2OP\7g\2\2PQ\7v\2\2QR\7w\2\2RS\7"+
		"t\2\2ST\7p\2\2TU\7u\2\2U\32\3\2\2\2VW\7<\2\2W\34\3\2\2\2XY\7~\2\2Y\36"+
		"\3\2\2\2Z[\7.\2\2[ \3\2\2\2\\`\t\2\2\2]_\t\3\2\2^]\3\2\2\2_b\3\2\2\2`"+
		"^\3\2\2\2`a\3\2\2\2a\"\3\2\2\2b`\3\2\2\2cg\7}\2\2df\13\2\2\2ed\3\2\2\2"+
		"fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\177\2\2k$\3\2\2"+
		"\2lp\7$\2\2mo\13\2\2\2nm\3\2\2\2or\3\2\2\2pq\3\2\2\2pn\3\2\2\2qs\3\2\2"+
		"\2rp\3\2\2\2st\7$\2\2t&\3\2\2\2uw\t\4\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2"+
		"\2xy\3\2\2\2yz\3\2\2\2z{\b\24\2\2{(\3\2\2\2\7\2`gpx\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}