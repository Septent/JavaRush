package Lvl4.Lecture9;

/*
 * Правильно унаследуй классы:
 *    машину — от транспортного средства;
 *    электрокар — от машины.
 * Удали дублирующиеся переменные.
 */

public class InheritanceTwo {
    public static void main(String[] args) {
        
    }
}

class ElectricCar extends Car {
    int electricEnginePower;
}

class Vehicle {
    double maxSpeed;

}

class Car extends Vehicle {
    int wheelCount;
    double weight;
}
