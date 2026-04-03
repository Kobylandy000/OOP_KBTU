package lab3.task5;

import lab3.task4.Employee;  // Employee 4-тапсырмадан
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // 1. Chocolate
        System.out.println("1. Chocolate сұрыптау:");
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers", 75.0),
                new Chocolate("Mars", 45.0)
        };

        System.out.print("   Алдында: ");
        for (Chocolate c : chocolates) System.out.print(c + " ");

        Sort.bubbleSort(chocolates);

        System.out.print("\n   Кейін: ");
        for (Chocolate c : chocolates) System.out.print(c + " ");
        System.out.println("\n");

        // 2. Time
        System.out.println("2. Time сұрыптау:");
        Time[] times = {
                new Time(14, 30, 0),
                new Time(9, 15, 30),
                new Time(9, 15, 15)
        };

        System.out.print("   Алдында: ");
        for (Time t : times) System.out.print(t + " ");

        Sort.bubbleSort(times);

        System.out.print("\n   Кейін: ");
        for (Time t : times) System.out.print(t + " ");
        System.out.println("\n");

        // 3. Employee
        System.out.println("3. Employee сұрыптау:");
        Employee[] employees = {
                new Employee("Asan", 500000, new Date(2020,0,1), "001"),
                new Employee("Ussen", 800000, new Date(2021,0,1), "002"),
                new Employee("Marat", 600000, new Date(2022,0,1), "003")
        };

        System.out.print("   Алдында: ");
        for (Employee e : employees) System.out.print(e.getName() + "($" + e.salary + ") ");

        Sort.bubbleSort(employees);

        System.out.print("\n   Кейін: ");
        for (Employee e : employees) System.out.print(e.getName() + "($" + e.salary + ") ");
        System.out.println("\n");

    }
}
