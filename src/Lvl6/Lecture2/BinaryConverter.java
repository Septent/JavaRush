package Lvl6.Lecture2;

/*
 * Публичный статический метод toBinary(int) должен переводить целое число, полученное в качестве входящего параметра, из десятичной
 * системы счисления в двоичную и возвращать его строковое представление. А публичный статический метод toDecimal(String) наоборот —
 * из строкового представления двоичного числа в десятичное число.
 * Методы работают только с положительными числами и не пустыми строками. Если входящий параметр меньше или равен 0, метод
 * toBinary(int) возвращает пустую строку. Если входящий параметр — пустая строка или null, то метод toDecimal(String) возвращает 0.
 * Твоя задача — реализовать эти методы.
 */

public class BinaryConverter {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        decimalNumber = -50;
        System.out.println("Десятичное число " + decimalNumber + " равно двоичному числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        binaryNumber = "";
        System.out.println("Двоичное число " + binaryNumber + " равно десятичному числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber <= 0) return "";
        StringBuilder binary = new StringBuilder();
    
        while (decimalNumber > 0) {
            int i = decimalNumber % 2;
            binary.insert(0, i);
            decimalNumber = decimalNumber / 2;
        }
        return binary.toString();
    }

    public static int toDecimal(String binaryNumber) {
        if ((binaryNumber == null) || (binaryNumber.isEmpty())) return 0;
        int decimal = 0;
        for (int i = 0; i < binaryNumber.length(); i++) {
            int value = binaryNumber.charAt(binaryNumber.length() - 1 - i) - '0';
            decimal = decimal + value * (int) Math.pow(2, i);
        }
        return decimal;
    }
}
