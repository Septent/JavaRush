package Lvl18.Lecture2;

/*
 * Напиши метод, который определяет, объект какого класса ему передали, и возвращает результат: одно из значений — «Корова»,
 * «Кит», «Собака», «Неизвестное животное».
 */

public class LetsDecideAnimal {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        switch (o.getClass().getSimpleName()) {
            case "Cow":
                return "Корова";
            case "Dog":
                return "Собака";
            case "Whale":
                return "Кит";
            default:
                return "Неизвестное животное";
        }
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
