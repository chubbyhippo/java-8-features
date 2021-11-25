package numericstreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 50).sum());

        System.out.println(IntStream.rangeClosed(1, 50).max());

        System.out.println(LongStream.rangeClosed(50, 100).min());

        OptionalDouble optionalDouble = IntStream.rangeClosed(1, 50).average();
        optionalDouble.ifPresent(System.out::println);
    }
}
