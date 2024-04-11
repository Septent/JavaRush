package Lvl20.Lecture8;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * Заполни список exceptions десятью различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 */

public class InvasionOfExceptions {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[5];
            int element = arr[10];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            int length = str.length();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Возраст не может быть отрицательным.");
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object obj = new Integer(10);
            String str = (String) obj;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            List<Integer> list = new ArrayList<>();
            list.get(10);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            File file = new File("не_существующий_файл.txt");
            Scanner scanner = new Scanner(file);    
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            List<Integer> list = Collections.unmodifiableList(new ArrayList<>());
            list.add(10);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileReader fileReader = new FileReader("файл.txt");
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        exceptions.add(new SecurityException());
        exceptions.add(new InterruptedException());

    }
}
