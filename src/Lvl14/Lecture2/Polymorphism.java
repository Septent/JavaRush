package Lvl14.Lecture2;

/*
 * Класс Bat (летучая мышь) унаследован от класса Animal. Все логично, вот только при вызове метода move() у объекта класса Bat
 * выведется в консоли "Я бегу!".
 * Зачем бежать, если ты умеешь летать?
 * Переопредели метод move() для класса Bat, чтобы он выводил в консоли "Я лечу!".
 * Метод main() в тестировании участия не принимает.
 */

public class Polymorphism {
    public static void main(String[] args) {
        Bat bat = new Bat();
        bat.move();
    }
}

class Animal {
    public void move(){
        System.out.println("Я бегу!");
    }
}

class Bat extends Animal {
    @Override
    public void move() {
        System.out.println("Я лечу!");
    }
}
