using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    public partial class IR
    {
        private static string TranslateNode(ASTFunctionNode node)
        {
            return "";
        }

        private static string TranslateNode(ASTUnaryStatementNode node)
        {
            string code = "";
            switch (node.StmntType)
            {
                case STATEMENT_TYPE.RETURN:

                    break;
            }
            code += TranslateNode(node.Right);
            return "";
        }

        private static string TranslateNode(ASTRightValueNode node)
        {
            switch (node.GetType().Name)
            {
                case "ASTConstantNode":
                    var constantNode = (ASTConstantNode)node;
                    return TranslateNode(constantNode);
                default:
                    return "";
            }
        }

        private static string TranslateNode(ASTConstantNode node)
        {
            switch(node.ConstType)
            {
                case CONSTANT_TYPE.CHAR:
                    break;
                case CONSTANT_TYPE.INTEGER:
                    break;
                case CONSTANT_TYPE.FLOAT:
                    break;
                case CONSTANT_TYPE.STRING:
                    break;
            }
            return "";
        }
    }
}
