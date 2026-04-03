package lab3.task6;

import lab3.task4.Employee;
import lab3.task5.Chocolate;
import lab3.task5.Sort;
import lab3.task5.Time;

import java.util.Date;

/**
 * TASK 6: Test класы — Sort класының Chocolate, Time, Employee үшін жұмысын тексеру
 */
public class Task6Test {
    public static void main(String[] args) {

        // =================== CHOCOLATE ===================
        System.out.println("========== Chocolate (Bubble Sort) ==========");
        Chocolate[] chocolates = {
            new Chocolate("Twix",       58.0),
            new Chocolate("Snickers",   50.0),
            new Chocolate("KitKat",     45.0),
            new Chocolate("Bounty",     57.0),
            new Chocolate("Mars",       51.0)
        };

        System.out.print("Before: ");
        Sort.printArray(chocolates);

        Sort.bubbleSort(chocolates);

        System.out.print("After BubbleSort (by weight): ");
        Sort.printArray(chocolates);

        // =================== TIME ===================
        System.out.println("\n========== Time (Merge Sort) ==========");
        Time[] times = {
            new Time(14, 30, 0),
            new Time(8,  15, 45),
            new Time(23, 59, 59),
            new Time(0,  0,  1),
            new Time(12, 0,  0)
        };

        System.out.print("Before: ");
        Sort.printArray(times);

        Sort.mergeSort(times);

        System.out.print("After MergeSort (by time): ");
        Sort.printArray(times);

        // =================== EMPLOYEE ===================
        System.out.println("\n========== Employee (Bubble Sort — by salary) ==========");
        Employee[] employees = {
            new Employee("Ержан",   750000, new Date(2021 - 1900, 2, 10), "NI005"),
            new Employee("Алма",    500000, new Date(2019 - 1900, 6, 1),  "NI006"),
            new Employee("Бекзат",  900000, new Date(2017 - 1900, 0, 15), "NI007"),
            new Employee("Дана",    600000, new Date(2020 - 1900, 11, 5), "NI008"),
            new Employee("Сания",   450000, new Date(2022 - 1900, 4, 20), "NI009")
        };

        System.out.print("Before: ");
        Sort.printArray(employees);

        Sort.bubbleSort(employees);

        System.out.print("After BubbleSort (by salary): ");
        Sort.printArray(employees);

        System.out.println("\n--- Employee MergeSort by name ---");
        // Comparable<Employee> бойынша емес, comparator бойынша сорттау үшін
        // Employee BY_NAME comparator-ын қолданамыз (lambda арқылы массивті сорттаймыз)
        java.util.Arrays.sort(employees, Employee.BY_NAME);
        System.out.print("After sort by name: ");
        Sort.printArray(employees);

        System.out.println("\n--- Employee sort by hire date ---");
        java.util.Arrays.sort(employees, Employee.BY_HIRE_DATE);
        System.out.print("After sort by hire date: ");
        Sort.printArray(employees);

        // =================== SWAP тесті ===================
        System.out.println("\n========== swap() test ==========");
        Integer[] nums = {5, 3, 8, 1, 9, 2};
        System.out.print("Before swap(0,5): ");
        Sort.printArray(nums);
        Sort.swap(nums, 0, 5);
        System.out.print("After  swap(0,5): ");
        Sort.printArray(nums);

        Sort.bubbleSort(nums);
        System.out.print("BubbleSort ints:  ");
        Sort.printArray(nums);
    }
}
