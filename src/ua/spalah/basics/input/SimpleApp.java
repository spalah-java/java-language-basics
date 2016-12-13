package ua.spalah.basics.input;

import java.util.Scanner;

public class SimpleApp {

    public static void main(String[] args) {
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello\nWhat is your name");
        String name = scanner.nextLine();
        System.out.println("Your name" + name);


        System.out.println("What is your age");
        int age = scanner.nextInt();
        System.out.println("Yor age is " + age);

        System.out.println("Name your pets through space");

//        int number = 1;
//        while (scanner.hasNext()) {
//            System.out.println(number++ + " " + scanner.next());
//        }

//        scanner.skip(".*\n");
        scanner.nextLine();

        String petsInLine = scanner.nextLine();
        String[] pets = petsInLine.split(" ");

        for (int i = 1; i <= pets.length; i++) {
            System.out.println(i + " " + pets[i -1]);
        }
        System.out.println("exit");
    }


    public void calc(String input) {
        String[] split = input.split(" ");
        int i = Integer.parseInt(split[0]);
    }
}
