package lab3.task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ========== 1. PERSON ТЕКСЕРУ ==========
        System.out.println("1. PERSON КЛАСЫ:");
        System.out.println("   - Implements: Comparable, Serializable, Workable\n");

        Person p1 = new Person("Asan", 25, "Asan Ussenov", 3.8);
        Person p2 = new Person("Ussen", 30, "Ussen Asanov", 3.5);
        Person p3 = new Person("Marat", 20, "Marat Nurbekov", 3.9);

        Person[] people = {p1, p2, p3};

        System.out.println("   Comparable (GPA бойынша салыстыру):");
        System.out.println("   " + p1.fullName + " (" + p1.gpa + ") vs " + p2.fullName + " (" + p2.gpa + "): " + p1.compareTo(p2));
        System.out.println("   " + p2.fullName + " (" + p2.gpa + ") vs " + p3.fullName + " (" + p3.gpa + "): " + p2.compareTo(p3));

        System.out.println("\n   Сұрыптау (GPA бойынша):");
        System.out.print("      Алдында: ");
        for (Person p : people) {
            System.out.print(p.fullName + "(" + p.gpa + ") ");
        }

        Arrays.sort(people);

        System.out.print("\n      Кейін: ");
        for (Person p : people) {
            System.out.print(p.fullName + "(" + p.gpa + ") ");
        }

        System.out.println("\n\n   Workable интерфейсі:");
        p1.work();
        p1.takeBreak();
        p1.processPayment();
        p1.move();

        // ========== 2. ANIMAL ТЕКСЕРУ ==========
        System.out.println("\n2. ANIMAL КЛАСЫ:");
        System.out.println("   - Implements: Comparable, Serializable, Feedable\n");

        Animal a1 = new Animal("Tobik", 5) {
            @Override
            public void move() {
                System.out.println(name + " is running");
            }
        };

        Animal a2 = new Animal("Murka", 3) {
            @Override
            public void move() {
                System.out.println(name + " is jumping");
            }
        };

        Animal a3 = new Animal("Burenka", 7) {
            @Override
            public void move() {
                System.out.println(name + " is walking");
            }
        };

        Animal[] animals = {a1, a2, a3};

        System.out.println("   Comparable (жасы бойынша салыстыру):");
        System.out.println("   " + a1.name + " (" + a1.age + ") vs " + a2.name + " (" + a2.age + "): " + a1.compareTo(a2));
        System.out.println("   " + a2.name + " (" + a2.age + ") vs " + a3.name + " (" + a3.age + "): " + a2.compareTo(a3));

        System.out.println("\n   Сұрыптау (жасы бойынша):");
        System.out.print("      Алдында: ");
        for (Animal a : animals) {
            System.out.print(a.name + "(" + a.age + ") ");
        }

        Arrays.sort(animals);

        System.out.print("\n      Кейін: ");
        for (Animal a : animals) {
            System.out.print(a.name + "(" + a.age + ") ");
        }

        System.out.println("\n\n   Feedable интерфейсі:");
        a1.feed();
        a1.giveWater();

        System.out.println("\n   Animal методтары:");
        a1.breathe();
        a1.eat();
        a1.move();
    }
}