package Lvl18.Lecture9;

/*
 * Есть public интерфейсы CanFly (летать), CanMove (передвигаться), CanEat (есть).
 * Добавь эти интерфейсы классам Dog (собака), Car (автомобиль), Duck (утка), Airplane (самолет).
 */

public class FlyMoveEat {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanMove, CanEat{
        public void move() {

        }

        public void eat() {

        }
    }

    public class Duck implements CanFly, CanEat, CanMove {
        public void fly() {

        }

        public void eat() {

        }

        public void move() {

        }
    }

    public class Car implements CanMove {
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {
        public void fly() {

        }

        public void move() {

        }
    }
}
