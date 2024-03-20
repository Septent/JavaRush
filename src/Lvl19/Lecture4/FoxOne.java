package Lvl19.Lecture4;

import java.awt.*;

/*
 * Реализуй в классе Fox интерфейс Animal.
 * Поменяй код так, чтобы в классе Fox был только один метод - getName.
 * Учти, что создавать дополнительные классы и удалять методы нельзя!
 */

public class FoxOne {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
