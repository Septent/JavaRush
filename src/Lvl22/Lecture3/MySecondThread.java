package Lvl22.Lecture3;

/*
 * 1. Создать public static класс TestThread, унаследованный от класса Thread.
 * 2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static block inside TestThread".
 * 3. Метод run должен выводить в консоль "it's a run method".
 */

public class MySecondThread {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it's a static block inside TestThread");
        }

        public void run() {
            System.out.println("it's a run method");
        }
    }
}
