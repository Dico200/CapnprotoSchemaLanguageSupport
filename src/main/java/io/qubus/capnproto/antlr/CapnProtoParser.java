// Generated from E:/Trip/idea_plugin_env/CapnprotoSchemaLangPlugin\CapnProto.g4 by ANTLR 4.7
package io.qubus.capnproto.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CapnProtoParser extends Parser {
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
	public static final int
		RULE_document = 0, RULE_file_identifier = 1, RULE_using_import = 2, RULE_namespace = 3, 
		RULE_document_content = 4, RULE_struct_def = 5, RULE_struct_content = 6, 
		RULE_interface_def = 7, RULE_interface_content = 8, RULE_field_def = 9, 
		RULE_type = 10, RULE_inner_type = 11, RULE_enum_def = 12, RULE_annotation_reference = 13, 
		RULE_enum_content = 14, RULE_named_union_def = 15, RULE_unnamed_union_def = 16, 
		RULE_union_content = 17, RULE_group_def = 18, RULE_group_content = 19, 
		RULE_function_def = 20, RULE_generic_type_parameters = 21, RULE_function_parameters = 22, 
		RULE_annotation_def = 23, RULE_annotation_parameters = 24, RULE_const_def = 25, 
		RULE_const_value = 26, RULE_literal_union = 27, RULE_literal_list = 28, 
		RULE_literal_bytes = 29, RULE_union_mapping = 30, RULE_inner_using = 31;
	public static final String[] ruleNames = {
		"document", "file_identifier", "using_import", "namespace", "document_content", 
		"struct_def", "struct_content", "interface_def", "interface_content", 
		"field_def", "type", "inner_type", "enum_def", "annotation_reference", 
		"enum_content", "named_union_def", "unnamed_union_def", "union_content", 
		"group_def", "group_content", "function_def", "generic_type_parameters", 
		"function_parameters", "annotation_def", "annotation_parameters", "const_def", 
		"const_value", "literal_union", "literal_list", "literal_bytes", "union_mapping", 
		"inner_using"
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

	@Override
	public String getGrammarFileName() { return "CapnProto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CapnProtoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public File_identifierContext file_identifier() {
			return getRuleContext(File_identifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CapnProtoParser.EOF, 0); }
		public List<Using_importContext> using_import() {
			return getRuleContexts(Using_importContext.class);
		}
		public Using_importContext using_import(int i) {
			return getRuleContext(Using_importContext.class,i);
		}
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public List<Document_contentContext> document_content() {
			return getRuleContexts(Document_contentContext.class);
		}
		public Document_contentContext document_content(int i) {
			return getRuleContext(Document_contentContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			file_identifier();
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(65);
				using_import();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(71);
				namespace();
				}
			}

			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << T__24) | (1L << T__25) | (1L << NAME))) != 0)) {
				{
				{
				setState(74);
				document_content();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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

	public static class File_identifierContext extends ParserRuleContext {
		public TerminalNode FILE_ID() { return getToken(CapnProtoParser.FILE_ID, 0); }
		public File_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterFile_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitFile_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitFile_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final File_identifierContext file_identifier() throws RecognitionException {
		File_identifierContext _localctx = new File_identifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(FILE_ID);
			setState(83);
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

	public static class Using_importContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(CapnProtoParser.TEXT, 0); }
		public List<TerminalNode> NAME() { return getTokens(CapnProtoParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CapnProtoParser.NAME, i);
		}
		public Using_importContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_using_import; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterUsing_import(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitUsing_import(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitUsing_import(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Using_importContext using_import() throws RecognitionException {
		Using_importContext _localctx = new Using_importContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_using_import);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__1);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(86);
				match(NAME);
				setState(87);
				match(T__2);
				}
			}

			setState(90);
			match(T__3);
			setState(91);
			match(TEXT);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(92);
				match(T__4);
				setState(93);
				match(NAME);
				}
			}

			setState(96);
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

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public TerminalNode TEXT() { return getToken(CapnProtoParser.TEXT, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(T__5);
			setState(99);
			match(NAME);
			setState(100);
			match(T__6);
			setState(101);
			match(T__7);
			setState(102);
			match(TEXT);
			setState(103);
			match(T__8);
			setState(104);
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

	public static class Document_contentContext extends ParserRuleContext {
		public Struct_defContext struct_def() {
			return getRuleContext(Struct_defContext.class,0);
		}
		public Interface_defContext interface_def() {
			return getRuleContext(Interface_defContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Annotation_defContext annotation_def() {
			return getRuleContext(Annotation_defContext.class,0);
		}
		public Const_defContext const_def() {
			return getRuleContext(Const_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Document_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterDocument_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitDocument_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitDocument_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Document_contentContext document_content() throws RecognitionException {
		Document_contentContext _localctx = new Document_contentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_document_content);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				struct_def();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				interface_def();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				function_def();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				annotation_def();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(110);
				const_def();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				enum_def();
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

	public static class Struct_defContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Annotation_referenceContext annotation_reference() {
			return getRuleContext(Annotation_referenceContext.class,0);
		}
		public List<Struct_contentContext> struct_content() {
			return getRuleContexts(Struct_contentContext.class);
		}
		public Struct_contentContext struct_content(int i) {
			return getRuleContext(Struct_contentContext.class,i);
		}
		public Struct_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterStruct_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitStruct_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitStruct_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_defContext struct_def() throws RecognitionException {
		Struct_defContext _localctx = new Struct_defContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_struct_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__9);
			setState(115);
			type();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(116);
				annotation_reference();
				}
			}

			setState(119);
			match(T__10);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << T__19) | (1L << T__24) | (1L << T__25) | (1L << NAME))) != 0)) {
				{
				{
				setState(120);
				struct_content();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(126);
			match(T__11);
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

	public static class Struct_contentContext extends ParserRuleContext {
		public Field_defContext field_def() {
			return getRuleContext(Field_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Named_union_defContext named_union_def() {
			return getRuleContext(Named_union_defContext.class,0);
		}
		public Unnamed_union_defContext unnamed_union_def() {
			return getRuleContext(Unnamed_union_defContext.class,0);
		}
		public Interface_defContext interface_def() {
			return getRuleContext(Interface_defContext.class,0);
		}
		public Annotation_defContext annotation_def() {
			return getRuleContext(Annotation_defContext.class,0);
		}
		public Struct_defContext struct_def() {
			return getRuleContext(Struct_defContext.class,0);
		}
		public Group_defContext group_def() {
			return getRuleContext(Group_defContext.class,0);
		}
		public Const_defContext const_def() {
			return getRuleContext(Const_defContext.class,0);
		}
		public Inner_usingContext inner_using() {
			return getRuleContext(Inner_usingContext.class,0);
		}
		public Struct_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterStruct_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitStruct_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitStruct_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Struct_contentContext struct_content() throws RecognitionException {
		Struct_contentContext _localctx = new Struct_contentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_struct_content);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				field_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				enum_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				named_union_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				unnamed_union_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				interface_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				annotation_def();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				struct_def();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				group_def();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				const_def();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(137);
				inner_using();
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

	public static class Interface_defContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Interface_contentContext> interface_content() {
			return getRuleContexts(Interface_contentContext.class);
		}
		public Interface_contentContext interface_content(int i) {
			return getRuleContext(Interface_contentContext.class,i);
		}
		public Interface_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterInterface_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitInterface_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitInterface_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_defContext interface_def() throws RecognitionException {
		Interface_defContext _localctx = new Interface_defContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_interface_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__12);
			setState(141);
			type();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(142);
				match(T__13);
				setState(143);
				match(T__7);
				setState(144);
				type();
				setState(145);
				match(T__8);
				}
			}

			setState(149);
			match(T__10);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__12) | (1L << T__16) | (1L << T__19) | (1L << NAME))) != 0)) {
				{
				{
				setState(150);
				interface_content();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__11);
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

	public static class Interface_contentContext extends ParserRuleContext {
		public Field_defContext field_def() {
			return getRuleContext(Field_defContext.class,0);
		}
		public Enum_defContext enum_def() {
			return getRuleContext(Enum_defContext.class,0);
		}
		public Named_union_defContext named_union_def() {
			return getRuleContext(Named_union_defContext.class,0);
		}
		public Unnamed_union_defContext unnamed_union_def() {
			return getRuleContext(Unnamed_union_defContext.class,0);
		}
		public Interface_defContext interface_def() {
			return getRuleContext(Interface_defContext.class,0);
		}
		public Struct_defContext struct_def() {
			return getRuleContext(Struct_defContext.class,0);
		}
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Interface_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterInterface_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitInterface_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitInterface_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Interface_contentContext interface_content() throws RecognitionException {
		Interface_contentContext _localctx = new Interface_contentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_interface_content);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				field_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				enum_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				named_union_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				unnamed_union_def();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				interface_def();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				struct_def();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(164);
				function_def();
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

	public static class Field_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public TerminalNode LOCATOR() { return getToken(CapnProtoParser.LOCATOR, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Const_valueContext const_value() {
			return getRuleContext(Const_valueContext.class,0);
		}
		public Field_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterField_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitField_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitField_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_defContext field_def() throws RecognitionException {
		Field_defContext _localctx = new Field_defContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_field_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME);
			setState(168);
			match(LOCATOR);
			setState(169);
			match(T__14);
			setState(170);
			type();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(171);
				match(T__2);
				setState(172);
				const_value();
				}
			}

			setState(175);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public Inner_typeContext inner_type() {
			return getRuleContext(Inner_typeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(NAME);
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(178);
				inner_type();
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(181);
				match(T__4);
				setState(182);
				type();
				}
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

	public static class Inner_typeContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Inner_typeContext> inner_type() {
			return getRuleContexts(Inner_typeContext.class);
		}
		public Inner_typeContext inner_type(int i) {
			return getRuleContext(Inner_typeContext.class,i);
		}
		public Inner_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterInner_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitInner_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitInner_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_typeContext inner_type() throws RecognitionException {
		Inner_typeContext _localctx = new Inner_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_inner_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__7);
			setState(186);
			type();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(187);
				inner_type();
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(190);
				match(T__15);
				setState(191);
				type();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(192);
					inner_type();
					}
				}

				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(T__8);
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

	public static class Enum_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public Annotation_referenceContext annotation_reference() {
			return getRuleContext(Annotation_referenceContext.class,0);
		}
		public List<Enum_contentContext> enum_content() {
			return getRuleContexts(Enum_contentContext.class);
		}
		public Enum_contentContext enum_content(int i) {
			return getRuleContext(Enum_contentContext.class,i);
		}
		public Enum_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterEnum_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitEnum_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitEnum_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_defContext enum_def() throws RecognitionException {
		Enum_defContext _localctx = new Enum_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__16);
			setState(203);
			match(NAME);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(204);
				annotation_reference();
				}
			}

			setState(207);
			match(T__10);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(208);
				enum_content();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
			match(T__11);
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

	public static class Annotation_referenceContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(CapnProtoParser.TEXT, 0); }
		public Annotation_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterAnnotation_reference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitAnnotation_reference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitAnnotation_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_referenceContext annotation_reference() throws RecognitionException {
		Annotation_referenceContext _localctx = new Annotation_referenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_annotation_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__5);
			setState(217);
			type();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__17) {
				{
				setState(218);
				match(T__17);
				}
			}

			setState(221);
			match(T__7);
			setState(222);
			match(TEXT);
			setState(223);
			match(T__8);
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

	public static class Enum_contentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public TerminalNode LOCATOR() { return getToken(CapnProtoParser.LOCATOR, 0); }
		public Annotation_referenceContext annotation_reference() {
			return getRuleContext(Annotation_referenceContext.class,0);
		}
		public Enum_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterEnum_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitEnum_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitEnum_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enum_contentContext enum_content() throws RecognitionException {
		Enum_contentContext _localctx = new Enum_contentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enum_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(NAME);
			setState(226);
			match(LOCATOR);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(227);
				annotation_reference();
				}
			}

			setState(230);
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

	public static class Named_union_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public TerminalNode LOCATOR() { return getToken(CapnProtoParser.LOCATOR, 0); }
		public List<Union_contentContext> union_content() {
			return getRuleContexts(Union_contentContext.class);
		}
		public Union_contentContext union_content(int i) {
			return getRuleContext(Union_contentContext.class,i);
		}
		public Named_union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterNamed_union_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitNamed_union_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitNamed_union_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_union_defContext named_union_def() throws RecognitionException {
		Named_union_defContext _localctx = new Named_union_defContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_named_union_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(NAME);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATOR) {
				{
				setState(233);
				match(LOCATOR);
				}
			}

			setState(236);
			match(T__18);
			setState(237);
			match(T__10);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==NAME) {
				{
				{
				setState(238);
				union_content();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
			match(T__11);
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

	public static class Unnamed_union_defContext extends ParserRuleContext {
		public List<Union_contentContext> union_content() {
			return getRuleContexts(Union_contentContext.class);
		}
		public Union_contentContext union_content(int i) {
			return getRuleContext(Union_contentContext.class,i);
		}
		public Unnamed_union_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unnamed_union_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterUnnamed_union_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitUnnamed_union_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitUnnamed_union_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unnamed_union_defContext unnamed_union_def() throws RecognitionException {
		Unnamed_union_defContext _localctx = new Unnamed_union_defContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unnamed_union_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__19);
			setState(247);
			match(T__10);
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==NAME) {
				{
				{
				setState(248);
				union_content();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(254);
			match(T__11);
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

	public static class Union_contentContext extends ParserRuleContext {
		public Field_defContext field_def() {
			return getRuleContext(Field_defContext.class,0);
		}
		public Group_defContext group_def() {
			return getRuleContext(Group_defContext.class,0);
		}
		public Unnamed_union_defContext unnamed_union_def() {
			return getRuleContext(Unnamed_union_defContext.class,0);
		}
		public Named_union_defContext named_union_def() {
			return getRuleContext(Named_union_defContext.class,0);
		}
		public Union_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterUnion_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitUnion_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitUnion_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_contentContext union_content() throws RecognitionException {
		Union_contentContext _localctx = new Union_contentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_union_content);
		try {
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				field_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				group_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(258);
				unnamed_union_def();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(259);
				named_union_def();
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

	public static class Group_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public List<Group_contentContext> group_content() {
			return getRuleContexts(Group_contentContext.class);
		}
		public Group_contentContext group_content(int i) {
			return getRuleContext(Group_contentContext.class,i);
		}
		public Group_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterGroup_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitGroup_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitGroup_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_defContext group_def() throws RecognitionException {
		Group_defContext _localctx = new Group_defContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_group_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(NAME);
			setState(263);
			match(T__20);
			setState(264);
			match(T__10);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__19 || _la==NAME) {
				{
				{
				setState(265);
				group_content();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(T__11);
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

	public static class Group_contentContext extends ParserRuleContext {
		public Field_defContext field_def() {
			return getRuleContext(Field_defContext.class,0);
		}
		public Unnamed_union_defContext unnamed_union_def() {
			return getRuleContext(Unnamed_union_defContext.class,0);
		}
		public Named_union_defContext named_union_def() {
			return getRuleContext(Named_union_defContext.class,0);
		}
		public Group_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterGroup_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitGroup_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitGroup_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_contentContext group_content() throws RecognitionException {
		Group_contentContext _localctx = new Group_contentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_group_content);
		try {
			setState(276);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				field_def();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				unnamed_union_def();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				named_union_def();
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

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public List<Function_parametersContext> function_parameters() {
			return getRuleContexts(Function_parametersContext.class);
		}
		public Function_parametersContext function_parameters(int i) {
			return getRuleContext(Function_parametersContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode LOCATOR() { return getToken(CapnProtoParser.LOCATOR, 0); }
		public Generic_type_parametersContext generic_type_parameters() {
			return getRuleContext(Generic_type_parametersContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitFunction_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitFunction_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_function_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(NAME);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATOR) {
				{
				setState(279);
				match(LOCATOR);
				}
			}

			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(282);
				generic_type_parameters();
				}
			}

			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				{
				setState(285);
				function_parameters();
				}
				break;
			case NAME:
				{
				setState(286);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(289);
				match(T__21);
				setState(292);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__7:
					{
					setState(290);
					function_parameters();
					}
					break;
				case NAME:
					{
					setState(291);
					type();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(296);
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

	public static class Generic_type_parametersContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CapnProtoParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CapnProtoParser.NAME, i);
		}
		public Generic_type_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generic_type_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterGeneric_type_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitGeneric_type_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitGeneric_type_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generic_type_parametersContext generic_type_parameters() throws RecognitionException {
		Generic_type_parametersContext _localctx = new Generic_type_parametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_generic_type_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__22);
			setState(299);
			match(NAME);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(300);
				match(T__15);
				setState(301);
				match(NAME);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(T__23);
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

	public static class Function_parametersContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CapnProtoParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CapnProtoParser.NAME, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Const_valueContext> const_value() {
			return getRuleContexts(Const_valueContext.class);
		}
		public Const_valueContext const_value(int i) {
			return getRuleContext(Const_valueContext.class,i);
		}
		public Function_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterFunction_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitFunction_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitFunction_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_parametersContext function_parameters() throws RecognitionException {
		Function_parametersContext _localctx = new Function_parametersContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__7);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(310);
				match(NAME);
				setState(311);
				match(T__14);
				setState(312);
				type();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(313);
					match(T__2);
					setState(314);
					const_value();
					}
				}

				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(317);
					match(T__15);
					setState(318);
					match(NAME);
					setState(319);
					match(T__14);
					setState(320);
					type();
					setState(323);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__2) {
						{
						setState(321);
						match(T__2);
						setState(322);
						const_value();
						}
					}

					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(332);
			match(T__8);
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

	public static class Annotation_defContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public Annotation_parametersContext annotation_parameters() {
			return getRuleContext(Annotation_parametersContext.class,0);
		}
		public Annotation_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterAnnotation_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitAnnotation_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitAnnotation_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_defContext annotation_def() throws RecognitionException {
		Annotation_defContext _localctx = new Annotation_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_annotation_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(T__24);
			setState(335);
			type();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(336);
				annotation_parameters();
				}
			}

			setState(339);
			match(T__14);
			setState(340);
			type();
			setState(341);
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

	public static class Annotation_parametersContext extends ParserRuleContext {
		public Annotation_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterAnnotation_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitAnnotation_parameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitAnnotation_parameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_parametersContext annotation_parameters() throws RecognitionException {
		Annotation_parametersContext _localctx = new Annotation_parametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_annotation_parameters);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(T__7);
			setState(344);
			match(T__9);
			setState(345);
			match(T__8);
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

	public static class Const_defContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Const_valueContext const_value() {
			return getRuleContext(Const_valueContext.class,0);
		}
		public Const_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterConst_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitConst_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitConst_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_defContext const_def() throws RecognitionException {
		Const_defContext _localctx = new Const_defContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_const_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(T__25);
			setState(348);
			match(NAME);
			setState(349);
			match(T__14);
			setState(350);
			type();
			setState(351);
			match(T__2);
			setState(352);
			const_value();
			setState(353);
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

	public static class Const_valueContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CapnProtoParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CapnProtoParser.NAME, i);
		}
		public TerminalNode INTEGER() { return getToken(CapnProtoParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(CapnProtoParser.FLOAT, 0); }
		public TerminalNode TEXT() { return getToken(CapnProtoParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(CapnProtoParser.BOOLEAN, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(CapnProtoParser.HEXADECIMAL, 0); }
		public TerminalNode VOID() { return getToken(CapnProtoParser.VOID, 0); }
		public Literal_listContext literal_list() {
			return getRuleContext(Literal_listContext.class,0);
		}
		public Literal_unionContext literal_union() {
			return getRuleContext(Literal_unionContext.class,0);
		}
		public Literal_bytesContext literal_bytes() {
			return getRuleContext(Literal_bytesContext.class,0);
		}
		public Const_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterConst_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitConst_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitConst_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_valueContext const_value() throws RecognitionException {
		Const_valueContext _localctx = new Const_valueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_const_value);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case T__26:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26) {
					{
					setState(355);
					match(T__26);
					}
				}

				setState(359);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(358);
					match(T__4);
					}
				}

				setState(361);
				match(NAME);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(362);
					match(T__4);
					setState(363);
					match(NAME);
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(367);
				match(FLOAT);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(TEXT);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 5);
				{
				setState(369);
				match(BOOLEAN);
				}
				break;
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(370);
				match(HEXADECIMAL);
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 7);
				{
				setState(371);
				match(VOID);
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(372);
				literal_list();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 9);
				{
				setState(373);
				literal_union();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 10);
				{
				setState(374);
				literal_bytes();
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

	public static class Literal_unionContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CapnProtoParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CapnProtoParser.NAME, i);
		}
		public List<Union_mappingContext> union_mapping() {
			return getRuleContexts(Union_mappingContext.class);
		}
		public Union_mappingContext union_mapping(int i) {
			return getRuleContext(Union_mappingContext.class,i);
		}
		public Literal_unionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_union; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterLiteral_union(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitLiteral_union(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitLiteral_union(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_unionContext literal_union() throws RecognitionException {
		Literal_unionContext _localctx = new Literal_unionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_literal_union);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(T__7);
			setState(378);
			match(NAME);
			setState(379);
			match(T__2);
			setState(380);
			union_mapping();
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(381);
				match(T__15);
				setState(382);
				match(NAME);
				setState(383);
				match(T__2);
				setState(384);
				union_mapping();
				}
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(390);
			match(T__8);
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

	public static class Literal_listContext extends ParserRuleContext {
		public List<Const_valueContext> const_value() {
			return getRuleContexts(Const_valueContext.class);
		}
		public Const_valueContext const_value(int i) {
			return getRuleContext(Const_valueContext.class,i);
		}
		public Literal_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterLiteral_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitLiteral_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitLiteral_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_listContext literal_list() throws RecognitionException {
		Literal_listContext _localctx = new Literal_listContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__22);
			setState(393);
			const_value();
			setState(398);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(394);
				match(T__15);
				setState(395);
				const_value();
				}
				}
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(401);
			match(T__23);
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

	public static class Literal_bytesContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(CapnProtoParser.TEXT, 0); }
		public Literal_bytesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_bytes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterLiteral_bytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitLiteral_bytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitLiteral_bytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_bytesContext literal_bytes() throws RecognitionException {
		Literal_bytesContext _localctx = new Literal_bytesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_literal_bytes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__27);
			setState(404);
			match(TEXT);
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

	public static class Union_mappingContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(CapnProtoParser.NAME, 0); }
		public Const_valueContext const_value() {
			return getRuleContext(Const_valueContext.class,0);
		}
		public Union_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_union_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterUnion_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitUnion_mapping(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitUnion_mapping(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Union_mappingContext union_mapping() throws RecognitionException {
		Union_mappingContext _localctx = new Union_mappingContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_union_mapping);
		try {
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				match(T__7);
				setState(407);
				match(NAME);
				setState(408);
				match(T__2);
				setState(409);
				const_value();
				setState(410);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				const_value();
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

	public static class Inner_usingContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(CapnProtoParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(CapnProtoParser.NAME, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Inner_usingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inner_using; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).enterInner_using(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CapnProtoListener ) ((CapnProtoListener)listener).exitInner_using(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CapnProtoVisitor ) return ((CapnProtoVisitor<? extends T>)visitor).visitInner_using(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inner_usingContext inner_using() throws RecognitionException {
		Inner_usingContext _localctx = new Inner_usingContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_inner_using);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(T__1);
			setState(416);
			match(NAME);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(417);
				match(T__4);
				setState(418);
				match(NAME);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(424);
				match(T__2);
				setState(425);
				type();
				}
			}

			setState(428);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u01b1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\7\2E\n\2\f\2\16\2H\13\2\3\2\5\2K\n\2\3\2\7\2N\n\2\f\2\16\2"+
		"Q\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\5\4a\n"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"s\n\6\3\7\3\7\3\7\5\7x\n\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008d\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0096\n\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00b0\n\13\3\13\3\13\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\5\f\u00ba"+
		"\n\f\3\r\3\r\3\r\5\r\u00bf\n\r\3\r\3\r\3\r\5\r\u00c4\n\r\7\r\u00c6\n\r"+
		"\f\r\16\r\u00c9\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u00d0\n\16\3\16\3\16"+
		"\7\16\u00d4\n\16\f\16\16\16\u00d7\13\16\3\16\3\16\3\17\3\17\3\17\5\17"+
		"\u00de\n\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u00e7\n\20\3\20\3"+
		"\20\3\21\3\21\5\21\u00ed\n\21\3\21\3\21\3\21\7\21\u00f2\n\21\f\21\16\21"+
		"\u00f5\13\21\3\21\3\21\3\22\3\22\3\22\7\22\u00fc\n\22\f\22\16\22\u00ff"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u0107\n\23\3\24\3\24\3\24\3"+
		"\24\7\24\u010d\n\24\f\24\16\24\u0110\13\24\3\24\3\24\3\25\3\25\3\25\5"+
		"\25\u0117\n\25\3\26\3\26\5\26\u011b\n\26\3\26\5\26\u011e\n\26\3\26\3\26"+
		"\5\26\u0122\n\26\3\26\3\26\3\26\5\26\u0127\n\26\5\26\u0129\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\7\27\u0131\n\27\f\27\16\27\u0134\13\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u013e\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\5\30\u0146\n\30\7\30\u0148\n\30\f\30\16\30\u014b\13\30\5\30"+
		"\u014d\n\30\3\30\3\30\3\31\3\31\3\31\5\31\u0154\n\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\5"+
		"\34\u0167\n\34\3\34\5\34\u016a\n\34\3\34\3\34\3\34\5\34\u016f\n\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u017a\n\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0184\n\35\f\35\16\35\u0187\13\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\7\36\u018f\n\36\f\36\16\36\u0192\13\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \5 \u01a0\n \3!\3!\3!\3!\7!\u01a6"+
		"\n!\f!\16!\u01a9\13!\3!\3!\5!\u01ad\n!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\2\2\u01dc\2B\3\2\2\2"+
		"\4T\3\2\2\2\6W\3\2\2\2\bd\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16\u008c\3\2\2"+
		"\2\20\u008e\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3\2\2\2\26\u00b3\3\2\2\2"+
		"\30\u00bb\3\2\2\2\32\u00cc\3\2\2\2\34\u00da\3\2\2\2\36\u00e3\3\2\2\2 "+
		"\u00ea\3\2\2\2\"\u00f8\3\2\2\2$\u0106\3\2\2\2&\u0108\3\2\2\2(\u0116\3"+
		"\2\2\2*\u0118\3\2\2\2,\u012c\3\2\2\2.\u0137\3\2\2\2\60\u0150\3\2\2\2\62"+
		"\u0159\3\2\2\2\64\u015d\3\2\2\2\66\u0179\3\2\2\28\u017b\3\2\2\2:\u018a"+
		"\3\2\2\2<\u0195\3\2\2\2>\u019f\3\2\2\2@\u01a1\3\2\2\2BF\5\4\3\2CE\5\6"+
		"\4\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IK\5\b"+
		"\5\2JI\3\2\2\2JK\3\2\2\2KO\3\2\2\2LN\5\n\6\2ML\3\2\2\2NQ\3\2\2\2OM\3\2"+
		"\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2RS\7\2\2\3S\3\3\2\2\2TU\7$\2\2UV\7\3"+
		"\2\2V\5\3\2\2\2WZ\7\4\2\2XY\7\'\2\2Y[\7\5\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3"+
		"\2\2\2\\]\7\6\2\2]`\7 \2\2^_\7\7\2\2_a\7\'\2\2`^\3\2\2\2`a\3\2\2\2ab\3"+
		"\2\2\2bc\7\3\2\2c\7\3\2\2\2de\7\b\2\2ef\7\'\2\2fg\7\t\2\2gh\7\n\2\2hi"+
		"\7 \2\2ij\7\13\2\2jk\7\3\2\2k\t\3\2\2\2ls\5\f\7\2ms\5\20\t\2ns\5*\26\2"+
		"os\5\60\31\2ps\5\64\33\2qs\5\32\16\2rl\3\2\2\2rm\3\2\2\2rn\3\2\2\2ro\3"+
		"\2\2\2rp\3\2\2\2rq\3\2\2\2s\13\3\2\2\2tu\7\f\2\2uw\5\26\f\2vx\5\34\17"+
		"\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y}\7\r\2\2z|\5\16\b\2{z\3\2\2\2|\177\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7\16"+
		"\2\2\u0081\r\3\2\2\2\u0082\u008d\5\24\13\2\u0083\u008d\5\32\16\2\u0084"+
		"\u008d\5 \21\2\u0085\u008d\5\"\22\2\u0086\u008d\5\20\t\2\u0087\u008d\5"+
		"\60\31\2\u0088\u008d\5\f\7\2\u0089\u008d\5&\24\2\u008a\u008d\5\64\33\2"+
		"\u008b\u008d\5@!\2\u008c\u0082\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0084"+
		"\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c"+
		"\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2"+
		"\2\2\u008d\17\3\2\2\2\u008e\u008f\7\17\2\2\u008f\u0095\5\26\f\2\u0090"+
		"\u0091\7\20\2\2\u0091\u0092\7\n\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7"+
		"\13\2\2\u0094\u0096\3\2\2\2\u0095\u0090\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u009b\7\r\2\2\u0098\u009a\5\22\n\2\u0099\u0098\3"+
		"\2\2\2\u009a\u009d\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u009b\3\2\2\2\u009e\u009f\7\16\2\2\u009f\21\3\2\2"+
		"\2\u00a0\u00a8\5\24\13\2\u00a1\u00a8\5\32\16\2\u00a2\u00a8\5 \21\2\u00a3"+
		"\u00a8\5\"\22\2\u00a4\u00a8\5\20\t\2\u00a5\u00a8\5\f\7\2\u00a6\u00a8\5"+
		"*\26\2\u00a7\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7"+
		"\u00a3\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a6\3\2"+
		"\2\2\u00a8\23\3\2\2\2\u00a9\u00aa\7\'\2\2\u00aa\u00ab\7\37\2\2\u00ab\u00ac"+
		"\7\21\2\2\u00ac\u00af\5\26\f\2\u00ad\u00ae\7\5\2\2\u00ae\u00b0\5\66\34"+
		"\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2"+
		"\7\3\2\2\u00b2\25\3\2\2\2\u00b3\u00b5\7\'\2\2\u00b4\u00b6\5\30\r\2\u00b5"+
		"\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b8\7\7"+
		"\2\2\u00b8\u00ba\5\26\f\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\27\3\2\2\2\u00bb\u00bc\7\n\2\2\u00bc\u00be\5\26\f\2\u00bd\u00bf\5\30"+
		"\r\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c7\3\2\2\2\u00c0"+
		"\u00c1\7\22\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c4\5\30\r\2\u00c3\u00c2"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\7\13\2\2\u00cb\31\3\2\2\2\u00cc\u00cd"+
		"\7\23\2\2\u00cd\u00cf\7\'\2\2\u00ce\u00d0\5\34\17\2\u00cf\u00ce\3\2\2"+
		"\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\7\r\2\2\u00d2\u00d4"+
		"\5\36\20\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9"+
		"\7\16\2\2\u00d9\33\3\2\2\2\u00da\u00db\7\b\2\2\u00db\u00dd\5\26\f\2\u00dc"+
		"\u00de\7\24\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3"+
		"\2\2\2\u00df\u00e0\7\n\2\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\7\13\2\2\u00e2"+
		"\35\3\2\2\2\u00e3\u00e4\7\'\2\2\u00e4\u00e6\7\37\2\2\u00e5\u00e7\5\34"+
		"\17\2\u00e6\u00e5\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e9\7\3\2\2\u00e9\37\3\2\2\2\u00ea\u00ec\7\'\2\2\u00eb\u00ed\7\37\2"+
		"\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7\25\2\2\u00ef\u00f3\7\r\2\2\u00f0\u00f2\5$\23\2\u00f1\u00f0\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\16\2\2\u00f7!\3\2\2\2\u00f8"+
		"\u00f9\7\26\2\2\u00f9\u00fd\7\r\2\2\u00fa\u00fc\5$\23\2\u00fb\u00fa\3"+
		"\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7\16\2\2\u0101#\3\2\2\2"+
		"\u0102\u0107\5\24\13\2\u0103\u0107\5&\24\2\u0104\u0107\5\"\22\2\u0105"+
		"\u0107\5 \21\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0105\3\2\2\2\u0107%\3\2\2\2\u0108\u0109\7\'\2\2\u0109\u010a"+
		"\7\27\2\2\u010a\u010e\7\r\2\2\u010b\u010d\5(\25\2\u010c\u010b\3\2\2\2"+
		"\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7\16\2\2\u0112\'\3\2\2\2\u0113"+
		"\u0117\5\24\13\2\u0114\u0117\5\"\22\2\u0115\u0117\5 \21\2\u0116\u0113"+
		"\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117)\3\2\2\2\u0118"+
		"\u011a\7\'\2\2\u0119\u011b\7\37\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3"+
		"\2\2\2\u011b\u011d\3\2\2\2\u011c\u011e\5,\27\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u0122\5.\30\2\u0120\u0122\5\26"+
		"\f\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0128\3\2\2\2\u0123"+
		"\u0126\7\30\2\2\u0124\u0127\5.\30\2\u0125\u0127\5\26\f\2\u0126\u0124\3"+
		"\2\2\2\u0126\u0125\3\2\2\2\u0127\u0129\3\2\2\2\u0128\u0123\3\2\2\2\u0128"+
		"\u0129\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7\3\2\2\u012b+\3\2\2\2"+
		"\u012c\u012d\7\31\2\2\u012d\u0132\7\'\2\2\u012e\u012f\7\22\2\2\u012f\u0131"+
		"\7\'\2\2\u0130\u012e\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\7\32"+
		"\2\2\u0136-\3\2\2\2\u0137\u014c\7\n\2\2\u0138\u0139\7\'\2\2\u0139\u013a"+
		"\7\21\2\2\u013a\u013d\5\26\f\2\u013b\u013c\7\5\2\2\u013c\u013e\5\66\34"+
		"\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0149\3\2\2\2\u013f\u0140"+
		"\7\22\2\2\u0140\u0141\7\'\2\2\u0141\u0142\7\21\2\2\u0142\u0145\5\26\f"+
		"\2\u0143\u0144\7\5\2\2\u0144\u0146\5\66\34\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u013f\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014d\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u0138\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2"+
		"\2\2\u014e\u014f\7\13\2\2\u014f/\3\2\2\2\u0150\u0151\7\33\2\2\u0151\u0153"+
		"\5\26\f\2\u0152\u0154\5\62\32\2\u0153\u0152\3\2\2\2\u0153\u0154\3\2\2"+
		"\2\u0154\u0155\3\2\2\2\u0155\u0156\7\21\2\2\u0156\u0157\5\26\f\2\u0157"+
		"\u0158\7\3\2\2\u0158\61\3\2\2\2\u0159\u015a\7\n\2\2\u015a\u015b\7\f\2"+
		"\2\u015b\u015c\7\13\2\2\u015c\63\3\2\2\2\u015d\u015e\7\34\2\2\u015e\u015f"+
		"\7\'\2\2\u015f\u0160\7\21\2\2\u0160\u0161\5\26\f\2\u0161\u0162\7\5\2\2"+
		"\u0162\u0163\5\66\34\2\u0163\u0164\7\3\2\2\u0164\65\3\2\2\2\u0165\u0167"+
		"\7\35\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0169\3\2\2\2"+
		"\u0168\u016a\7\7\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016e\7\'\2\2\u016c\u016d\7\7\2\2\u016d\u016f\7\'\2\2\u016e"+
		"\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u017a\3\2\2\2\u0170\u017a\7!"+
		"\2\2\u0171\u017a\7\"\2\2\u0172\u017a\7 \2\2\u0173\u017a\7%\2\2\u0174\u017a"+
		"\7#\2\2\u0175\u017a\7&\2\2\u0176\u017a\5:\36\2\u0177\u017a\58\35\2\u0178"+
		"\u017a\5<\37\2\u0179\u0166\3\2\2\2\u0179\u0170\3\2\2\2\u0179\u0171\3\2"+
		"\2\2\u0179\u0172\3\2\2\2\u0179\u0173\3\2\2\2\u0179\u0174\3\2\2\2\u0179"+
		"\u0175\3\2\2\2\u0179\u0176\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2"+
		"\2\2\u017a\67\3\2\2\2\u017b\u017c\7\n\2\2\u017c\u017d\7\'\2\2\u017d\u017e"+
		"\7\5\2\2\u017e\u0185\5> \2\u017f\u0180\7\22\2\2\u0180\u0181\7\'\2\2\u0181"+
		"\u0182\7\5\2\2\u0182\u0184\5> \2\u0183\u017f\3\2\2\2\u0184\u0187\3\2\2"+
		"\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0188\3\2\2\2\u0187\u0185"+
		"\3\2\2\2\u0188\u0189\7\13\2\2\u01899\3\2\2\2\u018a\u018b\7\31\2\2\u018b"+
		"\u0190\5\66\34\2\u018c\u018d\7\22\2\2\u018d\u018f\5\66\34\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191"+
		"\u0193\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u0194\7\32\2\2\u0194;\3\2\2\2"+
		"\u0195\u0196\7\36\2\2\u0196\u0197\7 \2\2\u0197=\3\2\2\2\u0198\u0199\7"+
		"\n\2\2\u0199\u019a\7\'\2\2\u019a\u019b\7\5\2\2\u019b\u019c\5\66\34\2\u019c"+
		"\u019d\7\13\2\2\u019d\u01a0\3\2\2\2\u019e\u01a0\5\66\34\2\u019f\u0198"+
		"\3\2\2\2\u019f\u019e\3\2\2\2\u01a0?\3\2\2\2\u01a1\u01a2\7\4\2\2\u01a2"+
		"\u01a7\7\'\2\2\u01a3\u01a4\7\7\2\2\u01a4\u01a6\7\'\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8"+
		"\u01ac\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7\5\2\2\u01ab\u01ad\5\26"+
		"\f\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae"+
		"\u01af\7\3\2\2\u01afA\3\2\2\2\62FJOZ`rw}\u008c\u0095\u009b\u00a7\u00af"+
		"\u00b5\u00b9\u00be\u00c3\u00c7\u00cf\u00d5\u00dd\u00e6\u00ec\u00f3\u00fd"+
		"\u0106\u010e\u0116\u011a\u011d\u0121\u0126\u0128\u0132\u013d\u0145\u0149"+
		"\u014c\u0153\u0166\u0169\u016e\u0179\u0185\u0190\u019f\u01a7\u01ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}