package streams;

import data.StudentDataBase;

public class StreamsMatchExample {
    public static boolean allMatch() {
        return StudentDataBase
                .getAllStudents()
                .stream()
                .allMatch(student -> student.getGpa() >= 3.9);
    }
    public static void main(String[] args) {
        System.out.println("allMatch : " + allMatch());
    }
}
