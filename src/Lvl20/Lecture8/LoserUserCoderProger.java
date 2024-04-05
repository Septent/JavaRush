package Lvl20.Lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Давай напишем программу, которая определит, чем заняться тому или иному человеку.
 * Для этого нужно:
 * Ввести [в цикле] с клавиатуры несколько строк (ключей).
 * Строки (ключи) могут быть такими: "user", "loser", "coder", "proger".
 * Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
 * Для каждой введенной строки нужно:
 * Создать соответствующий объект [см. Person.java], например, для строки "user" нужно создать объект класса User.
 * Передать этот объект в метод doWork.
 * Написать реализацию метода doWork, который:
 * Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
 * Вызывает метод doNothing(), если person имеет тип Loser.
 * Вызывает метод writeCode(), если person имеет тип Coder.
 * Вызывает метод enjoy(), если person имеет тип Proger.
 */

public class LoserUserCoderProger {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while(true) {
            key = reader.readLine();
            if (!(key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("proger"))) {
                break;
            }
            switch (key) {
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
            }
            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User)person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser)person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder)person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger)person).enjoy();
        }
    }
}

interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }

    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }

}