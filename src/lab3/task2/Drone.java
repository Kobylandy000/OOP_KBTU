package lab3.task2;

// Drone — Flyable іске асырады (жылжи де, ұша да алады)
public class Drone implements Flyable {
    private String name;
    private int x, y, altitude;

    public Drone(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.altitude = 0;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(name + " moved to " + getPosition());
    }

    @Override
    public void fly(int altitude) {
        this.altitude = altitude;
        System.out.println(name + " flying at altitude " + altitude + "m");
    }

    @Override
    public void land() {
        this.altitude = 0;
        System.out.println(name + " landed at " + getPosition());
    }

    @Override
    public int getX() { return x; }

    @Override
    public int getY() { return y; }

    @Override
    public int getAltitude() { return altitude; }

    @Override
    public String toString() {
        return "Drone[" + name + "] — " + getFullPosition();
    }
}
