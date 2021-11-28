package dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    public static void parseLocalDateTime() {
        String dateTime = "2029-04-18T15:33:33";
        LocalDateTime parse = LocalDateTime.parse(dateTime);
        System.out.println("parse = " + parse);

        LocalDateTime parse1 = LocalDateTime.parse((dateTime), DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("parse1 = " + parse1);

        String dateTime1 = "2029-04-18T15|33|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");

        LocalDateTime parse2 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("parse2 = " + parse2);


    }

    public static void formatLocalDateTime() {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String format = localDateTime.format(dateTimeFormatter);
        System.out.println("format = " + format);

    }

    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();


    }
}
