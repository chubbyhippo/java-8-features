package numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsBoxingExample {
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)
                .boxed()
                .toList();
    }
    public static void main(String[] args) {
       boxing().forEach(System.out::println);
    }
}
