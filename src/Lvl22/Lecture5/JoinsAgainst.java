package Lvl22.Lecture5;

/*
 * 1. Разберись, что делает программа.
 * 2. Расставь вызовы методов join() так, чтобы для каждой кошки выполнялось следующее:
 * 2.1. Сначала кошка рожает котят.
 * 2.2. Потом все котята вылезают из корзинки в произвольном порядке.
 * 2.3. В конце кошка собирает их назад в корзинку.
 * 2.4. Все события для одной кошки могут быть перемешаны с событиями для другой кошки.
 * 2.5. Добавить сон котят (200 мс) в investigateWorld.
 */

public class JoinsAgainst {
    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Мурка");
        Cat cat2 = new Cat("Пушинка");
    }

    private static void investigateWorld() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class Cat extends Thread {
        protected Kitten kitten1;
        protected Kitten kitten2;

        public Cat(String name) throws InterruptedException {
            super(name);
            kitten1 = new Kitten("Котенок 1, мама - " + getName());
            //kitten1.join();
            kitten2 = new Kitten("Котенок 2, мама - " + getName());
            //kitten2.join();
            start();
        }

        public void run() {
            System.out.println(getName() + " родила 2 котят");
            try {
                initAllKittens();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": Все котята в корзинке. " + getName() + " собрала их назад");
        }

        private void initAllKittens() throws InterruptedException {
            kitten1.start();
            kitten1.join();
            kitten2.start();
            kitten2.join();
        }
    }

    public static class Kitten extends Thread {
        public Kitten(String name) {
            super(name);
        }

        public void run() {
            investigateWorld();
            System.out.println(getName() + ", вылез из корзинки");
        }
    }
}
