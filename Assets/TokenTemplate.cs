using System;
using System.Collections;
using System.Collections.Generic;
using System.Net.Http.Headers;
using System.Transactions;
using UnityEditor.Tilemaps;
using UnityEngine;

[System.Serializable]
public class TokenTemplate {
	public string name;
	public string value;
	public Color color;
}

[System.Serializable]
public class Token {
	[NonSerialized] public TokenTemplate ref_to_tokenTemplate;
	public bool isAlive = true;

	public virtual bool isComplete()
	{
		return ref_to_tokenTemplate.value.Length == value.Length;
	}

	public string name;
	public string value; //collected characters

	public Token(TokenTemplate tokenTemplate)
	{
		ref_to_tokenTemplate = tokenTemplate;
		value = "";
		name = tokenTemplate.name;
	}

	public virtual void AbsorbCharacter(char c)
	{
		value += c;
		//protection against out of range
		if (value.Length > ref_to_tokenTemplate.value.Length)
		{
			isAlive = false;
			return;
		}
		if (ref_to_tokenTemplate.value[value.Length - 1] != c)
			isAlive = false;
	}

	public virtual void Revive()
	{
		value = value.Substring(0, value.Length - 1);

		//unsafe
		// isAlive = true;

		//safe
		isAlive = (value == ref_to_tokenTemplate.value);
		if (!isAlive)
			Debug.LogError("Token revive failed");
	}

	public string toHTML()
	{
		return "<color=" + colorToHex(ref_to_tokenTemplate.color) + ">" + value + "</color>";
	}

	private string colorToHex(Color c)
	{
		Color32 color32 = c;
		return "#" + color32.r.ToString("X2") + color32.g.ToString("X2") + color32.b.ToString("X2");
	}
}

public class PhaseToken : Token {
	public int phase; // ex. 0 - before dot, 1 - after dot; for float

	public PhaseToken(TokenTemplate tokenTemplate) : base(tokenTemplate)
	{
	}

	public override void Revive()
	{
		value = value.Substring(0, value.Length - 1);
		isAlive = true;
	}
}

public class IntToken : PhaseToken {
	public IntToken(TokenTemplate tokenTemplate) : base(tokenTemplate)
	{
	}

	public override void AbsorbCharacter(char c)
	{
		value += c;
		if (!char.IsDigit(c))
			isAlive = false;
	}

	public override bool isComplete()
	{
		return value.Length > 0;
	}
}

public class StringToken : PhaseToken {
	public StringToken(TokenTemplate tokenTemplate) : base(tokenTemplate)
	{
	}

	public override void AbsorbCharacter(char c)
	{
		value += c;
		if (c == '\n')
		{
			isAlive = false;
			return;
		}

		if (phase == 0) //before anything
		{
			if (c != '"')
				isAlive = false;
			else
				phase = 1;
		}
		else if (phase == 1) //after "
		{
			if (c == '"')
				phase = 2;
		}
		else if (phase == 2) //after second "
		{
			isAlive = false;
		}
	}

	public override bool isComplete()
	{
		return phase == 2;
	}
}

public class FloatToken : PhaseToken {
	public FloatToken(TokenTemplate tokenTemplate) : base(tokenTemplate)
	{
	}

	public override void AbsorbCharacter(char c)
	{
		value += c;
		if (phase == 0) //before anything
		{
			if (!char.IsDigit(c))
				isAlive = false;
			else
				phase = 1;
		}
		else if (phase == 1) //first digit entered
		{
			if (!char.IsDigit(c) && c != '.')
				isAlive = false;
			else if (c == '.')
				phase = 2;
		}
		else if (phase == 2) //ends with dot
		{
			if (!char.IsDigit(c))
				isAlive = false;
			else
				phase = 3;
		}
		if (phase == 3) //after digits after dot
		{
			if(!char.IsDigit(c))
				isAlive = false;
		}
	}

	public override bool isComplete()
	{
		return phase == 3;
	}
}

public class IdentifierToken : PhaseToken {
	public IdentifierToken(TokenTemplate tokenTemplate) : base(tokenTemplate)
	{
		
	}
	public override void AbsorbCharacter(char c)
	{
		value += c;
		if (!char.IsLetterOrDigit(c))
		{
			isAlive = false;
			return;
		}

		if (phase == 0) //before anything
		{
			//first character must be letter
			if (!char.IsLetter(c))
				isAlive = false;
			else
				phase = 1;
		}
	}

	public override bool isComplete()
	{
		return phase == 1;
	}
}