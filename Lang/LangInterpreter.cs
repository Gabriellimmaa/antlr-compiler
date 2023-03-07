using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Text.RegularExpressions;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Grammar;
using System.Globalization;

namespace Interpreter.Lang
{
    public class LangInterpreter : LangBaseVisitor<object?>
    {
        private Dictionary<string, IParseTree> _functions;

        public LangInterpreter(Dictionary<string, IParseTree> functions)
        {
            this._functions = functions;
        }

        public Dictionary<string, object?> Variables { get; protected set; } = new Dictionary<string, object?>();

        struct Valuable
        {
            public int type;
            public object? value;

            public Valuable(int _type, object? _value)
            {
                type = _type;
                value = _value;
            }


            public int GetType()
            {
                return type;
            }

            public object? GetValue()
            {
                return value;
            }

            public void SetType(int _type)
            {
                type = _type;
            }

            public void SetValue(object? _value)
            {
                value = _value;
            }
        }

        #region I/O Statements

        public override object? VisitInputRead([NotNull] LangParser.InputReadContext context)
        {
            var input = Console.ReadLine();
            var type = context.TYPE.Type;

            if (type == LangLexer.INT)
            {
                var y = 0;
                if (int.TryParse(input, out y))
                {
                    Variables[context.VAR().GetText()] = new Valuable(LangLexer.INT, y);
                }
                else
                {
                    Console.WriteLine("Entrada inválida para tipo INT");
                    Environment.Exit(0);
                    return null;
                }
            }
            if (type == LangLexer.BOOLEAN)
            {
                var y = false;
                if (Boolean.TryParse(input, out y))
                {
                    Variables[context.VAR().GetText()] = new Valuable(LangLexer.BOOLEAN, y);
                }
                else
                {
                    Console.WriteLine("Entrada inválida para tipo BOOLEAN");
                    Environment.Exit(0);
                    return null;
                }
            }
            if (type == LangLexer.DOUBLE)
            {
                double y = 0.0;
                if (double.TryParse(input, NumberStyles.AllowDecimalPoint, CultureInfo.InvariantCulture, out y))
                {
                    if (!input.Contains("."))
                    {
                        Console.WriteLine("Entrada inválida para tipo DOUBLE");
                        Environment.Exit(0);
                    }
                    else
                    {
                        Variables[context.VAR().GetText()] = new Valuable(LangLexer.DOUBLE, y);
                    }
                }
                else
                {
                    Console.WriteLine("Entrada inválida para tipo DOUBLE");
                    Environment.Exit(0);
                    return null;
                }

            }
            if (type == LangLexer.STRING)
            {
                var y = input;
                if (!String.IsNullOrWhiteSpace(y))
                {
                    Variables[context.VAR().GetText()] = new Valuable(LangLexer.STRING, y);
                }
                else
                {
                    Console.WriteLine("Entrada inválida para tipo STRING");
                    Environment.Exit(0);
                    return null;
                }
            }


            return null;
        }

