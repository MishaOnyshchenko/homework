import java.util.*;

/*Написать простую круд программу: Есть пустой список студентов.
Реализовать ф-ционал добавления, удаления, редактирования, чтения данного списка.
Использовать мавен. Протестировать методы с помощью junit.
Разобратся как запускать отдельно все тесты через мавен+ из терминала. */

public class StudentRunner {
    public static void main(String[] args) {

        //creating empty list of students and object of the Student class
        Map<String, Student> studMap = new HashMap<>();
        Student student = new Student();

        //creating 2 students and putting them to the studMap
        student.createStudent(studMap, "Vasya", "man", 17);
        student.createStudent(studMap, "Asya", "woman", 16);
        System.out.println("Initial ist of the students: " + studMap);

        //updating of the student "Vasya"
        student.updateStudent(studMap, "Vasya", "Vasylisa", "woman",26);

        //reading of the student "Vasya"
        student.readStudent(studMap, "Vasya");

        //deleting of the student "Vasya"
        student.deleteStudent(studMap, "Vasya");

        System.out.println("Final list of the students: " + studMap);
    }
}
