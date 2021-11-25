package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {
    public static int sumOfIntegers(List<Integer> integers) {
        return integers.stream()
                .reduce(0, Integer::sum);
    }

    public static int sumOfIntStream() {
        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(sumOfIntegers(integers));
        System.out.println(sumOfIntStream());
    }
}
