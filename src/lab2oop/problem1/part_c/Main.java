package lab2oop.problem1.part_c;
import java.util.HashSet;

class Main {
    public static void main(String[] args) {
        HashSet<Vehicle> set = new HashSet<>();
        set.add(new Car("Toyota", "ABC123"));
        set.add(new Car("Toyota", "ABC123"));
        set.add(new Car("Honda", "XYZ789"));

        for (Vehicle v : set) {
            System.out.println(v);
        }

    }
}
