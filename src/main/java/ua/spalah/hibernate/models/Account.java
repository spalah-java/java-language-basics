package ua.spalah.hibernate.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "ACCOUNTS")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ACC_TYPE")
public abstract class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double balance;

    @Enumerated(EnumType.STRING)
    private AccountType type;

    protected Account(AccountType type) {
        this.type = type;
    }

    protected Account(double balance, AccountType type) {
        this.id = id;
        this.balance = balance;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
