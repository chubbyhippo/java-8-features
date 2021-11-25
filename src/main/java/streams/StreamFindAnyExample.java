package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyExample {
    public static Optional<Student> findAnyStudent() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }
    public static void main(String[] args) {
        Optional<Student> anyStudent = findAnyStudent();
        anyStudent.ifPresent(System.out::println);
    }
}
