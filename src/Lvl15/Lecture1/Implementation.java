package Lvl15.Lecture1;

import java.util.ArrayList;

/*
 * В интерфейсе Runnable объявлен метод run() и есть две его реализации: в классе Car и в классе Plane.
 * В классе Solution есть публичное статическое поле ArrayList<Runnable> list, а также два публичных статических метода:
 * addToList(Runnable), который добавляет в список list элемент, полученный в качестве входного параметра, и метод runList(),
 * который вызывает метод run() у каждого элемента списка list.
 * Твоя задача — реализовать эти методы.
 * 
 * Метод main() не участвует в тестировании.
 */

public class Implementation {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        list.add(runnable);
    }

    public static void runList() {
        for (var i : list) {
            i.run();
        }
    }
}

class Plane implements Runnable {

    @Override
    public void run() {
        System.out.println("Plane is running!");
    }
}


class Car implements Runnable {

    @Override
    public void run() {
        System.out.println("Car is running!");
    }
}

interface Runnable {
    void run();
}
