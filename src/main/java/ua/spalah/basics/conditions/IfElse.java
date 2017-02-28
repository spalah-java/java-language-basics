package ua.spalah.basics.conditions;

public class IfElse {

    public static void main(String[] args) {
        compare(5, 7);
        compare(9, 3);
    }

    private static void compare(int a, int b) {
        boolean bool = a > b;

        if (bool) {
            System.out.println("a bigger than b");
        }

        // -----------------------------------------------
        if (bool) System.out.println("a bigger than b");

        // -----------------------------------------------
        if (a > b) {
            System.out.println("a bigger than b");
        }

        // -----------------------------------------------
        if (a > b) {
            System.out.println("a bigger than b");
        } else {
            System.out.println("b bigger or equals a");
        }

        // -----------------------------------------------
        if (a > b) {
            System.out.println("a bigger than b");
        } else if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("b bigger than a");
        }

        // -----------------------------------------------
        if (a > b) System.out.println("a bigger than b");
        else System.out.println("b bigger or equals a");
    }
}
