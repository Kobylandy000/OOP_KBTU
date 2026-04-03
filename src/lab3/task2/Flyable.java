package lab3.task2;

// Flyable — Moveable-ді кеңейтеді (интерфейс интерфейсті кеңейтеді)
// Ұшатын нәрсе жылжи алады + биіктікке ие болады
public interface Flyable extends Moveable {
    void fly(int altitude);
    int getAltitude();
    void land();

    default String getFullPosition() {
        return "Position: " + getPosition() + ", Altitude: " + getAltitude() + "m";
    }
}
