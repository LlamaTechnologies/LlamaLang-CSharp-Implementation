using System.Collections.Generic;
using LLVMSharp;

namespace LlamaLangCompiler
{
    public partial class IR
    {
        private static LLVMValueRef TranslateNode(ASTFunctionNode node)
        {
            LLVMTypeRef returnType = TranslateType(node.ReturnType);
            var args = new List<LLVMTypeRef>();
            foreach (var param in node.Parameters)
            {
                var paramType = TranslateType(param.VarType);
                args.Add(paramType);
            }

            var functionType = LLVM.FunctionType(returnType, args.ToArray(), false);
            var function= LLVM.AddFunction(module, node.Name, functionType);
            LLVM.SetLinkage(function, LLVMLinkage.LLVMLinkOnceAnyLinkage);
            LLVM.AddTargetDependentFunctionAttr(function, "nounwind", "");
            // Create a new basic block to start insertion into.
            LLVMBasicBlockRef block = LLVM.AppendBasicBlock(function, "entry");
            LLVM.PositionBuilderAtEnd(builder, block);

            foreach (var stmnt in node.Block)
            {
                switch (stmnt.StmntType)
                {
                    case STATEMENT_TYPE.RETURN:
                        LLVM.BuildRet(builder, TranslateNode((ASTUnaryStatementNode)stmnt));
                        break;

                }
            }

            return function;
        }

        private static LLVMValueRef TranslateNode(ASTUnaryStatementNode node)
        {
            return TranslateNode(node.Right);
        }

        private static LLVMValueRef TranslateNode(ASTRightValueNode node)
        {
            switch (node.GetType().Name)
            {
                case "ASTConstantNode":
                    var constantNode = (ASTConstantNode)node;
                    return TranslateNode(constantNode);
                default:
                    return new LLVMValueRef();
            }
        }

        private static LLVMValueRef TranslateNode(ASTConstantNode node)
        {
            switch(node.ConstType)
            {
                case CONSTANT_TYPE.CHAR:
                    return LLVM.ConstInt(LLVM.Int8Type(), ulong.Parse(node.Value), true);
                default:
                case CONSTANT_TYPE.INTEGER:
                    return LLVM.ConstInt(LLVM.Int64Type(), ulong.Parse(node.Value), true);
                case CONSTANT_TYPE.FLOAT:
                    return LLVM.ConstReal(LLVM.DoubleType(), double.Parse(node.Value));
                case CONSTANT_TYPE.STRING:
                    return LLVM.ConstString(node.Value, (uint) node.Value.Length, true);
            }
        }

        private static LLVMTypeRef TranslateType(string typeName)
        {
            if (Primitives.Exists(typeName))
            {
                var primitive = Primitives.Get(typeName);
                switch (primitive)
                {
                    case PRIMITIVE_TYPE.BOOL:
                        return LLVM.Int1Type();

                    case PRIMITIVE_TYPE.SCHAR:
                    case PRIMITIVE_TYPE.CHAR:
                    case PRIMITIVE_TYPE.UINT8:
                    case PRIMITIVE_TYPE.INT8:
                        return LLVM.Int8Type();

                    case PRIMITIVE_TYPE.WCHAR:
                    case PRIMITIVE_TYPE.UINT16:
                    case PRIMITIVE_TYPE.INT16:
                        return LLVM.Int16Type();

                    case PRIMITIVE_TYPE.UCHAR:
                    case PRIMITIVE_TYPE.UINT32:
                    case PRIMITIVE_TYPE.INT32:
                        return LLVM.Int32Type();
                    
                    default:
                    case PRIMITIVE_TYPE.UINT64:
                    case PRIMITIVE_TYPE.INT64:
                        return LLVM.Int64Type();

                    case PRIMITIVE_TYPE.FLOAT32:
                        return LLVM.FloatType();
                    case PRIMITIVE_TYPE.FLOAT64:
                        return LLVM.DoubleType();
                }
            } else
            {
                return LLVM.Int64Type();
            }
            
        }
    }
}
