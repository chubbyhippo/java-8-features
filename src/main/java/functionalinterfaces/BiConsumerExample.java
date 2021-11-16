package functionalinterfaces;

import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void nameAndActivites() {
        BiConsumer<String, List<String>> biConsumer =
                (name, activities) -> System.out.println(name + " : " + activities);
        var studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println("a : " + a + ", b : " + b);

        biConsumer.accept("1", "2");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("multiplication is : " + (a * b));
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("division is : " + (a / b));

        multiply.andThen(division).accept(10, 5);

        nameAndActivites();

    }
}
