package examples;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6, 7, 8, 8, 8, 9).distinct()
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
