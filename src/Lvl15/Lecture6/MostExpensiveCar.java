package Lvl15.Lecture6;

import java.util.Optional;
import java.util.stream.Stream;

/*
 * У автомобиля, представленного классом Car, есть две характеристики: название - поле name, цена - поле price.
 * В классе Solution выполняются две операции поиска:
 * 
 *    метод getMostExpensiveCar(Stream<Car>) ищет самый дорогой автомобиль в одном списке;
 *    метод getMoreExpensiveCar(Stream<Car>, Car) в другом списке ищет автомобиль дороже, чем полученный в методе
 *       getMostExpensiveCar(Stream<Car>).
 * Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
 * 
 * Подсказка:
 * Для поиска элемента с максимальным искомым значением в потоке данных используй метод max(), а чтобы найти первый попавшийся
 * подходящий элемент из потока отфильтрованных данных используй метод findFirst().
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class MostExpensiveCar {
    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car1("Model S", 94_490),
                new Car1("Model 3", 50_690),
                new Car1("Model X", 99_690),
                new Car1("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car1("X5", 110_000),
                new Car1("X3", 54_000),
                new Car1("X7", 143_000),
                new Car1("X6", 125_000)
        );

        Optional<Car1> mostExpensiveCar = getMostExpensiveCar(tesla);
        mostExpensiveCar.ifPresent(System.out::println);

        Optional<Car1> moreExpensiveCar = mostExpensiveCar.flatMap(car -> getMoreExpensiveCar(bmw, car));
        moreExpensiveCar.ifPresent(System.out::println);
    }

    public static Optional<Car1> getMostExpensiveCar(Stream<Car1> cars) {
        return cars.max( (x1, x2) -> x1.getPrice() - x2.getPrice() );
    }

    public static Optional<Car1> getMoreExpensiveCar(Stream<Car1> cars, Car1 mostExpensiveCar) {
        return cars.filter(x -> x.getPrice() > mostExpensiveCar.getPrice()).findFirst();
    }
}

class Car1 {
    private String name;
    private Integer price;

    public Car1(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Автомобиль " + name + ", цена - " + price + " USD";
    }
}