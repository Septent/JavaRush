package Lvl19.Lecture11;

import java.awt.*;

/*
 * Исправь классы Fox и BigFox так, чтобы программа компилировалась.
 * В решении этой задачи не нужно создавать экземпляры базового класса.
 * Метод main не изменяй.
 */

public class FoxAndBigFox {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        public Color getColor() {
            return new Color(0, 0, 0, 0);
        }
    }
}
