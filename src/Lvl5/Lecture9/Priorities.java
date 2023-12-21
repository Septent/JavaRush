package Lvl5.Lecture9;

/*
 * Внеси исправления в метод main(), чтобы он выводил в консоли число 12.
 */

public class Priorities {
    public static void main(String[] args) {
        int number = 2;
        System.out.println(number + number * (number + ++number));
    }
}
