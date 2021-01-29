using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;

namespace LlamaLangCompiler
{
    public class SyntaxErrorListener : IAntlrErrorListener<IToken>
    {
        public List<ErrorDescription> Errors;
        public SyntaxErrorListener()
        {
            Errors = new List<ErrorDescription>();
        }

        public void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            string file = Path.GetFileName(recognizer.InputStream.SourceName);
            var error = new ErrorDescription(line, file, msg, charPositionInLine);
            Errors.Add(error);
        }
    }
}