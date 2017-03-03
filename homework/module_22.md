# Модуль 22. Домашнее задание

## Bank Application

### Реализуем веб приложение используя Сервлеты и JSP

Делаем для нашего приложения протой веб интерфейс на онснове JSP.

Пишем веб приложение которое должно реализовывать следующий функционал:
1. Отображение полного списка клиентов
2. Просмотр детальной информации по конкретному клиенту
3. Редактирование существующего и добавление нового клиента
4. Добавление нового аккаунта клиенту
5. Снятие денег и пополнение счета на страничке клиента

Пример приложения можете найти в этом репозитории:
- [классы](https://github.com/spalah-java/java-language-basics/tree/master/src/main/java/ua/spalah/jsp)
- [jsp](https://github.com/spalah-java/java-language-basics/tree/master/src/main/webapp/WEB-INF/views)
- [web.xml](https://github.com/spalah-java/java-language-basics/blob/master/src/main/webapp/WEB-INF/web.xml#L40)

Инициализацию приложения сделайте в ServletContextListener'е как в [примере](https://github.com/spalah-java/java-language-basics/blob/master/src/main/java/ua/spalah/jsp/servlets/ServletContextInitializer.java). 

