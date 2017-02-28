package ua.spalah.nested;


public class Outer3 {

    private String text = "I am private!";

    public void someMethod() {
        final String var = "local method var";

        /*public*/
        class Local {
            private void printMe(String s) {
                System.out.println(s);
                System.out.println(text);
                System.out.println(var);
            }
        }

        Local local = new Local();
        local.printMe("param");
    }
}