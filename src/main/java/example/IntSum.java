package example;

import java.util.stream.IntStream;

public class IntSum {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(0, 100).sum();
        System.out.println(sum);
    }
}
