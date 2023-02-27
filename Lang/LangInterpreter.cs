using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Grammar;

namespace Interpreter.Lang
{
    public class LangInterpreter : LangBaseVisitor<object?>
    {
        private Dictionary<string, IParseTree> _functions;

        public LangInterpreter(Dictionary<string, IParseTree> functions)
        {
            this._functions = functions;
        }

        public Dictionary<string, object?> Variables {get; protected set;} = new Dictionary<string, object?>();

        #region I/O Statements

        public override object? VisitInputRead([NotNull] LangParser.InputReadContext context)
        {
            var input = Console.ReadLine();
            if (!String.IsNullOrEmpty(input))
                Variables[context.VAR().GetText()] = input;
            return null;
        }

        public override object? VisitOutputWriteVar([NotNull] LangParser.OutputWriteVarContext context)
        {
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
                Console.WriteLine(Variables[varName]);
            else
                Console.WriteLine("Variable " + varName + " is not defined");
            return null;
        }

        public override object? VisitOutputWriteStr([NotNull] LangParser.OutputWriteStrContext context)
        {
            var varName = context.STR().GetText();
            Console.WriteLine(varName.Replace("\"", ""));
            return null;
        }

        public override object? VisitOutputWriteExpr([NotNull] LangParser.OutputWriteExprContext context)
        {
            object? v = Visit(context.expr());
            if (v != null)
                Console.WriteLine(v);
            return null;
        }
        #endregion

        #region Variable and Expression Statements
        protected (Double, Double) GetDoubles(IParseTree tree1, IParseTree tree2)
        {
            var t1 = Visit(tree1);
            var t2 = Visit(tree2);
            Double.TryParse(t1?.ToString(), out var d1);
            Double.TryParse(t2?.ToString(), out var d2);
            return (d1, d2);
        }

        public override object? VisitAtribVar([NotNull] LangParser.AtribVarContext context)
        {
            var varName = context.VAR().GetText();
            object? v = Visit(context.expr());
            Variables[varName] = v;
            return null;
        }

        public override object VisitExprPlus([NotNull] LangParser.ExprPlusContext context)
        {
            var d = GetDoubles(context.term(), context.expr());
            return d.Item1 + d.Item2;
        }

        public override object VisitExprMinus([NotNull] LangParser.ExprMinusContext context)
        {
            var d = GetDoubles(context.term(), context.expr());
            return d.Item1 - d.Item2;
        }

        public override object? VisitExprTerm([NotNull] LangParser.ExprTermContext context)
        {
            return Visit(context.term());
        }

        public override object? VisitTermMult([NotNull] LangParser.TermMultContext context)
        {
            var d = GetDoubles(context.factor(), context.term());
            return d.Item1 * d.Item2;
        }

        public override object? VisitTermDiv([NotNull] LangParser.TermDivContext context)
        {
            var d = GetDoubles(context.factor(), context.term());
            return d.Item1 / d.Item2;
        }

        public override object? VisitTermFactor([NotNull] LangParser.TermFactorContext context)
        {
            return Visit(context.factor());
        }

        public override object? VisitFactorVar([NotNull] LangParser.FactorVarContext context)
        {
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
                return Variables[varName];

            Console.WriteLine("Variable " + varName + " is not defined");
            return null;
        }

        public override object? VisitFactorNum([NotNull] LangParser.FactorNumContext context)
        {
            var txtNum = context.NUM().GetText();
            return Double.Parse(txtNum);
        }

        public override object? VisitFactorExpr([NotNull] LangParser.FactorExprContext context)
        {
            return Visit(context.expr());
        }
        #endregion

        #region Control Statements
        public override object? VisitIfstIf([NotNull] LangParser.IfstIfContext context)
        {
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.block());
            return null;
        }

        public override object? VisitIfstIfElse([NotNull] LangParser.IfstIfElseContext context)
        {
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.b1);
            else
                Visit(context.b2);
            return null;
        }

        public override object? VisitCondExpr([NotNull] LangParser.CondExprContext context)
        {
            object? v = Visit(context.expr()); 
            return v != null && (Double)v != 0;
        }

        public override object? VisitCondRelop([NotNull] LangParser.CondRelopContext context)
        {
            var d = GetDoubles(context.e1, context.e2);
            switch (context.RELOP.Type)
            {
                case LangLexer.EQ:
                    return d.Item1 == d.Item2;
                case LangLexer.NE:
                    return d.Item1 != d.Item2;
                case LangLexer.LT:
                    return d.Item1 < d.Item2;
                case LangLexer.LE:
                    return d.Item1 <= d.Item2;
                case LangLexer.GT:
                    return d.Item1 > d.Item2;
                case LangLexer.GE:
                    return d.Item1 >= d.Item2;
            }
            return null;
        }

        public override object? VisitCondAnd([NotNull] LangParser.CondAndContext context)
        {
            object? v1 = Visit(context.c1);
            object? v2 = Visit(context.c2);
            return v1 != null && v2 != null && (bool)v1 && (bool)v2;
        }

        public override object? VisitCondOr([NotNull] LangParser.CondOrContext context)
        {
            object? v1 = Visit(context.c1);
            object? v2 = Visit(context.c2);
            return v1 != null && (bool)v1 || v2 != null && (bool)v2;
        }

        public override object? VisitCondNot([NotNull] LangParser.CondNotContext context)
        {
            object? v = Visit(context.cond());
            return v != null && !(bool)v;
        }
        #endregion

        #region Functions

        public override object? VisitFuncInvocLine([NotNull] LangParser.FuncInvocLineContext context)
        {
            var funcName = context.VAR().GetText();
            var function = _functions[funcName];

            if (function != null){
                return Visit(function);
            }

            return null;
        }

        #endregion

    }
}