package streams.terminal;

import data.Student;
import data.StudentDataBase;

public class StreamsSumExample {
    public static int sum() {
        return StudentDataBase.getAllStudents()
                .stream()
                .mapToInt(Student::getNoteBooks)
                .sum();

    }

    public static void main(String[] args) {
        System.out.println(sum());
    }
}
