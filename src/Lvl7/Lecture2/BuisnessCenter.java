package Lvl7.Lecture2;

/*
 * Давай построим бизнес-центр, который состоит из двух зданий, один из которых только начинаем строить, а второй —
 * на этапе планирования, поэтому о нем мало что известно.
 * Тебе нужно будет создать два конструктора: один с параметрами, второй — без. Они оба должны инициализировать
 * поля floorsCount и developer.
 */

public class BuisnessCenter {
    public static void main(String[] args) {
        SkyscraperThree skyscraper = new SkyscraperThree();
        SkyscraperThree skyscraperUnknown = new SkyscraperThree(50, "Неизвестно");
    }
}

class SkyscraperThree {
    private int floorsCount;
    private String developer;

    public SkyscraperThree() {
        this.floorsCount = 5;
        this.developer = "JavaRushDevelopment";
    }

    public SkyscraperThree(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }
}
