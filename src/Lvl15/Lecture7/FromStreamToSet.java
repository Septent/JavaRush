package Lvl15.Lecture7;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Необходимо, чтобы метод getFilteredStrings(Stream<String>) преобразовывал входящий поток строк во множество строк,
 * длина которых больше шести символов.
 * 
 * Реализуй его, используя метод collect() объекта типа Stream<String>. В качестве параметра передай нужный коллектор
 * (объект типа Collector<Set<String>>). Такой объект можно получить, вызвав статический метод toSet() класса Collectors.
 * 
 * Метод main() не принимает участие в тестировании.
 */

public class FromStreamToSet {
        public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        Set<String> set = stringStream.filter(x -> x.length() > 6).collect( Collectors.toSet());
        return set;
    }
}
