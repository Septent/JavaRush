package Lvl9.Lecture5;

import java.util.ArrayList;

/*
 * В методе main создается список ArrayList<String>, присваивается переменной var strings и заполняется пятью элементами.
 * Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.
 */

public class DoubleBraces {
    public static void main(String[] args) {
        var strings = new ArrayList<String>()
        {{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    }
}