        public override object? VisitOutputWriteVar([NotNull] LangParser.OutputWriteVarContext context)
        {
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
            {
                var varStruct = (Valuable)Variables[varName];
                if (context.POSITION() != null)
                {
                    var position = Int32.Parse(context.POSITION().GetText().Replace("[", "").Replace("]", ""));
                    try
                    {
                        if (varStruct.GetType() == LangLexer.ARRAY_INT)
                        {
                            var auxList = (List<int>)varStruct.GetValue();
                            Console.WriteLine(auxList[position]);
                            return null;
                        }
                        if (varStruct.GetType() == LangLexer.ARRAY_STRING)
                        {
                            var auxList = (List<string>)varStruct.GetValue();
                            Console.WriteLine(auxList[position]);
                            return null;
                        }
                        if (varStruct.GetType() == LangLexer.ARRAY_DOUBLE)
                        {
                            var auxList = (List<double>)varStruct.GetValue();
                            Console.WriteLine(auxList[position]);
                            return null;
                        }
                    }
                    catch
                    {
                        Console.WriteLine("Array " + varName + " index was out of range");
                        return null;
                    }
                }
                else
                {

                    if (varStruct.GetType() == LangLexer.ARRAY_INT)
                    {
                        Console.Write('[');
                        int index = 0;
                        var auxList = (List<int>)varStruct.GetValue();
                        foreach (var item in auxList)
                        {
                            Console.Write(item);
                            if (index != auxList.Count - 1)
                            {
                                Console.Write(" | ");
                            }
                            index++;
                        }
                        Console.Write("]\n");
                        return null;
                    }
                    if (varStruct.GetType() == LangLexer.ARRAY_STRING)
                    {
                        Console.Write('[');
                        int index = 0;
                        var auxList = (List<string>)varStruct.GetValue();
                        foreach (string item in auxList)
                        {
                            Console.Write(item);
                            if (index != auxList.Count - 1)
                            {
                                Console.Write(" | ");
                            }
                            index++;
                        }
                        Console.Write("]\n");
                        return null;
                    }
                    if (varStruct.GetType() == LangLexer.ARRAY_DOUBLE)
                    {
                        Console.Write('[');
                        int index = 0;
                        var auxList = (List<double>)varStruct.GetValue();
                        foreach (double item in auxList)
                        {
                            Console.Write(item);
                            if (index != auxList.Count - 1)
                            {
                                Console.Write(" | ");
                            }
                            index++;
                        }
                        Console.Write("]\n");
                        return null;
                    }
                }
                Console.WriteLine(varStruct.GetValue());
            }
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

        public override object? VisitOutputWriteFStr([NotNull] LangParser.OutputWriteFStrContext context)
        {

            List<string> blocks = new List<string>();
            var strContent = context.STR().GetText();
            Regex regex = new Regex(@"\$\{(.+?)\}");
            MatchCollection matches = regex.Matches(strContent);
            int i = 0;
            foreach (Match match in matches)
            {
                strContent = strContent.Replace(match.Value, "{" + i + "}");
                i++;
                var varName = match.Groups[1].Value;
                if (Variables.ContainsKey(varName))
                    blocks.Add(((Valuable)Variables[varName]).GetValue().ToString());
                else
                {
                    Console.WriteLine("Variable " + varName + " is not defined");
                    return null;
                }
            }
            string mensagemFormatada = String.Format(strContent, blocks.ToArray());
            Console.WriteLine(mensagemFormatada.Replace("\"", ""));

            return null;
        }
        #endregion

        #region Variable and Expression Statements
        protected (Double, Double) GetDoubles(IParseTree tree1, IParseTree tree2)
        {
            var t1 = Visit(tree1);
            var t2 = Visit(tree2);
            if (t1 is Valuable && t2 is Valuable)
            {
                Double.TryParse(((Valuable)t1).GetValue().ToString(), out var d1);
                Double.TryParse(((Valuable)t2).GetValue().ToString(), out var d2);
                return (d1, d2);
            }
            else if (t1 is Valuable && t2 is not Valuable)
            {
                Double.TryParse(((Valuable)t1).GetValue().ToString(), out var d1);
                Double.TryParse(t2.ToString(), out var d2);
                return (d1, d2);
            }
            else if (t1 is not Valuable && t2 is Valuable)
            {
                Double.TryParse(t1.ToString(), out var d1);
                Double.TryParse(((Valuable)t2).GetValue().ToString(), out var d2);
                return (d1, d2);
            }
            else
            {
                Double.TryParse(t1.ToString(), out var d1);
                Double.TryParse(t2.ToString(), out var d2);
                return (d1, d2);
            }
        }

        // public override object? VisitAtribDecim([NotNull] LangParser.AtribDecimContext context)
        // {
        //     var txtNum = context.DECIM().GetText();
        //     var varName = context.VAR().GetText();
        //     var v = new Valuable(LangLexer.DOUBLE, double.Parse(txtNum,CultureInfo.InvariantCulture));
        //     Variables[varName] = v;
        //     return v;
        // }

        public override object? VisitAtribVar([NotNull] LangParser.AtribVarContext context)
        {
            var varName = context.VAR().GetText();
            var varType = context.TYPE.Type;
            var varValue = Visit(context.expr());
            if (varType == LangLexer.INT && varValue.ToString().Contains("."))
            {
                Console.WriteLine("Variable " + varName + " is not of type int");
                Environment.Exit(0);
            }
            if (varType == LangLexer.DOUBLE && varValue is not double)
            {
                Console.WriteLine("Variable " + varName + " is not of type double");
                Environment.Exit(0);
            }
            if (varType == LangLexer.BOOLEAN)
            {
                bool result;
                try
                {
                    if (bool.TryParse((string)varValue, out result))
                    {
                        var aux = new Valuable(varType, varValue);
                        Variables[varName] = aux;
                        return null;
                    }
                    else
                    {
                        Console.WriteLine("Variable " + varName + " is not of type boolean");
                        Environment.Exit(0);
                    }
                }
                catch
                {
                    Console.WriteLine("Variable " + varName + " is not of type boolean");
                    Environment.Exit(0);
                }
                return null;
            }

            var vStruct = new Valuable(varType, varValue);
            Variables[varName] = vStruct;
            return null;
        }

        public override object VisitAtribString([NotNull] LangParser.AtribStringContext context)
        {
            var varName = context.VAR().GetText();
            var varContent = context.STR().GetText().Replace("\"", string.Empty); ;
            Variables[varName] = new Valuable(LangLexer.STRING, varContent);
            return null;
        }

        public override object? VisitAtribPlus([NotNull] LangParser.AtribPlusContext context)
        {
            var varName = context.VAR().GetText();
            if (!Variables.ContainsKey(varName))
            {
                Console.WriteLine("Variable " + varName + " is not defined");
                return null;
            }

            var varStruct = (Valuable)Variables[varName];
            var value = varStruct.GetValue();
            var type = varStruct.GetType();
            if (type == LangLexer.DECIM)
            {
                varStruct.SetValue((double)value + (double)Visit(context.expr()));
            }
            if (type == LangLexer.INT)
            {
                varStruct.SetValue((int)value + (int)Visit(context.expr()));
            }
            Variables[varName] = varStruct;
            return null;
        }

        public override object? VisitAtribMinus([NotNull] LangParser.AtribMinusContext context)
        {
            var varName = context.VAR().GetText();
            if (!Variables.ContainsKey(varName))
            {
                Console.WriteLine("Variable " + varName + " is not defined");
                return null;
            }

            var varStruct = (Valuable)Variables[varName];
            var value = varStruct.GetValue();
            var type = varStruct.GetType();
            if (type == LangLexer.DECIM)
            {
                varStruct.SetValue((double)value - (double)Visit(context.expr()));
            }
            if (type == LangLexer.INT)
            {
                varStruct.SetValue((int)value - (int)Visit(context.expr()));
            }
            Variables[varName] = varStruct;
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
            return Int32.Parse(txtNum);
        }

        public override object? VisitFactorDecim([NotNull] LangParser.FactorDecimContext context)
        {
            var txtNum = context.DECIM().GetText();
            return Double.Parse(txtNum, CultureInfo.InvariantCulture);
        }

        public override object? VisitFactorBoolTrue([NotNull] LangParser.FactorBoolTrueContext context)
        {
            var txtNum = context.BOOL_TRUE().GetText();
            return txtNum;
        }

        public override object? VisitFactorBoolFalse([NotNull] LangParser.FactorBoolFalseContext context)
        {
            var txtNum = context.BOOL_FALSE().GetText();
            return txtNum;
        }

        // public override object VisitFactorDecim([NotNull] LangParser.FactorDecimContext context)
        // {
        //     var txtNum = context.DECIM().GetText();
        //     Console.WriteLine(double.Parse(txtNum,CultureInfo.InvariantCulture));
        //     return new Valuable(LangLexer.DOUBLE, double.Parse(txtNum,CultureInfo.InvariantCulture));
        // }

        public override object? VisitFactorExpr([NotNull] LangParser.FactorExprContext context)
        {
            return Visit(context.expr());
        }

        /*public override object VisitFactorStr([NotNull] LangParser.FactorStrContext context)
        {
            return context.STR().GetText().Replace("\"", string.Empty);
        }*/

        #endregion

        #region Control Statements
        public override object? VisitIfstIf([NotNull] LangParser.IfstIfContext context)
        {
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.block());
            return null;
        }

