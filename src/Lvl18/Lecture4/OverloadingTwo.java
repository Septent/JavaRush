package Lvl18.Lecture4;

/*
 * Реализуй два метода: print(int) и print(Integer).
 * Напиши такой код в методе main(), чтобы вызвались оба.
 */

public class OverloadingTwo {
    public static void main(String[] args) {
        print(5);
        print((Integer) 5);
    }

    public static void print(int i) {
        
    }

    public static void print(Integer i) {

    }
}
