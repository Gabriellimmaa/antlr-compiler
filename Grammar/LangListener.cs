//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.9.2
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from Lang.g4 by ANTLR 4.9.2

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

namespace Grammar {
using Antlr4.Runtime.Misc;
using IParseTreeListener = Antlr4.Runtime.Tree.IParseTreeListener;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete listener for a parse tree produced by
/// <see cref="LangParser"/>.
/// </summary>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.9.2")]
[System.CLSCompliant(false)]
public interface ILangListener : IParseTreeListener {
	/// <summary>
	/// Enter a parse tree produced by the <c>progLine</c>
	/// labeled alternative in <see cref="LangParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterProgLine([NotNull] LangParser.ProgLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>progLine</c>
	/// labeled alternative in <see cref="LangParser.prog"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitProgLine([NotNull] LangParser.ProgLineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LangParser.functions"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunctions([NotNull] LangParser.FunctionsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LangParser.functions"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunctions([NotNull] LangParser.FunctionsContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LangParser.function"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFunction([NotNull] LangParser.FunctionContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LangParser.function"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFunction([NotNull] LangParser.FunctionContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>fnBlockLine</c>
	/// labeled alternative in <see cref="LangParser.fnBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFnBlockLine([NotNull] LangParser.FnBlockLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>fnBlockLine</c>
	/// labeled alternative in <see cref="LangParser.fnBlock"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFnBlockLine([NotNull] LangParser.FnBlockLineContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>fnBodyLine</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFnBodyLine([NotNull] LangParser.FnBodyLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>fnBodyLine</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFnBodyLine([NotNull] LangParser.FnBodyLineContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>fnBodyLineMore</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFnBodyLineMore([NotNull] LangParser.FnBodyLineMoreContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>fnBodyLineMore</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFnBodyLineMore([NotNull] LangParser.FnBodyLineMoreContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>fnReturnExprLine</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFnReturnExprLine([NotNull] LangParser.FnReturnExprLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>fnReturnExprLine</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFnReturnExprLine([NotNull] LangParser.FnReturnExprLineContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>fnReturnLine</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFnReturnLine([NotNull] LangParser.FnReturnLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>fnReturnLine</c>
	/// labeled alternative in <see cref="LangParser.fnBody"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFnReturnLine([NotNull] LangParser.FnReturnLineContext context);
	/// <summary>
	/// Enter a parse tree produced by <see cref="LangParser.params"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterParams([NotNull] LangParser.ParamsContext context);
	/// <summary>
	/// Exit a parse tree produced by <see cref="LangParser.params"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitParams([NotNull] LangParser.ParamsContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>lineStmt</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLineStmt([NotNull] LangParser.LineStmtContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>lineStmt</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLineStmt([NotNull] LangParser.LineStmtContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>lineIf</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLineIf([NotNull] LangParser.LineIfContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>lineIf</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLineIf([NotNull] LangParser.LineIfContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>lineWhile</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLineWhile([NotNull] LangParser.LineWhileContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>lineWhile</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLineWhile([NotNull] LangParser.LineWhileContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>lineFor</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLineFor([NotNull] LangParser.LineForContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>lineFor</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLineFor([NotNull] LangParser.LineForContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>lineEOL</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLineEOL([NotNull] LangParser.LineEOLContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>lineEOL</c>
	/// labeled alternative in <see cref="LangParser.line"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLineEOL([NotNull] LangParser.LineEOLContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>funcInvocLine</c>
	/// labeled alternative in <see cref="LangParser.funcInvoc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFuncInvocLine([NotNull] LangParser.FuncInvocLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>funcInvocLine</c>
	/// labeled alternative in <see cref="LangParser.funcInvoc"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFuncInvocLine([NotNull] LangParser.FuncInvocLineContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>stmtAtrib</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtAtrib([NotNull] LangParser.StmtAtribContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>stmtAtrib</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtAtrib([NotNull] LangParser.StmtAtribContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>stmtInput</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtInput([NotNull] LangParser.StmtInputContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>stmtInput</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtInput([NotNull] LangParser.StmtInputContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>stmtOutput</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterStmtOutput([NotNull] LangParser.StmtOutputContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>stmtOutput</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitStmtOutput([NotNull] LangParser.StmtOutputContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>lineFuncInvoc</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterLineFuncInvoc([NotNull] LangParser.LineFuncInvocContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>lineFuncInvoc</c>
	/// labeled alternative in <see cref="LangParser.stmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitLineFuncInvoc([NotNull] LangParser.LineFuncInvocContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>inputRead</c>
	/// labeled alternative in <see cref="LangParser.input"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterInputRead([NotNull] LangParser.InputReadContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>inputRead</c>
	/// labeled alternative in <see cref="LangParser.input"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitInputRead([NotNull] LangParser.InputReadContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>outputWriteVar</c>
	/// labeled alternative in <see cref="LangParser.output"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOutputWriteVar([NotNull] LangParser.OutputWriteVarContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>outputWriteVar</c>
	/// labeled alternative in <see cref="LangParser.output"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOutputWriteVar([NotNull] LangParser.OutputWriteVarContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>outputWriteStr</c>
	/// labeled alternative in <see cref="LangParser.output"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOutputWriteStr([NotNull] LangParser.OutputWriteStrContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>outputWriteStr</c>
	/// labeled alternative in <see cref="LangParser.output"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOutputWriteStr([NotNull] LangParser.OutputWriteStrContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>outputWriteExpr</c>
	/// labeled alternative in <see cref="LangParser.output"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterOutputWriteExpr([NotNull] LangParser.OutputWriteExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>outputWriteExpr</c>
	/// labeled alternative in <see cref="LangParser.output"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitOutputWriteExpr([NotNull] LangParser.OutputWriteExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ifstIf</c>
	/// labeled alternative in <see cref="LangParser.ifst"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfstIf([NotNull] LangParser.IfstIfContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ifstIf</c>
	/// labeled alternative in <see cref="LangParser.ifst"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfstIf([NotNull] LangParser.IfstIfContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>ifstIfElse</c>
	/// labeled alternative in <see cref="LangParser.ifst"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterIfstIfElse([NotNull] LangParser.IfstIfElseContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>ifstIfElse</c>
	/// labeled alternative in <see cref="LangParser.ifst"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitIfstIfElse([NotNull] LangParser.IfstIfElseContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>whilestWhile</c>
	/// labeled alternative in <see cref="LangParser.whilest"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterWhilestWhile([NotNull] LangParser.WhilestWhileContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>whilestWhile</c>
	/// labeled alternative in <see cref="LangParser.whilest"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitWhilestWhile([NotNull] LangParser.WhilestWhileContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>forstFor</c>
	/// labeled alternative in <see cref="LangParser.forst"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterForstFor([NotNull] LangParser.ForstForContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>forstFor</c>
	/// labeled alternative in <see cref="LangParser.forst"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitForstFor([NotNull] LangParser.ForstForContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>blockLine</c>
	/// labeled alternative in <see cref="LangParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterBlockLine([NotNull] LangParser.BlockLineContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>blockLine</c>
	/// labeled alternative in <see cref="LangParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitBlockLine([NotNull] LangParser.BlockLineContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>condRelop</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondRelop([NotNull] LangParser.CondRelopContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>condRelop</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondRelop([NotNull] LangParser.CondRelopContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>condExpr</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondExpr([NotNull] LangParser.CondExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>condExpr</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondExpr([NotNull] LangParser.CondExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>condAnd</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondAnd([NotNull] LangParser.CondAndContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>condAnd</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondAnd([NotNull] LangParser.CondAndContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>condOr</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondOr([NotNull] LangParser.CondOrContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>condOr</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondOr([NotNull] LangParser.CondOrContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>condNot</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterCondNot([NotNull] LangParser.CondNotContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>condNot</c>
	/// labeled alternative in <see cref="LangParser.cond"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitCondNot([NotNull] LangParser.CondNotContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>atribVar</c>
	/// labeled alternative in <see cref="LangParser.atrib"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterAtribVar([NotNull] LangParser.AtribVarContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>atribVar</c>
	/// labeled alternative in <see cref="LangParser.atrib"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitAtribVar([NotNull] LangParser.AtribVarContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>exprPlus</c>
	/// labeled alternative in <see cref="LangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExprPlus([NotNull] LangParser.ExprPlusContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>exprPlus</c>
	/// labeled alternative in <see cref="LangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExprPlus([NotNull] LangParser.ExprPlusContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>exprMinus</c>
	/// labeled alternative in <see cref="LangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExprMinus([NotNull] LangParser.ExprMinusContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>exprMinus</c>
	/// labeled alternative in <see cref="LangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExprMinus([NotNull] LangParser.ExprMinusContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>exprTerm</c>
	/// labeled alternative in <see cref="LangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterExprTerm([NotNull] LangParser.ExprTermContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>exprTerm</c>
	/// labeled alternative in <see cref="LangParser.expr"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitExprTerm([NotNull] LangParser.ExprTermContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>termMult</c>
	/// labeled alternative in <see cref="LangParser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTermMult([NotNull] LangParser.TermMultContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>termMult</c>
	/// labeled alternative in <see cref="LangParser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTermMult([NotNull] LangParser.TermMultContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>termDiv</c>
	/// labeled alternative in <see cref="LangParser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTermDiv([NotNull] LangParser.TermDivContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>termDiv</c>
	/// labeled alternative in <see cref="LangParser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTermDiv([NotNull] LangParser.TermDivContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>termFactor</c>
	/// labeled alternative in <see cref="LangParser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterTermFactor([NotNull] LangParser.TermFactorContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>termFactor</c>
	/// labeled alternative in <see cref="LangParser.term"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitTermFactor([NotNull] LangParser.TermFactorContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>factorExpr</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFactorExpr([NotNull] LangParser.FactorExprContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>factorExpr</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFactorExpr([NotNull] LangParser.FactorExprContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>factorVar</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFactorVar([NotNull] LangParser.FactorVarContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>factorVar</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFactorVar([NotNull] LangParser.FactorVarContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>factorNum</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFactorNum([NotNull] LangParser.FactorNumContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>factorNum</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFactorNum([NotNull] LangParser.FactorNumContext context);
	/// <summary>
	/// Enter a parse tree produced by the <c>factorStr</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void EnterFactorStr([NotNull] LangParser.FactorStrContext context);
	/// <summary>
	/// Exit a parse tree produced by the <c>factorStr</c>
	/// labeled alternative in <see cref="LangParser.factor"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	void ExitFactorStr([NotNull] LangParser.FactorStrContext context);
}
} // namespace Grammar
