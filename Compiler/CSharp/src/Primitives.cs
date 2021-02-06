using System;
using System.Collections.Generic;

namespace LlamaLangCompiler
{
    /**
    * This enum contains all prmitives names
    **/
    public enum PRIMITIVE_TYPE
    {
        // SPECIALS
        VOID,
        BOOL,

        // SIGNED
        INT8,
        INT16,
        INT32,
        INT64,
        

        /* CHARACTERS */
        SCHAR,  // ASCII
        CHAR,   // UTF-8
        WCHAR,  // UTF-16
        UCHAR,  // UNICODE

        /* UNSIGNED */
        BYTE,   // Alias for uint8
        UINT8,
        UINT16,
        UINT32,
        UINT64,
        
        /* FLOATING POINT */
        FLOAT32,
        FLOAT64       
    }

    /**
     * This is a holder for all primitives types.
     * Useful for checking if the type is primitive.
     **/
    public class Primitives
    {
        private static Dictionary<string, PRIMITIVE_TYPE> _primitives;

        static Primitives() {
            _primitives = new Dictionary<string, PRIMITIVE_TYPE>();

            var names = Enum.GetNames(typeof(PRIMITIVE_TYPE));
            foreach(string name in names)
            {
                PRIMITIVE_TYPE value = (PRIMITIVE_TYPE) Enum.Parse(typeof(PRIMITIVE_TYPE), name);
                long size = (long)value;
                AddPrimitive(size, name.ToLower(), value);
            }
        }

        private static void AddPrimitive(long size, string name, PRIMITIVE_TYPE value)
        {
            _primitives.Add(name, value);
        }

        public static bool Exists(string name)
        {
            return _primitives.ContainsKey(name);
        }

        internal static PRIMITIVE_TYPE Get(string name)
        {
            return _primitives[name];
        }
    }
}