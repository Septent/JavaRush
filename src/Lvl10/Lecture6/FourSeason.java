package Lvl10.Lecture6;

/*
 * Нужно создать набор значений (enum) для времен года. Для этого нужно в отдельном файле создать enum Season и объявить в нем 4 значения.
 * В методе Solution выведи все перечисления с новой строки.
 */

public class FourSeason {
    public static void main(String[] args) {
        System.out.println(Season.WINTER);
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
    }

    public enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN
    } 
}
