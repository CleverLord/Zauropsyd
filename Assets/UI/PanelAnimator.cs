using System.Collections;
using System.Collections.Generic;
using System.IO;
using Antlr4.Runtime;
using Antlr4.Runtime.Dfa;
using Antlr4.Runtime.Atn;
using Antlr4.Runtime.Sharpen;
using TMPro;
using UnityEngine;
using System;

public class MyErrorListener : BaseErrorListener
{
    public Action<string> OnError;
    public override void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
    {
        //Debug.Log("Error in parser at line " + ":" + e.OffendingToken.Column + e.OffendingToken.Line + e.Message);
        Debug.Log("ERROR: " + msg);
        OnError?.Invoke(msg);
    }

    public override void ReportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, bool exact, BitSet ambigAlts, ATNConfigSet configs)
    {
        //Debug.Log("Report ReportAmbiguity");
    }

    public override void ReportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, SimulatorState conflictState)
    {
        //Debug.Log("Report ReportAttemptingFullContext");
    }

    public override void ReportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, SimulatorState acceptState)
    {
        //Debug.Log("Report ReportContextSensitivity");
    }
}

public class PanelAnimator : MonoBehaviour
{
    public LTDescr descr;
    public bool isShown = true;
    public float x = 0;
    public TMP_Text text;
    public TMP_InputField codeInput;
    public TMP_InputField errorField;
    public bool goNegative = false;
    public static bool hadError = false;
    // Start is called before the first frame update
    IEnumerator Start()
    {
        yield return new WaitForEndOfFrame();
        x = GetComponent<RectTransform>().rect.width / 2;
    }

    // Update is called once per frame
    void Update(){}
    public void onErrorFound(string s)
    {
        errorField.text = "<color=#FF0000>" + s + "</color>";
        hadError = true;
    }

    public void Compile()
    {
        Scheduler scheduler = new Scheduler();
        AntlrInputStream antlerStream = new AntlrInputStream(codeInput.text);
        LogoLexer lexer = new LogoLexer(antlerStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LogoParser parser = new LogoParser(tokenStream);
        MyErrorListener listener = new MyErrorListener();
        listener.OnError += onErrorFound;
        parser.AddErrorListener(listener);
        parser.starter();
    }

    public void onTogglePanelButton()
    {
        bool localIsShown = isShown;
        if (goNegative) localIsShown = !localIsShown;

        if (localIsShown)
        {
            hidePanel();
            text.text = ">";
        }
        else
        {
            showPanel();
            text.text = "<";
        }
        isShown = !isShown;
    }

    void hidePanel()
    {
        if (descr != null)
            LeanTween.cancel(descr.id);
        descr = this.transform.LeanMoveLocalX(-x, 0.5f).setOnComplete(() => descr = null);
    }

    void showPanel()
    {
        if (descr != null)
            LeanTween.cancel(descr.id);
        descr = this.transform.LeanMoveLocalX(x, 0.5f).setOnComplete(() => descr = null);
    }
}