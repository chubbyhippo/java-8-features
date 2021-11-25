package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.IntSummaryStatistics;
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

    public static void twoLevelGroupingByGradeLevelAndGpa() {
        Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGroupingByGradeLevelAndNoteBooks() {
        Map<String, IntSummaryStatistics> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.summarizingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void main(String[] args) {
        System.out.println("groupStudentsByGender");
        groupStudentsByGender();
        System.out.println("customizedGroupingBy");
        customizedGroupingBy();
        System.out.println("twoLevelGrouping");
        twoLevelGroupingByGradeLevelAndGpa();
        System.out.println("twoLevelGroupingByGradeLevelAndNoteBooks");
        twoLevelGroupingByGradeLevelAndNoteBooks();
    }
}
