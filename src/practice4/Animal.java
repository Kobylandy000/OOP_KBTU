package practice4;

public abstract class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breathe() {
        System.out.println(name + " is breathing");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract void move();
}