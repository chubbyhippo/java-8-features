package methodreference;

import java.util.function.UnaryOperator;

public class FunctionMethodReferenceExample {
    static UnaryOperator<String> toUpperCaseMethodReference = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseMethodReference.apply("hello"));
    }
}
