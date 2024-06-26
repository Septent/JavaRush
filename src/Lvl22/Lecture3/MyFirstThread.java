package Lvl22.Lecture3;

/*
 * Создать public static class TestThread - нить с интерфейсом Runnable.
 * TestThread должен выводить в консоль "My first thread".
 */

public class MyFirstThread {
    public static void main(String[] args) {
        TestThread task = new TestThread();
        new Thread(task).start();
    }

    public static class TestThread implements Runnable {
        public void run() {
            System.out.println("My first thread");
        }
    }
}