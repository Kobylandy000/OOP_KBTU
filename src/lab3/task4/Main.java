package lab3.task4;

import java.util.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Date ескерту: month 0-11 (0 = January)
        Date d1 = new Date(2020, 0, 1);
        Date d2 = new Date(2021, 0, 1);
        Date d3 = new Date(2022, 0, 1);

        // Объекттерді жасау
        Employee e1 = new Employee("Asan", 500000, d1, "INS001");
        Employee e2 = new Employee("Ussen", 600000, d2, "INS002");
        Manager m1 = new Manager("Marat", 800000, d3, "INS003", 100000);

        // Manager-ге команда қосу
        m1.addToTeam(e1);
        m1.addToTeam(e2);

        System.out.println("=== 1. toString() тексеру ===");
        System.out.println("e1: " + e1);
        System.out.println("e2: " + e2);
        System.out.println("m1: " + m1);

        System.out.println("\n=== 2. equals() тексеру ===");
        Employee e3 = new Employee("Asan", 500000, d1, "INS001");
        System.out.println("e1 equals e3: " + e1.equals(e3));
        System.out.println("e1 equals e2: " + e1.equals(e2));

        System.out.println("\n=== 3. Comparable тексеру (salary бойынша) ===");
        System.out.println("e1 < e2: " + (e1.compareTo(e2) < 0));
        System.out.println("e2 < m1: " + (e2.compareTo(m1) < 0));

        System.out.println("\n=== 4. NameComparator тексеру ===");
        Employee[] employees = {e2, e1, m1};
        Arrays.sort(employees, new NameComparator());
        for (Employee e : employees) {
            System.out.println("  " + e.name);
        }

        System.out.println("\n=== 5. HireDateComparator тексеру ===");
        Arrays.sort(employees, new HireDateComparator());
        for (Employee e : employees) {
            System.out.println("  " + e.name + " - " + e.hireDate.getYear());
        }

        System.out.println("\n=== 6. clone() тексеру ===");
        Employee e1Clone = e1.clone();
        System.out.println("Original: " + e1);
        System.out.println("Clone: " + e1Clone);
        System.out.println("Бірдей объект пе? " + (e1 == e1Clone));

        Manager m1Clone = m1.clone();
        System.out.println("Manager Original: " + m1);
        System.out.println("Manager Clone: " + m1Clone);
    }
}
