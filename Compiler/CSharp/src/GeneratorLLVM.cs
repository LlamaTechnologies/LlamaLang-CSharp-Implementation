using System;
using System.IO;
using LLVMSharp;

namespace LlamaLangCompiler
{
    public class GeneratorLLVM
    {
        private static string _objFile = "";
        private static LLVMModuleRef module;
        private static LLVMBuilderRef builder;

        static GeneratorLLVM ()
        {
            module = LLVM.ModuleCreateWithName("my cool jit");
            builder = LLVM.CreateBuilder();
        }

        public static string translate(SymbolTableScope rootScope)
        {
            translateScope(rootScope);
            return _objFile;
        }

        private static void translateScope(SymbolTableScope scope)
        {
            if (scope.ScopeType == SCOPE_TYPE.GLOBAL)
            {
                scope.ForEachChild((child) =>
                {
                    translateScope(child);
                });
            }
            else
            {
                /*
                _objFile += "llang_" + scope.name  + ":\n";
                scope.funcData.block.ForEach((stmnt) =>
                {
                    _objFile += "\t";
                    switch (stmnt.statementType) 
                    {
                        case STATEMENT_TYPE.RETURN:
                            {
                                _objFile += "ret " +  translateType(scope.funcData.returnType) + " " + stmnt.right_value;
                            } break;
                    }
                });
                */
            }
        }

        private static string translateType(TypeSymbol returnType)
        {
            bool isPrimitive = Symbol.IsPrimitive(returnType.Name);
            PRIMITIVE_TYPE type = Primitives.Get(returnType.Name);

            if (isPrimitive)
            {
                switch(type)
                {
                    case PRIMITIVE_TYPE.INT:
                        return "%i32";
                    default: 
                        return "%void";
                }
            } else
            {
                return "%id";
            }
        }
    }
}