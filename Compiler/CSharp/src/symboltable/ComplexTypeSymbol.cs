using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    /**
     * Represnts a complex type like Prot or Union in the SymbolTableScope
     **/
    class ComplexTypeSymbol : TypeSymbol
    {
        public List<VarSymbol> members;
        public List<FunctionSymbol> methods;

        public ComplexTypeSymbol(string name, List<VarSymbol> members, List<FunctionSymbol> methods)
            : base(name, SYMBOL_TYPE.COMPLEX)
        {
            this.members = members;
            this.methods = methods;
        }
    }
}
