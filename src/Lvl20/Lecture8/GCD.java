package Lvl20.Lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Давай найдем наибольший общий делитель (НОД). Для этого:
 * 1. Введи с клавиатуры 2 целых положительных числа.
 * 2. Выведи в консоли наибольший общий делитель.
 */

public class GCD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        greatestCommonDivisor(list);
    }

    public static void greatestCommonDivisor(List<Integer> list) { 
        int result = 0;
        for (int i = 1; i <= Collections.max(list); i++) {
            int isDiv = 0;
            for (int value : list) {
                if (value % i == 0) {
                    isDiv++;
                }
            }

            if (isDiv == 2) { 
                result = i;
            }
        }

        System.out.println(result);
    }
}
