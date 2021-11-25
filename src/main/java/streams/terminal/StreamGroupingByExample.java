package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
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

    public static void threeArgumentGroupBy() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));
        System.out.println(studentLinkedHashMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getGradeLevel, Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMap);
    }

    public static void calculateLeastGpa() {
        Map<Integer, Student> studentMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getGradeLevel, Function.identity(),
                        BinaryOperator.minBy(Comparator.comparing(Student::getGpa))));
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
        System.out.println("threeArgumentGroupBy");
        threeArgumentGroupBy();
        System.out.println("calculateTopGpa");
        calculateTopGpa();
        System.out.println("calculateLeastGpa");
        calculateLeastGpa();
    }
}
