/*
 * Реализовать метод main(String[]), в котором нужно скопировать содержимое массивов firstArray и secondArray в один массив resultArray.
 * Массив firstArray должен быть в начале нового массива resultArray, а secondArray — после него.
 * Программа должна правильно обрабатывать массивы любой длины.
 */

public class MergeArrays {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;
    public static void main(String[] args) {
        int count = 0;
        resultArray = new int[firstArray.length + secondArray.length];
        
        for (int i = 0; i < firstArray.length; i++) {
            resultArray[i] = firstArray[i];
            count++;
        }
        
        for (int i = 0; i < secondArray.length; i++) {
            resultArray[count] = secondArray[i];
            count++;
        }
        
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}
