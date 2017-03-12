package ua.spalah.hibernate.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CH")
public class CheckingAccount extends Account {

    private double overdraft;

    public CheckingAccount() {
        super(AccountType.CHECKING);
    }

    public CheckingAccount(double balance, double overdraft) {
        super(balance, AccountType.CHECKING);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }
}
