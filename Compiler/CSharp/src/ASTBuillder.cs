using System;
using System.Collections.Generic;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using static LlamaLangParser;

namespace LlamaLangCompiler
{
    /**
     * Builds an Abstract Syntax Tree (AST) to represent the program and report syntax errors.
     * The AST contains only the information needed to check semantics and generate code.
     **/
    public class ASTBuillder : LlamaLangBaseVisitor<ASTNode>
    {
        public ASTProgramNode ASTree;
        public List<ErrorDescription> Errors;
        string fileName;
        public ASTBuillder(string fileName)
        {
            ASTree = new ASTProgramNode();
            Errors = new List<ErrorDescription>();
            this.fileName = fileName;
        }

        public override ASTNode VisitSourceFile([NotNull] SourceFileContext context)
        {

            Console.WriteLine();
            Console.WriteLine("========== SOURCE FILE NODE ===========");
            context.ASTnode = ASTree;

            // add program source to the program tree
            base.VisitChildren(context);

            return ASTree;
        }

        public override ASTNode VisitFunctionDecl([NotNull] FunctionDeclContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;

            ASTFunctionNode funcNode = (ASTFunctionNode)(context.ASTnode = new ASTFunctionNode());
            funcNode.File = fileName;
            funcNode.Line = context.Start.Line;
            funcNode.Name = context.IDENTIFIER().GetText();
            funcNode.ReturnType = context.type_().GetText();

            parentContext.ASTnode.AddChild(funcNode);
            base.VisitChildren(context);
            return null;
        }

        public override ASTNode VisitSignature([NotNull] SignatureContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            context.ASTnode = parentContext.ASTnode;
            return base.VisitChildren(context);
        }

        public override ASTNode VisitParameters([NotNull] ParametersContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            var funcNode = (ASTFunctionNode)parentContext.ASTnode;

            string msg = context.GetType().Name + "\t| Parent :: " + parentContext.GetType().Name + "\t| ASTnode :: " + parentContext.ASTnode?.GetType().Name;
            Console.WriteLine(msg);

            var parameters = new List<ParameterDeclContext>(context.parameterDecl());
            foreach (var paramContext in parameters)
            {
                if (paramContext.IsEmpty || paramContext.exception != null)
                    continue;

                var param = new ASTVariableDeclNode();
                param.File = fileName;
                param.Line = context.Start.Line;
                param.Name = paramContext.IDENTIFIER().GetText();
                param.VarType = paramContext.type_().GetText();
                funcNode.Parameters.Add(param);
            }

            return base.VisitChildren(context);
        }

        public override ASTNode VisitBlock([NotNull] BlockContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            context.ASTnode = parentContext.ASTnode;
            return base.VisitChildren(context);
        }

        public override ASTNode VisitStatementList([NotNull] StatementListContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            var funcNode = (ASTFunctionNode)parentContext.ASTnode;
            var statementContexts = new List<StatementContext>(context.statement());

            foreach (var statementContext in statementContexts)
            {
                if (statementContext.IsEmpty || statementContext.exception != null)
                    return null;

                statementContext.ASTnode = funcNode;
                base.VisitChildren(statementContext);
            }

            return funcNode;
        }

        public override ASTNode VisitReturnStmt([NotNull] ReturnStmtContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            var funcNode = (ASTFunctionNode)parentContext.ASTnode;

            string msg = context.GetType().Name + "\t| Parent :: " + parentContext.GetType().Name + "\t| ASTnode :: " + parentContext.ASTnode?.GetType().Name;
            Console.WriteLine(msg);

            var statement = new ASTUnaryStatementNode(STATEMENT_TYPE.RETURN);
            statement.File = fileName;
            statement.Line = context.Start.Line;

            funcNode.Block.Add(statement);
            context.ASTnode = statement;

            base.VisitChildren(context);

            return null;
        }

        public override ASTNode VisitUnaryExpr([NotNull] UnaryExprContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            var returnStnt = (ASTUnaryStatementNode)parentContext.ASTnode;
            context.ASTnode = returnStnt;

            string msg = context.GetType().Name + "\t| Parent :: " + parentContext.GetType().Name + "\t| ASTnode :: " + parentContext.ASTnode?.GetType().Name;
            Console.WriteLine(msg);

            var childNode = base.VisitChildren(context);
            var childNodeType = childNode.GetType();
            if (childNodeType == typeof(ASTUnaryStatementNode))
            {
                var node = (ASTUnaryStatementNode)childNode;
                var nodeType = node.Right.GetType();
                if (nodeType == typeof(ASTConstantNode))
                {
                    var constNode = (ASTConstantNode)node.Right;
                    constNode.Value = context.unaryOp().GetText() + constNode.Value;
                }
            }
            

            return childNode;
        }

        public override ASTNode VisitExpression([NotNull] ExpressionContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            var parentContext = (LlamaLangParseContext)context.Parent;
            var returnStnt = (ASTUnaryStatementNode)parentContext.ASTnode;
            context.ASTnode = returnStnt;

            string msg = context.GetType().Name + "\t| Parent :: " + parentContext.GetType().Name + "\t| ASTnode :: " + parentContext.ASTnode?.GetType().Name;
            Console.WriteLine(msg);

            var exprNode = base.VisitChildren(context);

            // Unary expression
            var exprType = exprNode.GetType().BaseType;
            if (exprType == typeof(ASTRightValueNode))
            {
                var rightValue = (ASTRightValueNode)exprNode;
                returnStnt.Right = rightValue;
            }

            return returnStnt;
        }

        public override ASTNode VisitBasicLit([NotNull] BasicLitContext context)
        {
            if (context.IsEmpty || context.exception != null)
                return null;

            ASTConstantNode constantNode;
            
            if (context.integer() != null)
            {
                constantNode = new ASTConstantNode(CONSTANT_TYPE.INTEGER);
                constantNode.Value = context.integer().GetText();
            }
            else if (context.FLOAT_LIT() != null)
            {
                constantNode = new ASTConstantNode(CONSTANT_TYPE.FLOAT);
                constantNode.Value = context.FLOAT_LIT().GetText();
            }
            else if (context.RUNE_LIT() != null)
            {
                constantNode = new ASTConstantNode(CONSTANT_TYPE.CHAR);
                constantNode.Value = context.RUNE_LIT().GetText();
            }
            else
            {
                constantNode = new ASTConstantNode(CONSTANT_TYPE.STRING);
                constantNode.Value = context.string_().GetText();
            }

            if (constantNode != null)
            {
                constantNode.File = fileName;
                constantNode.Line = context.Start.Line;
            }

            return constantNode;
        }
    }
}
