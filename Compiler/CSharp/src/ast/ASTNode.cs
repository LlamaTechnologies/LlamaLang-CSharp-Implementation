using System;
using System.Collections.Generic;


namespace LlamaLangCompiler
{
    public abstract class ASTNode
    {
        protected List<ASTNode> children;
        public int Line;
        public string File;

        protected ASTNode()
        {
            children = new List<ASTNode>();
        }

        public virtual void AddChild(ASTNode child)
        {
            children.Add(child);
        }

        public virtual bool RemoveChild(ASTNode child)
        {
            throw new NotImplementedException();
        }

        public override string ToString()
        {
            return ToString(0);   
        }

        public string ConcatenateChildren(string str, int tabLevel)
        {
            foreach (var child in children)
            {
                str += "\n" + child.ToString(tabLevel + 1);
            }

            return str;
        }

        public void ForEachChild(System.Action<ASTNode> action)
        {
            foreach (var child in children)
            {
                action.Invoke(child);
            }
        }

        public void ForEachChildDeep(System.Action<ASTNode> action)
        {
            foreach (var child in children)
            {
                action.Invoke(child);
                child.ForEachChildDeep(action);
            }
        }

        protected abstract string ToString(int tabLevel);

    }
}
