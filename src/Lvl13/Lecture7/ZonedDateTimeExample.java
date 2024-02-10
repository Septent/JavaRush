package Lvl13.Lecture7;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

/*
 * Что общего у всех временных зон и Пекина?
 * Правильно! Они позволят нам потренироваться в использовании классов ZoneId и ZonedDateTime :)
 * 
 * Реализуй два метода:
 *    в методе getSortedZones верни множество TreeSet всех временных зон;
 *    в методе getBeijingTime верни текущую дату и время в Пекине (временная зона для него — "Asia/Shanghai").
 */

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingDateTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> ts = new TreeSet<>();
        for (String s : ZoneId.getAvailableZoneIds()) {
            ts.add(s);
        }
        return ts;
    }

    static ZonedDateTime getBeijingDateTime() {
        ZoneId zone = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zdt = ZonedDateTime.now(zone);

        return zdt;
    }
}
