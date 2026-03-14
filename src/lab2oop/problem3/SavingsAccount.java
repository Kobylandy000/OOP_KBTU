package lab2oop.problem3;

public class SavingsAccount extends Account {
    private double InterestRate; // Пайыздық мөлшерлеме

    public SavingsAccount(int number, double rate) {
        super(number);
        InterestRate =  rate;
    }

    public void addInterest() {
        double interest = getbalance() * InterestRate;
        deposit(interest);
    }
}