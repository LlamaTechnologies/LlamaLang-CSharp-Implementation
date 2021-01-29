# LlamaLang
This is a language for game development heavily inspired by Jonathan Blows language, Jai.
It has annotations like Java, sintax TypeScript Inspired some of it is from go.
It has reflection and compile time functions excecution plus all program information is available at any moment at runtime.
Memory is completly managed by the programmer.
It is strongly tiped and compiled language.

## Implementation details
The compiles is made using ANTLR v4 with C# target and it targets LLVM IR so it can be compiled for every hardware supported by LLVM and have debuging capabilities.

## Example
An example of the gramar can be found at the files test.def and test.decl.

## Suported IDE's
As to date none is supported but these are the future targets in order of priority:
- VisualCode
- Visual Studio

Started 23/12/2020
