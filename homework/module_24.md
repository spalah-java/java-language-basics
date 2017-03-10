# Модуль 24. Домашнее задание

## Bank Application

### Реализуем DAO на основе Hibernate

Необходимо реализовать существующие интерфейсы DAO используя Hibernate.
Вы можете использовать как нативный Hibernate так и JPA - этот выбор за остается за вами.
Использовать HQL (JPQL) или Criteria тоже выбирать вам, можете даже комбинировать.
Entity же я рекомендую размечать аннотациями а не через xml.

В качестве примера можете взять проект из [Hibernate Getting Started Guide](http://docs.jboss.org/hibernate/orm/current/quickstart/html_single/hibernate-tutorials.zip).

Инициализация Hibernate будет проходить в том же месте что и сейчас - в ServletContextListener'е.
Все новые DAO будут хранить у себя экземпляр SessionFactory или EntityManagerFactory, который они получат в конструкторе.
Перед выполнением запроса открывайте сессию sessionFactory.openSession() либо entityManagerFactory.createEntityManager().
После выполнения запроса не забудьте закрыть ее после себя session.close() или entityManager.close().
