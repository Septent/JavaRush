package Lvl12.Lecture7;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/*
 * Твоя задача — обратиться к публичному API в интернете и получить данные. Напиши программу, которая будет обращаться по ссылке к публичному
 * API в интернете, получать данные и выводить их на экран.
 * 
 * Подсказки:
 * 1. Используй метод openStream() класса URL.
 * 2. Если не знаешь, какой API использовать, можешь запросить у нас на сервере список проектов-игр: https://javarush.com/api/1.0/rest/projects
 */

public class GettingViaAPI {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        InputStream input = url.openStream();

        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);
    }
}
