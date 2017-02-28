package ua.spalah.interfaces.comparators;

import ua.spalah.inheritance.employees.Employee;
import ua.spalah.inheritance.employees.Manager;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class ComparableMain {

    public static void main(String[] args) {

//        Comparable<Employee> gena = new Manager("Gena", 10230, LocalDate.now());
//        Comparable<Employee> tom = new Manager("Tom", 100, LocalDate.now());
//        System.out.println(tom.compareTo(gena));

        Employee harry1 = new Manager("Harry1", 785, LocalDate.of(2006, 4, 15));
        Employee harry2 = new Manager("Harry2", 78, LocalDate.of(2000, 4, 15));
        Employee harry3 = new Manager("Harry3", 10000785, LocalDate.now());

        Employee[] staff = {harry3, harry1, harry2};
        System.out.println(Arrays.toString(staff));

        Arrays.sort(staff);
        System.out.println(Arrays.toString(staff));

        NameComparator comp1 = new NameComparator();
        Arrays.sort(staff, comp1);
        System.out.println(Arrays.toString(staff));

        Comparator<Employee> comp2 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Arrays.sort(staff, comp2);
        System.out.println(Arrays.toString(staff));
    }
}
