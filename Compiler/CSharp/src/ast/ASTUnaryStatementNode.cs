using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    /**
    * Represents a unary instruction for example:
    *   - calling a function
    *   - increment
    *   - decrement
    *   - return...
    * Any statement that involves ONE value
    **/
    public class ASTUnaryStatementNode : ASTStatementNode
    {
        public ASTRightValueNode Right;

        public ASTUnaryStatementNode(STATEMENT_TYPE type)
            : base(type)
        {
            if (!(type < STATEMENT_TYPE.BINARY_STMNT))
            {
                throw new WrongStatementTypeException("Statement type is not a unary statement");
            }
        }

        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            string name = Enum.GetName(typeof(STATEMENT_TYPE), StmntType);
            string str = tabs + name + " " + Right?.ToString();
            return ConcatenateChildren(str, tabLevel);

        }
    }
}
