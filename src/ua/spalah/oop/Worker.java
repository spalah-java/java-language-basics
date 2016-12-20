package ua.spalah.oop;

import java.time.LocalDate;

public class Worker {

    public static final int DEFAULT_SALARY = 100;

    // fields
    private String name;
    private final LocalDate birthDay;
    private int salary;

    // constructors (overloaded)
    public Worker(String name, int year, int month, int day) {
        this(name, LocalDate.of(year, month, day));
    }

    public Worker(String name, LocalDate birthDay) {
        this(name, birthDay, DEFAULT_SALARY);
    }

    public Worker(String name, LocalDate birthDay, int salary) {
        this.name = name;
        this.birthDay = birthDay;
        this.salary = salary;
    }

    // dummy methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // methods that do something
    public void introduce() {
        System.out.println("Hello my name is " + name + " and I'm " + getAge() + " years old");
    }

    // private method to use only inside of the class
    private int getAge() {
        return LocalDate.now().getYear() - birthDay.getYear();
    }
}
