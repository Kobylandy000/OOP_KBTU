package practice4;

public class PowerSocket {
    public boolean charge(Pluggable p) {
        System.out.println("Charging...");
        p.plug();
        return true;
    }
}