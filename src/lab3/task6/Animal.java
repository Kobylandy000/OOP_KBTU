package lab3.task6;

import java.io.Serializable;

public abstract class Animal implements Comparable<Animal>, Serializable, Feedable {
    private static final long serialVersionUID = 1L;

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

    @Override
    public void feed() {
        System.out.println(name + " is being fed");
    }

    @Override
    public void giveWater() {
        System.out.println(name + " is drinking water");
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}