package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindFirstExample {
    public static Optional<Student> findFirstStudent() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }
    public static void main(String[] args) {
        Optional<Student> firstStudent = findFirstStudent();
        firstStudent.ifPresent(System.out::println);
    }
}
