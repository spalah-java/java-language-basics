package ua.spalah.inheritance.employees;


import ua.spalah.interfaces.Hellowable;
import ua.spalah.interfaces.LivingCreature;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>, LivingCreature, Hellowable {

    private String name = "some name";
    private double salary;
    private LocalDate birthDay;

    {
        name = "default";
        name = getString();
    }

    private String getString() {
        return "some default name";
    }

    public Employee(String name, double salary, LocalDate birthDay) {
        this.name = name;
        this.salary = salary;
        this.birthDay = birthDay;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void raiseSalary(double byPercent) {
        salary += salary * byPercent / 100;
    }

    @Override
    public int getAge() {
        return LocalDate.now().getYear() - birthDay.getYear();
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }

    @Override
    public int sayHelloIntroduceYourselfAndReturnYourAge(String nameSayHelloTo) {
        System.out.println("Hello " + nameSayHelloTo);
        System.out.println("My name is " + name);
        return getAge();
    }

    @Override
    public void dance(int numberOfMoves) {
        if ((numberOfMoves < 1)) {
            numberOfMoves = Hellowable.DEFAULT_NUMBER_OF_MOVES;
        }

        for (int i = 0; i < numberOfMoves; i++) {
            System.out.println("dancing");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthDay=" + birthDay +
                '}';
    }
}
