package Lvl4.Lecture3;

/*
 * В методе main вызови метод div() 2 раза. Первый раз — с такими аргументами, чтобы вывод в консоли был "Infinity", а второй — "-Infinity".
 * Код метода div() изменять нельзя.
 */

public class Infinity {
    public static void main(String[] args) {
        div(0, 1);
        div(0, -1);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
