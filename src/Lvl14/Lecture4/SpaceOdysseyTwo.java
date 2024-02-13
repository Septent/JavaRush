package Lvl14.Lecture4;

import java.util.ArrayList;

/*
 * Все члены экипажа космического корабля находятся на борту, корабль успешно вышел в открытый космос.
 * Команде пора приступить к выполнению своих обязанностей:
 * Людям — пилотировать корабль, Собаке — заниматься навигацией, а Коту — исследовать открытый космос.
 * 
 * Распредели обязанности членов экипажа в методе runWorkingProcess().
 * 
 * Для этого достань из списка astronauts всех людей (ты знаешь, под какими индексами они находятся) и передай их в качестве аргументов методу
 * pilot(Human human), собаку передай в метод createDirection(Dog dog), а кота — в метод research(Cat cat).
 * Другие методы не изменяй.
 * 
 * Подсказка:
 * Список astronauts содержит объекты типа Astronaut. Чтобы вызвать методы pilot(), createDirection() и research(), сначала объект Astronaut
 * нужно привести к правильному типу.
 */

public class SpaceOdysseyTwo {
    public static ArrayList<AstronautTwo> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        pilot((HumanTwo)astronauts.get(0));
        pilot((HumanTwo)astronauts.get(1));
        createDirection((DogTwo)astronauts.get(2));
        research((CatTwo)astronauts.get(3));
    }

    public static void pilot(HumanTwo human){
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(DogTwo dog){
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(CatTwo cat){
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new HumanTwo());
        astronauts.add(new HumanTwo());
        astronauts.add(new DogTwo());
        astronauts.add(new CatTwo());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (AstronautTwo astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}

class DogTwo extends AstronautTwo {
    public String getInfo() {
        return "Собака";
    }
}

class HumanTwo extends AstronautTwo {
    public String getInfo() {
        return "Человек";
    }
}

class CatTwo extends AstronautTwo {
    public String getInfo() {
        return "Кот";
    }
}

class AstronautTwo {
    public String getInfo() {
        return "Неизвестный астронавт";
    }
}
