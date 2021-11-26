package dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = LocalDate.of(2029, 12, 31);
        Period period = now.until(future);
        int days = period.getDays();
        System.out.println("days = " + days);
        int months = period.getMonths();
        System.out.println("months = " + months);
        int years = period.getYears();
        System.out.println("years = " + years);
        Period period1 = Period.ofDays(10);
        System.out.println("period1 = " + period1);
        System.out.println(period1.toTotalMonths());
        Period period2 = Period.ofYears(10);
        System.out.println("period2 = " + period2);
        System.out.println(period2.toTotalMonths());
        Period between = Period.between(now, future);
        System.out.println("between = " + between);
    }
}
