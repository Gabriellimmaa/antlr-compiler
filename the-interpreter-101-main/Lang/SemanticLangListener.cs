using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Grammar;

namespace Interpreter.Lang
{
    public class SemanticLangListener : LangBaseListener
    {
        public Dictionary<string, IParseTree> Functions { get; protected set; } = new Dictionary<string, IParseTree>();
        public HashSet<string> Variables { get; private set; } = new HashSet<string>();
        public Boolean HasErrors { get; private set; } = false;
        public List<string> ErrorMessages { get; private set; } = new List<string>();
        public override void ExitInputRead([NotNull] LangParser.InputReadContext context)
        {
            var varName = context.VAR().GetText();
            Variables.Add(varName);
        }

        public override void ExitAtribVar([NotNull] LangParser.AtribVarContext context)
        {
            var varName = context.VAR().GetText();
            Variables.Add(varName);
        }

        public override void ExitOutputWriteVar([NotNull] LangParser.OutputWriteVarContext context)
        {
            var varName = context.VAR().GetText();
            if (!Variables.Contains(varName))
            {
                HasErrors = true;
                ErrorMessages.Add("Undefined variable " + varName);
            }
        }

        public override void ExitFunction([NotNull] LangParser.FunctionContext context)
        {
            var fnName = context.VAR().GetText();
            
            if (Functions.ContainsKey(fnName))
            {
                HasErrors = true;
                ErrorMessages.Add("Function " + fnName + " already defined");
            } 
            else 
            {
                Functions.Add(fnName, context);
            }
        }
    }
}