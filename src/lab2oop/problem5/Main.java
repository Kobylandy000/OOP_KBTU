package lab2oop.problem5;

public class Main {
    public static void main(String[] args) {

        Person john = new Employee("John",30,"Engineer");
        Person alice = new PhdStudent("Alice",26,"CS","AI");

        Animal murka = new Cat("Murka",5);
        Animal dog = new Dog("Aktos", 2);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();

        registry.addPerson(john);
        registry.addPerson(alice);

        john.leavePetWith(alice);

        System.out.println(registry);

        john.retrievePetFrom(alice);

        System.out.println(registry);

        alice.assignPet(dog);
    }
}