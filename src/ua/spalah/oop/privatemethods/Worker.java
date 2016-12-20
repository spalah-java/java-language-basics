package ua.spalah.oop.privatemethods;


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

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    // methods that do something
    public void introduce() {
        System.out.println("Hello my name is " + name + " and I'm " + calculateAge() + " years old");
    }

    // private method to use only inside of the class
    private int calculateAge() {
        return LocalDate.now().getYear() - birthDay.getYear();
    }
}
