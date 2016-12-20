package ua.spalah.oop.staticthings;

import java.time.LocalDate;

/**
 * @author Kostiantyn Huliaiev
 */
public class Runner {

    public static void main(String[] args) {
        Worker employee1 = new Worker("Some guy", 2000, 12, 12);
        Worker employee2 = new Worker("Some guy", LocalDate.now());
        Worker employee3 = new Worker("Some guy", 2000, 12, 12);

        System.out.println(employee1 + " " + employee2 + employee3);

        int defaultSalary = Worker.DEFAULT_SALARY;
        System.out.println(defaultSalary);


        int rate = 50;
        SalaryHelper.raiseSalary(employee2, rate);

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());


        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str3";

        String join = String.join("", str1, str2, str3);
        System.out.println(join);
    }
}
