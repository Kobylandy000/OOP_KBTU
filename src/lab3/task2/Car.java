package lab3.task2;

// Car — тек Moveable (жылжи алады, бірақ ұша алмайды)
public class Car implements Moveable {
    private String model;
    private int x, y;

    public Car(String model, int x, int y) {
        this.model = model;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(model + " moved to " + getPosition());
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    @Override
    public String toString() {
        return "Car[" + model + "] at " + getPosition();
    }
}
