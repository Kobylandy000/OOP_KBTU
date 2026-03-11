package lab2oop.problem4;

public class Parallel extends Circuit {

    private Circuit c1;
    private Circuit c2;
    private double potential;

    public Parallel(Circuit a, Circuit b) {
        c1 = a;
        c2 = b;
    }

    public double getResistance() {

        double r1 = c1.getResistance();
        double r2 = c2.getResistance();

        return 1 / (1/r1 + 1/r2);
    }

    public double getPotentialDiff() {
        return potential;
    }

    public void applyPotentialDiff(double V) {

        potential = V;

        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}
