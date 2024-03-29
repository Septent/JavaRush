package Lvl13.Lecture6;

import java.time.Instant;

/*
 * В классе Solution реализуй шесть методов:
 * 
 * в методе plusMinutes нужно увеличить параметр instant на minutes минут и вернуть результат;
 * в методе plusHours нужно увеличить параметр instant на hours часов и вернуть результат;
 * в методе plusDays нужно увеличить параметр instant на days дней и вернуть результат;
 * в методе minusMinutes нужно уменьшить параметр instant на minutes минут и вернуть результат;
 * в методе minusHours нужно уменьшить параметр instant на hours часов и вернуть результат;
 * в методе minusDays нужно уменьшить параметр instant на days дней и вернуть результат.
 */

public class ManyMethods {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        long seconds = minutes * 60;
        return instant.plusSeconds(seconds);
    }

    static public Instant plusHours(Instant instant, long hours) {
        long seconds = hours * 60 * 60;
        return instant.plusSeconds(seconds);
    }

    static public Instant plusDays(Instant instant, long days) {
        long seconds = days * 24 * 60 * 60;
        return instant.plusSeconds(seconds);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        long seconds = minutes * 60;
        return instant.minusSeconds(seconds);
    }

    static public Instant minusHours(Instant instant, long hours) {
        long seconds = hours * 60 * 60;
        return instant.minusSeconds(seconds);
    }

    static public Instant minusDays(Instant instant, long days) {
        long seconds = days * 24 * 60 * 60;
        return instant.minusSeconds(seconds);
    }
}
