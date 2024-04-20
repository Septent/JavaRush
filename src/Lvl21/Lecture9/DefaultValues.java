package Lvl21.Lecture9;

/*
 * В этой задаче тебе нужно:
 * 1. Создать 7 нестатических public полей класса:
 *      intVar типа int
 *      doubleVar типа double
 *      DoubleVar типа Double
 *      booleanVar типа boolean
 *      ObjectVar типа Object
 *      ExceptionVar типа Exception
 *      StringVar типа String
 * 2. Убедиться, что они инициализируются дефолтными значениями.
 * 3. Вывести их значения в заданном порядке в методе main()
 */

public class DefaultValues {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        DefaultValues values = new DefaultValues();
        System.out.println(values.intVar);
        System.out.println(values.doubleVar);
        System.out.println(values.DoubleVar);
        System.out.println(values.booleanVar);
        System.out.println(values.ObjectVar);
        System.out.println(values.ExceptionVar);
        System.out.println(values.StringVar);
    }
}
