using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using UnityEngine;

[System.Serializable]
public class Scanner {
	public static List<Token> Scan(string s)
	{
		List<Token> tokens = new List<Token>();
		Scanner scanner = new Scanner();
		s += "\n";
		foreach (char c in s)
		{
			Token t = scanner.feed(c);
			if (t != null)
				tokens.Add(t);
		}
		return tokens;
	}

	//-------------------------------------------------------------------------------------------------//
	public string loadedCharacters = "";
	public static List<Token> liveTokens = new List<Token>();

	public List<Token> ScanWithThisScanner(string s)
	{
		List<Token> tokens = new List<Token>();
		s += "\n";
		foreach (char c in s)
		{
			Token t = feed(c);
			if (t != null)
				tokens.Add(t);
		}
		return tokens;
	}

	public Scanner()
	{
	}

	private Token feed(char c)
	{
		//Debug purposes
		loadedCharacters += c;

		//startup phase
		if (liveTokens.Count == 0)
			LoadTokens();

		//find the first token that matches the current character set
		Token completeToken = liveTokens.FirstOrDefault(t => t.isComplete());

		//feed the character
		foreach (Token token in liveTokens)
			token.AbsorbCharacter(c);

		//remove dead tokens
		liveTokens = liveTokens.Where(t => t.isAlive).ToList();
		
		if (liveTokens.Count == 0 && completeToken != null)
		{
			//New token has started. ex. "3<"
			//or last has just finished ex. "<4"
			//undo the last character
			completeToken.Revive(); //convert ex "<4" to "<"
			//since revive undos the last character, we need to kick it from loadedCharacters
			loadedCharacters = loadedCharacters.Substring(0, loadedCharacters.Length - 1);
			//and push the character (ex. '4') to the new scan
			feed(c);
			//return last valid token
			return completeToken;
		}
		return null;
	}

	public void LoadTokens()
	{
		foreach (TokenTemplate tt in UI_Controller.instance.tokenDatabase.tokenTemplates)
		{
			Token t = new Token(tt);
			liveTokens.Add(t);
		}
		Token ts = new StringToken(UI_Controller.instance.stringTemplate);
		liveTokens.Add(ts);
		Token ti= new IntToken(UI_Controller.instance.integerTemplate);
		liveTokens.Add(ti);
		Token tf = new FloatToken(UI_Controller.instance.floatTemplate);
		liveTokens.Add(tf);
		Token tid = new IdentifierToken(UI_Controller.instance.identifierTemplate);
		liveTokens.Add(tid);
	}
}