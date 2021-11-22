package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {
    public static Optional<Integer> limit(List<Integer> integers) {
        return integers
                .stream()
                .limit(2)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        var integers = Arrays.asList(220, 333, 308, 29, 475);
        Optional<Integer> limit = limit(integers);
        System.out.println(limit);
        limit.ifPresent(System.out::println);

    }
}
