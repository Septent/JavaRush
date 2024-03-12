package Lvl18.Lecture9;

/*
 * Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавить в каждый интерфейс по одному методу.
 */

public class FlyRunSwim {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }
}
