package defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier {
    @Override
    public int multiply(List<Integer> integers) {
        return integers
                .stream()
                .reduce(1, (integer, integer2) -> integer * integer2);
    }

    @Override
    public int size(List<Integer> integers) {
        System.out.println("Inside MultiplierImpl");
        return Multiplier.super.size(integers);
    }
}
