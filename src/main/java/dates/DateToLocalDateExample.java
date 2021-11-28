package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("date = " + date);

        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);

        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        java.sql.Date date1 = java.sql.Date.valueOf(localDate);
        System.out.println("date1 = " + date1);

        LocalDate localDate1 = date1.toLocalDate();
        System.out.println("localDate1 = " + localDate1);


    }
}
