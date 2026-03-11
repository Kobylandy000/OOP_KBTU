package lab2oop.problem1.part_a;

public class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}