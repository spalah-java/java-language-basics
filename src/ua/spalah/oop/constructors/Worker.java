package ua.spalah.oop.constructors;


import java.time.LocalDate;

public class Worker {

    // fields, public for now
    public String name;
    public LocalDate birthDay;

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
}
