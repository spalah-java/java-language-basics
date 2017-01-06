package ua.spalah.exceptions;

public class AccountService {

    public void transfer(Account from, Account to, double amount) throws NotEnoughFundsException {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        Account account1 = new Account(1, 500);
        Account account2 = new Account(2, 1000);

        AccountService service = new AccountService();

        System.out.println("open connection");
        try {
            service.transfer(account1, account2, 600);
            System.out.println("some code");

        } catch (NotEnoughFundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("close connection");
        }

        System.out.println(account1);
        System.out.println(account2);
    }
}
