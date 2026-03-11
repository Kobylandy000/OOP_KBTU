package lab2oop.problem3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount s = new SavingsAccount(1, 0.05);
        CheckingAccount c = new CheckingAccount(2);

        s.deposit(1000);
        c.deposit(500);

        c.withdraw(100);
        c.withdraw(50);
        c.withdraw(30);
        c.withdraw(20);

        bank.openAccount(s);
        bank.openAccount(c);

        bank.update();

        bank.printAccounts();
    }
}
