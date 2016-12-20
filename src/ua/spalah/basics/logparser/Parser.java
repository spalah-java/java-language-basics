package ua.spalah.basics.logparser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by root on 20.12.2016.
 */

public class Parser {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            Parser parser = new Parser("c:\\users\\root\\racoon.log");
        } catch (Exception  e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public Parser(String logPath) throws Exception{
        File logFile = new File(logPath);
        List<Entry> logEntries = new ArrayList<>();
        Scanner scanner = new Scanner(logFile);
        while (scanner.hasNext()){
            String[] line = scanner.nextLine().split(" ");
            if(line.length>3){
                try {
                    logEntries.add(new RacoonEntry(line));
                    logEntries.add(new Entry());
                }
                catch (Exception e){
                    //System.out.println(String.join(" ",line));
                }
            }
        }
        for (Entry entry : logEntries){
            if(!entry.isNull()) {
               //entry.showSelected("WARNING:");
               //entry.showSelected("ERROR:");
               System.out.println(entry);
            }
        }
    }
}

