package lab2oop.problem4;

public class Series extends Circuit {
    private Circuit c1;
    private Circuit c2;
    private double potential;

    public Series(Circuit a, Circuit b) {
        c1 = a;
        c2 = b;
    }

    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    public double getPotentialDiff() {
        return potential;
    }

    public void applyPotentialDiff(double V) {

        potential = V;

        double totalR = getResistance();
        double current = V / totalR;

        c1.applyPotentialDiff(current * c1.getResistance());
        c2.applyPotentialDiff(current * c2.getResistance());
    }
}
