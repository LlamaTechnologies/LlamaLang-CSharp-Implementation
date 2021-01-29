using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    /**
     * Represents any right side expresion
     * - constants
     * - binary expressions
     * - calls
     **/
    public abstract class ASTRightValueNode : ASTStatementNode
    {
        public ASTRightValueNode(STATEMENT_TYPE type)
           : base(type)
        { }

        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            return tabs + GetType().Name;
        }
    }
}
