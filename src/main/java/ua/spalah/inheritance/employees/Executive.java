package ua.spalah.inheritance.employees;


import java.time.LocalDate;

public final class Executive extends Manager {

    public Executive(String name, double salary, LocalDate hireDay, double bonus) {
        super(name, salary, hireDay);
        setBonus(bonus);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 2;
    }
}
