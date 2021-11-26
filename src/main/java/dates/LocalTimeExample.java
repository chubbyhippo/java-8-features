package dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("now = " + now);
        LocalTime of = LocalTime.of(23, 33);
        System.out.println("of = " + of);
        LocalTime of1 = LocalTime.of(23, 33, 33);
        System.out.println("of1 = " + of1);
        LocalTime of2 = LocalTime.of(23, 33, 33, 898984544);
        System.out.println("of2 = " + of2);
        int hour = of2.getHour();
        System.out.println("hour = " + hour);
        int minute = of2.getMinute();
        System.out.println("minute = " + minute);
        int getChronoHourOfDay = of2.get(ChronoField.CLOCK_HOUR_OF_DAY);
        System.out.println("getChronoHourOfDay = " + getChronoHourOfDay);
        int secondOfDay = of2.toSecondOfDay();
        System.out.println("secondOfDay = " + secondOfDay);
        LocalTime minusHours = now.minusHours(2L);
        System.out.println("minusHours = " + minusHours);
        LocalTime minus = now.minus(2, ChronoUnit.HOURS);
        System.out.println("minus = " + minus);
        LocalTime withMidNight = now.with(LocalTime.MIDNIGHT);
        System.out.println("withMidNight = " + withMidNight);
        LocalTime withChronoFieldHourOfDay = now.with(ChronoField.HOUR_OF_DAY, 23);
        System.out.println("withChronoFieldHourOfDay = " + withChronoFieldHourOfDay);
        LocalTime plusMinutes = now.plusMinutes(90);
        System.out.println("plusMinutes = " + plusMinutes);
    }
}
