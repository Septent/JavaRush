package Lvl20.Lecture2;

/*
 * Исправь строчку 'Object animal = new Pet();' в методе main() так, чтобы программа вывела "Bingo!".
 */

public class Bingo {
    public static void main(String[] args) {
        Object animal = new Tiger();
        boolean isCat = animal instanceof Cat;
        boolean isTiger = animal instanceof Tiger;
        boolean isPet = animal instanceof Pet;

        printResults(isCat, isTiger, isPet);
    }

    private static void printResults(boolean cat, boolean tiger, boolean pet) {
        if (cat && tiger && pet) System.out.println("Bingo!");
    }

    static class Pet {
    }

    static class Cat extends Pet {
    }

    static class Tiger extends Cat {
    }
}
