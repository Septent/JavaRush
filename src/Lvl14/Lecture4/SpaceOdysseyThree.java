package Lvl14.Lecture4;

import java.util.ArrayList;

/*
 * Сделаем наш предыдущий пример более правильным и универсальным.
 * Порядок, в котором добавляются астронавты в список astronauts, не всегда будет известен. Чтобы правильно распределить задачи
 * членам экипажа, необходимо определить, кем является астронавт. Для этого в методе runWorkingProcess() перебери всех астронавтов
 * в цикле, используя оператор instanceof определи, кем является астронавт и передай его в качестве аргумента соответствующему методу:
 *    Human — в метод pilot(Human human);
 *    Dog — в метод createDirection(Dog dog);
 *    Cat — в метод research(Cat cat).
 * 
 * Метод runWorkingProcess() должен работать корректно независимо от количества астронавтов и порядка их добавления в astronauts.
 */

public class SpaceOdysseyThree {
    public static ArrayList<AstronautThree> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
        runWorkingProcess();
    }

    public static void runWorkingProcess() {
        for (AstronautThree astronaut : astronauts) {
            if (astronaut instanceof HumanThree) {
                pilot((HumanThree)astronaut);
            } else if (astronaut instanceof DogThree) {
                createDirection((DogThree)astronaut);
            } else if (astronaut instanceof CatThree) {
                research((CatThree)astronaut);
            }
        }
    }

    public static void pilot(HumanThree human) {
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(DogThree dog) {
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием навигационного маршрута.");
    }

    public static void research(CatThree cat) {
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }

    public static void createCrew() {
        astronauts.add(new HumanThree());
        astronauts.add(new HumanThree());
        astronauts.add(new DogThree());
        astronauts.add(new CatThree());
    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (AstronautThree astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}

class DogThree extends AstronautThree {
    public String getInfo() {
        return "Собака";
    }
}

class HumanThree extends AstronautThree {
    public String getInfo() {
        return "Человек";
    }
}

class CatThree extends AstronautThree {
    public String getInfo() {
        return "Кот";
    }
}

class AstronautThree {
    public String getInfo() {
        return "Неизвестный астронавт";
    }
}
