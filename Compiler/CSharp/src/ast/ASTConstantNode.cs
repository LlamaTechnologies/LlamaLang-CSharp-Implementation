using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{ 
    public enum CONSTANT_TYPE
    {
        INTEGER,
        FLOAT,
        CHAR,
        STRING
    }

    /**
     * Represents any compile time constant like the one above
     **/
    public class ASTConstantNode : ASTRightValueNode
    {
        public string Value;
        public CONSTANT_TYPE ConstType;

        public ASTConstantNode(CONSTANT_TYPE constType)
            : base(STATEMENT_TYPE.CONSTANT)
        {
            ConstType = constType;
        }

        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            string typeName = Enum.GetName(typeof(CONSTANT_TYPE), ConstType);
            return tabs + "%" + typeName + " " + Value;
        }
    }
}
