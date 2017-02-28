package ua.spalah.exceptions;

public class NotEnoughFundsException extends Exception {

    public NotEnoughFundsException(long id, double available) {
        super("Not enough funds on account [" + id + "]. Only $" + available + " available to withdraw.");
    }

}