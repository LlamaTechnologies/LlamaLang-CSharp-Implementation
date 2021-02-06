using System;
using System.IO;
using System.Text;
using Antlr4.Runtime;

namespace LlamaLangCompiler
{
    public class Compiler
    {
        static string logFileName = @"../../../../Examples/log_antlr4.txt";
        static string inputFileName = @"../../../../Examples/test_function_syntax_errors.llang";
        //static string inputFileName = @"../../../../Examples/test_function.llang";

        public static void Main(string[] args)
        {
            // Log file
            var logFile = File.Open(logFileName, FileMode.OpenOrCreate, FileAccess.Write);
            var logOut = new StreamWriter(logFile, Encoding.UTF8);


            // Read arguments


            // Prepare files
            var sourceFile = new AntlrFileStream(inputFileName);
            

            Console.WriteLine("======== Source File ========");
            Console.WriteLine();
            Console.WriteLine(sourceFile);

            var lexer = new LlamaLangLexer(sourceFile);
            var tokens = new CommonTokenStream(lexer);
            var parser = new LlamaLangParser(tokens, logOut, logOut)
            {
                BuildParseTree = true
            };
            var syntaxErrorListener = new SyntaxErrorListener();
            parser.AddErrorListener(syntaxErrorListener);


            var tree = parser.sourceFile();
            var ast = (ASTProgramNode) new ASTBuillder(Path.GetFileName(inputFileName)).VisitSourceFile(tree);
            
            
            var errors = syntaxErrorListener.Errors;
            var analisedAST = new SemanticChecker(ast, errors).check();


            // Print Errors
            Console.WriteLine("======== Errors ========");
            Console.WriteLine("count: " + parser.NumberOfSyntaxErrors.ToString());
            Console.WriteLine();

            foreach (var error in errors)
            {
                Console.WriteLine(error.ToString());
            }


            Console.WriteLine();
            Console.WriteLine("======== Abstract Syntax Tree ========");
            Console.WriteLine();
            Console.WriteLine(analisedAST);

            
            // Close logFile
            logOut?.Dispose();
            logFile?.Close();
            Console.ReadKey();
            

            // If errors do not create executable
            if (errors.Count > 0)
                return;

            // Done!

        }
    }
}
