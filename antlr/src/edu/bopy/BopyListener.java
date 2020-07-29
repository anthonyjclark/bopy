// Generated from /Users/ajc/Documents/projects/bopy/antlr/Bopy.g4 by ANTLR 4.7.1
package edu.bopy;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BopyParser}.
 */
public interface BopyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BopyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BopyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BopyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BopyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BopyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(BopyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(BopyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BopyParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BopyParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#typedName}.
	 * @param ctx the parse tree
	 */
	void enterTypedName(BopyParser.TypedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#typedName}.
	 * @param ctx the parse tree
	 */
	void exitTypedName(BopyParser.TypedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#constInit}.
	 * @param ctx the parse tree
	 */
	void enterConstInit(BopyParser.ConstInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#constInit}.
	 * @param ctx the parse tree
	 */
	void exitConstInit(BopyParser.ConstInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#varInit}.
	 * @param ctx the parse tree
	 */
	void enterVarInit(BopyParser.VarInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#varInit}.
	 * @param ctx the parse tree
	 */
	void exitVarInit(BopyParser.VarInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(BopyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(BopyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(BopyParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(BopyParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(BopyParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(BopyParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(BopyParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(BopyParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BopyParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BopyParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(BopyParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(BopyParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(BopyParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(BopyParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(BopyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(BopyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(BopyParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(BopyParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BopyParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(BopyParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BopyParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(BopyParser.ArgumentsContext ctx);
}