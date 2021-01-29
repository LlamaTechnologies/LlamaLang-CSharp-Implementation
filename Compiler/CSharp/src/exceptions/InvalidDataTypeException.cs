using System;
using System.Runtime.Serialization;

namespace LlamaLangCompiler
{
    [Serializable]
    internal class InvalidDataTypeException : Exception
    {
        public InvalidDataTypeException()
        {
        }

        public InvalidDataTypeException(string message) : base(message)
        {
        }

        public InvalidDataTypeException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected InvalidDataTypeException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}