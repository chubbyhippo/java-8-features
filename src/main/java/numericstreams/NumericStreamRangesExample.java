package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        intStream.forEach(System.out::println);
        IntStream.rangeClosed(1,50).forEach(System.out::println);
        LongStream.rangeClosed(1,50).forEach(System.out::println);
        IntStream.range(1,50).asDoubleStream().forEach(System.out::println);

    }
}
