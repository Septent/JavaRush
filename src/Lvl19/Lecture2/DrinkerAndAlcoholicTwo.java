package Lvl19.Lecture2;

/*
 * Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.
 */

public class DrinkerAndAlcoholicTwo {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }

        }

        public boolean isAlcoholic() {
            return true;
        }
    }
}
