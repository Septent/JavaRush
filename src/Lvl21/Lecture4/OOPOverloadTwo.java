package Lvl21.Lecture4;

/*
 * Посмотри на реализации метода print() в коде и определи, какой из них будет вызван.
 * Удали все лишние реализации метода print().
 */

public class OOPOverloadTwo {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(long l) {
        System.out.println("Я буду Java прогером!");
    }
}
