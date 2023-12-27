package Lvl7.Lecture5;

/*
 * Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые, то должен возвращаться
 * одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
 *    true
 *    true
 *    true
 *    true
 *    false
 *    false
 */

public class NewHashCode {
    public static void main(String[] args) {
        CarHash lamborghini = new CarHash("Lamborghini", 2020);
        CarHash lamborghini1 = new CarHash("Lamborghini", 2020);
        CarHash ferrari = new CarHash("Ferrari", 2020);
        CarHash ferrari1 = new CarHash("Ferrari", 2020);
        CarHash bugatti = new CarHash("Bugatti", 2020);
        CarHash bugatti1 = new CarHash("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}

class CarHash {
    private String model;
    private int year;

    public CarHash(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        int hash = 31 * model.hashCode() + year;
        return hash;
    }
}