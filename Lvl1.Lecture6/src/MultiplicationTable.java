/*
 * Проинициализируй массив MULTIPLICATION_TABLE значением new int[10][10], заполни его таблицей умножения
 * и выведи в консоли в следующем виде:
 * 1 2 3 4 …
 * 2 4 6 8 …
 * 3 6 9 12 …
 * 4 8 12 16 …
 * …
 * Числа в строке разделены пробелом.
 */


public class MultiplicationTable {
    public static int[][] multiplication_Table;
    public static void main(String[] args) {
        multiplication_Table = new int[10][10];
        
        for (int i = 0; i < multiplication_Table.length; i++) {
            for (int j = 0; j < multiplication_Table[i].length; j++) {
                multiplication_Table[i][j] = (j + 1) * (i + 1);
            }
        }
        
        for (int i = 0; i < multiplication_Table.length; i++) {
            for (int j = 0; j < multiplication_Table[i].length; j++) {
                System.out.print(multiplication_Table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
