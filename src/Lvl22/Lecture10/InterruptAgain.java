package Lvl22.Lecture10;

/*
 * Создай нить TestThread.
 * В методе main создай экземпляр нити, запусти, а потом прерви ее используя метод interrupt().
 */

public class InterruptAgain {
    public static void main(String[] args) throws InterruptedException {
        TestThread tt = new TestThread();
        tt.start();
        tt.interrupt();
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread {
    }
}
