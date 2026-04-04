package practice5;

import java.util.*;

public class Task5
{
    public static void main(String[] args)
    {
        String line = "45.0+4.1   3.2*9.1   10.0-2.5   8.0/4.0   8.0/0.0   5.3+   b+9.2   5.3+a";
        System.out.println("Input: \"" + line + "\"\n");

        // Split the line by whitespace → individual expressions
        String[] expressions = line.trim().split("\\s+");

        for (String expr : expressions)
        {
            System.out.print("  \"" + expr + "\"  →  ");
            evaluate(expr);
        }
    }

    static void evaluate(String expression)
    {
        double          leftOperand, rightOperand, result;
        String          leftString, operator, rightString;
        StringTokenizer tokenizer;

        tokenizer = new StringTokenizer(expression, "+-*/", true);

        try
        {
            leftString  = tokenizer.nextToken();
            operator    = tokenizer.nextToken();
            rightString = tokenizer.nextToken(); // missing → NoSuchElementException

            // Nested try-catch: identify which operand is not a number
            try
            {
                leftOperand = Double.parseDouble(leftString);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Left operand '" + leftString + "' is not a number.");
                return;
            }

            try
            {
                rightOperand = Double.parseDouble(rightString);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Right operand '" + rightString + "' is not a number.");
                return;
            }

            switch (operator)
            {
                case "+":
                    result = leftOperand + rightOperand;
                    System.out.println(leftOperand + " + " + rightOperand + " = " + result);
                    break;
                case "-":
                    result = leftOperand - rightOperand;
                    System.out.println(leftOperand + " - " + rightOperand + " = " + result);
                    break;
                case "*":
                    result = leftOperand * rightOperand;
                    System.out.println(leftOperand + " * " + rightOperand + " = " + result);
                    break;
                case "/":
                    if (rightOperand == 0)
                        System.out.println("Error: division by zero.");
                    else
                    {
                        result = leftOperand / rightOperand;
                        System.out.println(leftOperand + " / " + rightOperand + " = " + result);
                    }
                    break;
                default:
                    System.out.println("Unknown operator: '" + operator + "'");
            }
        }
        catch (NoSuchElementException nsee)
        {
            System.out.println("Invalid syntax — missing operand or operator.");
        }
    }
}
