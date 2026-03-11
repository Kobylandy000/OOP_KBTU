package lab2oop.problem1.part_c;
import java.util.Objects;

public class Vehicle {
    private String LicensePlate;

    public Vehicle(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) o;
        return LicensePlate.equals(v.LicensePlate);
    }

    public int hashCode() {
        return Objects.hash(LicensePlate);
    }
    public String toString() {
        return "Vehicle[" + LicensePlate + "]";
    }
}