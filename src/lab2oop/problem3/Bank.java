package lab2oop.problem3;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account acc) {
        accounts.add(acc);
    }

    public void closeAccount(Account acc) {
        accounts.remove(acc);
    }

    public void update() {

        for (Account acc : accounts) {

            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            }

            if (acc instanceof CheckingAccount) {
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account acc : accounts) {
            acc.print();
        }
    }
}
