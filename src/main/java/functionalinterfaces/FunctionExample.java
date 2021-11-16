package functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = String::toUpperCase;

    static Function<String, String> addSomeString = name -> name.toUpperCase().concat("test");

    public static void main(String[] args) {
        System.out.println("Result is : " + function.apply("hello"));

        System.out.println("Result of andThen is : " + function.andThen(addSomeString).apply("hello "));

        System.out.println("Result of compose is : " + function.compose(addSomeString).apply("hello "));
    }
}
