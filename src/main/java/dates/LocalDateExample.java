package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate = " + localDate);
        LocalDate localDate1 = LocalDate.of(2022, 1, 8);
        System.out.println("localDate1 = " + localDate1);
        LocalDate localDate2 = LocalDate.ofYearDay(2022, 365);
        System.out.println("localDate2 = " + localDate2);
        Month month = localDate.getMonth();
        System.out.println("month = " + month);
        int monthValue = localDate.getMonthValue();
        System.out.println("monthValue = " + monthValue);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        int dayOfYear = localDate.getDayOfYear();
        System.out.println("dayOfYear = " + dayOfYear);
        int i = localDate.get(ChronoField.DAY_OF_MONTH);
        System.out.println("i = " + i);
        LocalDate plusDays = localDate.plusDays(2L);
        System.out.println("plusDays = " + plusDays);
        LocalDate plusMonths = localDate.plusMonths(2L);
        System.out.println("plusMonths = " + plusMonths);
        LocalDate minusDays = localDate.minusDays(2L);
        System.out.println("minusDays = " + minusDays);
        LocalDate withYear = localDate.withYear(2029);
        System.out.println("withYear = " + withYear);
        LocalDate with = localDate.with(ChronoField.YEAR, 2029);
        System.out.println("with = " + with);
        LocalDate withTemporalAdjusters = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println("withTemporalAdjusters = " + withTemporalAdjusters);
        LocalDate minus = localDate.minus(1, ChronoUnit.CENTURIES);
        System.out.println("minus = " + minus);

        boolean leapYear = localDate.isLeapYear();
        System.out.println("leapYear = " + leapYear);
        boolean equal = localDate.isEqual(minus);
        System.out.println("equal = " + equal);
        boolean before = localDate.isBefore(minus);
        System.out.println("before = " + before);
        boolean after = localDate.isAfter(minus);
        System.out.println("after = " + after);
        boolean supported = localDate.isSupported(ChronoUnit.MINUTES);
        System.out.println("supported = " + supported);
    }
}
