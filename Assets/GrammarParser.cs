using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

public class GrammarParser : MonoBehaviour
{
	public string Name = "world";

	void Start()
	{
		AntlrInputStream antlerStream = new AntlrInputStream("logo " + Name);
		LogoLexer lexer = new LogoLexer(antlerStream);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		LogoParser parser = new LogoParser(tokenStream);

		parser.starter();
	}
}
