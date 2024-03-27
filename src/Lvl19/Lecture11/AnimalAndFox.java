package Lvl19.Lecture11;

import java.awt.*;

/*
 * Реализуй интерфейс Animal в классе Fox.
 * Поменяй код так, чтобы в классе Fox был только один метод - getName.
 * Учти, что методы удалять нельзя.
 */

public class AnimalAndFox {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();

        Integer getAge();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
