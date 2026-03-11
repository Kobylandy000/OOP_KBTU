package practice3.problem1;

public class Animal {
    protected String name;
    protected int weight;

    public Animal(){
        System.out.println("Animal is created!");
    }

    public Animal(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String eat(){
        return " is eating";
    }

    public void makeSound(){
        System.out.println("Some generic animal sound");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }

    public String toString(){
        return "Animal" + name + " with weght: " + weight;
    }
}
