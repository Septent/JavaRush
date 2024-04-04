package Lvl20.Lecture8;

/*
 * В этой задаче тебе нужно:
 * 1. Создать интерфейс Bridge с методом int getCarsCount().
 * 2. Создать классы WaterBridge и SuspensionBridge, которые реализуют интерфейс Bridge.
 * 3. Метод getCarsCount() должен возвращать любое фиксированное значение типа int.
 * 4. Метод getCarsCount() должен возвращать различные значения для различных классов.
 * 5. В классе Solution создать публичный метод println(Bridge bridge).
 * 6. В методе println() вывести на консоль значение getCarsCount() для объекта bridge.
 * 7. Каждый класс и интерфейс должны быть в отдельных файлах.
 */

public class Bridges {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    interface Bridge {
        int getCarsCount();
    }

    static class WaterBridge implements Bridge {
        public int getCarsCount() {
            return 1;
        }
    }

    static class SuspensionBridge implements Bridge {
        public int getCarsCount() {
            return 2;
        }
    }

    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }
}
