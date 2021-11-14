package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerExample {
    static Consumer<Student> consumer1 = System.out::println;
    static Consumer<Student> consumer2 = student -> System.out.print(student.getName());
    static Consumer<Student> consumer3 = student -> System.out.println(student.getActivities());

    public static void printName() {
        System.out.println("printName");
        StudentDataBase.getAllStudents().forEach(consumer1);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities");
        StudentDataBase.getAllStudents()
                .forEach(consumer2.andThen(consumer3));
    }

    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition");
        StudentDataBase.getAllStudents().forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                consumer2.andThen(consumer3).andThen(consumer1).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
