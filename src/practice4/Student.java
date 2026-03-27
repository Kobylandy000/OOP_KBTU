package practice4;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable{

    String studentId;

    public Student(String name, int age, String fullName, double gpa, String studentId) {
        super(name, age, fullName, gpa);
        this.studentId = studentId;
    }

    @Override
    public void eatPizza() {
        System.out.println(fullName + " (student) eats pizza!");
    }

    @Override
    public void takeRetake() {
        System.out.println(fullName + " is taking a retake exam");
    }

    @Override
    public void move() {
        System.out.println(fullName + " (student) is moving");
    }

    @Override
    public void dance() {
        System.out.println(fullName + " is dancing at the party!");
    }

    @Override
    public String toString() {
        return "Student{name=" + fullName + ", gpa=" + gpa + ", id=" + studentId + "}";
    }
}