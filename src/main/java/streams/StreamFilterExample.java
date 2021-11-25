package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamFilterExample {
    public static List<Student> filtersStudents() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa() >= 3.9)
                .toList();
    }

    public static void main(String[] args) {
        filtersStudents().forEach(System.out::println);
    }
}
