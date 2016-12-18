package ua.spalah.oop.finalfields;


import java.time.LocalDate;

public class Worker {

    // fields
    private String name;
    // now final
    private final LocalDate birthDay;

    // constructors (overloaded)
    // not working now, because birthDay not set
//    public Worker() {
//    }

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

    // You cannot reinitialize final variable
//    public void setBirthDay(LocalDate birthDay) {
//        this.birthDay = birthDay;
//    }

    // methods that do something
    public void introduce() {
        System.out.println("Hello my name is " + name + " and I'm " + getAge() + " years old");
    }

    // private method to use only inside of the class
    private int getAge() {
        return LocalDate.now().getYear() - birthDay.getYear();
    }
}
