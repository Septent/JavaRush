package Lvl18.Lecture12;

/*
 * Напиши метод, который определяет, какой объект в него передали.
 * Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
 * 
 * Примечание: постарайся определять тип животного как можно более точно.
 */

public class AnimalsThree {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        switch (o.getClass().getSimpleName()) {
            case "Cat": return "Кот";
            case "Lion": return "Лев";
            case "Bull": return "Бык";
            case "Cow": return "Корова";
            case "Tiger": return "Тигр";
            default: return "Животное";
        }
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
