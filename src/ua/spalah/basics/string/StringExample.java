package ua.spalah.basics.string;


public class StringExample {

    public static void main(String[] args) {
        // создание
        String e = ""; // пустая строка
        String greeting = "Hello";
        String J = "Java\u2122"; // Java™

        // конкатенация строк
        String someString = greeting + " " + J;

        // методы для класса String
        someString.length();
        someString.isEmpty();
        someString.toLowerCase();
        someString.toUpperCase();
        someString.charAt(0);
        someString.contains("a");
        someString.startsWith("b");
        someString.endsWith("c");
        someString.indexOf("d");
        someString.replace("e", "f");
        someString.split("\\s");
        someString.substring(0, 7);
        someString.trim();
    }
}
