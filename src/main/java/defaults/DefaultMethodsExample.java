package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("power", "position", "shorten", "doubt", "dog");
//        Collections.sort(strings);
        strings.sort(Comparator.naturalOrder());
        strings.forEach(System.out::println);

        strings.sort(Comparator.reverseOrder());
        strings.forEach(System.out::println);
    }
}
