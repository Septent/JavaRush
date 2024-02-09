package Lvl13.Lecture6;

import java.time.Instant;

/*
 * В классе Solution реализуй три метода:
 * 
 * в методе getMaxFromMilliseconds верни максимальный Instant, который можно получить с помощью метода ofEpochMilli(long milliseconds);
 * в методе getMaxFromSeconds верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds);
 * в методе getMaxFromSecondsAndNanos верни максимальный Instant, который можно получить с помощью метода ofEpochSecond(long seconds, long nanos).

 */

public class EndOfTime {
    public static void main(String[] args) {
        System.out.println(getMaxFromMilliseconds());
        System.out.println(getMaxFromSeconds());
        System.out.println(getMaxFromSecondsAndNanos());
    }

    static Instant getMaxFromMilliseconds() {
        return Instant.ofEpochMilli(Long.MAX_VALUE);
    }

    static Instant getMaxFromSeconds() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond());
    }

    static Instant getMaxFromSecondsAndNanos() {
        return Instant.ofEpochSecond(Instant.MAX.getEpochSecond(), Instant.MAX.getNano());
    }
}
