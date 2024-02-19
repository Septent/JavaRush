package Lvl14.Lecture8;

/*
 * Существуют 2 интерфейса — Swimmable и Flyable, указывающие на то, что объект умеет плавать и/или летать соответственно.
 * Расставь эти интерфейсы для классов Zeppelin (Дирижабль), Ship (Корабль) и JamesBondCar (Машина Джеймса Бонда) в соответствии с их возможностями.
 * 
 * Помни: машина Джеймса Бонда умеет все.
 */

public class FlyOrSwim {
    
}

class Ship implements Swimmable {

}

interface Swimmable {

}

class JamesBondCar implements Flyable, Swimmable {

}

class Zeppelin implements Flyable {

}

interface Flyable {

}