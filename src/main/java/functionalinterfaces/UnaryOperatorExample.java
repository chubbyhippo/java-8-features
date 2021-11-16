package functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = s -> s.concat("Test");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("hello "));
    }
}
