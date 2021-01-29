using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler 
{
    /**
     * Represents a function in the SymbolTableScope
     */
    public class FunctionSymbol : Symbol
    {
        public uint paramCount;
        public uint requiredParamCount;
        public List<string> paramList;
        public List<string> requiredParamList;

        public FunctionSymbol(string name, List<string> paramList, List<string> requiredParamList = null) 
            : base(name, SYMBOL_TYPE.FUNC) 
        {
            paramCount = (uint) paramList.Count;
            requiredParamCount = requiredParamList != null && requiredParamList.Count > 0 
                ? (uint) requiredParamList.Count 
                : paramCount;
            this.paramList = paramList;
            this.requiredParamList = requiredParamList;
        }
    }
}
