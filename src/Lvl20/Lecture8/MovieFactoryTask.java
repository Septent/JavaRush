package Lvl20.Lecture8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * У нас есть кинофабрика, но она работает не в полную силу.
 * Давай расширим ее функционал по аналогии с тем, что уже есть, и добавим чтение с консоли.
 * Вот что тебе нужно сделать для успешного решения:
 * 1. Разобраться, что программа умеет делать.
 * 2. Все классы должны быть внутри класса Solution.
 * 3. Добавить классы Cartoon, Thriller.
 * 4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
 * 5. Аналогично получению объекта SoapOpera сделать:
 *      добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
 *      добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
 * 6. Считать с консоли несколько ключей (строк).
 * Важно: ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
 * 7. Создать переменную movie типа Movie и для каждой введенной строки (ключа):
 *      получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
 *      вывести на экран movie.getClass().getSimpleName().
 */

public class MovieFactoryTask {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        Movie movie = null;

        while (true) {
            key = reader.readLine();

            

            movie = MovieFactory.getMovie(key);
            

            if (!(key.equals("cartoon") || key.equals("thriller") || key.equals("soapOpera"))) {
                break;
            }
            System.out.println(movie.getClass().getSimpleName());
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            } else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            } else if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {

    }

    static class SoapOpera extends Movie {

    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
