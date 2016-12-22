package ua.spalah.inheritance.employees;


import java.time.LocalDate;

public class Manager extends Employee{

    private double bonus;

    public Manager(String name, double salary, LocalDate hireDay) {
        super(name, salary, hireDay);
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
