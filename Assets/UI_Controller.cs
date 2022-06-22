using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography.X509Certificates;
using System.Threading;
using TMPro;
using UnityEngine;

public class UI_Controller : MonoBehaviour {
	public TokenDatabase tokenDatabase;
	public static UI_Controller instance;

	public TMP_InputField code_in_field;
	public TMP_InputField code_out_field;

	public List<string> old_code_lines = new List<string>();
	public List<TokenList> tokens_for_each_line = new List<TokenList>();
	// Start is called before the first frame update

	public TokenTemplate stringTemplate;
	public TokenTemplate integerTemplate;
	public TokenTemplate floatTemplate;
	public TokenTemplate identifierTemplate;

	public bool redraw = false;
	void Awake()
	{
		instance = this;
	}

	void Update()
	{
		if (redraw){
			ShowColoredText();
			redraw = false;
			
		}
	}
	Thread thread;
	public void On_code_in_changed_ThreadStarter()
	{
		if (thread != null)
			thread.Abort();
		
		thread = new Thread(On_code_in_changed);
		thread.Start();
	}

	public void On_code_in_changed()
	{
		List<string> new_code_lines = code_in_field.text.Split('\n').ToList();
		List<int> lines_location = new_code_lines.Select(line => old_code_lines.IndexOf(line)).ToList();
		TokenList[] new_tokens_for_each_line = new TokenList[new_code_lines.Count];
		for (int i = 0; i < lines_location.Count; i++)
		{
			if (lines_location[i] != -1)
				new_tokens_for_each_line[i] = tokens_for_each_line[lines_location[i]];
			else
				new_tokens_for_each_line[i] = getTokensForLine(new_code_lines[i]);
		}
		tokens_for_each_line = new_tokens_for_each_line.ToList();
		old_code_lines = new_code_lines;
		redraw = true;
		thread = null;
	}

	public void ShowColoredText()
	{
		code_out_field.text = "";
		foreach (var tokenList in tokens_for_each_line)
		{
			foreach (var token in tokenList.tokens)
			{
				code_out_field.text += token.toHTML();
			}
			code_out_field.text += "\n";
		}
	}

	TokenList getTokensForLine(string line)
	{
		Scanner scanner = new Scanner();
		return new TokenList(scanner.ScanWithThisScanner(line), scanner);
	}
}

[System.Serializable]
public class TokenList {
	public Scanner scannerUsedToScanThisList;
	public List<Token> tokens;
	
	public TokenList(List<Token> tokens, Scanner scannerUsedToScanThisList = null)
	{
		this.tokens = tokens;
		this.scannerUsedToScanThisList = scannerUsedToScanThisList;
	}
}