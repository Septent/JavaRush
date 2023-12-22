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
       /* String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
*/
        String path = "/usr/java/jdk1.8/bin/";
        String jdk13 = "jdk-13";
        path = changePath(path, jdk13);
        System.out.println(path);
        jdk13 = "jdk-130";
        path = changePath(path, jdk13);
        System.out.println(path);
        jdk13 = "jdk-abra-kadabra";
        path = changePath(path, jdk13);
        System.out.println(path);
    }

    public static String changePath(String path, String jdk) {
        String subStr1 = path.substring(0, path.indexOf("jdk"));
        String subStr2 = path.substring(path.indexOf("/", path.indexOf("jdk")), path.length());
        return subStr1 + jdk + subStr2;
    }
}
