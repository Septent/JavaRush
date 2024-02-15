package Lvl14.Lecture4;

/*
 * Перед тобой 4 класса животных — Cow, Lion, Wolf и Elephant. Корова (Cow) и слон (Elephant) являются травоядными, поэтому они наследуются
 * от класса Herbivore.
 * А лев (Lion) и волк (Wolf) являются хищниками, поэтому они наследуются от класса Predator. В свою очередь классы Herbivore и Predator
 * унаследованы от Animal.
 * В классе Solution реализуй метод printRation(Animal animal), который должен выводить в консоли рацион переданного животного:
 * 
 *    если животное хищник, нужно вывести "Любит мясо";
 *    если животное травоядное, вывести "Любит траву"
 */

public class HerbivoreAndPredator {
    public static void main(String[] args) {
        printRation(new CowHAV());
        printRation(new LionHAV());
        printRation(new ElephantHAV());
        printRation(new WolfHAV());
    }

    public static void printRation(AnimalHAV animal){
        String herbivore = "Любит траву";
        String predator = "Любит мясо";

        if (animal instanceof HerbivoreHAV) {
            System.out.println(herbivore);
        } else if (animal instanceof PredatorHAV) {
            System.out.println(predator);
        }
    }
}

class AnimalHAV {

}

class HerbivoreHAV extends AnimalHAV {
}

class WolfHAV extends PredatorHAV {
}

class CowHAV extends HerbivoreHAV {
}

class LionHAV extends PredatorHAV {
}

class ElephantHAV extends HerbivoreHAV {
}

class PredatorHAV extends AnimalHAV {
}