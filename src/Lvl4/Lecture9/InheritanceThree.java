package Lvl4.Lecture9;

/*
 * Правильно унаследуй классы:
 *    человека — от существа;
 *    Java-девелопера — от человека.
 * Удали дублирующие методы.
 */

public class InheritanceThree {
    public static void main(String[] args) {

    }
}

class Entity {
    public void move(){
        System.out.println("Я передвигаюсь.");
    }

    public void eat(){
        System.out.println("Я ем.");
    }
}

class Human extends Entity {
    public void speak(){
        System.out.println("Я умею общаться.");
    }
}

class JavaDeveloper extends Human {
    public void code(){
        System.out.println("Я умею общаться на Java.");
    }
}