package ua.spalah.basics.logparser;

import java.util.GregorianCalendar;

/**
 * Created by root on 20.12.2016.
 */
public class RacoonEntry extends Entry {

    public RacoonEntry(String[] logEntry){

        String[] data = logEntry[0].split("-");
        logEntry[0]="";
        String[] time = logEntry[1].split(":");
        logEntry[1]="";
        this.setWarnLevel(logEntry[2]); ;
        logEntry[2]="";
        this.setWarnMessage(String.join(" ",logEntry).trim());
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.set(
                Integer.parseInt(data[0]),Integer.parseInt(data[1]),Integer.parseInt(data[2]),Integer.parseInt(time[0]),Integer.parseInt(time[1]),Integer.parseInt(time[2])
        );
        this.setDatetime(calendar.getTime());
    }
}
