package streams;

import java.util.stream.Stream;

public class StreamsIterateExample {
    public static void main(String[] args) {
        Stream.iterate(1, integer -> integer*2)
                .forEach(System.out::println);
    }
}
