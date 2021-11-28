package dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("now = " + now);

        long epochSecond = now.getEpochSecond();
        System.out.println("epochSecond = " + epochSecond);

        Instant ofEpochSecond = Instant.ofEpochSecond(0);
        System.out.println("ofEpochSecond = " + ofEpochSecond);

        Instant now1 = Instant.now();

        Duration between = Duration.between(now, now1);
        System.out.println("between = " + between);
    }
}
