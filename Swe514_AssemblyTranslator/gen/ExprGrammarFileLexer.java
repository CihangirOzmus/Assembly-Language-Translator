// Generated from C:/Javalib/Swe514_Project_v2/src\ExprGrammarFile.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprGrammarFileLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, MUL=12, DIV=13, MOD=14, ADD=15, SUB=16, ID=17, NUM=18, 
		WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "MUL", "DIV", "MOD", "ADD", "SUB", "ID", "NUM", "WS"
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


	public ExprGrammarFileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExprGrammarFile.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25r\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\7\22b\n\22\f\22\16\22"+
		"e\13\22\3\23\6\23h\n\23\r\23\16\23i\3\24\6\24m\n\24\r\24\16\24n\3\24\3"+
		"\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62"+
		";\5\2\13\f\17\17\"\"\2t\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5/\3\2\2"+
		"\2\7\63\3\2\2\2\t\66\3\2\2\2\13<\3\2\2\2\r?\3\2\2\2\17D\3\2\2\2\21J\3"+
		"\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33U\3\2\2\2\35"+
		"W\3\2\2\2\37[\3\2\2\2!]\3\2\2\2#_\3\2\2\2%g\3\2\2\2\'l\3\2\2\2)*\7d\2"+
		"\2*+\7g\2\2+,\7i\2\2,-\7k\2\2-.\7p\2\2.\4\3\2\2\2/\60\7g\2\2\60\61\7p"+
		"\2\2\61\62\7f\2\2\62\6\3\2\2\2\63\64\7<\2\2\64\65\7?\2\2\65\b\3\2\2\2"+
		"\66\67\7r\2\2\678\7t\2\289\7k\2\29:\7p\2\2:;\7v\2\2;\n\3\2\2\2<=\7k\2"+
		"\2=>\7h\2\2>\f\3\2\2\2?@\7v\2\2@A\7j\2\2AB\7g\2\2BC\7p\2\2C\16\3\2\2\2"+
		"DE\7y\2\2EF\7j\2\2FG\7k\2\2GH\7n\2\2HI\7g\2\2I\20\3\2\2\2JK\7f\2\2KL\7"+
		"q\2\2L\22\3\2\2\2MN\7=\2\2N\24\3\2\2\2OP\7*\2\2P\26\3\2\2\2QR\7+\2\2R"+
		"\30\3\2\2\2ST\7,\2\2T\32\3\2\2\2UV\7\61\2\2V\34\3\2\2\2WX\7o\2\2XY\7q"+
		"\2\2YZ\7f\2\2Z\36\3\2\2\2[\\\7-\2\2\\ \3\2\2\2]^\7/\2\2^\"\3\2\2\2_c\t"+
		"\2\2\2`b\t\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d$\3\2\2\2ec\3"+
		"\2\2\2fh\t\4\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2j&\3\2\2\2km\t"+
		"\5\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\24\2\2q("+
		"\3\2\2\2\6\2cin\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}