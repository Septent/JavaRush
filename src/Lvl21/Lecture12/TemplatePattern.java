package Lvl21.Lecture12;

/*
 * В этой задаче тебе нужно:
 * 1. В отдельном файле создать класс DrinkMaker с тремя абстрактными методами:
 *      void getRightCup() - выбрать подходящую чашку;
 *      void putIngredient() - положить ингредиенты;
 *      void pour() - залить жидкость.
 * 2. В классе DrinkMaker создать и реализовать метод void makeDrink(), который готовит напиток в такой последовательности: выбирает чашку,
 * кладет ингредиенты, заливает жидкость.
 * 3. В отдельных файлах создать классы LatteMaker и TeaMaker, которые наследуются от DrinkMaker.
 * 4. Распределить следующие фразы между всеми методами в классах LatteMaker и TeaMaker:
 *      "Заливаем кипятком"
 *      "Берем чашку для латте"
 *      "Насыпаем чай"
 *      "Берем чашку для чая"
 *      "Заливаем кофе"
 *      "Делаем молоко с пенкой"
 * 5. Каждый метод должен выводить в консоль свою фразу, не пересекаясь с другими методами.
 */

public class TemplatePattern {
    public static void main(String[] args) {
    }
}

abstract class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    public void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

class LatteMaker extends DrinkMaker {
    public void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    public void putIngredient() {
        System.out.println("Делаем молоко с пенкой");
    }

    public void pour() {
        System.out.println("Заливаем кофе");
    }
}

class TeaMaker extends DrinkMaker {
    public void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    public void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    public void pour() {
        System.out.println("Заливаем кипятком");
    }
}