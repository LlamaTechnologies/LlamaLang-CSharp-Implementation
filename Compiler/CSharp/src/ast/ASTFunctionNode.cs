using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    /**
    * Represents a function definition
    **/
    public class ASTFunctionNode : ASTNode
    {
        public string Name;
        public List<ASTVariableDeclNode> Parameters;
        public List<ASTStatementNode> Block;
        public string ReturnType;

        public ASTFunctionNode()
        {
            Parameters = new List<ASTVariableDeclNode>();
            Block = new List<ASTStatementNode>();
        }

        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            string str = tabs + "function: " +  Name + " (";
            
            foreach (ASTVariableDeclNode param in Parameters)
            {
                str += "\n\t" + tabs + param.ToString();
            }
            
            str += "\n" + tabs + ") {";

            foreach (ASTStatementNode param in Block)
            {
                str += "\n\t  " + tabs + param.ToString();
            }

            str += "\n" + tabs + "}";

            return ConcatenateChildren(str, tabLevel);
        }
    }
}
