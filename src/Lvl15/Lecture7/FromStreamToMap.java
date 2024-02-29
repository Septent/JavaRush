package Lvl15.Lecture7;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/*
 * Необходимо, чтобы метод getMap(Stream<String>) преобразовывал входящий поток строк в карту (map), ключом которой является сама
 * строка, а значением — её длина.
 * 
 * Реализуй его, используя метод collect() объекта типа Stream<String>. В качестве параметра передай нужный коллектор (объект типа
 * Collector<Map<String, Integer>>). Такой объект можно получить, вызвав статический метод toMap() класса Collectors.
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class FromStreamToMap {
    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        Map<String, Integer> map = stringStream.collect( Collectors.toMap(x -> x, x -> x.length()) );
        return map;
    }
}
