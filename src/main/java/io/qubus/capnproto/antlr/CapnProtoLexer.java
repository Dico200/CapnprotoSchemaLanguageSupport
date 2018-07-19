// Generated from E:/Trip/idea_plugin_env/CapnprotoSchemaLangPlugin\CapnProto.g4 by ANTLR 4.7
package io.qubus.capnproto.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CapnProtoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, LOCATOR=29, TEXT=30, INTEGER=31, 
		FLOAT=32, HEXADECIMAL=33, FILE_ID=34, BOOLEAN=35, VOID=36, NAME=37, COMMENT=38, 
		WHITESPACE=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "DIGIT", "HEX_DIGIT", "LOCATOR", "TEXT", "INTEGER", 
		"FLOAT", "HEXADECIMAL", "FILE_ID", "BOOLEAN", "VOID", "NAME", "COMMENT", 
		"WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'using'", "'='", "'import'", "'.'", "'$'", "'.namespace'", 
		"'('", "')'", "'struct'", "'{'", "'}'", "'interface'", "'extends'", "':'", 
		"','", "'enum'", "'.ann'", "':union'", "'union'", "':group'", "'->'", 
		"'['", "']'", "'annotation'", "'const'", "'-'", "'0x'", null, null, null, 
		null, null, null, null, "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "LOCATOR", "TEXT", "INTEGER", "FLOAT", "HEXADECIMAL", 
		"FILE_ID", "BOOLEAN", "VOID", "NAME", "COMMENT", "WHITESPACE"
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


	public CapnProtoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CapnProto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0142\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\5\37\u00da\n\37\3 "+
		"\3 \6 \u00de\n \r \16 \u00df\3 \5 \u00e3\n \3!\3!\7!\u00e7\n!\f!\16!\u00ea"+
		"\13!\3!\3!\3\"\5\"\u00ef\n\"\3\"\6\"\u00f2\n\"\r\"\16\"\u00f3\3#\5#\u00f7"+
		"\n#\3#\6#\u00fa\n#\r#\16#\u00fb\3#\3#\6#\u0100\n#\r#\16#\u0101\5#\u0104"+
		"\n#\3#\3#\5#\u0108\n#\3#\6#\u010b\n#\r#\16#\u010c\5#\u010f\n#\3$\5$\u0112"+
		"\n$\3$\3$\3$\3$\6$\u0118\n$\r$\16$\u0119\3%\3%\3%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\5&\u0128\n&\3\'\3\'\3\'\3\'\3\'\3(\3(\7(\u0131\n(\f(\16(\u0134"+
		"\13(\3)\3)\7)\u0138\n)\f)\16)\u013b\13)\3)\3)\3*\3*\3*\3*\3\u00e8\2+\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\2=\2"+
		"?\37A C!E\"G#I$K%M&O\'Q(S)\3\2\t\3\2\62;\4\2CHch\3\2$$\4\2C\\c|\5\2\62"+
		";C\\c|\3\2\f\f\5\2\13\f\17\17\"\"\2\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5W\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13f\3"+
		"\2\2\2\rh\3\2\2\2\17j\3\2\2\2\21u\3\2\2\2\23w\3\2\2\2\25y\3\2\2\2\27\u0080"+
		"\3\2\2\2\31\u0082\3\2\2\2\33\u0084\3\2\2\2\35\u008e\3\2\2\2\37\u0096\3"+
		"\2\2\2!\u0098\3\2\2\2#\u009a\3\2\2\2%\u009f\3\2\2\2\'\u00a4\3\2\2\2)\u00ab"+
		"\3\2\2\2+\u00b1\3\2\2\2-\u00b8\3\2\2\2/\u00bb\3\2\2\2\61\u00bd\3\2\2\2"+
		"\63\u00bf\3\2\2\2\65\u00ca\3\2\2\2\67\u00d0\3\2\2\29\u00d2\3\2\2\2;\u00d5"+
		"\3\2\2\2=\u00d9\3\2\2\2?\u00db\3\2\2\2A\u00e4\3\2\2\2C\u00ee\3\2\2\2E"+
		"\u00f6\3\2\2\2G\u0111\3\2\2\2I\u011b\3\2\2\2K\u0127\3\2\2\2M\u0129\3\2"+
		"\2\2O\u012e\3\2\2\2Q\u0135\3\2\2\2S\u013e\3\2\2\2UV\7=\2\2V\4\3\2\2\2"+
		"WX\7w\2\2XY\7u\2\2YZ\7k\2\2Z[\7p\2\2[\\\7i\2\2\\\6\3\2\2\2]^\7?\2\2^\b"+
		"\3\2\2\2_`\7k\2\2`a\7o\2\2ab\7r\2\2bc\7q\2\2cd\7t\2\2de\7v\2\2e\n\3\2"+
		"\2\2fg\7\60\2\2g\f\3\2\2\2hi\7&\2\2i\16\3\2\2\2jk\7\60\2\2kl\7p\2\2lm"+
		"\7c\2\2mn\7o\2\2no\7g\2\2op\7u\2\2pq\7r\2\2qr\7c\2\2rs\7e\2\2st\7g\2\2"+
		"t\20\3\2\2\2uv\7*\2\2v\22\3\2\2\2wx\7+\2\2x\24\3\2\2\2yz\7u\2\2z{\7v\2"+
		"\2{|\7t\2\2|}\7w\2\2}~\7e\2\2~\177\7v\2\2\177\26\3\2\2\2\u0080\u0081\7"+
		"}\2\2\u0081\30\3\2\2\2\u0082\u0083\7\177\2\2\u0083\32\3\2\2\2\u0084\u0085"+
		"\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v\2\2\u0087\u0088\7g\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7h\2\2\u008a\u008b\7c\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7g\2\2\u008d\34\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7"+
		"z\2\2\u0090\u0091\7v\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094"+
		"\7f\2\2\u0094\u0095\7u\2\2\u0095\36\3\2\2\2\u0096\u0097\7<\2\2\u0097 "+
		"\3\2\2\2\u0098\u0099\7.\2\2\u0099\"\3\2\2\2\u009a\u009b\7g\2\2\u009b\u009c"+
		"\7p\2\2\u009c\u009d\7w\2\2\u009d\u009e\7o\2\2\u009e$\3\2\2\2\u009f\u00a0"+
		"\7\60\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"&\3\2\2\2\u00a4\u00a5\7<\2\2\u00a5\u00a6\7w\2\2\u00a6\u00a7\7p\2\2\u00a7"+
		"\u00a8\7k\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7p\2\2\u00aa(\3\2\2\2\u00ab"+
		"\u00ac\7w\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7q\2\2"+
		"\u00af\u00b0\7p\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7<\2\2\u00b2\u00b3\7i\2"+
		"\2\u00b3\u00b4\7t\2\2\u00b4\u00b5\7q\2\2\u00b5\u00b6\7w\2\2\u00b6\u00b7"+
		"\7r\2\2\u00b7,\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba\7@\2\2\u00ba.\3"+
		"\2\2\2\u00bb\u00bc\7]\2\2\u00bc\60\3\2\2\2\u00bd\u00be\7_\2\2\u00be\62"+
		"\3\2\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7p\2\2\u00c2"+
		"\u00c3\7q\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7v\2\2"+
		"\u00c6\u00c7\7k\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7p\2\2\u00c9\64\3\2"+
		"\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce"+
		"\7u\2\2\u00ce\u00cf\7v\2\2\u00cf\66\3\2\2\2\u00d0\u00d1\7/\2\2\u00d18"+
		"\3\2\2\2\u00d2\u00d3\7\62\2\2\u00d3\u00d4\7z\2\2\u00d4:\3\2\2\2\u00d5"+
		"\u00d6\t\2\2\2\u00d6<\3\2\2\2\u00d7\u00da\5;\36\2\u00d8\u00da\t\3\2\2"+
		"\u00d9\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da>\3\2\2\2\u00db\u00dd\7"+
		"B\2\2\u00dc\u00de\5;\36\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\7#"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3@\3\2\2\2\u00e4\u00e8"+
		"\7$\2\2\u00e5\u00e7\n\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\7$\2\2\u00ecB\3\2\2\2\u00ed\u00ef\7/\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00f2\5;\36\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4D\3\2\2\2\u00f5\u00f7\7/\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\5;\36\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0103\3\2"+
		"\2\2\u00fd\u00ff\7\60\2\2\u00fe\u0100\5;\36\2\u00ff\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2"+
		"\2\2\u0103\u00fd\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u010e\3\2\2\2\u0105"+
		"\u0107\7g\2\2\u0106\u0108\7/\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2"+
		"\2\u0108\u010a\3\2\2\2\u0109\u010b\5;\36\2\u010a\u0109\3\2\2\2\u010b\u010c"+
		"\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0105\3\2\2\2\u010e\u010f\3\2\2\2\u010fF\3\2\2\2\u0110\u0112\7/\2\2\u0111"+
		"\u0110\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\7\62"+
		"\2\2\u0114\u0115\7z\2\2\u0115\u0117\3\2\2\2\u0116\u0118\5=\37\2\u0117"+
		"\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011aH\3\2\2\2\u011b\u011c\7B\2\2\u011c\u011d\5G$\2\u011dJ\3\2\2"+
		"\2\u011e\u011f\7v\2\2\u011f\u0120\7t\2\2\u0120\u0121\7w\2\2\u0121\u0128"+
		"\7g\2\2\u0122\u0123\7h\2\2\u0123\u0124\7c\2\2\u0124\u0125\7n\2\2\u0125"+
		"\u0126\7u\2\2\u0126\u0128\7g\2\2\u0127\u011e\3\2\2\2\u0127\u0122\3\2\2"+
		"\2\u0128L\3\2\2\2\u0129\u012a\7x\2\2\u012a\u012b\7q\2\2\u012b\u012c\7"+
		"k\2\2\u012c\u012d\7f\2\2\u012dN\3\2\2\2\u012e\u0132\t\5\2\2\u012f\u0131"+
		"\t\6\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133P\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\7%\2\2\u0136"+
		"\u0138\n\7\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\b)\2\2\u013dR\3\2\2\2\u013e\u013f\t\b\2\2\u013f\u0140\3\2\2\2\u0140"+
		"\u0141\b*\3\2\u0141T\3\2\2\2\25\2\u00d9\u00df\u00e2\u00e8\u00ee\u00f3"+
		"\u00f6\u00fb\u0101\u0103\u0107\u010c\u010e\u0111\u0119\u0127\u0132\u0139"+
		"\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}