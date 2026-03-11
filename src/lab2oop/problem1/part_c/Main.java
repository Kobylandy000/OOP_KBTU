package lab2oop.problem1.part_c;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Vehicle> set = new HashSet<>();
        set.add(new Car("ABC123", "Toyota"));
        set.add(new Car("ABC123", "Toyota"));
        set.add(new Car("XYZ789", "Honda"));

        for (Vehicle v : set) {
            System.out.println(v);
        }

    }
}
