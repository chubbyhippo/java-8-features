package dates;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime = " + zonedDateTime);
        ZoneOffset zonedDateTimeOffset = zonedDateTime.getOffset();
        System.out.println("zonedDateTimeOffset = " + zonedDateTimeOffset);
        ZoneId zonedDateTimeZone = zonedDateTime.getZone();
        System.out.println("zonedDateTimeZone = " + zonedDateTimeZone);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("availableZoneIds = " + availableZoneIds);
        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);
        long availableZoneIdsSize = ZoneId.getAvailableZoneIds().size();
        System.out.println("availableZoneIdsSize = " + availableZoneIdsSize);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/Chicago"));
        System.out.println("America/Chicago = " + zonedDateTime1);

        ZonedDateTime now = ZonedDateTime.now(Clock.systemDefaultZone());
        System.out.println("now = " + now);

        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("localDateTime = " + localDateTime);
    }
}
