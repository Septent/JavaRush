package Lvl6.Lecture2;

import java.util.Arrays;

/*
 * Публичный статический метод toHex(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной
 * системы счисления в шестнадцатеричную и возвращать его строковое представление. А публичный статический метод toDecimal(String)
 * наоборот — из строкового представления шестнадцатеричного числа в десятичное число.
 * Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод
 * toHex(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
 * Твоя задача реализовать эти методы.
 * Также в классе Solution есть константа HEX, которая содержит в себе все символы, используемые в шестнадцатеричной системе.
 */

public class HexConverter {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Десятичное число " + decimalNumber + " равно шестнадцатеричному числу " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно десятичному числу " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
    String hex = "";
    if (decimalNumber <= 0) return hex;
    char[] HEXAr = HEX.toCharArray();
    while(decimalNumber != 0){
        hex = HEXAr[decimalNumber%16] + hex;
        decimalNumber /= 16;
    }
    return  hex;
    }

    public static int toDecimal(String hexNumber) {
        int DN = 0;
        if ((hexNumber == null) || (hexNumber == "")) return DN;
        char[] HEXAr = HEX.toCharArray();
        char[] HArN = hexNumber.toCharArray();
        for (int i = 0; i < hexNumber.length(); i++) {
            int ind = Arrays.binarySearch(HEXAr, HArN[i]);
            DN = 16 * DN + ind;
        }
        return DN;
    }
}
