package methodreference;

import data.Student;
import data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> printStudentConsumer = System.out::println;
    static Consumer<Student> getPrintStudentConsumer = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(printStudentConsumer);
        StudentDataBase.getAllStudents().forEach(getPrintStudentConsumer);
    }
}
