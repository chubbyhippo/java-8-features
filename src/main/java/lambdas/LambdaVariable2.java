package lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    static int value = 4;

    public static void main(String[] args) {

        Consumer<Integer> consumer = integer -> {
            value++;
            System.out.println(value + integer);
        };
        value = 7;
        consumer.accept(value);
    }
}
