package Lvl6.Lecture5;

/*
 * Реализуй метод changePath(String, String) так, чтобы он заменял версию jdk в пути, полученном первым параметром метода,
 * на версию, полученную вторым параметром, и возвращал новый путь.
 * Версия jdk начинается со строки "jdk" и заканчивается на "/".
 * Пример:
 *    путь — "/usr/java/jdk1.8/bin/"
 *    версия jdk — "jdk-13"
 */

public class Substrings {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        String[] str = path.split("/");
        str[3] = jdk;
        return String.join("/", str);
    }
}
