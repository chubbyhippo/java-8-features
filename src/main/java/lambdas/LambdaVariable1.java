package lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> c1 = integer -> System.out.println("Value is : " + i);
    }
}
