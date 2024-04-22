package Lvl21.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * В этой задаче тебе нужно:
 * 1. Создать в отдельных файлах классы Plane и Helicopter, реализующие интерфейс CanFly.
 * 2. Класс Plane должен иметь конструктор с параметром int - количество перевозимых пассажиров.
 * 3. В статическом методе reset() класса Solution:
 *      считать с консоли параметр типа String;
 *      если параметр равен "helicopter", статическому объекту CanFly result присвоить объект класса Helicopter;
 *      если параметр равен "plane", считать второй параметр типа int (количество пассажиров), статическому объекту CanFly result присвоить объект класса Plane.
 * 4. В статическом блоке инициализировать CanFly result, вызвав метод reset().
 * 5. Закрыть поток ввода методом close().
 */

public class MasteringStaticBlock {
    public static void main(String[] args) {

    }

    static {
        reset();
    }

    public static CanFly result;

    public static void reset() throws IllegalArgumentException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String key = reader.readLine();
            if ("plane".equals(key)) {
                key = reader.readLine();
                result = new Plane(Integer.parseInt(key));
            } else if ("helicopter".equals(key)) {
                result = new Helicopter();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    interface CanFly {
        void fly();
    }

    static class Plane implements CanFly {
        private int passagers;

        public Plane(int passagers) {
            this.passagers = passagers;
        }

        public void fly() {

        }
    }

    static class Helicopter implements CanFly {
        public void fly() {
            
        }
    }
}
