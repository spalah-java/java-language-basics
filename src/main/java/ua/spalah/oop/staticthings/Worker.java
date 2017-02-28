package ua.spalah.oop.staticthings;


import java.time.LocalDate;

public class Worker {

    private static long nextId = 1;
    public static final int DEFAULT_SALARY = 100;

    // fields
    private final long id;
    private String name;
    private final LocalDate birthDay;
    private int salary;

    // constructors (overloaded)
    public Worker(String name, int year, int month, int day) {
        id = nextId++;
        this.name = name;
        birthDay = LocalDate.of(year, month, day);
        salary = DEFAULT_SALARY;
    }

    public Worker(String name, LocalDate birthDay) {
        id = nextId++;
        this.name = name;
        this.birthDay = birthDay;
        // default value
        salary = DEFAULT_SALARY;
    }

    public Worker(String name, LocalDate birthDay, int salary) {
        id = nextId++;
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
