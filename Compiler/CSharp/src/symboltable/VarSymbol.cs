namespace LlamaLangCompiler
{
    /**
     * Represents a variable declaration symbol in the SymbolTableScope
     **/
    public class VarSymbol : Symbol
    {
        public TypeSymbol varType;

        public VarSymbol(string name, TypeSymbol varType)
            : base(name, SYMBOL_TYPE.VAR)
        {
            this.varType = varType;
        }
    }
}