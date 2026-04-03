package lab3.task2;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.move();
        airplane.fly();

        Bird bird = new Bird();
        bird.move();
        bird.fly();
    }
}
