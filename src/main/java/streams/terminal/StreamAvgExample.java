package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.OptionalDouble;

public class StreamAvgExample {
    public static OptionalDouble avg() {
        return StudentDataBase.getAllStudents()
                .stream()
                .mapToInt(Student::getNoteBooks)
                .average();
    }
    public static void main(String[] args) {
        avg().ifPresent(System.out::println);
    }
}
