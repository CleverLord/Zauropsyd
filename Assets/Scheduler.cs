using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.Linq;
using System.Globalization;
using System.Text.RegularExpressions;

public class Scheduler
{
    List<string[]> commands = new List<string[]>();
    static GameObject turtle;
    TurtleControl controller;
    List<int[]> loops = new List<int[]>();
    Dictionary<string, string[]> variables = new Dictionary<string, string[]>();
    Dictionary<string, List<string>> lists = new Dictionary<string, List<string>>();
    List<int[]> ifs = new List<int[]>();
    List<int> ifList = new List<int>();
    int testMode = 0;
    int ifMode = 0;
    List<int> completedEndIfs = new List<int>();
    string logger = "";
    List<string> errorList = new List<string>();
    void AddLoop(float times, int i)
    {
        //int instCount = Regex.Matches(body, ";").Count;
        int howMany = (int)times;
        logger += " | Adding a loop: " + howMany + " " + i + " | \n";
        loops.Add(new int[] { howMany, i, 1 });
    }

    float Par(string a)
    {
        return float.Parse(a, CultureInfo.InvariantCulture.NumberFormat);
    }

    bool compare(float a, float b, string c)
    {
        logger += " | " + a + " " + c + " " + b + " -> ";
        bool result = false;
        switch (c)
        {
            case "<":
                result = a < b;
                break;
            case "<=":
                result = a <= b;
                break;
            case ">":
                result = a > b;
                break;
            case ">=":
                result = a >= b;
                break;
            case "==":
                result = a == b;
                break;
            case "!=":
                result = a != b;
                break;
            default:
                logger += "DEFAULT!" + " | ";
                result = false;
                break;
        }
        logger += result.ToString() + " | \n";
        return result;
    }

    public void Execute()
    {

        if (PanelAnimator.hadError)// Je�li publiczna lista b��d�w zawiera jakiekolwiek pozycje
            return;
        string commandLog = "";
        for (int x = 0; x < commands.Count; x++)
        {
            commandLog += x + " | " + commands[x][0] + " " + commands[x][1] + "\n";
        }
        int ifCount = 0;
        if (!controller)
        {
            turtle = GameObject.Find("Turtle");
            controller = turtle.GetComponent<TurtleControl>();
        }
        for (int i = 0; i < commands.Count; i++)
        {
            string[] command = commands[i];
            string body = command[0];
            string value = command[1];
            if (loops.Count > 0)
            {
                testMode = loops[loops.Count - 1][2];
            } else
            {
                testMode = 0;
            }
            if (ifs.Count > 0)
            {
                //ifMode = ifs[ifs.Count - 1][1];
            } else
            {
                ifMode = 0;
            }
            //Debug.Log(i + " |" + body + "|" + value + "| Test Mode: " + testMode + " If Count: " + ifCount);
            switch (body)
            {
                case "FD":
                    if (testMode == 0 && ifCount == 0)
                    {
                        controller.Forward(Eval(value));
                        logger += " | " + body + " " + value + " | \n";
                    }
                    break;
                case "BK":
                    if (testMode == 0 && ifCount == 0)
                    {
                        controller.Backwards(Eval(value));
                        logger += " | " + body + " " + value + " | \n";
                    }
                    break;
                case "LT":
                    if (testMode == 0 && ifCount == 0)
                    {
                        controller.TurnLeft(Eval(value));
                        logger += " | " + body + " " + value + " | \n";
                    }
                    break;
                case "RT":
                    if (testMode == 0 && ifCount == 0)
                    {
                        controller.TurnRight(Eval(value));
                        logger += " | " + body + " " + value + " | \n";
                    }
                    break;
                case "IF":
                    if (testMode == 0)
                    {
                        if (ifCount == 0)
                        {
                            //ifs.Add(new int[] { i, 1 });
                            ifList.Add(i);
                            logger += " | Adding an IF statement on line " + i + " | \n";
                        }
                        ifCount++;
                    }
                    break;
                case "IF_END":
                    if (testMode == 0)
                    {
                        logger += " | Acknowledging and IF_END in line " + i + " with the current ifCount " + ifCount + " | \n";

                        if (completedEndIfs.Contains(i))
                        {
                            completedEndIfs.Remove(i);
                        } else if (ifList.Count > 0)
                        {
                            ifCount--;
                            if (ifCount == 0)
                            {
                                string[] stuff = value.Split('%');
                                //int instCount = Regex.Matches(stuff[1], ";").Count;
                                string left = "";
                                string comparator = "";
                                string right = "";
                                string comparators = "<=>!";
                                foreach (char ch in stuff[0])
                                {
                                    if (!comparators.Contains(ch))
                                    {
                                        if (comparator.Length == 0)
                                            left += ch;
                                        else
                                            right += ch;
                                    }
                                    else
                                    {
                                        comparator += ch;
                                    }
                                }
                                float leftValue = Eval(left);
                                float rightValue = Eval(right);
                                int oldI = i;
                                if (compare(leftValue, rightValue, comparator) == true) //&& ifs[ifs.Count - 1][1] == 1)
                                {
                                    i = ifList[ifList.Count - 1];
                                    //i = ifs[ifs.Count - 1][0];
                                    logger += " | true, coming back to line nr " + (i + 1) + " | \n";
                                }
                                else
                                {
                                    logger += " | false, continuing onto command nr " + (i + 1) + " | \n";
                                }
                                completedEndIfs.Add(oldI);
                                ifList.RemoveAt(ifList.Count - 1);
                                /*if (ifs[ifs.Count - 1][1] == 0) // If this If has already been completed
                                {
                                    completedEndIfs.Add(i);
                                    ifs.RemoveAt(ifs.Count - 1);
                                }
                                else
                                {
                                    ifs[ifs.Count - 1][1] = 0;
                                    Debug.Log("If Mode set to " + ifs[ifs.Count - 1][1]);
                                }*/
                            } else if (ifCount < 0)
                            {
                                errorList.Add("If endings error");
                            }
                        }
                        Debug.Log("IF ended");
                    }
                    break;
                case "REPEAT":
                    if (testMode == 0 && ifCount == 0)
                        AddLoop(Eval(value), i);
                    break;
                case "REPEAT_END":
                    if (ifCount == 0)
                    {
                        if (loops[loops.Count - 1][0] < 1)
                        {
                            loops.RemoveAt(loops.Count - 1);
                        }
                        else
                        {
                            loops[loops.Count - 1][2] = 0;
                            loops[loops.Count - 1][0]--;
                            i = loops[loops.Count - 1][1];
                        }
                    }
                    break;
                case "VAR":
                    string[] varContent = value.Split('%');
                    AddVariable(varContent[0], varContent[1]);
                    break;
                case "LST":
                    string[] lstContent = value.Split('%');
                    AddList(lstContent[0], lstContent[1]);
                    break;
                default:
                    Debug.Log("DEFAULT!");
                    break;
            }
        }
        Debug.Log(logger);
        Debug.Log(commandLog);
    }

