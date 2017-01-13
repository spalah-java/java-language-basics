package ua.spalah.generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ua.spalah.inheritance.employees.Employee;
import ua.spalah.inheritance.employees.Manager;
import ua.spalah.inheritance.employees.Secretary;

public class GenericMain {


    public static void main(String[] args) {
        Stack<Manager> stack = new Stack<Manager>();
//        fillEmployees(stack);

        Stack<Employee> stack2 = new Stack<Employee>();
        stack2.push(new Secretary("third", 1200, LocalDate.now()));

        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("first", 1200, LocalDate.now()));
        list.add(new Secretary("second", 1200, LocalDate.now()));

        List<Manager> managerList = new ArrayList<Manager>();
        list.add(new Manager("manager", 1200, LocalDate.now()));

        stack2.pushAll(list);
        stack2.pushAll(managerList);

        List<Manager> fillThisManagerList = new ArrayList<Manager>();
        List<Employee> fillThisList = new ArrayList<Employee>();


        stack.popAll(fillThisManagerList);
        stack.popAll(fillThisList);
    }

    public static void fillEmployees(Stack<Employee> stack) {
        stack.push(new Secretary("firs", 1200, LocalDate.now()));
        stack.push(new Secretary("second", 1200, LocalDate.now()));
        stack.push(new Secretary("third", 1200, LocalDate.now()));
    }
}
