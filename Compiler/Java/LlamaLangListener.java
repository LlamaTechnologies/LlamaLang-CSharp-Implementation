// Generated from LlamaLang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LlamaLangParser}.
 */
public interface LlamaLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void enterSourceFile(LlamaLangParser.SourceFileContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#sourceFile}.
	 * @param ctx the parse tree
	 */
	void exitSourceFile(LlamaLangParser.SourceFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(LlamaLangParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(LlamaLangParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(LlamaLangParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(LlamaLangParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(LlamaLangParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(LlamaLangParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(LlamaLangParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(LlamaLangParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(LlamaLangParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(LlamaLangParser.VarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(LlamaLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(LlamaLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(LlamaLangParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(LlamaLangParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LlamaLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LlamaLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStmt(LlamaLangParser.SimpleStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#simpleStmt}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStmt(LlamaLangParser.SimpleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStmt(LlamaLangParser.ExpressionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#expressionStmt}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStmt(LlamaLangParser.ExpressionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(LlamaLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(LlamaLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(LlamaLangParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(LlamaLangParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(LlamaLangParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#emptyStmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(LlamaLangParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(LlamaLangParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(LlamaLangParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(LlamaLangParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(LlamaLangParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(LlamaLangParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(LlamaLangParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(LlamaLangParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(LlamaLangParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(LlamaLangParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(LlamaLangParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#signature}.
	 * @param ctx the parse tree
	 */
	void enterSignature(LlamaLangParser.SignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#signature}.
	 * @param ctx the parse tree
	 */
	void exitSignature(LlamaLangParser.SignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(LlamaLangParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(LlamaLangParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(LlamaLangParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(LlamaLangParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void enterParameterDecl(LlamaLangParser.ParameterDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#parameterDecl}.
	 * @param ctx the parse tree
	 */
	void exitParameterDecl(LlamaLangParser.ParameterDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LlamaLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LlamaLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(LlamaLangParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#primaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(LlamaLangParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(LlamaLangParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(LlamaLangParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void enterConversion(LlamaLangParser.ConversionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#conversion}.
	 * @param ctx the parse tree
	 */
	void exitConversion(LlamaLangParser.ConversionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(LlamaLangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(LlamaLangParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LlamaLangParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LlamaLangParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void enterBasicLit(LlamaLangParser.BasicLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#basicLit}.
	 * @param ctx the parse tree
	 */
	void exitBasicLit(LlamaLangParser.BasicLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(LlamaLangParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(LlamaLangParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void enterOperandName(LlamaLangParser.OperandNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#operandName}.
	 * @param ctx the parse tree
	 */
	void exitOperandName(LlamaLangParser.OperandNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedIdent(LlamaLangParser.QualifiedIdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#qualifiedIdent}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedIdent(LlamaLangParser.QualifiedIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#literalType}.
	 * @param ctx the parse tree
	 */
	void enterLiteralType(LlamaLangParser.LiteralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#literalType}.
	 * @param ctx the parse tree
	 */
	void exitLiteralType(LlamaLangParser.LiteralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDecl(LlamaLangParser.FieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#fieldDecl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDecl(LlamaLangParser.FieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(LlamaLangParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(LlamaLangParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(LlamaLangParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(LlamaLangParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void enterMethodExpr(LlamaLangParser.MethodExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#methodExpr}.
	 * @param ctx the parse tree
	 */
	void exitMethodExpr(LlamaLangParser.MethodExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void enterReceiverType(LlamaLangParser.ReceiverTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#receiverType}.
	 * @param ctx the parse tree
	 */
	void exitReceiverType(LlamaLangParser.ReceiverTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LlamaLangParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(LlamaLangParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LlamaLangParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(LlamaLangParser.EosContext ctx);
}