        public override object? VisitForstFor([NotNull] LangParser.ForstForContext context)
        {
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
            {
                var cond = Visit(context.cond());
                while (cond != null && (bool)cond)
                {
                    Visit(context.block());
                    Visit(context.atrib());
                    cond = Visit(context.cond());
                }
            }
            else
            {
                Console.WriteLine("Variable " + varName + " is not defined");
            }
            return null;
        }

        public override object? VisitWhilestWhile([NotNull] LangParser.WhilestWhileContext context)
        {
            var cond = Visit(context.cond());
            while (cond != null && (bool)cond)
            {
                Visit(context.block());
                cond = Visit(context.cond());
            }
            return null;
        }

        public override object? VisitAtribArrayNumber([NotNull] LangParser.AtribArrayNumberContext context)
        {
            var varName = context.VAR().GetText();
            var varValue = context.factor_array_number().GetText();
            var varType = context.TYPE.Type;
            if (Variables.ContainsKey(varName))
            {
                Console.WriteLine("Variable " + varName + " is already defined");
            }
            else
            {
                if (varType == LangLexer.INT)
                {
                    List<int> intList = varValue.Trim('[', ']').Split(',')
                    .Select(int.Parse)
                    .ToList();
                    Variables[varName] = new Valuable(LangLexer.ARRAY_INT, intList);
                }
                if (varType == LangLexer.DOUBLE)
                {
                    List<double> doubleList = varValue.Trim('[', ']').Split(',')
                    .Select(s => double.Parse(s, System.Globalization.CultureInfo.GetCultureInfo("en-US")))
                    .ToList();
                    Variables[varName] = new Valuable(LangLexer.ARRAY_DOUBLE, doubleList);
                }
            }
            return null;
        }

        public override object? VisitAtribArrayString([NotNull] LangParser.AtribArrayStringContext context)
        {
            var varName = context.VAR().GetText();
            var varValue = context.factor_array_string().GetText();
            if (Variables.ContainsKey(varName))
            {
                Console.WriteLine("Variable " + varName + " is already defined");
            }
            else
            {
                List<string> list = varValue.Trim('[', ']').Split(',')
                .ToList();
                Variables[varName] = new Valuable(LangLexer.ARRAY_STRING, list);
            }
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

        public override object VisitTernaryCond([NotNull] LangParser.TernaryCondContext context)
        {
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
            {
                string? str = context.e1.ToString();
                string pattern = "\"([^\"]*)\"";
                Match match = Regex.Match(str, pattern);
                if (match.Success)
                {
                    string result = match.Groups[1].Value;
                    Console.WriteLine(result);
                }
            }
            else
            {
                string? str = context.e2.ToString();
                string pattern = "\"([^\"]*)\"";
                Match match = Regex.Match(str, pattern);
                if (match.Success)
                {
                    string result = match.Groups[1].Value;
                    Console.WriteLine(result);
                }
            }
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

            if (function != null)
            {
                return Visit(function);
            }

            return null;
        }

        #endregion

    }
}