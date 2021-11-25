package numericstreams;

import java.util.Arrays;
import java.util.List;

public class NumericStreamUnBoxingExample {
    public static int[] unBoxing(List<Integer> integers) {
        return integers
                .stream()
                .mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (int i : unBoxing(integers)) {
            System.out.println(i);
        }
    }
}
