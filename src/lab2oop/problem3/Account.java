package lab2oop.problem3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        balance += sum;
    }

    public void withdraw(double sum) {
        if(balance >= sum) {
            balance -= sum;
        }
    }

    public double getbalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        if(balance >= amount) {
            withdraw(amount);
            other.deposit(amount);
        }
    }

    public String toString() {
        return "Account " + accNumber + " balance: " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }

}
