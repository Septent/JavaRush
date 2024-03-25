package Lvl19.Lecture11;

/*
 * В этой задаче тебе нужно:
 * 1. Реализовать интерфейс DBObject в классе User.
 * 2. Реализовать метод initializeIdAndName так, чтобы программа работала и выводила на экран: "The user's name is Neo, id = 1".
 * 3. Метод toString и метод main менять нельзя.
 * 4. Подумать, что должен возвращать метод initializeIdAndName в классе User.
 * Обрати внимание: методы toString() и main() менять нельзя.
 */

public class Neo {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    static class Matrix {
        public static User NEO = new User().initializeIdAndName(1, "Neo");
    }

    interface DBObject {
        DBObject initializeIdAndName(long id, String name);
    }

    static class User implements DBObject {
        long id;
        String name;

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }

        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            this.toString();
            return this;
        }
    }
}