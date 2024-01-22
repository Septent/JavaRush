package Lvl10.Lecture7;

/*
 * В классе Solution есть метод getTranslationForDayOfWeek(String), который возвращает перевод дня недели с русского на английский.
 * Твоя задача — переписать метод, используя только оператор if-else.
 */

public class SwitchToIf {
    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Вторник"));
        System.out.println(getTranslationForDayOfWeek("Пятница"));
        System.out.println(getTranslationForDayOfWeek("Высплюсенье"));
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;

        if (ru.toLowerCase().equals("понедельник")) {
            en = "Monday";
        } else if (ru.toLowerCase().equals("вторник")) {
            en = "Tuesday";
        } else if (ru.toLowerCase().equals("среда")) {
            en = "Wednesday";
        } else if (ru.toLowerCase().equals("четверг")) {
            en = "Thursday";
        } else if (ru.toLowerCase().equals("пятница")) {
            en = "Friday";
        } else if (ru.toLowerCase().equals("суббота")) {
            en = "Saturday";
        } else if (ru.toLowerCase().equals("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }
        return en;
    }
}
