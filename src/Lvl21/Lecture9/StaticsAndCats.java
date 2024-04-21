package Lvl21.Lecture9;

/*
 * В этой задаче тебе нужно:
 * 1. Создать класс Cat с публичным полем name типа String в классе Solution.
 * 2. В статическом блоке создать объект типа Cat и инициализировать им переменную cat (не забудь инициализировать поле name).
 * 3. В статическом блоке вывести имя созданного кота на экран.
 * Примечание: не создавай конструкторы с параметрами в классе Cat.
 */

public class StaticsAndCats {
    public static Cat cat;
    static {
        cat = new Cat();
        cat.name = "Timofey";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }
}