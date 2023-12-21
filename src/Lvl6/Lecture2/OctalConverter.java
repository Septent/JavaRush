package Lvl6.Lecture2;

/*
 * Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра,
 * из десятичной системы счисления в восьмеричную. А публичный статический метод toDecimal(int) наоборот — из
 * восьмеричной в десятичную.
 * Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
 * Твоя задача — реализовать эти методы.
 */

public class OctalConverter {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber <= 0) return 0;
        int i = 0;
        int octNumber = 0;
        while (decimalNumber != 0) {
            octNumber = (int) (octNumber + (decimalNumber % 8) * Math.pow(10, i)); 
            decimalNumber /= 8;
            i++;
        }
        return octNumber;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber <= 0) return 0;
        int i = 0;
        int decNumber = 0;
        while (octalNumber != 0) {
            decNumber = (int) (decNumber + (octalNumber % 10) * Math.pow(8, i)); 
            octalNumber /= 10;
            i++;
        }
        return decNumber;
    }
}
