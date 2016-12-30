package ua.spalah.interfaces;

import ua.spalah.inheritance.animals.Cat;
import ua.spalah.inheritance.employees.Employee;
import ua.spalah.inheritance.employees.Manager;

import java.time.LocalDate;

public class InterfaceRunner {

    public static void main(String[] args) {
        Employee harry = new Manager("Harry", 785, LocalDate.of(1980, 4, 15));
        Cat cat = new Cat();
        cat.setNick("Murka");

        printInfo(harry);
        printInfo(cat);

        printFullInfo(harry);
        printFullInfo(cat);
    }

    public static void printInfo(Named someoneWhoHasName) {
        System.out.println(someoneWhoHasName.getName());
    }

    public static void printFullInfo(LivingCreature creature) {
        System.out.println("My name is " + creature.getName());
        System.out.println("And I'm " + creature.getAge() + " years old");
    }
}
