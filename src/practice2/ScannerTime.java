package practice2;

import java.util.Scanner;

public class ScannerTime {

    public static Time scanTime() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minute: ");
        int minute = sc.nextInt();

        System.out.print("Enter second: ");
        int second = sc.nextInt();

        return new Time(hour, minute, second);
    }
}