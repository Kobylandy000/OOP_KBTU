package lab3.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Task4Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("=== Task 4: Employee & Manager ===");

        // Қызметкерлер жасау
        Employee e1 = new Employee("Бекзат", 500000, new Date(2020 - 1900, 0, 15), "NI001");
        Employee e2 = new Employee("Алма", 700000, new Date(2018 - 1900, 5, 1), "NI002");
        Employee e3 = new Employee("Дана", 600000, new Date(2019 - 1900, 3, 20), "NI003");

        System.out.println(e1);
        System.out.println(e2);

        // equals тесті
        Employee e1copy = new Employee("Бекзат", 500000, new Date(), "NI001");
        System.out.println("e1.equals(e1copy): " + e1.equals(e1copy));

        // clone тесті
        Employee cloned = e1.clone();
        System.out.println("Cloned: " + cloned);
        System.out.println("Same object? " + (e1 == cloned)); // false

        // Менеджер
        Manager m1 = new Manager("Ержан", 1200000, 200000);
        m1.addTeamMember(e1);
        m1.addTeamMember(e2);
        m1.addTeamMember(e3);
        System.out.println("\n" + m1);
        System.out.println("Team size: " + m1.getTeam().size());

        Manager m2 = new Manager("Сания", 1200000, 350000);

        // compareTo тесті — менеджерлердің жалақысы тең, бонус бойынша
        System.out.println("\nm1 vs m2 (salary equal, by bonus): " + m1.compareTo(m2));

        // Сорттау — жалақы бойынша (Comparable)
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        Collections.sort(employees);
        System.out.println("\nSorted by salary:");
        employees.forEach(System.out::println);

        // Сорттау — аты бойынша
        employees.sort(Employee.BY_NAME);
        System.out.println("\nSorted by name:");
        employees.forEach(System.out::println);

        // Сорттау — жалдану күні бойынша
        employees.sort(Employee.BY_HIRE_DATE);
        System.out.println("\nSorted by hire date:");
        employees.forEach(System.out::println);

        // Manager deep clone тесті
        Manager clonedManager = m1.clone();
        System.out.println("\nCloned manager: " + clonedManager);
        System.out.println("Team same? " + (m1.getTeam() == clonedManager.getTeam())); // false (deep)
    }
}
