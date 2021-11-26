package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integers = Arrays.asList(82, 73, 63, 28, 91);
        System.out.println("Multiply :");
        System.out.println(multiplier.multiply(integers));
        System.out.println("Size :");
        System.out.println(multiplier.size(integers));
        System.out.println("Is empty? :");
        System.out.println(Multiplier.isEmpty(integers));
    }
}