    public void AddCommand(string command, string value)
    {
        commands.Add(new string[] { command, value });
    }

    public void AddVariable (string name, string value)
    {
        /*
         * VAR kitten 2;
         * VAR -> command
         * value -> kitten%2
         */

        bool isValueNumber = value.Any(x => !char.IsLetter(x));
        if (isValueNumber) // It's a number
        {
            string resultingValue = ParseMath(SplitIntoMath(value)).ToString();
            string[] result = new string[] { "num", resultingValue };
            if (!variables.ContainsKey(name))
            {
                variables.Add(name, result);
            }
        }
        else
        {
            string[] result = new string[] { "str", value };
            if (!variables.ContainsKey(name))
            {
                variables.Add(name, result);
            }
        }
    }

    public void AddList (string name, string content)
    {
        content = content.Replace("[", "");
        content = content.Replace("]", "");
        List<string> result = content.Split(',').ToList();
        if (!lists.ContainsKey(name))
        {
            lists.Add(name, result);
        } else
        {
            lists[name] = result;
        }
    }

    string Addition(string a, string b) {return (Par(a) + Par(b)).ToString(); }
    string Subtraction(string a, string b) {return (Par(a) - Par(b)).ToString(); }
    string Multiplication(string a, string b) { return (Par(a) * Par(b)).ToString(); }
    string Division(string a, string b) { return (Par(a) * Par(b)).ToString(); }

    float Eval(string input)
    {
        if (input[input.Length - 1] == '.')
        {
            input = input.Substring(0, input.Length - 1);
        }
        bool isValueText = input.Any(x => char.IsLetter(x));
        bool containsSQB = input.Contains("[") || input.Contains("]");
        // If the vaule contains a text then it's a reference to a variable, else it's a mathematical expression
        if (isValueText)
        {
            if (containsSQB)
            {
                string listName = "";
                string enumer = "";
                bool found = false;
                foreach (char ch in input)
                {
                    if (ch != '[' && ch != ']')
                    {
                        if (!found)
                            listName += ch;
                        else
                            enumer += ch;
                    }
                    else
                        found = true;
                }

                int i = int.Parse(enumer);

                return Par(lists[listName][i]);
            } else
                return Par(variables[input][1]);
        }
        else
        {
            return ParseMath(SplitIntoMath(input));
        }
    }

    float ParseMath(List<string> input)
    {
        string result = input[0];
        for (int i = 0; i < input.Count; i++) {
            switch (input[i])
            {
                case "+":
                    result = Addition(result, input[i + 1]);
                    break;
                case "-":
                    result = Subtraction(result, input[i + 1]);
                    break;
                case "*":
                    result = Multiplication(result, input[i + 1]);
                    break;
                case "/":
                    result = Division(result, input[i + 1]);
                    break;
                default:
                    break;
            }
        }
        return Par(result);
    }

    List<string> SplitIntoMath(string input)
    {
        string specialSymbols = "+-*/()";
        List<string> result = new List<string>();
        string word = "";
        foreach (char ch in input)
        {
            if (!specialSymbols.Contains(ch))
            {
                word += ch;
            } else
            {
                result.Add(word);
                result.Add(ch.ToString());
                word = "";
            }
        }
        if (word != "")
        {
            result.Add(word);
        }
        return result;
    }
}
