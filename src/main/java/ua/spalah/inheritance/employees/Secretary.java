package ua.spalah.inheritance.employees;

import java.time.LocalDate;

/**
 * @author Kostiantyn Huliaiev
 */
public class Secretary extends Employee {

    public Secretary(String name, double salary, LocalDate birthDay) {
        super(name, salary, birthDay);
    }
}
