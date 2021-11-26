package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample2 {
    public static void sortByName(List<Student> students) {
        students.sort(Comparator.comparing(Student::getName));
    }

    public static void sortByGPA(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGpa));
    }

    public static void comparatorChaining(List<Student> students) {
        students.sort(Comparator.comparingDouble(Student::getGpa)
                .thenComparing(Student::getName));
    }

    public static void sortWithNullValues(List<Student> students) {
       students.sort(Comparator.nullsFirst(Comparator.comparing(Student::getName)));
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println("Name");
        sortByName(students);
        students.forEach(System.out::println);
        System.out.println("GPA");
        sortByGPA(students);
        students.forEach(System.out::println);
        System.out.println("Chain");
        comparatorChaining(students);
        students.forEach(System.out::println);
        List<Student> allStudentsWithNull = StudentDataBase.getAllStudentsWithNull();
        sortWithNullValues(allStudentsWithNull);
        allStudentsWithNull.forEach(System.out::println);
    }
}
