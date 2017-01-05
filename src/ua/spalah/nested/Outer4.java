package ua.spalah.nested;


public class Outer4 {

    private String text = "I am private!";

    public void someMethod() {
        final String var = "local method var";

        MyInterface obj = new MyInterface() {
            @Override
            public String doIt(int i) {
                System.out.println(i);
                System.out.println(text);
                System.out.println(var);
                return "result";
            }
        };
        obj.doIt(7);
    }
}