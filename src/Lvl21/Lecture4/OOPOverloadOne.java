package Lvl21.Lecture4;

/*
 * Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя получилось 10 различных методов printMatrix().
 */

public class OOPOverloadOne {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix() {

    }

    public static void printMatrix(int i) {
        
    }

    public static void printMatrix(int i, int j) {
        
    }

    public static void printMatrix(int i, int j, int k) {
        
    }

    public static void printMatrix(String i, int j, int k) {
        
    }

    public static void printMatrix(String i, String j, int k) {
        
    }

    public static void printMatrix(String i, String j, String k) {
        
    }

    public static void printMatrix(double i, String j, String k) {
        
    }
}
