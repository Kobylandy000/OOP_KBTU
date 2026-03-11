package lab2oop.problem5;

public class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    public String getSound() {
        return "Tweet";
    }
}
