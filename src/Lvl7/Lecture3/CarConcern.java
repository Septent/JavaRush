package Lvl7.Lecture3;

/*
 * Почувствуй себя автоконструктором и найди решение, как сделать так, чтобы завод снова заработал. Для этого тебе нужно добавить
 * инициализацию полей в конструкторах соответствующими параметрами. Если параметр отсутствует, то нужно инициализировать поле
 * значением по умолчанию. Для поля year это текущий год (4321), для поля color — Оранжевый.
 */

public class CarConcern {
    public static void main(String[] args) {
        
    }
}

class CarConc {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConc(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConc(String model, int year) {
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public CarConc(String model) {
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }
}
