package Lvl21.Lecture2;

/*
 * Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс Clothes.
 * Реализуй их методы.
 */

public class OOPInterfaces {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Discountable, Movable, Sellable {
        public boolean isMovable() {
            return false;
        }

        public Object getAllowedAction() {
            return new Object();
        }

        public Object getAllowedAction(String name) {
            return new Object();
        }
    }
}
