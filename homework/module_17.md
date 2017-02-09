# Модуль 17. Домашнее задание

## Bank Application

### Реализуем DAO (Data access object) основании JDBC

В настоящих приложения все данные в БД. И ответственность за их получение из базы в приложение обычно возлагается на специализированные для этого объеты DAO (Data access object).
 
На данный момент у вас долна быть база примерно такого вида:

#####CLIENTS

 ID  | NAME | GENDER | EMAIL | TELEPHONE | CITY | ACTIVE_ACCOUNT_ID
 --- | ---- | ------ | ----- | --------- | ---- | -----------------
 1 | John Doe | MALE | jd@gmail.com | +555 1235321 | New York | 2
 2 | Lisa Jones | FEMALE | lisa@mail.ru | +777 8546842 | Boston | 9
 ... | ... | ... | ... | ... | ... | ...

#####ACCOUNTS
 ID  | CLIENT_ID | TYPE | BALANCE | OVERDRAFT
 --- | --------- | ---- | ------- | ---------
 1 | 1 | SAVING | 5000.75 | null
 2 | 1 | SAVING | 700.75 | null
 3 | 1 | CHECKING | 1000.00 | 2000
 4 | 2 | CHECKING | 2500.30 | 3500
 ... | ... | ... | ... | ...

В нашем приложении нам нужно реализовать 2 класса для DAO - ClientDao и AccountDao.

```java
public interface ClientDao {
    // Сохраняет нового клиента в базу и возвращает его уже с проставленым id
    Client save(Client client);
    // Обновляет информаци о существующем клиенте
    Client update(Client client);
    // В зависимости от того новый клиент или существующий (есть уже id или еще нет) сохраняет его или обновляет его информацию
    Client saveOrUpdate(Client client);
    // Удаляет клиента по его id
    void delete(long clientId);
    
    // Находит клиента по его id
    Client find(long id);
    // Достает из базы всех клиентов
    List<Client> findAll();
    // Находит клиента по имени
    Client findByName(String name);
}
    
public interface AccountDao {
    Account save(Account Account);
    Account update(Account Account);
    Account saveOrUpdate(Account Account);
    void delete(long id);
    
    Account find(long id);
    List<Client> findAll();
    List<Account> findByClientId(long clientId);
    Account findActiveAccountByClientName(String clientName);
    
}
```

ClientDao должен использовать внутри себя AccountDao, чтобы когда мы доставали клиента мы получали его объект с с установленными аккаунтами.

Так как теперь вместо того, чтобы хранить данные в поле **currentBank**, мы храним их в базе, теперь нам не нужен класс Bank, а все методы в сервисах не будут принимать банк, а будут ходить в базу за этими данными. 
Поэтому внутри каждого сервиса теперь будет использоваться небходимый в нем DAO. В ClientService - ClientDao, в AccountService - AccountDao.
Сервисы будут принимать их в конструкторе и сохранять у себя в поле.
Плюс если вам понадобятся в командах какие-нибудь методы из DAO не вызывайте их напрямую, только через сервис, для этого можете продублировать в сервисе метод из DAO, и в нем просто вызывать метод DAO, например:

```java
public interface AccountServiceImpl {
    
    private AccountDao accountDao;
    
    @Override
    public Account findActiveAccountByClientName(String clientName) {
        return accountDao.findActiveAccountByClientName(clientName);
    }
}
```

Можете при старте приложения создать один коннекшн к базе и передавать его в конструкторах DAO.

Если нужны параметризированные запросы (SELECT, UPDATE, INSERT и т.д.) используйте PreparedStatement.

Пример как выполнять селекты с вы можете найти [в наших примерах из класса](https://github.com/spalah-java/java-language-basics/blob/master/src/ua/spalah/jdbc/JdbcMain.java#L31).