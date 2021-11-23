package numericstreams;

import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {
    static class ArbitraryObj {
        private int first;
        private int second;

        public ArbitraryObj(int first, int second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public String toString() {
            return "ArbitraryObj{" +
                    "first=" + first +
                    ", second=" + second +
                    '}';
        }
    }

    public static List<ArbitraryObj> mapToObj() {
        return IntStream.rangeClosed(1, 5)
                .mapToObj(value -> new ArbitraryObj(value, value))
                .toList();
    }

    public static long mapToLong() {
        return IntStream.rangeClosed(1, 5)
                .mapToLong(value -> value)
                .sum();
    }

    public static double mapToDouble() {
        return IntStream.rangeClosed(1, 5)
                .mapToDouble(value -> value)
                .sum();
    }

    public static void main(String[] args) {
        mapToObj().forEach(System.out::println);
        System.out.println(mapToLong());
        System.out.println(mapToDouble());
    }
}
