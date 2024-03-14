package Lvl18.Lecture12;

/*
 * Необходимо расставить правильно ключевые слова abstract, чтобы программа компилировалась.
 * Добавь там, где нужно, и удали там, где они не нужны.
 */

public class UnnecessaryAbstractions {
    public static void main(String[] args) {
        Horse horse = new Pegasus();
        horse.run();
    }

    public static interface CanFly {
        public abstract void fly();
    }

    public static class Horse {
        public void run() {

        }
    }

    public static class Pegasus extends Horse implements CanFly {
        public void fly() {

        }
    }

    public static abstract class SwimmingPegasus extends Pegasus {
        public abstract void swim();
    }

}
