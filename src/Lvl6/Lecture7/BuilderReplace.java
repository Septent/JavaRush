package Lvl6.Lecture7;

/*
 * Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.
 */

public class BuilderReplace {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        return sb.reverse().toString();
    }
}
