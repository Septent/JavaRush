package Lvl18.Lecture12;

/*
 * Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
 * Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)
 */

public class AnimalsFour {
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

    public class Duck implements CanFly, CanRun, CanSwim {
        public void swim() {

        }

        public void run() {

        }

        public void fly() {
            
        }
    }

    public class Penguin implements CanRun, CanSwim {
        public void swim() {
            
        }

        public void run() {
            
        }
    }

    public class Toad implements CanSwim {
        public void swim() {
            
        }


    }
}
