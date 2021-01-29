using System;
using System.Runtime.Serialization;

namespace LlamaLangCompiler
{
    [Serializable]
    internal class WrongStatementTypeException : Exception
    {
        public WrongStatementTypeException()
        {
        }

        public WrongStatementTypeException(string message) : base(message)
        {
        }

        public WrongStatementTypeException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected WrongStatementTypeException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}