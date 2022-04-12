// Generated from /Users/milenabulkina/IdeaProjects/lab4/GrammarForGrammar.g4 by ANTLR 4.9.2

import grammar.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarForGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarForGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(GrammarForGrammarParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#input_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_(GrammarForGrammarParser.Input_Context ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarForGrammarParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#importBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportBlock(GrammarForGrammarParser.ImportBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToken(GrammarForGrammarParser.TokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#tokenBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenBlock(GrammarForGrammarParser.TokenBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#startNonTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartNonTerm(GrammarForGrammarParser.StartNonTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#nonTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTerm(GrammarForGrammarParser.NonTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#nonTermBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonTermBlock(GrammarForGrammarParser.NonTermBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#inherited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInherited(GrammarForGrammarParser.InheritedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#synthesized}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSynthesized(GrammarForGrammarParser.SynthesizedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#ruleBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleBlock(GrammarForGrammarParser.RuleBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#ruleInherited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRuleInherited(GrammarForGrammarParser.RuleInheritedContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarForGrammarParser#codeLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeLine(GrammarForGrammarParser.CodeLineContext ctx);
}