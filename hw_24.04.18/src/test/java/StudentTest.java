import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void createStudent() {
        Map<String, Student> studMap = new HashMap<>();
        Student student = new Student();
        Student actual = student.createStudent(studMap, "Vova", "man", 15);
        Student expected = new Student("Vova", "man", 15);
        assertEquals(expected, actual);
    }

    @Test
    public void readStudent() {
    }

    @Test
    public void updateStudent() {
    }

    @Test
    public void deleteStudent() {
    }
}