package Lvl7.Lecture5;

/*
 * В методе main создаются два айфона с одинаковыми параметрами.
 * В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
 * Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
 * У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.
 */

public class TwoPhones {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }
}

class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        else if (this.model == null) return false;
        else if (this.color == null) return false;

        Iphone iphone = (Iphone) obj;

        if (this.price != iphone.price) return false;

        return this.model.equals(iphone.model) && this.color.equals(iphone.color);
    }
}