package ua.spalah.hibernate.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("S")
public class SavingAccount extends Account{

    public SavingAccount() {
        super(AccountType.SAVING);
    }

    public SavingAccount(double balance) {
        super(balance, AccountType.SAVING);
    }
}
