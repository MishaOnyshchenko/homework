package service.reader_pack;

import domenObject.Student;
import org.junit.Test;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

public class ScriptReaderTest {

    @Test
    public void readScriptAndFillCollection() {
        ScriptReader scriptReader = new ScriptReader();
        List<Student> studentList = new ArrayList<>();

        //Test name, surname, phone, email from the first student in received ArrayList;
        //String newTestString = "INSERT INTO student_db.student (name, ser_name, phone, email) VALUES ('bim', 'frick', '+380503456785', 'bim@mail.ru');";

        String actualName = scriptReader.readScriptAndFillCollection(studentList).get(0).getName();
        String expectedName = "bim";
        assertEquals(expectedName, actualName);

        String actualSurname = scriptReader.readScriptAndFillCollection(studentList).get(0).getSurname();
        String expectedSurname = "frick";
        assertEquals(expectedSurname, actualSurname);

        String actualPhone = scriptReader.readScriptAndFillCollection(studentList).get(0).getPhone();
        String expectedPhone = "+380503456785";
        assertEquals(expectedPhone, actualPhone);

        String actualEmail = scriptReader.readScriptAndFillCollection(studentList).get(0).getEmail();
        String expectedEmail = "bim@mail.ru";
        assertEquals(expectedEmail, actualEmail);
    }
}