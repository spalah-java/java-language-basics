package ua.spalah.basics.conditions;

public class SwitchCase {

    public static void main(String[] args) {
        checkCase(1);
        checkCase(2);
        checkCase(3);
        checkCase(4);
        checkCase(5);
        checkCase(7);
    }

    private static void checkCase(int i) {
        switch (i) {
            case 1:
                System.out.println("it is one");
                break;
            case 2:
                System.out.println("it is two");
                break;
            case 3:
                System.out.println("it is three");
            case 4:
            case 5:
                System.out.println("it is one of 3, 4, 5");
                break;
            default:
                System.out.println("I don't know your number");
        }
    }

}
