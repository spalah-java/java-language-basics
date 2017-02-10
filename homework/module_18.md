# Модуль 18. Домашнее задание

## Bank Application

### Пробуем Рефлексию в действии

Продолжаем домашку по внедрению JDBC DAO в наше приложение.

Задание со звездочкой - воспользоваться рефлексией и реализовать маппер (преобразователь) из ResultSet в модель.
Как пример можете взять то, что мы начали писать на лекции.

```java
private static <T> T mapModel(ResultSet resultSet, Class<T> classToMap) throws Exception {
        T model = classToMap.newInstance();

        for (Field field : classToMap.getDeclaredFields()) {

            String name = field.getName();
            if (field.isAnnotationPresent(DbColumn.class)) {
                DbColumn annotation = field.getAnnotation(DbColumn.class);
                name = annotation.columnName();
            }

            Class<?> type = field.getType();
            field.setAccessible(true);

            if (long.class.isAssignableFrom(type)) {
                field.setLong(model, resultSet.getLong(name));
            } else if (double.class.isAssignableFrom(type)) {
                field.setDouble(model, resultSet.getDouble(name));
            } else if (String.class.isAssignableFrom(type)) {
                field.set(model, resultSet.getString(name));
            }
            // обработка других типов полей
        }

        return model;
    }
```
