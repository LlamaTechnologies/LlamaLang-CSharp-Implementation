namespace LlamaLangCompiler
{
    /**
     * Represents a whole program.
     * It is the root node of the tree.
     **/
    public class ASTProgramNode : ASTNode
    {
        protected override string ToString(int tabLevel)
        {
            var tabs = new string('\t', tabLevel);
            string str = tabs + GetType().Name;
            return ConcatenateChildren(str, tabLevel);
        }
    }
}