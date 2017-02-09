# Модуль 17. Домашнее задание

## Bank Application

### Реализуем DAO (Data access object) основании JDBC

В настоящих приложения все данные в БД. И ответственность за их получение из базы в приложение обычно возлагается на специализированные для этого объеты DAO (Data access object).
 
На данный момент у вас долна быть база примерно такого вида:


 First Header  | Second Header
 ------------- | -------------
 Content Cell  | Content Cell 
 Content Cell  | Content Cell 


В нашем приложении нам нужно реализовать 2 класса для DAO - ClientDao и AccountDao. 

```java
public interface ClientService {
    Client findClientByName(Bank bank, String name);
    List<Client> findAllClients(Bank bank);
    Client saveClient(Bank bank, Client client);
    void deleteClient(Bank bank, Client client);
}

public interface AccountService {
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    void transfer(Account fromAccount, Account toAccount, double amount);
}

```

```java
public interface ClientService {
    Client findClientByName(Bank bank, String name);
    List<Client> findAllClients(Bank bank);
    Client saveClient(Bank bank, Client client);
    void deleteClient(Bank bank, Client client);
}

public interface AccountService {
    void deposit(Account account, double amount);
    void withdraw(Account account, double amount);
    void transfer(Account fromAccount, Account toAccount, double amount);
}

public interface BankReportService {
    int getNumberOfClients(Bank bank); // общее количество клиентов
    int getNumberOfAccounts(Bank bank); // общее количество счетов
    double getTotalAccountSum(Bank bank); // общая сумма по всем счетам
    double getBankCreditSum(Bank bank); // возвращает сумму отрицательных балансов по всем счетам
    List<Client> getClientsSortedByName(Bank bank); // Возвращает список клиентов отсортированных по имени
}
```
