package ua.spalah.basics.loops;

public class Loops {

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        whileNoLoop();
        doWhileLoop();
        forEachLoop();
    }

    private static void forLoop() {
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
        }
    }

    private static void whileLoop() {
        int i = 7;
        while (i > -3) {
            System.out.println(i--);
//            System.out.println(--i);
        }
        System.out.println(i);
    }

    private static void whileNoLoop() {
        int i = 10;
        while (i < 5) {
            System.out.println(i);
            i--;
        }
    }

    private static void doWhileLoop() {
        int i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i < 5);
    }

    private static void forEachLoop() {
        String[] strings = {"one", "anotherOne", "third", "ect", "..."};

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
