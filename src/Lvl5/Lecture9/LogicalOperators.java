package Lvl5.Lecture9;

/*
 * Внеси исправления в метод taskForCondition(), чтобы он выводил в консоли число 30. Изменять можно только логические операторы: && на & и || на |.
 */

public class LogicalOperators {
    public static void main(String[] args) {
        taskForCondition();
    }

    public static void taskForCondition() {
        int number = 15;
        boolean firstCondition = number < 15 & number > 25 & (number += 15) < 25;
        boolean secondCondition = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
