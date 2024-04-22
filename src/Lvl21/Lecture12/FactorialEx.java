package Lvl21.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*
 * Напиши метод, который вычисляет факториал - произведение всех чисел от 1 до введенного числа, включая его.
 * 
 * Пример вычислений: 4! = factorial(4) = 1*2*3*4
 * Пример вывода: 24
 * 
 * Для этого:
 * Введи с консоли число меньше либо равно 150.
 * Реализуй функцию factorial.
 * Если введенное число меньше 0, выведи 0.
 * 0! = 1
 */

public class FactorialEx {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        if (n < 0) {
            return "0";
        } else if (n == 0) {
            return "1";
        }

        BigInteger result = new BigInteger("1");

        for (long i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result.toString();
    }
}
