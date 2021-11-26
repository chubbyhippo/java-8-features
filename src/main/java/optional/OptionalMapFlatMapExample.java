package optional;

import data.Bike;
import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .ifPresent(System.out::println);
    }

    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            stringOptional.ifPresent(System.out::println);
        }
    }

    public static void optionalFlatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 2.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
        name.ifPresent(System.out::println);

    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
