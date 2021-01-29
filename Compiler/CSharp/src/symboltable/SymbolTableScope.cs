using System;
using System.Collections.Generic;


namespace LlamaLangCompiler
{
    public enum SCOPE_TYPE
    {
        GLOBAL,     // program gloabl scope
        FUNC,       // function scope
        METHOD,     // same as func but has access to members
        NAMESPACE   // namespace scope
    }

    /**
     * Represents a scope in the program code
     * It could be:
     *    - global
     *    - function
     *    - method
     *    - namespace.
     **/
    public class SymbolTableScope
    {
        public SCOPE_TYPE ScopeType;

        public SymbolTableScope Parent;

        public List<Symbol> Symbols;

        private List<SymbolTableScope> children;

        public SymbolTableScope(SCOPE_TYPE scopeType)
        {
            ScopeType = scopeType;
            children = new List<SymbolTableScope>();
        }

        public void AddSymbol(Symbol symbol)
        {
            Symbols.Add(symbol);
        }

        public void AddChildScope(SymbolTableScope child)
        {
            children.Add(child);
        }

        public void ForEachChild(Action<SymbolTableScope> p)
        {
            foreach (var child in children)
            {
                p.Invoke(child);
            }
        }

        public void ForEachSymbol(Action<Symbol> p)
        {
            foreach (var symbol in Symbols)
            {
                p.Invoke(symbol);
            }
        }

        public void printScopeTree(int indentLevel = 0)
        {
            string identation = new String('\t', indentLevel);
            Console.WriteLine(identation + ScopeType.ToString() + " {");

            ForEachSymbol((symbol) =>
            {
                Console.WriteLine(identation + "\t" + symbol.Name + ": " + symbol.Type);
            });

            ForEachChild((child) =>
            {
                child.printScopeTree(indentLevel + 1);
            });
            Console.WriteLine(identation + "}");
        }
    }
}
