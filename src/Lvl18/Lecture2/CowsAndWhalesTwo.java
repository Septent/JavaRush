package Lvl18.Lecture2;

/*
 * Переопредели метод getName в классе Whale(Кит), чтобы программа выводила на экран пустую строку.
 */

public class CowsAndWhalesTwo {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName() {
            return "";
        }
    }
}
