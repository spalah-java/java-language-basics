package ua.spalah.java8.interfaces;


import java.util.ArrayList;

public class InterfaceMain {


    public static void main(String[] args) {
        SomeInterface some = new SomeImpl();
        System.out.println(some.x2(2));
        System.out.println(some.x4(5));


        ArrayList<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(3);
        integers.add(5);
        integers.add(7);

        for (Integer integer : integers) {
            System.out.println(some.x4(integer));
        }


        integers.forEach(z -> System.out.println(some.x4(z)));
    }
}
