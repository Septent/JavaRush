package Lvl15.Lecture5;

import java.util.stream.Stream;

/*
 * Реализуй метод toUpperCase(Stream<String>) так, чтобы он возвращал поток таких же строк, что и во входящем потоке, только в верхнем регистре.
 * Поскольку это будет поток уже других строк, для преобразования используй метод map() объекта типа Stream<String>.
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class DataConversionTwo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Не", "волнуйтесь", "если", "что-то", "не", "работает.", "Если", "бы", "всё", "работало", "вас", "бы", "уволили.");

        toUpperCase(stream).forEach(System.out::println);
    }

    public static Stream<String> toUpperCase(Stream<String> strings) {
        Stream<String> stream = strings.map(x -> x.toUpperCase());
        return stream;
    }
}
