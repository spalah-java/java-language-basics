# Модуль 12. Домашнее задание

## Bank Application

#### Расширим класс Client
 
Добавим нашему клиенту больше информации
 - email
 - телефон
 - город

Геттеры, сеттеры, апдейт equals и hashCode само собой

```java
private String email;
private String tel;
private String city;
```

При создании клиента из консоли валидируем email и телефон с помощью регулярных выражений - Regular Expressions.
Чиатем про них здесь [RegExp](http://www.quizful.net/post/Java-RegExp)

Саму проверку можно осуществить с помощью метода, который есть у каждой строки

```java
boolean correct = "some string".matches("^some\\s.*$");
```

Он принимает в себя RegEx для проверки. Поищите в интернете RegEx'ы для телефонов и email'ов

#### Внедряем коллекции

Начинаем использовать соответствующие коллекции в необходимых местах, например теперь можно харанить клиентов в банке в Map'е по имени.
Теперь поиск по имени будет происходить намного быстрее.

Добавьте в BankReportService метод который возвращает клиентов сгрупированных по городу
```java
public interface BankReportService {
    // all previous methods
    Map<String, List<Client>> getClientsByCity(Bank bank);
}
```

#### Unit testing

Читаем про Unit-тестирование при помощи JUnit: [link1](https://habrahabr.ru/post/120101/), [link2](http://devcolibri.com/864).

Подключаем себе библиотеку JUnit (пока без maven, скачиваем и добавляем к себе в проект
- [`junit.jar`](http://bit.ly/My9IXz)
- [`hamcrest-core.jar`](http://bit.ly/1gbl25b)

Пробуем писать тесты для ClientService и AccountService.
