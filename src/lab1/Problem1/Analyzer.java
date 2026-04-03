package lab1.Problem1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Data data = new Data();

        while(true) {
            System.out.println("Enter your number! (Type Q to quit): ");

            if (scanner.hasNextDouble()){
                double number = scanner.nextDouble();
                data.addValue(number);
            }else{
                String s = scanner.next();
                if(s.equalsIgnoreCase("Q")) {
                    System.out.println("Average is: " + data.getAverage());
                    System.out.println("Maximum is: " + data.getMaximum());
                    break;
                }
                System.out.println("Error! Please Enter a number or Q");
            }
        }
    }
}