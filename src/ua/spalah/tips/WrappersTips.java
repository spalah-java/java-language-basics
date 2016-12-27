package ua.spalah.tips;

import java.util.ArrayList;

public class WrappersTips {

    public static void main(String[] args) {
        Integer wrappedInt1 = new Integer(5);
        Integer wrappedInt2 = Integer.valueOf(5);
        Integer wrappedInt3 = Integer.valueOf("5");
        int int4 = Integer.parseInt("100500");

//        new ArrayList<int>();
        new ArrayList<Integer>();


        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(new Integer(3));
        integers.add(5);
        integers.add(7);

//        System.out.println(integers.get(5));
        Integer someInt1 = integers.get(3);
        int someInt2 = integers.get(4);

        Integer n = 3;
        n++;
        System.out.println(n);
    }
}
