using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    public class TypeSymbol : Symbol
    {
        public TypeSymbol(string name, SYMBOL_TYPE type = SYMBOL_TYPE.TYPE)
            : base(name, type)
        {

        }
    }
}
