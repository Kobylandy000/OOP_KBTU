package lab2oop.problem1.part_c;
import java.util.Objects;

class Car extends Vehicle {
    private String model;

    public Car(String model,String LicensePlate) {
        super(LicensePlate);
        this.model = model;
    }

    public String getModel(){ return model;}

    public boolean equals(Object o) {
        if(!super.equals(o)) return false;
        if(!(o instanceof Car)) return false;
        Car c = (Car) o;
        return model.equals(c.model);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(),model);
    }

    public String toString() {
        return "Car[" + getLicensePlate() + ", " + model + "]";
    }
}
