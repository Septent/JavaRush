package Lvl20.Lecture8;

/*
 * Давай напишем программу, которая определит, что умеют делать жители океана:
 * 1. Подумай, как связаны интерфейсы CanSwim (способен плавать) и CanWalk (способен ходить) с классом SeaCreature (морское животное).
 * 2. Правильно расставь наследование интерфейсов и класса SeaCreature.
 * 3. Подумай, как могут быть связаны классы Orca (Косатка), Whale (Кит), RiverOtter (Выдра) с классом SeaCreature.
 * 4. Расставь правильно наследование между классами Orca, Whale, RiverOtter и классом SeaCreature.
 * 5. У выбранных классов реализуй метод getCurrentCreature, чтобы он возвращал объект у которого его вызвали.
 * 6. Подумай, какой класс должен реализовать интерфейс CanWalk и добавить интерфейс этому классу.
 * 7. Подумай, какое животное еще не умеет плавать и добавить ему интерфейс CanSwim.
 */

public class Stop {
    public static void main(String[] args) {
        CanSwim creature = new Orca();
        creature.swim();
        creature = new Whale();
        creature.swim();
        creature = new RiverOtter();
        creature.swim();
    }

    public static void test(CanSwim creature) {
        creature.swim();
    }

    interface CanWalk {
        void walk();
    }

    interface CanSwim {
        void swim();
    }

    static abstract class SeaCreature implements CanSwim {
        public void swim() {
            SeaCreature currentCreature = (SeaCreature) getCurrentCreature();
            currentCreature.displaySwim();
        }

        private void displaySwim() {
            System.out.println(getCurrentCreature().getClass().getSimpleName() + " is swimming");
        }

        abstract CanSwim getCurrentCreature();
    }

    static class Orca extends SeaCreature {
        public Orca getCurrentCreature () {
            return this;
        }
    }

    static class Whale extends SeaCreature {
        public Whale getCurrentCreature () {
            return this;
        }
    }

    static class RiverOtter implements CanSwim, CanWalk {
        public RiverOtter getCurrentCreature () {
            return this;
        }

        public void walk() {

        }
        public void swim() {

        }
    }
}
