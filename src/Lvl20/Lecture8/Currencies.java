package Lvl20.Lecture8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Расширь функциональность программы, которая позволит производить манипуляции с валютами.
 * 1. В существующем абстрактном классе Money создай приватное поле amount типа double.
 * 2. Создай публичный геттер для поля amount(public double getAmount()), чтобы к этому полю можно было получить доступ извне класса Money.
 * 3. В отдельных файлах создай классы Hryvnia, Ruble и USD, которые будут являться потомками класса Money.
 * 4. В классах Hryvnia, Ruble и USD реализуй метод getCurrencyName() который будет возвращать название соответствующей валюты (строку) в
 *    виде аббревиатуры (USD, UAH, RUB).
 * 5. В классах Hryvnia, Ruble и USD реализуй публичный (public) конструктор, который принимает один параметр и вызывает конструктор
 *    базового класса (super) с этим параметром.
 * 6. Заполни список allMoney объектами всех возможных в рамках условия задачи и функциональности программы валют.
 */

public class Currencies {
    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Collections.addAll(ivan.getAllMoney(),
                   new Ruble(1000),
                   new Hryvnia(500),
                   new USD(2000));
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //напишите тут ваш код
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

abstract class Money {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public Money(double amount) {
        this.amount = amount;
    }

    //public abstract double getAmount();

    public abstract String getCurrencyName();
}

class Ruble extends Money {
    public Ruble(double amount) {
        super(amount);
    } 

    public String getCurrencyName() {
        return "RUB";
    }
}

class USD extends Money {
    public USD(double amount) {
        super(amount);
    } 

    public String getCurrencyName() {
        return "USD";
    }
}

class Hryvnia extends Money {
    public Hryvnia(double amount) {
        super(amount);
    } 

    public String getCurrencyName() {
        return "UAH";
    }
}