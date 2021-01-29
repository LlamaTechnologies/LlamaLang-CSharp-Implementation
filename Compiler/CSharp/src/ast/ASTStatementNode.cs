using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    public enum STATEMENT_TYPE
    {
        EMPTY,
        RETURN,
        CONSTANT,   // any constant statement
        BINARY_STMNT,
        ASSIGN,
        ADD,
        SUB,
        MUL,
        DIV,
        MOD,
        CALL,
    }
    
    /**
    * Represents an instruction
    **/
    public abstract class ASTStatementNode : ASTNode
    {
        public STATEMENT_TYPE StmntType;

        protected ASTStatementNode(STATEMENT_TYPE type)
        {
            StmntType = type;
        }
    }
}
