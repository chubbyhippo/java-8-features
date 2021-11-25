package streams.terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {
    public static void partitioningBy() {
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(student -> student.getGpa() >= 3.8));
        System.out.println(partitioningMap);
    }

    public static void main(String[] args) {
        partitioningBy();
    }
}
