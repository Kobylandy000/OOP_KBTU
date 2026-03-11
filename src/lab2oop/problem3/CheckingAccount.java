package lab2oop.problem3;

public class CheckingAccount extends Account {
    private int transactionCount = 0;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int number) {
        super(number);
    }

    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
    }

    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
    }

    public void deductFee() {
        if(transactionCount > FREE_TRANSACTIONS) {
            int extra = transactionCount - FREE_TRANSACTIONS;
            super.withdraw(extra * 0.02);
        }
        transactionCount = 0;
    }
}
