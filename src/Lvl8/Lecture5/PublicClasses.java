package Lvl8.Lecture5;

/*
 * Исправь ошибки в коде, чтобы программа компилировалась и работала.
 */

public class PublicClasses {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}

class Cat {
    String name = "Tom";
}