// Generated from E:/Trip/idea_plugin_env/CapnprotoSchemaLangPlugin\CapnProto.g4 by ANTLR 4.7
package io.qubus.capnproto.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CapnProtoParser}.
 */
public interface CapnProtoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(CapnProtoParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(CapnProtoParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#file_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFile_identifier(CapnProtoParser.File_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#file_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFile_identifier(CapnProtoParser.File_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#using_import}.
	 * @param ctx the parse tree
	 */
	void enterUsing_import(CapnProtoParser.Using_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#using_import}.
	 * @param ctx the parse tree
	 */
	void exitUsing_import(CapnProtoParser.Using_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(CapnProtoParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(CapnProtoParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#document_content}.
	 * @param ctx the parse tree
	 */
	void enterDocument_content(CapnProtoParser.Document_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#document_content}.
	 * @param ctx the parse tree
	 */
	void exitDocument_content(CapnProtoParser.Document_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#struct_def}.
	 * @param ctx the parse tree
	 */
	void enterStruct_def(CapnProtoParser.Struct_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#struct_def}.
	 * @param ctx the parse tree
	 */
	void exitStruct_def(CapnProtoParser.Struct_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#struct_content}.
	 * @param ctx the parse tree
	 */
	void enterStruct_content(CapnProtoParser.Struct_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#struct_content}.
	 * @param ctx the parse tree
	 */
	void exitStruct_content(CapnProtoParser.Struct_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#interface_def}.
	 * @param ctx the parse tree
	 */
	void enterInterface_def(CapnProtoParser.Interface_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#interface_def}.
	 * @param ctx the parse tree
	 */
	void exitInterface_def(CapnProtoParser.Interface_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#interface_content}.
	 * @param ctx the parse tree
	 */
	void enterInterface_content(CapnProtoParser.Interface_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#interface_content}.
	 * @param ctx the parse tree
	 */
	void exitInterface_content(CapnProtoParser.Interface_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#field_def}.
	 * @param ctx the parse tree
	 */
	void enterField_def(CapnProtoParser.Field_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#field_def}.
	 * @param ctx the parse tree
	 */
	void exitField_def(CapnProtoParser.Field_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CapnProtoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CapnProtoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#inner_type}.
	 * @param ctx the parse tree
	 */
	void enterInner_type(CapnProtoParser.Inner_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#inner_type}.
	 * @param ctx the parse tree
	 */
	void exitInner_type(CapnProtoParser.Inner_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void enterEnum_def(CapnProtoParser.Enum_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#enum_def}.
	 * @param ctx the parse tree
	 */
	void exitEnum_def(CapnProtoParser.Enum_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#annotation_reference}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_reference(CapnProtoParser.Annotation_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#annotation_reference}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_reference(CapnProtoParser.Annotation_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#enum_content}.
	 * @param ctx the parse tree
	 */
	void enterEnum_content(CapnProtoParser.Enum_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#enum_content}.
	 * @param ctx the parse tree
	 */
	void exitEnum_content(CapnProtoParser.Enum_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#named_union_def}.
	 * @param ctx the parse tree
	 */
	void enterNamed_union_def(CapnProtoParser.Named_union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#named_union_def}.
	 * @param ctx the parse tree
	 */
	void exitNamed_union_def(CapnProtoParser.Named_union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#unnamed_union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnnamed_union_def(CapnProtoParser.Unnamed_union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#unnamed_union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnnamed_union_def(CapnProtoParser.Unnamed_union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#union_content}.
	 * @param ctx the parse tree
	 */
	void enterUnion_content(CapnProtoParser.Union_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#union_content}.
	 * @param ctx the parse tree
	 */
	void exitUnion_content(CapnProtoParser.Union_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#group_def}.
	 * @param ctx the parse tree
	 */
	void enterGroup_def(CapnProtoParser.Group_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#group_def}.
	 * @param ctx the parse tree
	 */
	void exitGroup_def(CapnProtoParser.Group_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#group_content}.
	 * @param ctx the parse tree
	 */
	void enterGroup_content(CapnProtoParser.Group_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#group_content}.
	 * @param ctx the parse tree
	 */
	void exitGroup_content(CapnProtoParser.Group_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(CapnProtoParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(CapnProtoParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#generic_type_parameters}.
	 * @param ctx the parse tree
	 */
	void enterGeneric_type_parameters(CapnProtoParser.Generic_type_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#generic_type_parameters}.
	 * @param ctx the parse tree
	 */
	void exitGeneric_type_parameters(CapnProtoParser.Generic_type_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(CapnProtoParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(CapnProtoParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#annotation_def}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_def(CapnProtoParser.Annotation_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#annotation_def}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_def(CapnProtoParser.Annotation_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#annotation_parameters}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation_parameters(CapnProtoParser.Annotation_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#annotation_parameters}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation_parameters(CapnProtoParser.Annotation_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#const_def}.
	 * @param ctx the parse tree
	 */
	void enterConst_def(CapnProtoParser.Const_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#const_def}.
	 * @param ctx the parse tree
	 */
	void exitConst_def(CapnProtoParser.Const_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#const_value}.
	 * @param ctx the parse tree
	 */
	void enterConst_value(CapnProtoParser.Const_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#const_value}.
	 * @param ctx the parse tree
	 */
	void exitConst_value(CapnProtoParser.Const_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#literal_union}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_union(CapnProtoParser.Literal_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#literal_union}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_union(CapnProtoParser.Literal_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#literal_list}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_list(CapnProtoParser.Literal_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#literal_list}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_list(CapnProtoParser.Literal_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#literal_bytes}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_bytes(CapnProtoParser.Literal_bytesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#literal_bytes}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_bytes(CapnProtoParser.Literal_bytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#union_mapping}.
	 * @param ctx the parse tree
	 */
	void enterUnion_mapping(CapnProtoParser.Union_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#union_mapping}.
	 * @param ctx the parse tree
	 */
	void exitUnion_mapping(CapnProtoParser.Union_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link CapnProtoParser#inner_using}.
	 * @param ctx the parse tree
	 */
	void enterInner_using(CapnProtoParser.Inner_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link CapnProtoParser#inner_using}.
	 * @param ctx the parse tree
	 */
	void exitInner_using(CapnProtoParser.Inner_usingContext ctx);
}