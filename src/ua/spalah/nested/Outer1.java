package ua.spalah.nested;


public class Outer1 {

    private String privateField = "I am private!";
    public String publicField = "I am public!";


    public static class Nested {

        int someField;

        public Nested(int someField) {
            this.someField = someField;
        }

        public void doStuff() {
            for (int i = 0; i < someField; i++) {
                System.out.println("doing something");
            }
        }
    }

}
