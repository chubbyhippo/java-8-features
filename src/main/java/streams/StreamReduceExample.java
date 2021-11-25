package streams;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integers) {
        return integers
                .stream()
                //1
                //3
                //5
                //7
                // a=1, b=1(from stream) -> result 1 is returned
                // a=1, b=3(from stream) -> result 3 is returned
                // a=3, b=5(from stream) -> result 15 is returned
                // a=15, b=7(from stream) -> result 105 is returned
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {
        return integers.stream().reduce((integer, integer2) -> integer * integer2);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .reduce((student, student2) -> student.getGpa() > student2.getGpa() ? student : student2);
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);

        System.out.println(performMultiplication(integers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());

        List<Integer> emptyIntegers = new ArrayList<>();
        Optional<Integer> emptyResult = performMultiplicationWithoutIdentity(emptyIntegers);
        System.out.println(emptyResult.isPresent());
        if (emptyResult.isPresent()) {
            System.out.println(emptyResult.get());
        }

        if (getHighestGpaStudent().isPresent()) {
            System.out.println(getHighestGpaStudent());
        }
    }
}
