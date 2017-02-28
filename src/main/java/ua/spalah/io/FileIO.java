package ua.spalah.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) throws IOException {
        writeToFile();
        readFromFile();
    }

    private static void writeToFile() throws IOException {
        String fileName = "C:\\example\\file to write to.txt";
        PrintWriter printWriter = new PrintWriter(fileName);
        printWriter.println("Hello world!!!11111");
        printWriter.flush();
        printWriter.close();

    }

    private static void readFromFile() throws IOException {
        String fileName = "C:\\example\\some_doc.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println(reader.readLine());
        reader.close();

        Scanner scanner = new Scanner(new File(fileName));
        System.out.println(scanner.nextDouble() * 2);
        System.out.println(scanner.nextInt() * 3);
    }
}
