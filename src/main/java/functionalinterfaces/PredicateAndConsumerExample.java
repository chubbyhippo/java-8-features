package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;
    static BiConsumer<String, List<String>> biConsumer
            = (name, activities) -> System.out.println(name + " : " + activities);

    static Consumer<Student> studentConsumer = student -> {
        if (p1.and(p2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities(StudentDataBase.getAllStudents());
    }
}
