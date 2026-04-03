package lab3.task1.abstarctUse;

public class Dog extends Animal {
    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        System.out.println(name + " : Woof");
    }
}
