# Модуль 16. Домашнее задание

## Bank Application

#### Создаем схему для БД нашего банка и наполняем ее данными
 
У нас будет 2 таблицы: с клиентами и со счетами.

Добавьте в каждую из наших моделей поле **id** типа **long**.

Вам необходимо создать таблицы для моделей, чтобы колонки соответствовали полям в них:
 - если имя поля в классе firstName то в базе столбец должен называться first_name - все должно соответствовать [naming conventions](https://launchbylunch.com/posts/2014/Feb/16/sql-naming-conventions/#naming-conventions)
 - столбец должен иметь соответствующий тип -  [sql to java types mapping](https://www.tutorialspoint.com/jdbc/jdbc-data-types.htm)
 - в таблице со счетами будут все поля для чекинг и сейвинг аккаутов, просто в сейвинге поле овердрафт будет **null**

ID'шники должны быть помечены как первычные ключи (primary key) и иметь автоинкремент.
У аккаунта должна быть ссылка на клиента которому он принадлежит, и она болжна быть отмечена как foreign key.

Заполните эти таблицами начальными данными, штук 7 клиентов и у каждого 2-5 счетов.