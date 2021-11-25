package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {
    public static int findMinValue(List<Integer> integers) {
        return integers
                .stream()
                .reduce(Integer.MAX_VALUE, (integer, integer2) -> integer < integer2 ? integer : integer2);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integers) {
        return integers
                .stream()
                .reduce((integer, integer2) -> integer < integer2 ? integer : integer2);
    }

    public static void main(String[] args) {
        var integers = Arrays.asList(874, 232, 772, 844, 931);
        System.out.println(findMinValue(integers));

        var minValueOptional = findMinValueOptional(integers);
        if (minValueOptional.isPresent()) {
            System.out.println(minValueOptional);
            System.out.println(minValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }
    }
}
