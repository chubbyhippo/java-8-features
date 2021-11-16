package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> p2 = student -> student.getGpa() >= 3.9;

    public static void filterStudentsByGradeLevel() {
        System.out.println("filter by Grade Level");
        StudentDataBase.getAllStudents()
                .stream()
                .filter(p1)
                .forEach(System.out::println);
    }

    public static void filterStudentsByGpa() {
        System.out.println("filter by GPA");
        StudentDataBase.getAllStudents()
                .stream()
                .filter(p2)
                .forEach(System.out::println);
    }

    public static void filterStudents() {

        System.out.println("filter by Grade and GPA");
        StudentDataBase.getAllStudents()
                .stream()
                .filter(p1.and(p2))
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudents();
    }
}
