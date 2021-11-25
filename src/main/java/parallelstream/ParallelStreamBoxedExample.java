package parallelstream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {
    public static int sequentialSum(List<Integer> integers) {
        long start = System.currentTimeMillis();
        int sum = integers.stream()
                .mapToInt(value -> value)
                .sum();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration in sequential stream : " + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integers) {
        long start = System.currentTimeMillis();
        int sum = integers.stream()
                .parallel()
                .mapToInt(value -> value)
                .sum();
        long duration = System.currentTimeMillis() - start;
        System.out.println("Duration in parallel stream : " + duration);
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = IntStream.rangeClosed(1, 1000000)
                .boxed()
                .toList();

        sequentialSum(integers);
        parallelSum(integers);
    }
}
