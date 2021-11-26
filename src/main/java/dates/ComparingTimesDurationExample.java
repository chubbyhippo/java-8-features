package dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(5, 15);
        LocalTime localTime1 = LocalTime.of(15, 16);
        long until = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("until = " + until);

        Duration between = Duration.between(localTime, localTime1);
        System.out.println("between = " + between);

    }
}
