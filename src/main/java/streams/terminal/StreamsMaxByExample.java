package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;

public class StreamsMaxByExample {
    public static Optional<Student> maxBy() {
        return StudentDataBase.getAllStudents()
                .stream()
                .max(Comparator.comparing(Student::getGpa));
    }

    public static void main(String[] args) {
        maxBy().ifPresent(System.out::println);
    }
}
