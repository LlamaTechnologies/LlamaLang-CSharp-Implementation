// Generated from LlamaLang.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LlamaLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, FUNC=2, RETURN=3, IDENTIFIER=4, L_PAREN=5, R_PAREN=6, L_CURLY=7, 
		R_CURLY=8, L_BRACKET=9, R_BRACKET=10, ASSIGN=11, COMMA=12, SEMI=13, COLON=14, 
		DOT=15, PLUS_PLUS=16, MINUS_MINUS=17, DECLARE_ASSIGN=18, ELLIPSIS=19, 
		LOGICAL_OR=20, LOGICAL_AND=21, EQUALS=22, NOT_EQUALS=23, LESS=24, LESS_OR_EQUALS=25, 
		GREATER=26, GREATER_OR_EQUALS=27, OR=28, DIV=29, MOD=30, LSHIFT=31, RSHIFT=32, 
		BIT_CLEAR=33, EXCLAMATION=34, PLUS=35, MINUS=36, CARET=37, STAR=38, AMPERSAND=39, 
		ARROW=40, DECIMAL_LIT=41, OCTAL_LIT=42, HEX_LIT=43, FLOAT_LIT=44, RUNE_LIT=45, 
		INTERPRETED_STRING_LIT=46, WS=47, COMMENT=48, TERMINATOR=49, LINE_COMMENT=50;
	public static final int
		RULE_sourceFile = 0, RULE_identifierList = 1, RULE_expressionList = 2, 
		RULE_functionDecl = 3, RULE_varDecl = 4, RULE_varSpec = 5, RULE_block = 6, 
		RULE_statementList = 7, RULE_statement = 8, RULE_simpleStmt = 9, RULE_expressionStmt = 10, 
		RULE_assignment = 11, RULE_assign_op = 12, RULE_emptyStmt = 13, RULE_returnStmt = 14, 
		RULE_type_ = 15, RULE_pointer = 16, RULE_array = 17, RULE_typeName = 18, 
		RULE_signature = 19, RULE_result = 20, RULE_parameters = 21, RULE_parameterDecl = 22, 
		RULE_expression = 23, RULE_primaryExpr = 24, RULE_unaryExpr = 25, RULE_conversion = 26, 
		RULE_operand = 27, RULE_literal = 28, RULE_basicLit = 29, RULE_integer = 30, 
		RULE_operandName = 31, RULE_qualifiedIdent = 32, RULE_literalType = 33, 
		RULE_fieldDecl = 34, RULE_string_ = 35, RULE_arguments = 36, RULE_methodExpr = 37, 
		RULE_receiverType = 38, RULE_eos = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"sourceFile", "identifierList", "expressionList", "functionDecl", "varDecl", 
			"varSpec", "block", "statementList", "statement", "simpleStmt", "expressionStmt", 
			"assignment", "assign_op", "emptyStmt", "returnStmt", "type_", "pointer", 
			"array", "typeName", "signature", "result", "parameters", "parameterDecl", 
			"expression", "primaryExpr", "unaryExpr", "conversion", "operand", "literal", 
			"basicLit", "integer", "operandName", "qualifiedIdent", "literalType", 
			"fieldDecl", "string_", "arguments", "methodExpr", "receiverType", "eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<-'", "'func'", "'return'", null, "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "'='", "','", "';'", "':'", "'.'", "'++'", "'--'", "':='", 
			"'...'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", 
			"'|'", "'/'", "'%'", "'<<'", "'>>'", "'&^'", "'!'", "'+'", "'-'", "'^'", 
			"'*'", "'&'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "FUNC", "RETURN", "IDENTIFIER", "L_PAREN", "R_PAREN", "L_CURLY", 
			"R_CURLY", "L_BRACKET", "R_BRACKET", "ASSIGN", "COMMA", "SEMI", "COLON", 
			"DOT", "PLUS_PLUS", "MINUS_MINUS", "DECLARE_ASSIGN", "ELLIPSIS", "LOGICAL_OR", 
			"LOGICAL_AND", "EQUALS", "NOT_EQUALS", "LESS", "LESS_OR_EQUALS", "GREATER", 
			"GREATER_OR_EQUALS", "OR", "DIV", "MOD", "LSHIFT", "RSHIFT", "BIT_CLEAR", 
			"EXCLAMATION", "PLUS", "MINUS", "CARET", "STAR", "AMPERSAND", "ARROW", 
			"DECIMAL_LIT", "OCTAL_LIT", "HEX_LIT", "FLOAT_LIT", "RUNE_LIT", "INTERPRETED_STRING_LIT", 
			"WS", "COMMENT", "TERMINATOR", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LlamaLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LlamaLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SourceFileContext extends ParserRuleContext {
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public SourceFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterSourceFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitSourceFile(this);
		}
	}

	public final SourceFileContext sourceFile() throws RecognitionException {
		SourceFileContext _localctx = new SourceFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sourceFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNC || _la==IDENTIFIER) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNC:
					{
					setState(80);
					functionDecl();
					}
					break;
				case IDENTIFIER:
					{
					setState(81);
					varDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(87);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LlamaLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LlamaLangParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LlamaLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LlamaLangParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(IDENTIFIER);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(90);
				match(COMMA);
				setState(91);
				match(IDENTIFIER);
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LlamaLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LlamaLangParser.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			expression(0);
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(98);
					match(COMMA);
					setState(99);
					expression(0);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(LlamaLangParser.FUNC, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LlamaLangParser.IDENTIFIER, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(LlamaLangParser.ARROW, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitFunctionDecl(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(FUNC);
			setState(106);
			match(IDENTIFIER);
			setState(107);
			signature();
			setState(108);
			match(ARROW);
			setState(109);
			type_();
			setState(110);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDeclContext extends ParserRuleContext {
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitVarDecl(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			varSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarSpecContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LlamaLangParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(LlamaLangParser.ASSIGN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitVarSpec(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			identifierList();
			setState(115);
			match(COLON);
			setState(116);
			type_();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(117);
				match(ASSIGN);
				setState(118);
				expressionList();
				}
			}

			setState(121);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode L_CURLY() { return getToken(LlamaLangParser.L_CURLY, 0); }
		public TerminalNode R_CURLY() { return getToken(LlamaLangParser.R_CURLY, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(L_CURLY);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_CURLY) | (1L << L_BRACKET) | (1L << SEMI) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << DECIMAL_LIT) | (1L << OCTAL_LIT) | (1L << HEX_LIT) | (1L << FLOAT_LIT) | (1L << RUNE_LIT) | (1L << INTERPRETED_STRING_LIT))) != 0)) {
				{
				setState(124);
				statementList();
				}
			}

			setState(127);
			match(R_CURLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<EosContext> eos() {
			return getRuleContexts(EosContext.class);
		}
		public EosContext eos(int i) {
			return getRuleContext(EosContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitStatementList(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				statement();
				setState(130);
				eos();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << RETURN) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_CURLY) | (1L << L_BRACKET) | (1L << SEMI) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << DECIMAL_LIT) | (1L << OCTAL_LIT) | (1L << HEX_LIT) | (1L << FLOAT_LIT) | (1L << RUNE_LIT) | (1L << INTERPRETED_STRING_LIT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public SimpleStmtContext simpleStmt() {
			return getRuleContext(SimpleStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				varDecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				simpleStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				returnStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleStmtContext extends ParserRuleContext {
		public ExpressionStmtContext expressionStmt() {
			return getRuleContext(ExpressionStmtContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public EmptyStmtContext emptyStmt() {
			return getRuleContext(EmptyStmtContext.class,0);
		}
		public SimpleStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterSimpleStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitSimpleStmt(this);
		}
	}

	public final SimpleStmtContext simpleStmt() throws RecognitionException {
		SimpleStmtContext _localctx = new SimpleStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simpleStmt);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				expressionStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				emptyStmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStmtContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterExpressionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitExpressionStmt(this);
		}
	}

	public final ExpressionStmtContext expressionStmt() throws RecognitionException {
		ExpressionStmtContext _localctx = new ExpressionStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressionStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			expressionList();
			setState(150);
			assign_op();
			setState(151);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(LlamaLangParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(LlamaLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LlamaLangParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(LlamaLangParser.OR, 0); }
		public TerminalNode CARET() { return getToken(LlamaLangParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(LlamaLangParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(LlamaLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LlamaLangParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(LlamaLangParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(LlamaLangParser.RSHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(LlamaLangParser.AMPERSAND, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(LlamaLangParser.BIT_CLEAR, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) {
				{
				setState(153);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(156);
			match(ASSIGN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmptyStmtContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LlamaLangParser.SEMI, 0); }
		public EmptyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterEmptyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitEmptyStmt(this);
		}
	}

	public final EmptyStmtContext emptyStmt() throws RecognitionException {
		EmptyStmtContext _localctx = new EmptyStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_emptyStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStmtContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(LlamaLangParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitReturnStmt(this);
		}
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(RETURN);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << DECIMAL_LIT) | (1L << OCTAL_LIT) | (1L << HEX_LIT) | (1L << FLOAT_LIT) | (1L << RUNE_LIT) | (1L << INTERPRETED_STRING_LIT))) != 0)) {
				{
				setState(161);
				expression(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_Context extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_type_);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				typeName();
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				pointer();
				}
				break;
			case L_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(LlamaLangParser.STAR, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitPointer(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(STAR);
			setState(170);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode L_BRACKET() { return getToken(LlamaLangParser.L_BRACKET, 0); }
		public TerminalNode R_BRACKET() { return getToken(LlamaLangParser.R_BRACKET, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(L_BRACKET);
			setState(173);
			match(R_BRACKET);
			setState(174);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LlamaLangParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeName);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				qualifiedIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SignatureContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitSignature(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_signature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			parameters();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_result);
		try {
			setState(184);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				parameters();
				}
				break;
			case IDENTIFIER:
			case L_BRACKET:
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				type_();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(LlamaLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(LlamaLangParser.R_PAREN, 0); }
		public List<ParameterDeclContext> parameterDecl() {
			return getRuleContexts(ParameterDeclContext.class);
		}
		public ParameterDeclContext parameterDecl(int i) {
			return getRuleContext(ParameterDeclContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LlamaLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LlamaLangParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(L_PAREN);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(187);
				parameterDecl();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(189);
					parameterDecl();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(197);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LlamaLangParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(LlamaLangParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ParameterDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterParameterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitParameterDecl(this);
		}
	}

	public final ParameterDeclContext parameterDecl() throws RecognitionException {
		ParameterDeclContext _localctx = new ParameterDeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameterDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(IDENTIFIER);
			setState(200);
			match(COLON);
			setState(201);
			type_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode STAR() { return getToken(LlamaLangParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(LlamaLangParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(LlamaLangParser.MOD, 0); }
		public TerminalNode LSHIFT() { return getToken(LlamaLangParser.LSHIFT, 0); }
		public TerminalNode RSHIFT() { return getToken(LlamaLangParser.RSHIFT, 0); }
		public TerminalNode AMPERSAND() { return getToken(LlamaLangParser.AMPERSAND, 0); }
		public TerminalNode BIT_CLEAR() { return getToken(LlamaLangParser.BIT_CLEAR, 0); }
		public TerminalNode PLUS() { return getToken(LlamaLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LlamaLangParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(LlamaLangParser.OR, 0); }
		public TerminalNode CARET() { return getToken(LlamaLangParser.CARET, 0); }
		public TerminalNode EQUALS() { return getToken(LlamaLangParser.EQUALS, 0); }
		public TerminalNode NOT_EQUALS() { return getToken(LlamaLangParser.NOT_EQUALS, 0); }
		public TerminalNode LESS() { return getToken(LlamaLangParser.LESS, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(LlamaLangParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER() { return getToken(LlamaLangParser.GREATER, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(LlamaLangParser.GREATER_OR_EQUALS, 0); }
		public TerminalNode LOGICAL_AND() { return getToken(LlamaLangParser.LOGICAL_AND, 0); }
		public TerminalNode LOGICAL_OR() { return getToken(LlamaLangParser.LOGICAL_OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(204);
				primaryExpr(0);
				}
				break;
			case 2:
				{
				setState(205);
				unaryExpr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(209);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << LSHIFT) | (1L << RSHIFT) | (1L << BIT_CLEAR) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(212);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS) | (1L << CARET))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(215);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << NOT_EQUALS) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(218);
						match(LOGICAL_AND);
						setState(219);
						expression(3);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(220);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(221);
						match(LOGICAL_OR);
						setState(222);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExprContext extends ParserRuleContext {
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ConversionContext conversion() {
			return getRuleContext(ConversionContext.class,0);
		}
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LlamaLangParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LlamaLangParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitPrimaryExpr(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		return primaryExpr(0);
	}

	private PrimaryExprContext primaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, _parentState);
		PrimaryExprContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_primaryExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(229);
				operand();
				}
				break;
			case 2:
				{
				setState(230);
				conversion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PrimaryExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_primaryExpr);
					setState(233);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(237);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case DOT:
						{
						setState(234);
						match(DOT);
						setState(235);
						match(IDENTIFIER);
						}
						break;
					case L_PAREN:
						{
						setState(236);
						arguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExprContext extends ParserRuleContext {
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LlamaLangParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LlamaLangParser.MINUS, 0); }
		public TerminalNode EXCLAMATION() { return getToken(LlamaLangParser.EXCLAMATION, 0); }
		public TerminalNode CARET() { return getToken(LlamaLangParser.CARET, 0); }
		public TerminalNode STAR() { return getToken(LlamaLangParser.STAR, 0); }
		public TerminalNode AMPERSAND() { return getToken(LlamaLangParser.AMPERSAND, 0); }
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_unaryExpr);
		int _la;
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				primaryExpr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(246);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConversionContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(LlamaLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(LlamaLangParser.R_PAREN, 0); }
		public TerminalNode COMMA() { return getToken(LlamaLangParser.COMMA, 0); }
		public ConversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterConversion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitConversion(this);
		}
	}

	public final ConversionContext conversion() throws RecognitionException {
		ConversionContext _localctx = new ConversionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_conversion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			type_();
			setState(250);
			match(L_PAREN);
			setState(251);
			expression(0);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(252);
				match(COMMA);
				}
			}

			setState(255);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperandNameContext operandName() {
			return getRuleContext(OperandNameContext.class,0);
		}
		public MethodExprContext methodExpr() {
			return getRuleContext(MethodExprContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(LlamaLangParser.L_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(LlamaLangParser.R_PAREN, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitOperand(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_operand);
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				operandName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(259);
				methodExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(260);
				match(L_PAREN);
				setState(261);
				expression(0);
				setState(262);
				match(R_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public BasicLitContext basicLit() {
			return getRuleContext(BasicLitContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			basicLit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BasicLitContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode FLOAT_LIT() { return getToken(LlamaLangParser.FLOAT_LIT, 0); }
		public TerminalNode RUNE_LIT() { return getToken(LlamaLangParser.RUNE_LIT, 0); }
		public BasicLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterBasicLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitBasicLit(this);
		}
	}

	public final BasicLitContext basicLit() throws RecognitionException {
		BasicLitContext _localctx = new BasicLitContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_basicLit);
		try {
			setState(272);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECIMAL_LIT:
			case OCTAL_LIT:
			case HEX_LIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				integer();
				}
				break;
			case INTERPRETED_STRING_LIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				string_();
				}
				break;
			case FLOAT_LIT:
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(FLOAT_LIT);
				}
				break;
			case RUNE_LIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				match(RUNE_LIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LIT() { return getToken(LlamaLangParser.DECIMAL_LIT, 0); }
		public TerminalNode OCTAL_LIT() { return getToken(LlamaLangParser.OCTAL_LIT, 0); }
		public TerminalNode HEX_LIT() { return getToken(LlamaLangParser.HEX_LIT, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECIMAL_LIT) | (1L << OCTAL_LIT) | (1L << HEX_LIT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(LlamaLangParser.IDENTIFIER, 0); }
		public QualifiedIdentContext qualifiedIdent() {
			return getRuleContext(QualifiedIdentContext.class,0);
		}
		public OperandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterOperandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitOperandName(this);
		}
	}

	public final OperandNameContext operandName() throws RecognitionException {
		OperandNameContext _localctx = new OperandNameContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_operandName);
		try {
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				qualifiedIdent();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedIdentContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(LlamaLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(LlamaLangParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(LlamaLangParser.DOT, 0); }
		public QualifiedIdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedIdent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterQualifiedIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitQualifiedIdent(this);
		}
	}

	public final QualifiedIdentContext qualifiedIdent() throws RecognitionException {
		QualifiedIdentContext _localctx = new QualifiedIdentContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_qualifiedIdent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(IDENTIFIER);
			setState(281);
			match(DOT);
			setState(282);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public LiteralTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterLiteralType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitLiteralType(this);
		}
	}

	public final LiteralTypeContext literalType() throws RecognitionException {
		LiteralTypeContext _localctx = new LiteralTypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_literalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public FieldDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterFieldDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitFieldDecl(this);
		}
	}

	public final FieldDeclContext fieldDecl() throws RecognitionException {
		FieldDeclContext _localctx = new FieldDeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fieldDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			identifierList();
			setState(287);
			type_();
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTERPRETED_STRING_LIT) {
				{
				setState(288);
				string_();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_Context extends ParserRuleContext {
		public TerminalNode INTERPRETED_STRING_LIT() { return getToken(LlamaLangParser.INTERPRETED_STRING_LIT, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitString_(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_string_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(INTERPRETED_STRING_LIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(LlamaLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(LlamaLangParser.R_PAREN, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public TerminalNode ELLIPSIS() { return getToken(LlamaLangParser.ELLIPSIS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LlamaLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LlamaLangParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(L_PAREN);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IDENTIFIER) | (1L << L_PAREN) | (1L << L_BRACKET) | (1L << EXCLAMATION) | (1L << PLUS) | (1L << MINUS) | (1L << CARET) | (1L << STAR) | (1L << AMPERSAND) | (1L << DECIMAL_LIT) | (1L << OCTAL_LIT) | (1L << HEX_LIT) | (1L << FLOAT_LIT) | (1L << RUNE_LIT) | (1L << INTERPRETED_STRING_LIT))) != 0)) {
				{
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(294);
					expressionList();
					}
					break;
				case 2:
					{
					setState(295);
					type_();
					setState(298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(296);
						match(COMMA);
						setState(297);
						expressionList();
						}
						break;
					}
					}
					break;
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELLIPSIS) {
					{
					setState(302);
					match(ELLIPSIS);
					}
				}

				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(305);
					match(COMMA);
					}
				}

				}
			}

			setState(310);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodExprContext extends ParserRuleContext {
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LlamaLangParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(LlamaLangParser.IDENTIFIER, 0); }
		public MethodExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterMethodExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitMethodExpr(this);
		}
	}

	public final MethodExprContext methodExpr() throws RecognitionException {
		MethodExprContext _localctx = new MethodExprContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_methodExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			receiverType();
			setState(313);
			match(DOT);
			setState(314);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverTypeContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode L_PAREN() { return getToken(LlamaLangParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(LlamaLangParser.R_PAREN, 0); }
		public TerminalNode STAR() { return getToken(LlamaLangParser.STAR, 0); }
		public ReceiverTypeContext receiverType() {
			return getRuleContext(ReceiverTypeContext.class,0);
		}
		public ReceiverTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiverType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterReceiverType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitReceiverType(this);
		}
	}

	public final ReceiverTypeContext receiverType() throws RecognitionException {
		ReceiverTypeContext _localctx = new ReceiverTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_receiverType);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				typeName();
				}
				break;
			case L_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(L_PAREN);
				setState(321);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STAR:
					{
					setState(318);
					match(STAR);
					setState(319);
					typeName();
					}
					break;
				case IDENTIFIER:
				case L_PAREN:
					{
					setState(320);
					receiverType();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(323);
				match(R_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EosContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(LlamaLangParser.SEMI, 0); }
		public TerminalNode EOF() { return getToken(LlamaLangParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LlamaLangListener ) ((LlamaLangListener)listener).exitEos(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_eos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==SEMI) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 24:
			return primaryExpr_sempred((PrimaryExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpr_sempred(PrimaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u014c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\7\2U\n"+
		"\2\f\2\16\2X\13\2\3\2\3\2\3\3\3\3\3\3\7\3_\n\3\f\3\16\3b\13\3\3\4\3\4"+
		"\3\4\7\4g\n\4\f\4\16\4j\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\3\b\3\b\5\b\u0080\n\b\3\b\3\b\3\t\3\t"+
		"\3\t\6\t\u0087\n\t\r\t\16\t\u0088\3\n\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3"+
		"\13\3\13\5\13\u0094\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\16\5\16\u009d\n\16"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\5\21\u00aa"+
		"\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00b5\n\24\3\25"+
		"\3\25\3\26\3\26\5\26\u00bb\n\26\3\27\3\27\3\27\3\27\7\27\u00c1\n\27\f"+
		"\27\16\27\u00c4\13\27\5\27\u00c6\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\5\31\u00d1\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u00e2\n\31\f\31\16\31\u00e5\13"+
		"\31\3\32\3\32\3\32\5\32\u00ea\n\32\3\32\3\32\3\32\3\32\5\32\u00f0\n\32"+
		"\7\32\u00f2\n\32\f\32\16\32\u00f5\13\32\3\33\3\33\3\33\5\33\u00fa\n\33"+
		"\3\34\3\34\3\34\3\34\5\34\u0100\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u010b\n\35\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u0113\n"+
		"\37\3 \3 \3!\3!\5!\u0119\n!\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\5$\u0124\n"+
		"$\3%\3%\3&\3&\3&\3&\3&\5&\u012d\n&\5&\u012f\n&\3&\5&\u0132\n&\3&\5&\u0135"+
		"\n&\5&\u0137\n&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0144\n(\3(\3"+
		"(\5(\u0148\n(\3)\3)\3)\2\4\60\62*\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNP\2\t\4\2\36#%)\4\2\37#()\4\2\36\36"+
		"%\'\3\2\30\35\4\2\3\3$)\3\2+-\3\3\17\17\2\u0151\2V\3\2\2\2\4[\3\2\2\2"+
		"\6c\3\2\2\2\bk\3\2\2\2\nr\3\2\2\2\ft\3\2\2\2\16}\3\2\2\2\20\u0086\3\2"+
		"\2\2\22\u008e\3\2\2\2\24\u0093\3\2\2\2\26\u0095\3\2\2\2\30\u0097\3\2\2"+
		"\2\32\u009c\3\2\2\2\34\u00a0\3\2\2\2\36\u00a2\3\2\2\2 \u00a9\3\2\2\2\""+
		"\u00ab\3\2\2\2$\u00ae\3\2\2\2&\u00b4\3\2\2\2(\u00b6\3\2\2\2*\u00ba\3\2"+
		"\2\2,\u00bc\3\2\2\2.\u00c9\3\2\2\2\60\u00d0\3\2\2\2\62\u00e9\3\2\2\2\64"+
		"\u00f9\3\2\2\2\66\u00fb\3\2\2\28\u010a\3\2\2\2:\u010c\3\2\2\2<\u0112\3"+
		"\2\2\2>\u0114\3\2\2\2@\u0118\3\2\2\2B\u011a\3\2\2\2D\u011e\3\2\2\2F\u0120"+
		"\3\2\2\2H\u0125\3\2\2\2J\u0127\3\2\2\2L\u013a\3\2\2\2N\u0147\3\2\2\2P"+
		"\u0149\3\2\2\2RU\5\b\5\2SU\5\n\6\2TR\3\2\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2"+
		"\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\5P)\2Z\3\3\2\2\2[`\7\6\2\2\\]\7\16"+
		"\2\2]_\7\6\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\5\3\2\2\2b`\3"+
		"\2\2\2ch\5\60\31\2de\7\16\2\2eg\5\60\31\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2"+
		"\2hi\3\2\2\2i\7\3\2\2\2jh\3\2\2\2kl\7\4\2\2lm\7\6\2\2mn\5(\25\2no\7*\2"+
		"\2op\5 \21\2pq\5\16\b\2q\t\3\2\2\2rs\5\f\7\2s\13\3\2\2\2tu\5\4\3\2uv\7"+
		"\20\2\2vy\5 \21\2wx\7\r\2\2xz\5\6\4\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|"+
		"\5P)\2|\r\3\2\2\2}\177\7\t\2\2~\u0080\5\20\t\2\177~\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\n\2\2\u0082\17\3\2\2\2\u0083"+
		"\u0084\5\22\n\2\u0084\u0085\5P)\2\u0085\u0087\3\2\2\2\u0086\u0083\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\21\3\2\2\2\u008a\u008f\5\n\6\2\u008b\u008f\5\24\13\2\u008c\u008f\5\36"+
		"\20\2\u008d\u008f\5\16\b\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\23\3\2\2\2\u0090\u0094\5\26\f"+
		"\2\u0091\u0094\5\30\r\2\u0092\u0094\5\34\17\2\u0093\u0090\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\5\60\31"+
		"\2\u0096\27\3\2\2\2\u0097\u0098\5\6\4\2\u0098\u0099\5\32\16\2\u0099\u009a"+
		"\5\6\4\2\u009a\31\3\2\2\2\u009b\u009d\t\2\2\2\u009c\u009b\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\7\r\2\2\u009f\33\3\2\2"+
		"\2\u00a0\u00a1\7\17\2\2\u00a1\35\3\2\2\2\u00a2\u00a4\7\5\2\2\u00a3\u00a5"+
		"\5\60\31\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\37\3\2\2\2\u00a6"+
		"\u00aa\5&\24\2\u00a7\u00aa\5\"\22\2\u00a8\u00aa\5$\23\2\u00a9\u00a6\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa!\3\2\2\2\u00ab\u00ac"+
		"\7(\2\2\u00ac\u00ad\5 \21\2\u00ad#\3\2\2\2\u00ae\u00af\7\13\2\2\u00af"+
		"\u00b0\7\f\2\2\u00b0\u00b1\5&\24\2\u00b1%\3\2\2\2\u00b2\u00b5\7\6\2\2"+
		"\u00b3\u00b5\5B\"\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\'\3"+
		"\2\2\2\u00b6\u00b7\5,\27\2\u00b7)\3\2\2\2\u00b8\u00bb\5,\27\2\u00b9\u00bb"+
		"\5 \21\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb+\3\2\2\2\u00bc"+
		"\u00c5\7\7\2\2\u00bd\u00c2\5.\30\2\u00be\u00bf\7\16\2\2\u00bf\u00c1\5"+
		".\30\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00bd\3\2"+
		"\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\7\b\2\2\u00c8"+
		"-\3\2\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\7\20\2\2\u00cb\u00cc\5 \21\2"+
		"\u00cc/\3\2\2\2\u00cd\u00ce\b\31\1\2\u00ce\u00d1\5\62\32\2\u00cf\u00d1"+
		"\5\64\33\2\u00d0\u00cd\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00e3\3\2\2\2"+
		"\u00d2\u00d3\f\7\2\2\u00d3\u00d4\t\3\2\2\u00d4\u00e2\5\60\31\b\u00d5\u00d6"+
		"\f\6\2\2\u00d6\u00d7\t\4\2\2\u00d7\u00e2\5\60\31\7\u00d8\u00d9\f\5\2\2"+
		"\u00d9\u00da\t\5\2\2\u00da\u00e2\5\60\31\6\u00db\u00dc\f\4\2\2\u00dc\u00dd"+
		"\7\27\2\2\u00dd\u00e2\5\60\31\5\u00de\u00df\f\3\2\2\u00df\u00e0\7\26\2"+
		"\2\u00e0\u00e2\5\60\31\4\u00e1\u00d2\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1"+
		"\u00d8\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\61\3\2\2\2\u00e5\u00e3"+
		"\3\2\2\2\u00e6\u00e7\b\32\1\2\u00e7\u00ea\58\35\2\u00e8\u00ea\5\66\34"+
		"\2\u00e9\u00e6\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00f3\3\2\2\2\u00eb\u00ef"+
		"\f\3\2\2\u00ec\u00ed\7\21\2\2\u00ed\u00f0\7\6\2\2\u00ee\u00f0\5J&\2\u00ef"+
		"\u00ec\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00eb\3\2"+
		"\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\63\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00fa\5\62\32\2\u00f7\u00f8\t\6"+
		"\2\2\u00f8\u00fa\5\60\31\2\u00f9\u00f6\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa"+
		"\65\3\2\2\2\u00fb\u00fc\5 \21\2\u00fc\u00fd\7\7\2\2\u00fd\u00ff\5\60\31"+
		"\2\u00fe\u0100\7\16\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0102\7\b\2\2\u0102\67\3\2\2\2\u0103\u010b\5:\36"+
		"\2\u0104\u010b\5@!\2\u0105\u010b\5L\'\2\u0106\u0107\7\7\2\2\u0107\u0108"+
		"\5\60\31\2\u0108\u0109\7\b\2\2\u0109\u010b\3\2\2\2\u010a\u0103\3\2\2\2"+
		"\u010a\u0104\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010b9\3"+
		"\2\2\2\u010c\u010d\5<\37\2\u010d;\3\2\2\2\u010e\u0113\5> \2\u010f\u0113"+
		"\5H%\2\u0110\u0113\7.\2\2\u0111\u0113\7/\2\2\u0112\u010e\3\2\2\2\u0112"+
		"\u010f\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0111\3\2\2\2\u0113=\3\2\2\2"+
		"\u0114\u0115\t\7\2\2\u0115?\3\2\2\2\u0116\u0119\7\6\2\2\u0117\u0119\5"+
		"B\"\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2\u0119A\3\2\2\2\u011a\u011b"+
		"\7\6\2\2\u011b\u011c\7\21\2\2\u011c\u011d\7\6\2\2\u011dC\3\2\2\2\u011e"+
		"\u011f\5&\24\2\u011fE\3\2\2\2\u0120\u0121\5\4\3\2\u0121\u0123\5 \21\2"+
		"\u0122\u0124\5H%\2\u0123\u0122\3\2\2\2\u0123\u0124\3\2\2\2\u0124G\3\2"+
		"\2\2\u0125\u0126\7\60\2\2\u0126I\3\2\2\2\u0127\u0136\7\7\2\2\u0128\u012f"+
		"\5\6\4\2\u0129\u012c\5 \21\2\u012a\u012b\7\16\2\2\u012b\u012d\5\6\4\2"+
		"\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u0128"+
		"\3\2\2\2\u012e\u0129\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u0132\7\25\2\2"+
		"\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0135"+
		"\7\16\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2"+
		"\u0136\u012e\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\7\b\2\2\u0139K\3\2\2\2\u013a\u013b\5N(\2\u013b\u013c\7\21\2\2\u013c\u013d"+
		"\7\6\2\2\u013dM\3\2\2\2\u013e\u0148\5&\24\2\u013f\u0143\7\7\2\2\u0140"+
		"\u0141\7(\2\2\u0141\u0144\5&\24\2\u0142\u0144\5N(\2\u0143\u0140\3\2\2"+
		"\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\b\2\2\u0146\u0148"+
		"\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u013f\3\2\2\2\u0148O\3\2\2\2\u0149"+
		"\u014a\t\b\2\2\u014aQ\3\2\2\2%TV`hy\177\u0088\u008e\u0093\u009c\u00a4"+
		"\u00a9\u00b4\u00ba\u00c2\u00c5\u00d0\u00e1\u00e3\u00e9\u00ef\u00f3\u00f9"+
		"\u00ff\u010a\u0112\u0118\u0123\u012c\u012e\u0131\u0134\u0136\u0143\u0147";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}