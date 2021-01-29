using System;
using System.Collections.Generic;

namespace LlamaLangCompiler
{
    public class SemanticChecker
    {
        private ASTProgramNode ast;
        private List<ErrorDescription> errors;

        public SemanticChecker(ASTProgramNode ast, List<ErrorDescription> errors)
        {
            this.ast = ast;
            this.errors = errors;
        }

        public ASTProgramNode check()
        {
            ast.ForEachChildDeep(child =>
            {
                dynamic node = Convert.ChangeType(child, child.GetType());
                checkNode(node);
            });
            return ast;
        }

        private bool checkNode(ASTFunctionNode funcNode)
        {
            var returnStmnt = (ASTUnaryStatementNode)funcNode.Block.FindLast(stmnt => stmnt.StmntType == STATEMENT_TYPE.RETURN);

            if (Symbol.IsPrimitive(funcNode.ReturnType))
            {
                var retType = Primitives.Get(funcNode.ReturnType);
                if (retType == PRIMITIVE_TYPE.VOID)
                    return returnStmnt.Right.StmntType == STATEMENT_TYPE.EMPTY;
                else if (returnStmnt.Right.StmntType == STATEMENT_TYPE.CONSTANT)
                {
                    var constStmnt = (ASTConstantNode)returnStmnt.Right;
                    switch (retType)
                    {
                        case PRIMITIVE_TYPE.ULONG:
                        case PRIMITIVE_TYPE.UINT:
                        case PRIMITIVE_TYPE.UWORD:
                        case PRIMITIVE_TYPE.UBYTE:
                            if (constStmnt.Value[0] == '-')
                            {
                                var name = constStmnt.File + ":" + funcNode.Name;
                                var error = new ErrorDescription(constStmnt.Line, name, "Function return type is unsigned, signed type is returned");
                                errors.Add(error);
                                return false;
                            }
                            goto case(PRIMITIVE_TYPE.LONG);
                        case PRIMITIVE_TYPE.LONG:
                        case PRIMITIVE_TYPE.INT:
                        case PRIMITIVE_TYPE.WORD:
                        case PRIMITIVE_TYPE.BYTE:
                            if (constStmnt.ConstType != CONSTANT_TYPE.INTEGER && constStmnt.ConstType != CONSTANT_TYPE.CHAR)
                            {
                                var name = constStmnt.File + ":" + funcNode.Name;
                                var error = new ErrorDescription(constStmnt.Line, name, "Function return type is Integer, no integer is returned");
                                errors.Add(error);
                                return false;
                            }
                            break;
                        case PRIMITIVE_TYPE.FLOAT:
                        case PRIMITIVE_TYPE.DOUBLE:
                            if (constStmnt.ConstType != CONSTANT_TYPE.FLOAT)
                            {
                                var name = constStmnt.File + ":" + funcNode.Name;
                                var error = new ErrorDescription(constStmnt.Line, name, "Function return type is Floating point, no floating point is returned");
                                errors.Add(error);
                                return false;
                            }
                            break;
                        case PRIMITIVE_TYPE.STRING:
                            if (constStmnt.ConstType != CONSTANT_TYPE.STRING)
                            {
                                var name = constStmnt.File + ":" + funcNode.Name;
                                var error = new ErrorDescription(constStmnt.Line, name, "Function return type is string, no string type is returned");
                                errors.Add(error);
                                return false;
                            }
                            break;
                    }
                }
                else // Is returning a variable | check variable type
                {
                    
                }
            }
            // Is CustomType
            else
            {

            }
            return true;
        }
        private bool checkNode(ASTNode funcNode)
        {
            return true;
        }
    }
}