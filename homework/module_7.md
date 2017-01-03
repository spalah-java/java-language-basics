# Модуль 7. Домашнее задание

## Bank Application

### Реализация паттерна Observer

Наблюдатель (англ. Observer) — поведенческий шаблон проектирования.
Он создает механизм , который позволяет объекту получать оповещения от других объектов об изменении их состояния, тем самым наблюдая за ними.

Наши наблюдатели должны реализовывать следующий интерфейс
```java
public interface ClientRegistrationListener {
    void onClientAdded(Client c);
}
```
Соответсвенно, как можно понять из названия интерфейса мы будем следить за добавление клиентов в банк

У нашего банка появляется поле которое будет хранить подписавшихся на нас наблюдателей
```java
private List<ClientRegistrationListener> listeners;
```
И соответстующий метод который позволит добавлять наблюдателей
```java
public void addListener(ClientRegistrationListener listener)
```

Теперь при каждом добавлении клиента методе addClient должны оповестить всех наблюдателей об этом. (Просто в цикле вызываете метод из интерфейса)

Вам нужно реализовать три класса наблюдателей:

1. PrintClientListener - выводит в консоль информацию о клиенте

2. EmailNotificationListener - отправляет письмо с текстом
**"Notification email for client *{client name}* has been sent"**
(на самом деле никуда ничто вам отправлять не нужно, просто выведете это в консоль)

3. RegistrationLoggerListener - выводит в консоль имя клиента и дату и время когда он был добавлен в формате
**"Client *{client name}* added on *{current date and time}*"**

При создании банка добавьте ему несколько наблюдателей (поэксперементируйте с разными комбинациями) и потом проследите, что будет выводится в консоль, добавлении клиента в банк

### Перенесение функциональной логики в отдельные классы - Сервисы

Как я уже говорил, приложения обычно проектирую отделяя
1. Классы, которые хранят данные. Они содержат поля, геттеры и сеттеры для них, никакой логики.
2. Классы, которые обрабатывают данные (манипулируя классами 1го типа). Эти классы обычно имеют состояния (полей), но содержат в себе методы для реализации какой либо фунциональности (сохранение в базу, отправка почты, рассчет чего-нибудь)

Например:

У нас есть класс Dog который соответствует таблице DOG в базе данных (его поля соответствуют колонкам в таблице, то есть один объект, это одна строка в этой таблице).
Dog - это класс первого типа (поля и методы доступа и установки).

Ну а чтобы сохранить объетк собаки в базу данных мы используем класс DogDao (**DAO** - data access object).
В этом классе есть методы:
```java
public void save(Dog dog)

public Dog findById(long id)
```
Первый сохранят собаку в базу второй находит ее по id.

Теперь собственно задание. Вам нужно будет перенести бизнес логику вашего приложения в так называемые сервисы - классы предназначеные для этого.

Вам будет нужно написать три класса реализующие соответствующие интерфейсы, классы называйте как соответствующие интерфейсы с суффиксом Impl (например ClientServiceImpl).
Никаких модификаций в существующих классах вам по идее производить не нужно (разве что добавить метод deleteClient в класс Bank).

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
    int getNumberOfClients(Bank bank);
    int getNumberOfAccounts(Bank bank); // общее количество счетов
    double getTotalAccountSum(Bank bank);
    double getBankCreditSum(Bank bank); // возвращает сумму отрицательных балансов по всем счетам
    List<Client> getClientsSortedByName(Bank bank);
}
```
