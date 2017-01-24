package ua.spalah.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.sun.webkit.network.URLs;

public class UrlIO {

    public static void main(String[] args) throws IOException {
        String page = readFromUrl();
        System.out.println(page);
    }

    private static String readFromUrl() throws IOException {
        URL url = URLs.newURL("https://habrahabr.ru");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        return sb.toString();
    }
}
