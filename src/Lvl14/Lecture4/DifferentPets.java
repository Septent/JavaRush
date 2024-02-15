package Lvl14.Lecture4;

/*
 * Класс Pet является родительским классом для классов Cat и Dog. В нем реализован метод printInfo(), который сообщает,
 * что данный объект является питомцем.
 * В классах Cat и Dog переопредели метод printInfo(), дополнив его функционал следующим образом:
 * 
 * вначале вызови метод printInfo() родительского класса;
 * потом дополнительно выведи в консоли "Я не люблю людей" для класса Cat или "Я люблю людей" для класса Dog.
 * Пример вывода для класса Cat:
 *    Я домашний питомец.
 *    Я не люблю людей.
 * 
 * Пример вывода для класса Dog:
 *    Я домашний питомец.
 *    Я люблю людей.
 */

public class DifferentPets {
    public static void main(String[] args) {
        CatDP cat = new CatDP();
        cat.printInfo();
        DogDP dog = new DogDP();
        dog.printInfo();
    }
}

class PetDP {
    public void printInfo(){
        System.out.println("Я домашний питомец.");
    }
}

class DogDP extends PetDP {
    public static final String DOG = "Я люблю людей.";

    @Override
    public void printInfo() {
         super.printInfo();
         System.out.println(DOG);
    }
}

class CatDP extends PetDP {
    public static final String CAT = "Я не люблю людей.";

    @Override
    public void printInfo() {
         super.printInfo();
         System.out.println(CAT);
    }
}