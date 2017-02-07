# Модуль 14. Домашнее задание

## Bank Application

#### Добавляем инициализацию данных из файла
 
Добавляем второй вариант инициализации данных для нашего банка. Данные будем хранить в тестовых файлах в таком формате

clients.txt

    John Doe::MALE::jd@gmail.com::063-562-12-52::Dnipro
    ...

accounts.txt

    John Doe::SAVING::8500
    John Doe::CHECKING::7000::500
    ...

При инициализации банка вычитываем это все из файлов и создаем соответствующие объекты.
Положите эти файлы в папку ***resources*** в вашем проекте.
Задача со звездочкой, сделать так чтобы не нужно было хардкодить абсолютный путь к этим файлам,
и кто угодно, скачав проект, и положив его в папку, отличающуюся от той в которой проект лежит у вас, мог бы запустить его без проблем,
и банк наполнился бы данными из этих файлов.

#### Клиент-сервер

Пишем реализацию клиент сервера на основе стримов и сокетов, по примеру того, что я вам показывал на лекции [(пример)](https://github.com/spalah-java/java-language-basics/tree/master/src/ua/spalah/io/sockets).

Создаем интерфейс

```java
public interface IO {
    String read();
    void write(String s);
}
```

Каждая команда теперь принимает себе в конструктор его реализацию.
И вместо System.out.println() и Scanner'а использует этот объект для записи и чтения.
Для этого интерфейса пишем две реализации: ConsoleIO и SocketIO. Которые работают или с консолью или с сокетом соответственно.
(можете сделать командам конструктор по умолчанию который использует ConsoleIO, также можете вынести общий функционал в AbstractCommand если видите такую необходимость)

Пишем класс BankServerCommander в который будет ипользовать ServerSocket как в [примере](https://github.com/spalah-java/java-language-basics/blob/master/src/ua/spalah/io/sockets/Server.java) и создавать команды с SocketIO. Он по сути будет делать то же, что и BankCommander.

И конечно пишем клиент - BankClient. Он будет связывать с сервером через сокет, читать то, что вводит клиент, слать это на сервер, получать ответ и выводить его клиенту [(пример)](https://github.com/spalah-java/java-language-basics/blob/master/src/ua/spalah/io/sockets/Client.java).



#### Unit тесты

Пишем юнит тесты для ClientService и AccountService.