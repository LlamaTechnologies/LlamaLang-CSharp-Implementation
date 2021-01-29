using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    public enum SYMBOL_TYPE
    {
        PRIMITIVE,
        FUNC,
        TYPE,
        VAR,
        COMPLEX,
    }

    /**
     * Represents a Symbol in the SymbolTableScope
     **/
    public class Symbol
    {
        public string Name;
        public SYMBOL_TYPE Type;

        public Symbol(string name, SYMBOL_TYPE type = SYMBOL_TYPE.PRIMITIVE)
        {
            Name = name;
            Type = type;
        }

        static public bool IsPrimitive(string name)
        {
            return Primitives.Exists(name);
        }
    }
}
