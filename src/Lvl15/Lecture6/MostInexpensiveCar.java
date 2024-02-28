package Lvl15.Lecture6;

import java.util.Optional;
import java.util.stream.Stream;

/*
 * У автомобиля, представленного классом Car, есть две характеристики: название - поле name, цена - поле price.
 * В классе Solution выполняются две операции поиска:
 * 
 *    метод getCheapestCar(Stream<Car>) ищет самый дешевый автомобиль в одном списке;
 *    метод getCheaperCar(Stream<Car>, Car) в другом списке ищет автомобиль дешевле, чем полученный в методе getCheapestCar(Stream<Car>).
 * Методы возвращают не сам автомобиль (объект типа Car), а объект типа Optional<Car>.
 * 
 * Подсказка:
 * Для поиска элемента с минимальным искомым значением в потоке данных используй метод min(), а чтобы найти первый попавшийся подходящий
 * элемент из потока отфильтрованных данных используй метод findFirst().
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class MostInexpensiveCar {
    public static void main(String[] args) {
        var tesla = Stream.of(
                new Car2("Model S", 94_490),
                new Car2("Model 3", 50_690),
                new Car2("Model X", 99_690),
                new Car2("Model Y", 65_000)
        );

        var bmw = Stream.of(
                new Car2("X5", 110_000),
                new Car2("X3", 54_000),
                new Car2("X1", 40_000),
                new Car2("X6", 125_000)
        );

        Optional<Car2> cheapestCar = getCheapestCar(tesla);
        cheapestCar.ifPresent(System.out::println);

        Optional<Car2> cheaperCar = cheapestCar.flatMap(car -> getCheaperCar(bmw, car));
        cheaperCar.ifPresent(System.out::println);
    }

    public static Optional<Car2> getCheapestCar(Stream<Car2> cars) {
        return cars.min((x1, x2) -> x1.getPrice() - x2.getPrice() );
    }

    public static Optional<Car2> getCheaperCar(Stream<Car2> cars, Car2 cheapestCar) {
        return cars.filter(x -> x.getPrice() < cheapestCar.getPrice()).findFirst();
    }
}

class Car2 {
    private String name;
    private Integer price;

    public Car2(String name, Integer price) {
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