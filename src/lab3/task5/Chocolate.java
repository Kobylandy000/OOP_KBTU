package lab3.task5;

import java.util.Objects;

/**
 * TASK 5: Chocolate класы — Comparable іске асырылған (салмақ бойынша)
 */
public class Chocolate implements Comparable<Chocolate>, Cloneable {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() { return name; }
    public double getWeight() { return weight; }

    // Comparable — салмақ бойынша салыстыру
    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate{name='" + name + "', weight=" + weight + "g}";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chocolate)) return false;
        Chocolate c = (Chocolate) o;
        return Double.compare(c.weight, weight) == 0 && Objects.equals(name, c.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }

    @Override
    public Chocolate clone() throws CloneNotSupportedException {
        return (Chocolate) super.clone();
    }
}
