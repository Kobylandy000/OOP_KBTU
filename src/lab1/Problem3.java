package lab1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if(n > 100.0){
            System.out.println("Wrong number!");
        }else if (n >= 94.5){
            System.out.println("A");
        }else if(n >= 89.5){
            System.out.println("A-");
        }else if (n >= 84.5){
            System.out.println("B+");
        }else if (n >= 79.5){
            System.out.println("B");
        }else if(n >=74.5){
            System.out.println("B-");
        }else if(n >= 69.5){
            System.out.println("C+");
        }else if(n >= 64.5){
            System.out.println("C");
        }else if (n >= 59.5){
            System.out.println("C-");
        }else if(n >= 54.5){
            System.out.println("D+");
        }else if(n >= 49.5){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
