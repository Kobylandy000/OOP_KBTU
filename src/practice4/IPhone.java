package practice4;

public class IPhone extends Device implements SellableAndPluggable {
    double price;

    public IPhone(double price) {
        super("Apple");
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void plug() {
        System.out.println("iPhone plugged in with USB-C");
    }
}