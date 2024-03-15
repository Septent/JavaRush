package Lvl19.Lecture2;

/*
 * Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable. Не забудь реализовать методы!
 */

public class SelectableAndUpdatable {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        public void onSelect() {

        }

        public void refresh() {
            
        }
    }
}
