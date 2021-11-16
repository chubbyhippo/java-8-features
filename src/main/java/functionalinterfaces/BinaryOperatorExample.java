package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    static BinaryOperator<Integer> binaryOperator = (integer, integer2) -> integer * integer2;
    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(Comparator.naturalOrder());
    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(Comparator.naturalOrder());

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3, 4));
        System.out.println("Result of maxBy is : " + maxBy.apply(4, 5));
        System.out.println("Result of minBy is : " + minBy.apply(4, 5));
    }
}
