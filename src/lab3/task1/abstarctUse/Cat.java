package lab3.task1.abstarctUse;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void makeSound(){
        System.out.println(name + " : Meow");
    }
}
