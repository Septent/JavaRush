package Lvl19.Lecture11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * В этой задаче тебе нужно:
 * Прочесть с консоли имя файла.
 * Считывать строки с консоли, пока пользователь не введет строку "exit".
 * Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.
 */

public class WriteFile {
    public static void main(String[] args) throws IOException {
        Scanner scannerName = new Scanner(System.in);
        String fileName = scannerName.nextLine();

        Scanner scannerContent = new Scanner(System.in);

        StringBuffer stringBuffer = new StringBuffer();

        while (true) {
            String line = scannerContent.nextLine();
            stringBuffer.append(line + '\n');

            if (line.equals("exit")) {
                break;
            }
        }

        BufferedWriter writter = new BufferedWriter(new FileWriter(fileName));

        writter.write(stringBuffer.toString());
        writter.close();
    }
}
