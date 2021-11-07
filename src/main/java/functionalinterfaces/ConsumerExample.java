package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void printName() {
        Consumer<Student> consumer = System.out::println;
        StudentDataBase.getAllStudents().forEach(consumer);
    }

    public static void printNameAndActivities() {
        Consumer<Student> c1 = student -> System.out.print(student.getName());
        Consumer<Student> c2 = student -> System.out.println(student.getActivities());
        StudentDataBase.getAllStudents()
                .forEach(c1.andThen(c2));
    }

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("hello");
        printName();
        printNameAndActivities();
    }
}
