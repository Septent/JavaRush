package Lvl6.Lecture6;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * Используя StringTokenizer раздели query на части по разделителю delimiter.
 * Пример:
 *    getTokens("java.util.stream", "\\.") возвращает массив строк
 *    {"java", "util", "stream"}
 * Hint: решить задачу поможет метод countTokens().
 */

public class StrTokenizer {
        public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] result = new String[st.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = st.nextToken();
        }
        return result;
    }
}
