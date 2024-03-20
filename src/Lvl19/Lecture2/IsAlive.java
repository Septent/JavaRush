package Lvl19.Lecture2;

/*
 * В этой задаче тебе нужно:
 * Создать интерфейс Person.
 * Добавить в него метод isAlive(), который проверяет, жив человек или нет.
 * Подумать, какой тип должен возвращать этот метод.
 * Создать интерфейс Presentable.
 * Унаследовать интерфейс Presentable от интерфейса Person.
 */

public class IsAlive {
    public static void main(String[] args) throws Exception {

    }

    public interface Person {
        boolean isAlive();
    }

    public interface Presentable extends Person {
        
    }
}
