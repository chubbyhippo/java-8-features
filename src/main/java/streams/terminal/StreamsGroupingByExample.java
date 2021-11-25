package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsGroupingByExample {
    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println(studentMap);
    }

    public static void customizedGroupingBy() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        customizedGroupingBy();
    }
}
