import domenObject.Student;
import service.reader_pack.ScriptReader;
import service.writer_pack.ScriptWriter;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*create ArrayList for students*/
        List<Student> studList = new ArrayList<>();

        /*create the object of ScriptReader class*/
        ScriptReader reader = new ScriptReader();

        /*start the method to read the first script wit students, count them and fill ArrayList*/
        reader.readScriptAndFillCollection(studList);

        /*print how many students*/
        reader.howManyStudents();
        /*check and print who use gmail*/
        reader.checkIfHasGmail(studList);
        /*check and print nameSakes*/
        reader.nameSake(studList);

        /*check and print who use Vodafone/Life/Kyivstar*/
        reader.showVodafoneClients(studList);
        reader.showVodafoneAndLifeClients(studList);
        reader.showVodafoneAndKyivstarClients(studList);

        /*create the object of ScriptWriter class*/
        ScriptWriter writer = new ScriptWriter();
        /*create new 30 students and write them to the file "addNewStudents.sql"*/
        writer.addNewStudents();
        /*create the table address, fill it and write to the file "createAndFillAddressTableScript.sql"*/
        writer.createAndFillAddressTable();
    }
}
