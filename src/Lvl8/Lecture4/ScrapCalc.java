package Lvl8.Lecture4;

/*
 * Давай проведем рефакторинг кода: вынесем отдельно утильные методы.
 * Для этого создай внутренний статический (вложенный) класс Calc и перенеси в него методы add, subtract, multiply и divide.
 * Не забудь подкорректировать их вызовы.
 */

public class ScrapCalc {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Calc.add(a, b);
        Calc.subtract(a, b);
        Calc.multiply(a, b);
        Calc.divide(a, b);
    }

    
    static class Calc {
        public static void add(int a, int b) {
        System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}
