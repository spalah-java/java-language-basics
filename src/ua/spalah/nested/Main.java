package ua.spalah.nested;

import ua.spalah.inheritance.animals.Pet;

/**
 * @author Kostiantyn Huliaiev
 */
public class Main {


    public static void main(String[] args) {
        //    Outer1 outer1 = new Outer1();
        Outer1.Nested nested = new Outer1.Nested(7);

        Outer2 outer2 = new Outer2();
        Outer2.Inner inner = outer2.new Inner();
        inner.printText();

        Outer3 outer3 = new Outer3();
        outer3.someMethod();

        Outer4 outer4 = new Outer4();
        outer4.someMethod();

        Pet pet = new Pet() {
            @Override
            public void pet() {

            }

            @Override
            public void walk() {

            }
        };
    }
}
