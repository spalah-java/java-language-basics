package ua.spalah.oop.incapsulation;


import java.time.LocalDate;

public class Worker {

    // fields
    private String name;
    private LocalDate birthDay;

    // constructors (overloaded)
    public Worker() {
    }

    public Worker(String name, int year, int month, int day) {
        this.name = name;
        birthDay = LocalDate.of(year, month, day);
    }

    public Worker(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    // dummy get and set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
