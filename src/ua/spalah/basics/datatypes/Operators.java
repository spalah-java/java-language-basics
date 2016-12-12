package ua.spalah.basics.datatypes;

public class Operators {

    public static void main(String[] args) {
        prefixSuffixIncrement();
        bitOperations();
        booleanLogic(1, 2);
        booleanLogic(2, 1);
    }

    private static void prefixSuffixIncrement() {
        int a = 10;

        int b = 7;
        System.out.println(a + b++);
        System.out.println(b);

        int c = 7;
        System.out.println(a + ++c);
        System.out.println(c);
    }

    private static void bitOperations() {
        System.out.println(52 & 178);
    }

    private static void booleanLogic(int a, int b) {
        boolean bool = a > b;

        System.out.println(bool);
        System.out.println(!bool);
        System.out.println("---");
        System.out.println(bool || true);
        System.out.println(bool && false);
        System.out.println("---------");
    }
}
