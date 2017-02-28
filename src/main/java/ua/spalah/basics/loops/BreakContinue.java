package ua.spalah.basics.loops;

public class BreakContinue {

    public static void main(String[] args) {
        breakLoop();
        continueLoop();
    }

    private static void breakLoop() {
        for (int i = 0; i < 15; i++) {
            System.out.println(i);
            if (i > 7) break;
        }
    }

    private static void continueLoop() {
        for (int i = 0; i < 15; i++) {
            if (i % 3 != 0) continue;
            System.out.println(i);
        }
    }
}
