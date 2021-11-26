package optional;

import java.util.Optional;

public class OptionalOfExample {
    public static Optional<String> ofNullable() {
        return Optional.ofNullable(null);
    }

    public static Optional<String> of() {
        return Optional.of(null);
    }
    public static Optional<String> empty() {
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(ofNullable());
        System.out.println(of());
        System.out.println(empty());
    }
}
