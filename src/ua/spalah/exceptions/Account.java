package ua.spalah.exceptions;

public class Account {

    private long id;
    private double balance;

    public Account(long id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void deposit(float amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount can't be negative.");
        }
        balance += amount;
    }


    public void withdraw(float amount) throws NotEnoughFundsException {
        if (amount < 0) throw new IllegalArgumentException("Amount can't be negative.");

        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new NotEnoughFundsException(id, balance);
        }
    }
}
