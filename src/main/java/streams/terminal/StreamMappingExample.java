package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> names = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .toList();
        names.forEach(System.out::println);

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
