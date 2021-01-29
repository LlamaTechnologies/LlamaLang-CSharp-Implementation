using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    /**
     * Represents a variable declaration
     **/
    public class ASTVariableDeclNode : ASTNode
    {
        public string Name;
        public string VarType;

        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            string str = tabs + Name + " : " + VarType;
            return ConcatenateChildren(str, tabLevel);
        }
    }
}
