package streams;

import data.Student;
import data.StudentDataBase;

public class StreamsMapFilterReduceExample {

    private static int numberOfNoteBooks() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
//                .reduce(0, (integer, integer2) -> integer + integer2);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        int numberOfNoteBooks = numberOfNoteBooks();
        System.out.println("numberOfNoteBooks = " + numberOfNoteBooks);
    }
}
