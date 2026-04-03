package practice1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side length of the square: ");
        double a = sc.nextDouble();

        double area = a*a;
        double perimeter = a * 4;
        double diagonal = a * Math.sqrt(2);
        System.out.println("Area of the square is: " + area);
        System.out.println("Perimeter of the square is: " + perimeter);
        System.out.println("Length diagonal of the square is: " + diagonal);
    }
}
