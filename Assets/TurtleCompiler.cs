using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System;
using Antlr4.Runtime;
using Antlr4.Runtime.Misc;

public class TurtleCompiler
{
    static GameObject turtle;
    //[SerializeField] TurtleControl controller;
    TurtleControl controller;
    public TurtleCompiler()
    {

    }

    public void Move(string command, string value)
    {
        if (!controller)
        {
            turtle = GameObject.Find("Turtle");
            controller = turtle.GetComponent<TurtleControl>();
        }
        Debug.Log(turtle.name);
        Debug.Log(command);
        Debug.Log(value);
        switch (command)
        {
            case "FD":
                controller.Forward(float.Parse(value));
                break;
            case "BK":
                controller.Backwards(float.Parse(value));
                break;
            case "LT":
                controller.TurnLeft(float.Parse(value));
                break;
            case "RT":
                controller.TurnRight(float.Parse(value));
                break;
            default:
                Debug.Log("DEFAULT!");
                break;
        }
    }

    /* public static TortoiseProgram Compile(string source)
    {
        AntlrInputStream antlerStream = new AntlrInputStream(source);
        LogoLexer lexer = new LogoLexer(antlerStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LogoParser parser = new LogoParser(tokenStream);

        parser.prog(); // <-- compile actually happens here (see Assets/Grammars/Tortoise/Tortoise.g4

        TurtleCompiler compiler = parser.Compiler;
        TortoiseProgram program = new TortoiseProgram(compiler.Commands);

        return program;
    } */
}
