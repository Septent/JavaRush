package Lvl14.Lecture8;

import java.util.ArrayList;
import java.util.List;

/*
 * В деревне Вилларибо есть струнный оркестр, а в деревне Виллабаджо — клавишный.
 * Как-то раз повозки с музыкантами из двух деревень столкнулись на перекрестке, и все смешалось в кучу.
 * Помоги артистам разобрать свои инструменты. И естественно, после этого оба оркестра должны дать концерт.
 * 
 * Для этого:
 * 
 *    в методе createKeyboardOrchestra() добавь в список orchestra один орган и три пианино;
 *    в методе createStringedOrchestra() добавь в список orchestra две скрипки и одну гитару;
 *    метод playOrchestra() должен вызывать метод play() у всех элементов списка orchestra.
 */

public class VillariboAndVillabaggio {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        Organ organ = new Organ();
        orchestra.add(organ);
        Piano piano = new Piano();
        orchestra.add(piano);
        orchestra.add(piano);
        orchestra.add(piano);
    }

    public static void createStringedOrchestra() {
        Violin violin = new Violin();
        Guitar guitar = new Guitar();
        orchestra.add(violin);
        orchestra.add(violin);
        orchestra.add(guitar);
    }

    public static void playOrchestra() {
        for(var instrument : orchestra) {
            instrument.play();
        }
    }
}

class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино.");
    }
}

interface MusicalInstrument {
    void play();
}

class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара.");
    }
}

class Organ implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет орган.");
    }
}

class Violin implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет скрипка.");
    }
}