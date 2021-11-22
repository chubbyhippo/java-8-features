package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMaxExample {
    public static int findMaxValue(List<Integer> integers) {
        return integers
                .stream()
                .reduce(Integer.MIN_VALUE, (integer, integer2) -> integer > integer2 ? integer : integer2);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integers) {
        return integers
                .stream()
                .reduce((integer, integer2) -> integer > integer2 ? integer : integer2);
    }

    public static void main(String[] args) {
        var integers = Arrays.asList(874, 232, 772, 844, 931);
        System.out.println(findMaxValue(integers));

        var maxValueOptional = findMaxValueOptional(integers);
        if (maxValueOptional.isPresent()) {
            System.out.println(maxValueOptional);
            System.out.println(maxValueOptional.get());
        } else {
            System.out.println("Input list is empty");
        }
    }
}
