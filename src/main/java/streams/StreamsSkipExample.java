package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsSkipExample {
    public static Optional<Integer> skip(List<Integer> integers) {
        return integers
                .stream()
                .skip(3)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        var integers = Arrays.asList(220, 333, 308, 29, 475);
        Optional<Integer> skip = skip(integers);
        System.out.println(skip);
        skip.ifPresent(System.out::println);

    }
}
