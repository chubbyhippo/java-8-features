package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamJoiningExample {
    public static String joining() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.joining(",", "[", "]"));
    }

    public static void main(String[] args) {
        System.out.println(joining());
    }
}
