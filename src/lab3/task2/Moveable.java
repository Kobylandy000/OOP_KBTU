package lab3.task2;

/**
 * TASK 2: Moveable interface және оны кеңейтетін Flyable интерфейсі
 */
public interface Moveable {
    void move(int x, int y);
    int getX();
    int getY();

    default String getPosition() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
