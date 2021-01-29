using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LlamaLangCompiler
{
    public class ErrorDescription
    {
        public int line;
        public int column;
        public string file;
        public string message;

        public ErrorDescription(int line, string file, string message, int column = 0)
        {
            this.line = line;
            this.column = column;
            this.file = file;
            this.message = message;
        }

        public override string ToString()
        {
            return file + "\t:: line: " + line + "\t:: col: " + column + "\t:: " + message;
        }
    }
}
