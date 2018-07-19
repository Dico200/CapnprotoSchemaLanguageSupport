// Generated from E:/Trip/idea_plugin_env/CapnprotoSchemaLangPlugin\CapnProto.g4 by ANTLR 4.7
package io.qubus.capnproto.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CapnProtoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CapnProtoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#document}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument(CapnProtoParser.DocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#file_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_identifier(CapnProtoParser.File_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#using_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_import(CapnProtoParser.Using_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(CapnProtoParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#document_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDocument_content(CapnProtoParser.Document_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#struct_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_def(CapnProtoParser.Struct_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#struct_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct_content(CapnProtoParser.Struct_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#interface_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_def(CapnProtoParser.Interface_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#interface_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface_content(CapnProtoParser.Interface_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#field_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_def(CapnProtoParser.Field_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CapnProtoParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#inner_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_type(CapnProtoParser.Inner_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#enum_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_def(CapnProtoParser.Enum_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#annotation_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_reference(CapnProtoParser.Annotation_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#enum_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_content(CapnProtoParser.Enum_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#named_union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_union_def(CapnProtoParser.Named_union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#unnamed_union_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnnamed_union_def(CapnProtoParser.Unnamed_union_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#union_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_content(CapnProtoParser.Union_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#group_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_def(CapnProtoParser.Group_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#group_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_content(CapnProtoParser.Group_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(CapnProtoParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#generic_type_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric_type_parameters(CapnProtoParser.Generic_type_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(CapnProtoParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#annotation_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_def(CapnProtoParser.Annotation_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#annotation_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_parameters(CapnProtoParser.Annotation_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#const_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_def(CapnProtoParser.Const_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#const_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_value(CapnProtoParser.Const_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#literal_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_union(CapnProtoParser.Literal_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#literal_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_list(CapnProtoParser.Literal_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#literal_bytes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_bytes(CapnProtoParser.Literal_bytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#union_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnion_mapping(CapnProtoParser.Union_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link CapnProtoParser#inner_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInner_using(CapnProtoParser.Inner_usingContext ctx);
}