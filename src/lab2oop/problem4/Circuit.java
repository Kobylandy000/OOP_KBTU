package lab2oop.problem4;

public abstract class Circuit {

    public abstract double getResistance(); //кедергі

    public abstract double getPotentialDiff(); //кернеу

    public abstract void applyPotentialDiff(double V);

    public double getCurrent() {
        return getPotentialDiff() / getResistance(); // tok
    }

    public double getPower() {
        return getPotentialDiff() * getCurrent();
    }
}