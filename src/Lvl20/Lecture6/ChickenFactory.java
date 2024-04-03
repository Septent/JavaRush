package Lvl20.Lecture6;

/*
 * Давай напишем Фабрику (Factory) по производству кур (Hen):
 * 1. Создай класс Hen.
 *    Сделай его абстрактным.
 *    Добавь в класс абстрактный метод int getCountOfEggsPerMonth().
 *    Добавь в класс метод String getDescription(), который возвращает строку "Я - курица.".
 * 2. Создай класс RussianHen, который наследуется от Hen.
 * 3. Создай класс UkrainianHen, который наследуется от Hen.
 * 4. Создай класс MoldovanHen, который наследуется от Hen.
 * 5. Создай класс BelarusianHen, который наследуется от Hen.
 * 6. В каждом из четырех последних классов напиши свою реализацию метода getCountOfEggsPerMonth. Методы должны возвращать количество
 * яиц в месяц от данного типа куриц.
 * 7. В каждом из четырех последних классов напиши свою реализацию метода getDescription.
 * Методы должны возвращать строку вида:
 * <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
 * где Sssss - название страны
 * где N - количество яиц в месяц
 * 8. В классе HenFactory реализуй метод getHen, который возвращает соответствующую стране породу кур.
 * 9. Все созданные классы должны быть в отдельных файлах.
 */

public class ChickenFactory {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case "Ukraine":
                    hen = new UkrainianHen();
                    break;
                case "Russia":
                    hen = new RussianHen();
                    break;
                case "Moldova": 
                    hen = new MoldovanHen();
                    break;
                case "Belarus": 
                    hen = new BelarusianHen();
                    break;
            }
            return hen;
        }
    }

}

interface Country {
    String UKRAINE = "Ukraine";
    String RUSSIA = "Russia";
    String MOLDOVA = "Moldova";
    String BELARUS = "Belarus";
}

abstract class Hen implements Country {
    abstract int getCountOfEggsPerMonth();
    String getDescription() {
        return "Я - курица.";
    }
}

class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 10;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class UkrainianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 8;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + UKRAINE + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 7;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}

class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 12;
    }
    public String getDescription() {
        return super.getDescription() + " Моя страна - " + BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}