using System;
using System.IO;
using LLVMSharp;

namespace LlamaLangCompiler
{
    public partial class IR
    {
        private static LLVMModuleRef module;
        private static LLVMBuilderRef builder;


        public static void Translate(ASTProgramNode program)
        {
            module = LLVM.ModuleCreateWithName(program.File);
            builder = LLVM.CreateBuilder();

            program.ForEachChild((node) =>
            {
                var nodeType = node.GetType();
                switch (nodeType.Name) 
                {
                    case "ASTFunctionNode":
                        var funcNode = (ASTFunctionNode)node;
                        TranslateNode(funcNode);
                        break;
                    default:
                        Console.WriteLine(nodeType.Name + " Not implemented");
                        break;
                        
                }
            });

            LLVM.DumpModule(module);
            LLVM.DisposeBuilder(builder);
        }

    }
}