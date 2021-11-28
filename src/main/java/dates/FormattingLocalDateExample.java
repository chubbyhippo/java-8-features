package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateExample {
    public static void parseLocalDate() {
       String date = "2029-04-29";
        LocalDate parse = LocalDate.parse(date);
        System.out.println("parse = " + parse);
        LocalDate parse1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("parse1 = " + parse1);

        String s = "20290429";
        LocalDate parse2 = LocalDate.parse(s, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("parse2 = " + parse2);

        String s1 = "2029|04|28";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate parse3 = LocalDate.parse(s1, dateTimeFormatter);
        System.out.println("parse3 = " + parse3);
    }

    public static void formatLocalDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String format = localDate.format(dateTimeFormatter);
        System.out.println("format = " + format);
    }
    public static void main(String[] args) {
       parseLocalDate();
       formatLocalDate();
    }
}
