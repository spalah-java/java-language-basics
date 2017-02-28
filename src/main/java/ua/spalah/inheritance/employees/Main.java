package ua.spalah.inheritance.employees;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Manager misha = new Manager("Misha", 100, LocalDate.now());
        misha.setBonus(150.0);
        misha.raiseSalary(50);
        printSalary(misha);

        Employee vasya = new Employee("Vasya", 100, LocalDate.now());
        vasya.raiseSalary(50);
        printSalary(vasya);

        Employee gena = new Manager("Misha", 100, LocalDate.now());
//        gena.setBonus(150.0); variable with type Employee so you cannot invoke setBonus() method
        gena.raiseSalary(50);
        printSalary(gena);

        Employee[] employees = {misha, vasya, gena};
        holidayBonus(employees);
    }


    public static void printSalary(Employee employee) {
        System.out.println(employee.getSalary());
    }

    public static void holidayBonus(Employee[] employees) {
//        Manager employee1 = (Manager) employees[0];
        Employee employee1 = employees[0];
        Employee employee2 = employees[1];

//        if (employee1 instanceof Manager) {
//            ((Manager)employee1).setBonus(100);
//        }


        employee1.raiseSalary(10);
        employee2.raiseSalary(10);
//        employee1.setBonus(100);
    }
}
