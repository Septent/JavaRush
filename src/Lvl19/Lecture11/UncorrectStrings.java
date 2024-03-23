package Lvl19.Lecture11;

/*
 * Удали все некорректные строки в интерфейсе Button.
 */

public class UncorrectStrings {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        void onPress();

        String onPress(Object o);

    }
}
