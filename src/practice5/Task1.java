package practice5;

public class Task1
{
    public static void main(String[] args)
    {
        int denominator, numerator, ratio;

        numerator   = 5;
        denominator = 0; // Step 3: changed to 0 to trigger exception

        try
        {
            ratio = numerator / denominator;          // Step 5: only this line in try
            System.out.println("The answer is: " + ratio); // Step 6: moved into try
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by 0.");       // Step 7
            e.printStackTrace();                      // Step 8
        }

        System.out.println("Done."); // Don't move this line
    }
}
