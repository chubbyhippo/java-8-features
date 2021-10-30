package lambda;

import java.util.Comparator;

public class ComparatorLambda {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1 == o2
                                         // 1 -> o1 > o2
                                         // -1 -> o1 > o2
            }
        };

        System.out.println(comparator.compare(3, 2));

        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);

        System.out.println(comparatorLambda.compare(3, 2));

        Comparator<Integer> comparatorNaturalOrder = Comparator.naturalOrder();

        System.out.println(comparatorNaturalOrder.compare(3, 2));
    }
}
