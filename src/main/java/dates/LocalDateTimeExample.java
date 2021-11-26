package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime = " + localDateTime);
        LocalDateTime localDateTime1 = LocalDateTime.of(2029,
                9,
                29,
                23,
                22,
                22,
                999999);
        System.out.println("localDateTime1 = " + localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2 = " + localDateTime2);
        int hour = localDateTime.getHour();
        System.out.println("hour = " + hour);
        int minute = localDateTime.getMinute();
        System.out.println("minute = " + minute);
        int dayOfMonth = localDateTime.getDayOfMonth();
        System.out.println("dayOfMonth = " + dayOfMonth);
        int i = localDateTime.get(ChronoField.DAY_OF_MONTH);
        System.out.println("i = " + i);
        LocalDateTime plusHours = localDateTime.plusHours(2L);
        System.out.println("plusHours = " + plusHours);
        LocalDateTime minusDays = localDateTime.minusDays(2L);
        System.out.println("minusDays = " + minusDays);
        LocalDateTime withMonth = localDateTime.withMonth(12);
        System.out.println("withMonth = " + withMonth);

        LocalDateTime atTime = LocalDate.of(2029, 1, 1).atTime(23, 23);
        System.out.println("atTime = " + atTime);

        LocalDateTime atDate = LocalTime.of(23, 23).atDate(LocalDate.now());
        System.out.println("atDate = " + atDate);

    }
}
