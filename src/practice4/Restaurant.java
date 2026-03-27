package practice4;

public class Restaurant {
    String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void servePizza(CanHavePizza eater) {
        System.out.println("\n" + name + " is serving pizza...");
        eater.eatPizza();
        if (eater instanceof Person) {
            ((Person) eater).processPayment();
        } else {
            System.out.println("No payment needed for animals");
        }
    }
}