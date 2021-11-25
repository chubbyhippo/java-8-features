package parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1, 100000)
                .sum());
        System.out.println(IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum());
    }
}
