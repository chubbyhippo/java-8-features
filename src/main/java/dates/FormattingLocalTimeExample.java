package dates;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalTimeExample {
    public static void parseTime() {
        String time = "13:00";
        LocalTime localTime = LocalTime.parse(time);
        System.out.println("localTime = " + localTime);

        LocalTime parse = LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("parse = " + parse);

        String time1 = "13*00";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH*mm");
        LocalTime parse1 = LocalTime.parse(time1, dateTimeFormatter);
        System.out.println("parse1 = " + parse1);

        String time2 = "13*00*02";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("HH*mm*ss");
        LocalTime parse2 = LocalTime.parse(time2, dateTimeFormatter1);
        System.out.println("parse2 = " + parse2);

    }

    public static void formatTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime = LocalTime.now();
        String format = localTime.format(dateTimeFormatter);
        System.out.println("format = " + format);
    }

    public static void main(String[] args) {
        parseTime();
        formatTime();
    }
}
