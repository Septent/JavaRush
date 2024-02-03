package Lvl12.Lecture7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;

/*
 * Твоя задача — обратиться к публичному API в интернете: отправить и получить данные.
 * Напиши программу, которая будет обращаться по ссылке к публичному API в интернете, отправляя туда данные, получать ответные данные и
 * выводить их на экран.
 * 
 * Подсказки:
 * 
 * 1. Используй метод openConnection() класса URL.
 * 2. Используй методы setDoOutput(true) и getOutputStream() класса URLConnection.
 * 3. Если не знаешь, какой API использовать, бери http://httpbin.org/post.
 */

public class GettingViaAPITwo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);

        OutputStream output = connection.getOutputStream();
        try (PrintStream printStream = new PrintStream(output)) {
            printStream.println("Hello");
        }
        
        InputStream input = connection.getInputStream();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(input))) {
            while (bufferedReader.ready()){
                System.out.println(bufferedReader.readLine());
            }
        }
    }
}
