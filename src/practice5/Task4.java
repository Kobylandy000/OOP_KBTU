package practice5;

import java.util.*;

public class Task4
{
    // StringTokenizer:
    //   Provides: splits a String into tokens based on delimiter characters.
    //   Example:  new StringTokenizer("5.3+9.2", "+-*/", true)
    //             → tokens: "5.3", "+", "9.2"
    //
    // Three parameters of the explicit-value constructor:
    //   1) String str          – the string to tokenize
    //   2) String delim        – delimiter characters (each char is a delimiter)
    //   3) boolean returnDelims – if true, delimiters are returned as tokens too
    //   Example: new StringTokenizer("10*3", "*", true) → "10", "*", "3"
    //
    // Test cases:
    //   "5.3+9.2" → Result: 14.5
    //   "5.3+"    → NoSuchElementException  (nextToken() called but no token left)
    //               output: "Invalid syntax"
    //   "5.3+a"   → NumberFormatException   ("a" cannot be parsed as double)
    //               output: "One or more operands is not a number"

    public static void main(String[] args)
    {
        String[] tests = {"5.3+9.2", "5.3+", "5.3+a"};

        for (String input : tests)
        {
            System.out.print("Input \"" + input + "\" → ");
            evaluate(input);
        }
    }

    static void evaluate(String input)
    {
        double          leftOperand, result, rightOperand;
        String          leftString, operator, rightString;
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(input, "+", true);

        try
        {
            leftString  = tokenizer.nextToken();
            operator    = tokenizer.nextToken();
            rightString = tokenizer.nextToken();    // "5.3+" → NoSuchElementException

            leftOperand  = Double.parseDouble(leftString);
            rightOperand = Double.parseDouble(rightString); // "a" → NumberFormatException

            if (operator.equals("+"))
                result = leftOperand + rightOperand;
            else
                result = 0.0;

            System.out.println("Result: " + result);
        }
        catch (NoSuchElementException nsee)
        {
            System.out.println("Invalid syntax");
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("One or more operands is not a number");
        }
    }
}
