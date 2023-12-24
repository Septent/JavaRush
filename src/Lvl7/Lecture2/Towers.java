package Lvl7.Lecture2;

/*
 * Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
 *    Объявляет о результате постройки.
 *    Объявляет о результате и указывает количество этажей.
 *    Объявляет о результате и указывает застройщика.
 * Пример вывода:
 *    Небоскреб построен.
 *    Небоскреб построен. Количество этажей - 50
 *    Небоскреб построен. Застройщик - JavaRushDevelopment
 * Для решения задания тебе нужно объявить три разных конструктора и в них выводить текст.
 * Метод main не участвует в тестировании.
 */



public class Towers {
    public static void main(String[] args) {
        SkyscraperTwo skyscraper = new SkyscraperTwo();
        SkyscraperTwo skyscraperTower = new SkyscraperTwo(50);
        SkyscraperTwo skyscraperSkyline = new SkyscraperTwo("JavaRushDevelopment");
    }
}

class SkyscraperTwo {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    SkyscraperTwo() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }

    SkyscraperTwo(int floors) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floors);
    }

    SkyscraperTwo(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + developer);
    }
}