package Lvl21.Lecture12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Для решения этой задачи тебе нужно:
 * Найти пример паттерна Singleton с ленивой реализацией (lazy initialization).
 * По образу и подобию в отдельных файлах создать в отдельных файлах три класса синглтона — Sun, Moon, Earth.
 * Реализовать интерфейс Planet в классах Sun, Moon, Earth.
 * В статическом блоке класса Solution вызвать метод readKeyFromConsoleAndInitPlanet().
 * Реализовать функционал метода readKeyFromConsoleAndInitPlanet():
 *    для этого считай с консоли один параметр типа String.
 *    если он равен одной из констант интерфейса Planet, создай соответствующий объект и присвой его Planet thePlanet, иначе — обнули Planet thePlanet.
 */

public class SingletonPattern {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String consoleInput = reader.readLine();
        switch (consoleInput) {
            case Planet.EARTH:
                thePlanet = Earth.getInstance();
                break;
            case Planet.MOON:
                thePlanet = Moon.getInstance();
                break;
            case Planet.SUN:
                thePlanet = Sun.getInstance();
                break;
            default:
                thePlanet = null;
                break;
        }
    }
}

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}

class Earth implements Planet {
    private static volatile Earth instance = null;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null) {
            synchronized (Earth.class) {
                if (instance == null) {
                    instance = new Earth();
                }
            }
        }
        return instance;
    }
}

class Sun implements Planet {
    private static volatile Sun instance = null;

    private Sun() {
    }

    public static Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }

}

class Moon implements Planet {
    private static volatile Moon instance = null;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null) {
            synchronized (Moon.class) {
                if (instance == null) {
                    instance = new Moon();
                }
            }
        }
        return instance;
    }
}
