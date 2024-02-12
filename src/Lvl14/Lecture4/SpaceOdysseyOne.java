package Lvl14.Lecture4;

import java.util.ArrayList;

/*
 * Перед тем, как космический корабль отправится бороздить просторы Вселенной, необходимо пригласить на борт экипаж, который будет состоять из 2 людей,
 * 1 собаки и 1 кота.
 * В методе createCrew() добавь необходимое количество экземпляров соответствующих классов в список astronauts.
 * 
 * Подсказка:
 * Чтобы добавить объекты разных классов в один список, им нужен общий предок. Унаследуй интересующие тебя классы от Astronaut.
 * Кто угодно может стать исследователем космоса :)
 */

public class SpaceOdysseyOne {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Human humanOne = new Human();
        astronauts.add(humanOne);

        Human humanTwo = new Human();
        astronauts.add(humanTwo);

        Dog dog = new Dog();
        astronauts.add(dog);

        Cat cat = new Cat();
        astronauts.add(cat);
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}

class Dog extends Astronaut{
    public String getInfo(){
        return "Собака";
    }
}

class Human extends Astronaut {
    public String getInfo(){
        return "Человек";
    }
}

class Cat extends Astronaut{
    public String getInfo(){
        return "Кот";
    }
}

class Astronaut {
    public String getInfo(){
        return "Неизвестный астронавт";
    }
}
