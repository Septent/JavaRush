package Lvl20.Lecture4;

/*
 * Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
 * Для этого нужно:
 * 1. Реализовать интерфейс Selectable в классе Food.
 * 2. Метод onSelect() должен выводить на экран фразу "The food was selected".
 * 3. Подумай, какие методы можно вызвать для переменной food, а какие для — selectable.
 * 4. В методе callFoodMethods вызови методы onSelect, onEat, если это возможно.
 * 5. В методе callSelectableMethods вызови методы onSelect, onEat, если это возможно.
 * 6. Не используй явное приведение типов.
 */

public class TimeToEat {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        food.onEat();
        food.onSelect();
    }

    public static void callSelectableMethods(Selectable selectable) {
        selectable.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }

        public void onSelect() {
            System.out.println("The food was selected");
        }
    }
}
