package practice5;

import java.util.*;

public class Task4
{
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
            rightString = tokenizer.nextToken();

            leftOperand  = Double.parseDouble(leftString);
            rightOperand = Double.parseDouble(rightString);

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
