package practice3.problem1;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal("Lion", 100);
        Animal a2 = new Cat("Murka", 10,"white");
        Cat a3 = new Cat("Belka", 15, "black");

        a2.eat();
        System.out.println(a2.toString());
        a3.makeSound();
        a1.makeSound();
        a3.makeSound(3);
    }
}
