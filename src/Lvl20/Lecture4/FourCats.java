package Lvl20.Lecture4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Давай напишем программу, которая будет давать имена всем котикам, выпускаемым на нашей котофабрике.
 * Для этого нужно:
 * Считывать строки (параметры) с консоли, пока пользователь не введет пустую строку (Enter).
 * Для каждого параметра (имени кота):
 * создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
 * вывести на экран cat.toString().
 */

public class FourCats {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scanner = new Scanner(reader);
        ArrayList<String> values = new ArrayList<>();
        String key;

        while (!(key = scanner.nextLine()).isEmpty()) {
            values.add(key);
        }

        for (String value : values) {
            Cat cat = CatFactory.getCatByKey(value);
            System.out.println(cat);
        }
        reader.close();
        scanner.close();
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василий");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кисюлька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }
}
