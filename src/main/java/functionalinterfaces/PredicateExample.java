package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = integer -> integer % 2 == 0;
    static Predicate<Integer> p2 = integer -> integer % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate And result = " + p1.and(p2).test(10));
        System.out.println("Predicate And result = " + p1.and(p2).test(6));
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result = " + p1.or(p2).test(10));
        System.out.println("Predicate Or result = " + p1.or(p2).test(6));
    }

    public static void predicateNegate() {
        System.out.println("Predicate Negate result = " + p1.or(p2).negate().test(8));
    }

    public static void main(String[] args) {

        System.out.println(p1.test(8));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
