package practice4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. CanHavePizza - polymorphism
        System.out.println("===== CanHavePizza =====");
        CanHavePizza eater1 = new Cat("Whiskers", 3);
        CanHavePizza eater2 = new Student("ali", 20, "Ali Bekov", 3.8, "S001");
        eater1.eatPizza();
        eater2.eatPizza();

        // 2. Restaurant - instanceof
        System.out.println("\n===== Restaurant =====");
        Restaurant delpapa = new Restaurant("Del Papa");
        delpapa.servePizza(new Cat("Tom", 2));
        delpapa.servePizza(new Student("aisha", 21, "Aisha Nurova", 3.5, "S002"));

        // 3. PowerSocket - Pluggable
        System.out.println("\n===== PowerSocket =====");
        PowerSocket socket = new PowerSocket();
        socket.charge(new IPhone(999.99));

        // 4. Games - App statistics
        System.out.println("\n===== Games =====");
        App app = new App();
        app.getStatistics(new MemoryGame());
        app.getStatistics(new LogicGame());

        // 5. Sorting with Comparators
        System.out.println("\n===== Sorting Students =====");
        List<Student> students = new ArrayList<>();
        students.add(new Student("zara", 20, "Zara Akhmet", 3.2, "S003"));
        students.add(new Student("beka", 21, "Beka Seiit", 3.9, "S004"));
        students.add(new Student("dana", 19, "Dana Nurlan", 3.5, "S005"));

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name:");
        for (Student s : students) {
            System.out.println("  " + s);
        }

        Collections.sort(students, new GpaComparator());
        System.out.println("Sorted by GPA:");
        for (Student s : students) {
            System.out.println("  " + s);
        }

        // 6. Counting Sort
        System.out.println("\n===== Counting Sort =====");
        int[] arr = {1, 2, 3, 4, 1, 1, 4, 5, 2, 1};
        System.out.println("Before: " + Arrays.toString(arr));
        int[] sorted = CountingSort.sort(arr, 5);
        System.out.println("After:  " + Arrays.toString(sorted));
    }
}