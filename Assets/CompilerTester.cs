using System.Collections;
using System.Collections.Generic;
using Antlr4.Runtime;
using UnityEngine;


    public class CompilerTester : MonoBehaviour
{
    // Start is called before the first frame update
    IEnumerator Start ()
    {
        yield return new WaitForEndOfFrame();
        yield return new WaitForEndOfFrame();
        yield return new WaitForEndOfFrame();
        IoIo();
    }
    void IoIo()
    {
        Scheduler scheduler = new Scheduler();
        AntlrInputStream antlerStream = new AntlrInputStream("IF [2 < 1] [FD 1;];");
        //AntlrInputStream antlerStream = new AntlrInputStream("FD 1.2; LT 20; FD 1.2; LT 20; FD 1.2;");
        //AntlrInputStream antlerStream = new AntlrInputStream("FD 100; RT 20; FD 100; RT 20; FD 100;");
        LogoLexer lexer = new LogoLexer(antlerStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        //IError
        LogoParser parser = new LogoParser(tokenStream);
        Debug.Log(tokenStream);
        MyErrorListener listener = new MyErrorListener();
        parser.AddErrorListener(listener);
        parser.starter();
    }
    void Kuku()
    {
        TurtleCompiler compiler = new TurtleCompiler();
        AntlrInputStream antlerStream = new AntlrInputStream("LT 90; FD 1.20;");
        //AntlrInputStream antlerStream = new AntlrInputStream("FD 100; RT 20; FD 100; RT 20; FD 100;");
        LogoLexer lexer = new LogoLexer(antlerStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LogoParser parser = new LogoParser(tokenStream);
        parser.starter();
    }
    // Update is called once per frame
    void Fufu()
    {
        TurtleCompiler compiler = new TurtleCompiler();
        AntlrInputStream antlerStream = new AntlrInputStream("FD 1.20;");
        //AntlrInputStream antlerStream = new AntlrInputStream("FD 100; RT 20; FD 100; RT 20; FD 100;");
        LogoLexer lexer = new LogoLexer(antlerStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LogoParser parser = new LogoParser(tokenStream);
        parser.starter();
    }
}
