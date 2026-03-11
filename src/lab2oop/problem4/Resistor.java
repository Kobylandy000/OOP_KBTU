package lab2oop.problem4;

public class Resistor extends Circuit {

    private double resistance;
    private double potentialDifference;

    public Resistor(double r) {
        resistance = r;
    }

    public double getResistance() {
        return resistance;
    }

    public double getPotentialDiff() {
        return potentialDifference;
    }

    public void applyPotentialDiff(double V) {
        potentialDifference = V;
    }
}
