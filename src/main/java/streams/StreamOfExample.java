package streams;

import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("recent", "sun", "big", "possess", "address");
        stringStream.forEach(System.out::println);
    }
}
