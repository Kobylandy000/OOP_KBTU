package lab3.task6;

import java.util.Arrays;

/**
 * TASK 6: Person және Pet жетілдірулерін тексеру
 */
public class PersonPetDemo {
    public static void main(String[] args) {
        System.out.println("=== Task 6: Жетілдірілген Person & Pet ===\n");

        // Person тесті
        Person p1 = new Person("Бекзат", 22);
        Person p2 = new Person("Алма", 25);
        Person p3 = new Person("", -5); // жарамсыз

        System.out.println("--- Describable ---");
        p1.printDescription();
        p2.printDescription();

        System.out.println("\n--- Validatable ---");
        p1.printValidationStatus();
        p3.printValidationStatus();

        System.out.println("\n--- Comparable (sort by name) ---");
        Person[] people = {p2, p1, new Person("Дана", 30)};
        Arrays.sort(people);
        for (Person p : people) System.out.println(p);

        // Pet тесті
        System.out.println("\n--- Pet ---");
        Pet pet1 = new Pet("Барсик", "cat", 3, p1);
        Pet pet2 = new Pet("Арман", "dog", 5, p2);
        Pet pet3 = new Pet("", "unknown", -1, null); // жарамсыз

        pet1.printDescription();
        pet2.printDescription();

        System.out.println("\n--- Pet Validatable ---");
        pet1.printValidationStatus();
        pet3.printValidationStatus();

        System.out.println("\n--- Pet Comparable (sort by name) ---");
        Pet[] pets = {pet1, pet2, new Pet("Жұлдыз", "parrot", 2, p2)};
        Arrays.sort(pets);
        for (Pet pet : pets) System.out.println(pet);
    }
}
