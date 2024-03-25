package Lvl19.Lecture11;

/*
 * Переделай наследование в классах и интерфейсах так, чтобы программа компилировалась и продолжала делать то же самое.
 * Класс Hobby должен реализовывать интерфейсы Desire, Dream.
 */

public class ErrorCorrection {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().INDEX);
    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
