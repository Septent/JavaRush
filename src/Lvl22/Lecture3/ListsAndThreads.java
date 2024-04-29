package Lvl22.Lecture3;

import java.util.ArrayList;
import java.util.List;

/*
 * В методе main добавить в статический объект list 5 нитей. Каждая нить должна быть новым объектом класса Thread,
 * работающим со своим объектом класса SpecialThread.
 */

public class ListsAndThreads {
        public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new SpecialThread());
            list.add(t);
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
