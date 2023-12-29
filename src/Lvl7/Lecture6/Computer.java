package Lvl7.Lecture6;

/*
 * Попробуем собрать компьютер. У нас есть классы: системный блок, монитор, клавиатура, мышь. В классе компьютер в конструкторе создай
 * объекты классов-составляющих компьютера.
 */

public class Computer {
    Keyboard keyboard = new Keyboard();
    SystemUnit systemUnit = new SystemUnit();
    Mouse mouse = new Mouse();
    Monitor monitor = new Monitor();
}

class Keyboard {

}

class SystemUnit {

}

class Mouse {
}

class Monitor {

}