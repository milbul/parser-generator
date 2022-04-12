// Generated from /Users/milenabulkina/IdeaProjects/lab4/GrammarForGrammar.g4 by ANTLR 4.9.2

import grammar.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarForGrammarParser}.
 */
public interface GrammarForGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(GrammarForGrammarParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(GrammarForGrammarParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#input_}.
	 * @param ctx the parse tree
	 */
	void enterInput_(GrammarForGrammarParser.Input_Context ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#input_}.
	 * @param ctx the parse tree
	 */
	void exitInput_(GrammarForGrammarParser.Input_Context ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarForGrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarForGrammarParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#importBlock}.
	 * @param ctx the parse tree
	 */
	void enterImportBlock(GrammarForGrammarParser.ImportBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#importBlock}.
	 * @param ctx the parse tree
	 */
	void exitImportBlock(GrammarForGrammarParser.ImportBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void enterToken(GrammarForGrammarParser.TokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#token}.
	 * @param ctx the parse tree
	 */
	void exitToken(GrammarForGrammarParser.TokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#tokenBlock}.
	 * @param ctx the parse tree
	 */
	void enterTokenBlock(GrammarForGrammarParser.TokenBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#tokenBlock}.
	 * @param ctx the parse tree
	 */
	void exitTokenBlock(GrammarForGrammarParser.TokenBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#startNonTerm}.
	 * @param ctx the parse tree
	 */
	void enterStartNonTerm(GrammarForGrammarParser.StartNonTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#startNonTerm}.
	 * @param ctx the parse tree
	 */
	void exitStartNonTerm(GrammarForGrammarParser.StartNonTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#nonTerm}.
	 * @param ctx the parse tree
	 */
	void enterNonTerm(GrammarForGrammarParser.NonTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#nonTerm}.
	 * @param ctx the parse tree
	 */
	void exitNonTerm(GrammarForGrammarParser.NonTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#nonTermBlock}.
	 * @param ctx the parse tree
	 */
	void enterNonTermBlock(GrammarForGrammarParser.NonTermBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#nonTermBlock}.
	 * @param ctx the parse tree
	 */
	void exitNonTermBlock(GrammarForGrammarParser.NonTermBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#inherited}.
	 * @param ctx the parse tree
	 */
	void enterInherited(GrammarForGrammarParser.InheritedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#inherited}.
	 * @param ctx the parse tree
	 */
	void exitInherited(GrammarForGrammarParser.InheritedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#synthesized}.
	 * @param ctx the parse tree
	 */
	void enterSynthesized(GrammarForGrammarParser.SynthesizedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#synthesized}.
	 * @param ctx the parse tree
	 */
	void exitSynthesized(GrammarForGrammarParser.SynthesizedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#ruleBlock}.
	 * @param ctx the parse tree
	 */
	void enterRuleBlock(GrammarForGrammarParser.RuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#ruleBlock}.
	 * @param ctx the parse tree
	 */
	void exitRuleBlock(GrammarForGrammarParser.RuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#ruleInherited}.
	 * @param ctx the parse tree
	 */
	void enterRuleInherited(GrammarForGrammarParser.RuleInheritedContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#ruleInherited}.
	 * @param ctx the parse tree
	 */
	void exitRuleInherited(GrammarForGrammarParser.RuleInheritedContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarForGrammarParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void enterCodeLine(GrammarForGrammarParser.CodeLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarForGrammarParser#codeLine}.
	 * @param ctx the parse tree
	 */
	void exitCodeLine(GrammarForGrammarParser.CodeLineContext ctx);
}