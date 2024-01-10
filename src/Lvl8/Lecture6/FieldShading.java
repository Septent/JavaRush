package Lvl8.Lecture6;

/*
 * В методе main вызывается метод add, который должен увеличить значение поля salary класса Solution на переданное значение,
 * но при выводе поля salary получаем 0. Сделай так, чтобы программа работала правильно.
 */

public class FieldShading {
    public static int salary;

    public static void add(int increase) {
        salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
