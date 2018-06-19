package service.writer_pack;

import service.reader_pack.ScriptReader;

import java.io.*;


public class ScriptWriter implements ScriptWriterService {

    private static final String ADD_STUDENTS_SCRIPT_FILE = "D:\\0 - Java\\0 - projects\\javaKonang\\Misha_Onyshchenko\\student_home_works\\Misha_Onyshchenko\\src\\hw_19_05_18\\src\\main\\resources\\addNewStudents";

    private static final String ADDRESS_SCRIPT_FILE = "D:\\0 - Java\\0 - projects\\javaKonang\\Misha_Onyshchenko\\student_home_works\\Misha_Onyshchenko\\src\\hw_19_05_18\\src\\main\\resources\\createAndFillAddressTableScript.sql";

    /*Написать программно скрипт, который после запуска добавит 30 новых студентов в таблицу.*/
    public void addNewStudents() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ADD_STUDENTS_SCRIPT_FILE))) {
            for (int i = 1; i <= 30; i++) {
                bw.write("INSERT INTO student_db.student (name, ser_name, phone, email) VALUES ('petr" + i + "', 'frick" + i + "', '+3805034567" + i + "', 'boss" + i + "@yahoo.com');");
                bw.newLine();
            }
        } catch (IOException exc) {
            exc.getMessage();
        }
    }

    /*Программно написать скрипт который создаст таблицу адрес со следующими столбцами:
    город, улица, дом, а также скрипт который заполнит таблицу.
    При чем количество адресов должно быть равным количеству студентов в вашей таблице студенты.
    После добавления 30 строк.*/
    public void createAndFillAddressTable() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ADDRESS_SCRIPT_FILE))) {
            bw.write("CREATE TABLE address (city VARCHAR(20), street VARCHAR(20), building VARCHAR(15));");
            for (int i = 1; i <= 30 + ScriptReader.count; i++) {
                bw.write("INSERT INTO address (city, street, building) VALUES ('London', 'Pushkina', '" + i + "');");
                bw.newLine();
            }
        } catch (IOException exc) {
            exc.getMessage();
        }
    }
}
