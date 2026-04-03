package lab3.task6;

import java.io.Serializable;

public class Person extends Animal implements Serializable, Workable {
    private static final long serialVersionUID = 1L;

    String fullName;
    double gpa;

    public Person(String name, int age, String fullName, double gpa) {
        super(name, age);
        this.fullName = fullName;
        this.gpa = gpa;
    }

    @Override
    public void move() {
        System.out.println(fullName + " is walking");
    }

    public void processPayment() {
        System.out.println(fullName + " processed payment");
    }

    @Override
    public void work() {
        System.out.println(fullName + " is working");
    }

    @Override
    public void takeBreak() {
        System.out.println(fullName + " is taking a break");
    }

    @Override
    public int compareTo(Animal other) {
        if (other instanceof Person) {
            return Double.compare(this.gpa, ((Person) other).gpa);
        }
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Person{name=" + fullName + ", gpa=" + gpa + "}";
    }
}