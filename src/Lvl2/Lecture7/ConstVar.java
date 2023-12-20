package Lvl2.Lecture7;

/*
 * Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).
 * Кроме этого такие константы должны быть переименованы согласно конвенции (заглавными буквами).
 */

public class ConstVar {
    public static final double PI = 3.14;
    public static double radius = 2.5;
    public static double diameter = 5;

    public static void main(String[] args) {
        System.out.println("Плошадь круга равна: " + PI * radius * radius);
        System.out.println("Периметр круга равен: " + PI * diameter);
    }
}
