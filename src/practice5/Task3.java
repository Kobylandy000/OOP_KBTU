package practice5;

public class Task3
{
    public static void main(String[] args)
    {
        int   i;
        int[] data = {50, 320, 97, 12, 2000};

        // Fix: use proper loop condition i < data.length
        // Before fix: loop ran i=0..10 and caught ArrayIndexOutOfBoundsException to stop
        // That is an inappropriate use — exceptions should not control program flow
        for (i = 0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }
        System.out.println("Done");
    }
}
