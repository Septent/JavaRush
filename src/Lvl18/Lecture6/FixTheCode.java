package Lvl18.Lecture6;

/*
 * Исправь код, чтобы программа компилировалась.
 * Подсказка: метод getChild должен остаться абстрактным.
 */

public class FixTheCode {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }

        public abstract Pet getChild();
    }
}
