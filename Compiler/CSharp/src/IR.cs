using System;
using System.IO;
using LLVMSharp;

namespace LlamaLangCompiler
{
    public partial class IR
    {
        private static string _objFile = "";
        private static LLVMModuleRef module;
        private static LLVMBuilderRef builder;

        static IR ()
        {
            module = LLVM.ModuleCreateWithName("my cool jit");
            builder = LLVM.CreateBuilder();
        }

        public static string Translate(ASTProgramNode program)
        {
            program.ForEachChildDeep((node) =>
            {
                var nodeType = node.GetType();
                switch (nodeType.Name) 
                {
                    case "ASTFunctionNode":
                        var funcNode = (ASTFunctionNode)node;
                        _objFile += TranslateNode(funcNode);
                        break;
                    case "ASTUnaryStatementNode":
                        var unaryStmntNode = (ASTUnaryStatementNode)node;
                        _objFile += TranslateNode(unaryStmntNode);
                        break;
                        
                }
                
            });
            return _objFile;
        }

    }
}