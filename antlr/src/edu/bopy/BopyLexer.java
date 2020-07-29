// Generated from /Users/ajc/Documents/projects/bopy/antlr/Bopy.g4 by ANTLR 4.7.1
package edu.bopy;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BopyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NAME=18, STRING=19, FLOAT=20, INTEGER=21, COMMENT=22, INDENT=23, DEDENT=24, 
		NEWLINE=25, WHITESPACE=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"NAME", "STRING", "FLOAT", "INTEGER", "EXP", "DIGITS", "ZERO", "COMMENT", 
		"INDENT", "DEDENT", "NEWLINE", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'flt'", "'str'", "':'", "'let'", "'='", "'var'", "'if'", 
		"'func'", "'->'", "'proc'", "'('", "','", "')'", "'data'", "'true'", "'false'", 
		null, null, null, null, null, "'{'", "'}'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "NAME", "STRING", "FLOAT", "INTEGER", 
		"COMMENT", "INDENT", "DEDENT", "NEWLINE", "WHITESPACE"
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


	public BopyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bopy.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\34\u00d8\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\6\23}\n\23\r\23"+
		"\16\23~\3\23\7\23\u0082\n\23\f\23\16\23\u0085\13\23\3\24\3\24\3\24\3\24"+
		"\7\24\u008b\n\24\f\24\16\24\u008e\13\24\3\24\3\24\3\25\5\25\u0093\n\25"+
		"\3\25\3\25\3\25\7\25\u0098\n\25\f\25\16\25\u009b\13\25\3\25\3\25\5\25"+
		"\u009f\n\25\3\25\5\25\u00a2\n\25\3\26\5\26\u00a5\n\26\3\26\3\26\3\27\3"+
		"\27\5\27\u00ab\n\27\3\27\3\27\3\30\3\30\3\30\7\30\u00b2\n\30\f\30\16\30"+
		"\u00b5\13\30\5\30\u00b7\n\30\3\31\3\31\3\32\3\32\7\32\u00bd\n\32\f\32"+
		"\16\32\u00c0\13\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\5\35\u00cb"+
		"\n\35\3\35\6\35\u00ce\n\35\r\35\16\35\u00cf\3\36\6\36\u00d3\n\36\r\36"+
		"\16\36\u00d4\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\2/\2\61\2"+
		"\63\30\65\31\67\329\33;\34\3\2\13\5\2C\\aac|\6\2\62;C\\aac|\3\2$$\4\2"+
		"GGgg\4\2--//\3\2\63;\3\2\62;\3\2\f\f\4\2\13\13\"\"\2\u00e4\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7E\3\2\2\2\tI\3\2\2"+
		"\2\13K\3\2\2\2\rO\3\2\2\2\17Q\3\2\2\2\21U\3\2\2\2\23X\3\2\2\2\25]\3\2"+
		"\2\2\27`\3\2\2\2\31e\3\2\2\2\33g\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!p\3\2"+
		"\2\2#u\3\2\2\2%|\3\2\2\2\'\u0086\3\2\2\2)\u0092\3\2\2\2+\u00a4\3\2\2\2"+
		"-\u00a8\3\2\2\2/\u00b6\3\2\2\2\61\u00b8\3\2\2\2\63\u00ba\3\2\2\2\65\u00c5"+
		"\3\2\2\2\67\u00c7\3\2\2\29\u00cd\3\2\2\2;\u00d2\3\2\2\2=>\7k\2\2>?\7p"+
		"\2\2?@\7v\2\2@\4\3\2\2\2AB\7h\2\2BC\7n\2\2CD\7v\2\2D\6\3\2\2\2EF\7u\2"+
		"\2FG\7v\2\2GH\7t\2\2H\b\3\2\2\2IJ\7<\2\2J\n\3\2\2\2KL\7n\2\2LM\7g\2\2"+
		"MN\7v\2\2N\f\3\2\2\2OP\7?\2\2P\16\3\2\2\2QR\7x\2\2RS\7c\2\2ST\7t\2\2T"+
		"\20\3\2\2\2UV\7k\2\2VW\7h\2\2W\22\3\2\2\2XY\7h\2\2YZ\7w\2\2Z[\7p\2\2["+
		"\\\7e\2\2\\\24\3\2\2\2]^\7/\2\2^_\7@\2\2_\26\3\2\2\2`a\7r\2\2ab\7t\2\2"+
		"bc\7q\2\2cd\7e\2\2d\30\3\2\2\2ef\7*\2\2f\32\3\2\2\2gh\7.\2\2h\34\3\2\2"+
		"\2ij\7+\2\2j\36\3\2\2\2kl\7f\2\2lm\7c\2\2mn\7v\2\2no\7c\2\2o \3\2\2\2"+
		"pq\7v\2\2qr\7t\2\2rs\7w\2\2st\7g\2\2t\"\3\2\2\2uv\7h\2\2vw\7c\2\2wx\7"+
		"n\2\2xy\7u\2\2yz\7g\2\2z$\3\2\2\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2"+
		"\2\2~\177\3\2\2\2\177\u0083\3\2\2\2\u0080\u0082\t\3\2\2\u0081\u0080\3"+
		"\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"&\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u008c\7$\2\2\u0087\u008b\n\4\2\2\u0088"+
		"\u0089\7^\2\2\u0089\u008b\7$\2\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2"+
		"\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008f"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7$\2\2\u0090(\3\2\2\2\u0091\u0093"+
		"\7/\2\2\u0092\u0091\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u00a1\5/\30\2\u0095\u0099\7\60\2\2\u0096\u0098\5\61\31\2\u0097\u0096"+
		"\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009e\5/\30\2\u009d\u009f\5-"+
		"\27\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u00a2\5-\27\2\u00a1\u0095\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2*\3\2\2\2"+
		"\u00a3\u00a5\7/\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6"+
		"\3\2\2\2\u00a6\u00a7\5/\30\2\u00a7,\3\2\2\2\u00a8\u00aa\t\5\2\2\u00a9"+
		"\u00ab\t\6\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\5/\30\2\u00ad.\3\2\2\2\u00ae\u00b7\5\61\31\2\u00af\u00b3"+
		"\t\7\2\2\u00b0\u00b2\t\b\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00af\3\2\2\2\u00b7\60\3\2\2\2\u00b8\u00b9"+
		"\7\62\2\2\u00b9\62\3\2\2\2\u00ba\u00be\7%\2\2\u00bb\u00bd\n\t\2\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\b\32\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7}\2"+
		"\2\u00c6\66\3\2\2\2\u00c7\u00c8\7\177\2\2\u00c88\3\2\2\2\u00c9\u00cb\7"+
		"\17\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\7\f\2\2\u00cd\u00ca\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0:\3\2\2\2\u00d1\u00d3\t\n\2\2\u00d2\u00d1"+
		"\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\b\36\2\2\u00d7<\3\2\2\2\23\2~\u0083\u008a\u008c"+
		"\u0092\u0099\u009e\u00a1\u00a4\u00aa\u00b3\u00b6\u00be\u00ca\u00cf\u00d4"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}