package lab2oop.problem1.part_a;

public  class Cylinder extends Shape3D{
    private double radius;
    private double height;

    public Cylinder(double radius,double height) {
        this.radius = radius;
        this.height = height;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}