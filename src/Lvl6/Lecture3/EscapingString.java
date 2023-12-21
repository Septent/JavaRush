package Lvl6.Lecture3;

/*
 * Выведи на экран следующий текст в две строки:
 * It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
 * It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
 */

public class EscapingString {
    public static void main(String[] args) {
        System.out.println("It's a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"");
        System.out.println("It's a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"");
    }
}
