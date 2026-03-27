package practice4;

public class Person extends Animal implements Comparable<Person> {
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
    public int compareTo(Person other) {
        if (this.gpa > other.gpa) return 1;
        if (this.gpa < other.gpa) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Person{name=" + fullName + ", gpa=" + gpa + "}";
    }
}