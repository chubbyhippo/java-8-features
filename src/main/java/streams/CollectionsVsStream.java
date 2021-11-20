package streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("rescue");
        names.add("church");
        names.add("beast");
        names.add("noble");

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        names.remove(0);

        System.out.println(names);

        Stream<String> stream = names.stream();

        stream.forEach(System.out::println);
//        stream.forEach(System.out::println); error


    }
}
