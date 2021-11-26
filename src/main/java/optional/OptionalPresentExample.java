package optional;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> helloOptional = Optional.ofNullable("hello optional");
        if (helloOptional.isPresent()) {
            System.out.println(helloOptional.get());

        }
        helloOptional.ifPresent(System.out::println);

    }
}
