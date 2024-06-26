package Lvl22.Lecture10;

/*
 * 1. Разберись, что делает программа.
 * 2. Реализуй логику метода run так, чтобы каждую секунду через пробел
 * выдавался отсчет начиная с numSeconds до 1, а потом слово [Марш!] (см примеры).
 * 3. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
 * 
 * Пример для numSeconds=4 :
 * "4 3 2 1 Прервано!"
 * 
 * 4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
 * Пример для numSeconds=3 :
 * "3 2 1 Марш!"
 * 
 * PS: метод sleep выбрасывает InterruptedException.
 */

public class RaceCountdown {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while(numSeconds != 0) {
                    Thread.sleep(1000);
                    System.out.print(numSeconds + " ");
                    numSeconds--;
                }
                System.out.print("Марш!");
            } catch (InterruptedException e) {
                if (numSeconds != 0) {
                    while(numSeconds != 0) {
                        System.out.print(numSeconds + " ");
                        numSeconds--;
                    }
                }
                System.out.print("Прервано!");
            }
        }
    }
}
