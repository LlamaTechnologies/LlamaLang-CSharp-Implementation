using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    /**
    * Represents a binary instruction for example:
    *   - additions
    *   - assignments
    *   - etc
    * Any statement that has two sides involved
    **/
    class ASTBinaryStatementNode : ASTRightValueNode
    {
        public string left; // only identifiers
        public ASTStatementNode right; // any statement

        public ASTBinaryStatementNode(STATEMENT_TYPE type)
            : base(type)
        {
            if (!(type > STATEMENT_TYPE.BINARY_STMNT))
            {
                throw new WrongStatementTypeException("Statement type is not a binary statement");
            }
        }

        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            return tabs + GetType().Name;
        }
    }
}
