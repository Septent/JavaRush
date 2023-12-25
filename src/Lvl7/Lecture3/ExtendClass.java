package Lvl7.Lecture3;

/*
 * Эта задача нужна для понимания того, как вызывается конструктор базового класса (родителя).
 * У тебя есть классы ElectricCar, GasCar, HybridCar, которые наследуют класс Car.
 * Тебе нужно в конструкторах наследников класса Car передать тип автомобиля в конструктор базового класса (родителя),
 * используя super("тип автомобиля"). Для этого в классе Solution в методе main создай 3 объекта: HybridCar, GasCar и
 * ElectricCar.
 * 
 * Вывод должен быть следующий (последовательность может быть любая):
 * Привет. Я ElectricCar
 * Привет. Я GasCar
 * Привет. Я HybridCar
 */

public class ExtendClass {
    public static void main(String[] args) {
        HybridCar hybridCar = new HybridCar();
        GasCar gasCar = new GasCar();
        ElectricCar electricCar = new ElectricCar();
    }
}

class Car {
    public Car(String type) {
        System.out.println("Привет. Я " + type);
    }
}

class ElectricCar extends Car {
    public ElectricCar() {
        super("ElectricCar");
    }
}

class GasCar extends Car {
    public GasCar() {
        super("GasCar");
    }
}

class HybridCar extends Car {
    public HybridCar() {
        super("HybridCar");
    }
}