package Lvl7.Lecture2;

/*
 * Попробуем сконструировать свой первый небоскреб и объявить о результате выполнения в консоли. Для этого тебе нужно
 * вызвать конструктор класса Skyscraper в методе main и в теле конструктора вывести в консоль текст "Небоскреб построен.".
 */

public class CreateSkyscraper {
    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
    }
}

class Skyscraper {
    public Skyscraper() {
        System.out.println("Небоскреб построен.");
    }
}
