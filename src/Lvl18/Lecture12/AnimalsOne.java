package Lvl18.Lecture12;

/*
 * Напиши метод, который определяет, какой объект передали в него.
 * Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев», «Бык», «Животное».
 */

public class AnimalsOne {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String result = switch (o.getClass().getSimpleName()) {
            case "Cat" -> "Кот";
            case "Tiger" -> "Тигр";
            case "Lion" -> "Лев";
            case "Bull" -> "Бык";
            case "Pig" -> "Свинья";
            default -> "Животное";
        };

        return result;
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
