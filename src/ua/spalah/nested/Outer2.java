package ua.spalah.nested;


public class Outer2 {

    private String text = "I am private!";


    public class Inner {

        public void printText() {
            System.out.println(text);
        }
    }
}
