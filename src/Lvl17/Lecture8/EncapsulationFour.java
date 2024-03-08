package Lvl17.Lecture8;

/*
 * Скрой все внутренние переменные класса Cat и Dog.
 * Также скрой все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 */

public class EncapsulationFour {
    public static void main(String[] args) {
        CatEncapsulationFour cat = new CatEncapsulationFour("Vaska", 5);
        DogEncapsulationFour dog = new DogEncapsulationFour("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}

class CatEncapsulationFour {
    private String name;
    private int speed;

    public CatEncapsulationFour(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(DogEncapsulationFour dog) {
        return this.speed > dog.getSpeed();
    }
}

class DogEncapsulationFour {
    private String name;
    private int speed;

    public DogEncapsulationFour(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(CatEncapsulationFour cat) {
        return this.speed > cat.getSpeed();
    }
}