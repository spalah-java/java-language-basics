package ua.spalah.java8.lambda;


import java.util.Comparator;
import java.util.Random;

public class LambdaMain {

    public static void main(String[] args) {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//            }
//        };

        Runnable r = () -> System.out.println("hello");
        Thread th = new Thread(r);
        th.start();


        Comparator<String> comp1 = (s1, s2) -> s1.compareToIgnoreCase(s2);

        Comparator<String> comp3 = LambdaMain::getSomething;

        Comparator<String> comp2 = String::compareToIgnoreCase;

        comp1.compare("Vasya", "Petya");
    }



    private static int getSomething(String s1, String s2) {
        return new Random().nextInt();
    }
}
