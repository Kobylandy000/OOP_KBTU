package lab1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.println("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.println("Enter coefficient c: ");
        double c = sc.nextDouble();

        double D = Math.pow(b, 2) - (4 * a * c);
        if (D < 0){
            System.out.println(" D is less than 0");
        }else{
            System.out.println("x1 is: " + (-b + Math.sqrt(D) ) / (2 * a));
            System.out.println("x2 is: " + (-b - Math.sqrt(D) ) / (2 * a));
        }
    }
}
