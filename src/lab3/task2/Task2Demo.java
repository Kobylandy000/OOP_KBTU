package lab3.task2;

public class Task2Demo {
    public static void main(String[] args) {
        System.out.println("=== Task 2: Moveable & Flyable ===");
        Car car = new Car("Tesla", 0, 0);
        car.move(10, 5);
        System.out.println(car);

        System.out.println();
        Drone drone = new Drone("DJI-Pro", 0, 0);
        drone.move(5, 5);
        drone.fly(100);
        System.out.println(drone);
        drone.move(20, 20);
        drone.land();
        System.out.println(drone);
    }
}
