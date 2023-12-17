/*
 * В этой задаче тебе нужно:
 * 1. Считать 6 строк и заполнить ими массив strings.
 * 2. Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
 */

import java.util.Scanner;

public class RemoveIdentElems {
    public static String[] strings;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        
        for (int count, i = 0; i < strings.length; i++) {
            count = 0;
            String currString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currString != null && currString.equals(strings[j])) {
                    strings[j] = null;
                    count++;
                }
            }
            if (count > 0) {
                strings[i] = null;
            }
        }
        
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
        scanner.close();
    }
}
