package ua.spalah.basics.conditions;

import java.util.Random;

public class TernaryOperator {


    public static void main(String[] args) {
        int max = max(5, 7);
        System.out.println(max);

        System.out.println(max(787, 10));

        System.out.println(firstOrSecond(90, 120));

        Random random = new Random();
        boolean b = random.nextBoolean();
        String s = b ? "firstString" : "secondString";
        System.out.println(s);
    }

    private static int max(int a, int b) {
        return a > b ? a : b;
    }

    private static String firstOrSecond(int a, int b) {
        return a > b ? "first" : "second";
    }
}
