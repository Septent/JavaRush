package Lvl21.Lecture12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Для решения этой задачи:
 * Инициализируй переменную Statics.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
 * В статическом блоке считай из файла с именем Statics.FILE_NAME все строки и добавь их по отдельности в List lines.
 */

public class FileInStaticBlock {
    public static List<String> lines = new ArrayList<String>();

    static {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}

class Statics {
    public static String FILE_NAME = "C:\\Users\\Win11\\Desktop\\123.bat";
}