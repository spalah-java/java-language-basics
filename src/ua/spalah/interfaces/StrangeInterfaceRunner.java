package ua.spalah.interfaces;

import ua.spalah.inheritance.employees.Employee;
import ua.spalah.inheritance.employees.Manager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StrangeInterfaceRunner {

    public static void main(String[] args) {
        Employee harry1 = new Manager("Harry1", 785, LocalDate.of(2013, 4, 15));
        Employee harry2 = new Manager("Harry2", 785, LocalDate.of(2000, 4, 15));
        Employee harry3 = new Manager("Harry3", 785, LocalDate.now());

        harry1.sayHelloIntroduceYourselfAndReturnYourAge("Java Developer");

        System.out.println("List");
        ArrayList<Hellowable> list = new ArrayList<>();
        list.add(harry1);
        list.add(harry2);
        list.add(harry3);

        crazyStuff(list);

    }

    public static void crazyStuff(List<Hellowable> list) {
        for (Hellowable hellowable : list) {
            int age = hellowable.sayHelloIntroduceYourselfAndReturnYourAge("Yorik");
            hellowable.dance(age);
        }
    }
}
