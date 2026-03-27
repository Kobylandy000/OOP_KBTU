package practice4;

public class Cat extends Animal implements CanHavePizza {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void move() {
        System.out.println(name + " the cat sneaks quietly");
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " the cat eats pizza!");
    }
}