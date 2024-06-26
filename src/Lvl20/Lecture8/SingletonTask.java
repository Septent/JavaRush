package Lvl20.Lecture8;

/*
 * Класс является синглтоном (реализует паттерн Singleton), если позволяет создать всего один объект своего типа.
 * Реализуй Singleton pattern:
 * 1. Создай класс Singleton в отдельном файле.
 * 2. Добавь в него статический метод getInstance().
 * 3. При любом вызове метода getInstance() он должен возвращать один и тот же объект класса Singleton.
 * 4. Подумай, каким образом можно запретить создание других объектов этого класса.
 * 5. Сделай все конструкторы в классе Singleton приватными (private).
 * 6. В итоге должна быть возможность создать объект (экземпляр класса) используя только метод getInstance.
 */

public class SingletonTask {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
    }    
}

class Singleton {
    private final static Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }
}