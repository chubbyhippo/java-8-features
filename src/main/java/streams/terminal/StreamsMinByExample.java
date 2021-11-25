package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

public class StreamsMinByExample {
    public static Optional<Student> minBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .min(Comparator.comparing(Student::getGpa));
    }

    public static void main(String[] args) {
        minBy().ifPresent(System.out::println);
    }
}
