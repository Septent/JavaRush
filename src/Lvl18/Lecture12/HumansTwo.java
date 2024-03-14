package Lvl18.Lecture12;

/*
 * Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс перестал быть абстрактным.
 * Добавлять/реализовывать методы в классе CTO запрещается.
 */

public class HumansTwo {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CtoParent {
        public void workHard() {

        }
    }

    public static class CTO extends CtoParent implements Businessman {

    }
}
