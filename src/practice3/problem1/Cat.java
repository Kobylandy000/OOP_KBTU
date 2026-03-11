package practice3.problem1;

public class Cat extends Animal {

    private String color;

    // using super() without parameters
    public Cat() {
        super();
        System.out.println("Cat created");
    }

    // using super(name) with parameter
    public Cat(String name,int weight, String color) {
        super(name,weight);
        this.color = color;
    }

    // Method overriding
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    // Method overloading (different parameter list)
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Meow");
        }
    }

    @Override
    public String toString() {
        return "Cat " + name + super.eat() + " and its' color is " + color;
    }
}
