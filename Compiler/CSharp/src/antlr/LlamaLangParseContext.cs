using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Antlr4.Runtime;

namespace LlamaLangCompiler
{
    public class LlamaLangParseContext : ParserRuleContext
    {
        public ASTNode ASTnode;

        public LlamaLangParseContext(ParserRuleContext parent, int invokingState)
            : base(parent, invokingState)
        {
        }
    }
}
