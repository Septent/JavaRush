package Lvl20.Lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Посмотри, что делает эта программа.
 * Затем измени haveFun так, чтобы он вызывал метод:
 *   play(), если person имеет тип Player.
 *   dance(), если person имеет тип Dancer.
 */

public class PlayerAndDancer {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while (!(key = reader.readLine()).equals("exit")) {
            if ("player".equals(key)) {
                person = new Player();
            } else if ("dancer".equals(key)) {
                person = new Dancer();
            }
            haveFun(person);
        }
    }

    public static void haveFun(Person person) {
        if (person instanceof Player) {
            Player player = (Player) person;
            player.play();
        } else if (person instanceof Dancer) {
            Dancer dancer = (Dancer) person;
            dancer.dance();
        }
    }

    interface Person {
    }

    static class Player implements Person {
        void play() {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person {
        void dance() {
            System.out.println("dancing");
        }
    }
}
