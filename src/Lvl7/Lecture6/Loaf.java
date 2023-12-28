package Lvl7.Lecture6;

/*
 * Тебя отправили в магазин за покупками и сказали, что нужно купить батон, а если будут яйца, то взять десять штук.
 * Разберись, почему метод makePurchases независимо от переданных аргументов всегда выводит в консоль "Купил 10 батонов", и исправь его.
 * Метод main не участвует в проверке.
 */

public class Loaf {
    private static boolean hasEggs = true;
    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }
    
    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("Купил 10 батонов");
        } else {
            System.out.println("Купил 1 батон");
        }
    }
}
