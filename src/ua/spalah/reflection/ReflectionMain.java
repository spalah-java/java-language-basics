package ua.spalah.reflection;

import ua.spalah.inheritance.employees.Employee;
import ua.spalah.inheritance.employees.Secretary;
import ua.spalah.jdbc.Dog;
import ua.spalah.jdbc.Gender;
import ua.spalah.oop.simple.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.LocalDate;
import java.util.LinkedList;

public class ReflectionMain {

    public static void main(String[] args) throws Exception {
        printNames();

        modifiers();

        superclass();

        interfaces();

        fields();

        constructors();

        methods();

        creation();
    }

    private static void creation() throws Exception {
        Class<?> c = Class.forName("ua.spalah.jdbc.Dog");

        Object o = c.newInstance();

        System.out.println(o);
    }

    private static void methods() throws Exception {
        Dog lisa = new Dog(1, "Lisa", "Rotv", Gender.FEMALE, 123.11);

        Class<?> c = lisa.getClass();
        Method[] methods = c.getMethods();
        for (Method method : methods) {
            System.out.println("Имя: " + method.getName());
            System.out.println("Возвращаемый тип: "+method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.print("Типы параметров: ");
            for (Class paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println("");
        }

        Method method = c.getMethod("toString");
        String result = (String) method.invoke(lisa);
        System.out.println(result);

        method = c.getMethod("setId", long.class);
        method.invoke(lisa, 1010101);
        System.out.println(lisa);
    }

    private static void constructors() throws Exception {

        Dog lisa = new Dog(1, "Lisa", "Rotv", Gender.FEMALE, 123.11);

        Class<?> c = lisa.getClass();
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.println("\nnext constructor");
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
        }

        c.getConstructor(long.class);
        c.getConstructor(long.class, String.class, String.class, Gender.class, double.class);
    }

    private static void fields() throws Exception {
        Dog lisa = new Dog(1, "Lisa", "Rotv", Gender.FEMALE, 123.11);
        System.out.println(lisa);


        Class<?> c = lisa.getClass();

        Field[] publicFields = c.getDeclaredFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.print("Имя: " + field.getName());
            System.out.print(" --- Тип: " + fieldType.getName());

            field.setAccessible(true);
            System.out.println(" --- Value: " + field.get(lisa));
        }

        Field field = c.getDeclaredField("nick");
        field.setAccessible(true);
        field.set(lisa, "Roger");

        field = c.getDeclaredField("id");
        field.setAccessible(true);
        field.set(lisa, 71);

        System.out.println(lisa);
    }

    private static void interfaces() {
        Employee lisa = new Employee("Lisa", 11245.13, LocalDate.now());
        Class<?> c = lisa.getClass();

        for (Class<?> aClass : c.getInterfaces()) {
            System.out.println(aClass.getSimpleName());
        }

        for (Class<?> aClass : LinkedList.class.getInterfaces()) {
            System.out.println(aClass.getSimpleName());
        }

    }

    private static void superclass() {
        Secretary lisa = new Secretary("Lisa", 11245.13, LocalDate.now());
        Class<?> c = lisa.getClass();
//        System.out.println(c);
//        System.out.println(c.getSuperclass());

        while (c != null) {
            System.out.println(c);
            c = c.getSuperclass();
        }

    }

    private static void printNames() throws ClassNotFoundException {
        printObjectsClassName(new Dog());
        printObjectsClassName(new Person());
        printObjectsClassName(new Secretary("Lisa", 11245.13, LocalDate.now()));
        printObjectsClassName(Integer.class);

        printClassName(Integer.class);
        printClassName(Class.forName("ua.spalah.exceptions.NotEnoughFundsException"));
    }

    private static void modifiers() throws ClassNotFoundException {
        Class<?> c = Class.forName("ua.spalah.exceptions.NotEnoughFundsException");

        int mods = c.getModifiers();
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
    }

    private static void printObjectsClassName(Object o) {
        Class<?> clazz = o.getClass();
        printClassName(clazz);
    }

    private static void printClassName(Class<?> clazz) {
//        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getCanonicalName());
    }
}
