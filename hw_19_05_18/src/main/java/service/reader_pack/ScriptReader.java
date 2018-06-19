package service.reader_pack;

import domenObject.Student;

import java.io.*;
import java.util.*;
import java.util.regex.*;

        /*Нужно найти способ сгенерировать данные таблицы в файл любого расширения.
        После чего программно считать его и вывести в консоль:
        - количество студентов в таблице;
        - всех студентов которые имеют почту на домене gmail.com;
        - вывести однофамильцев.*/
public class ScriptReader implements ScriptReaderService {

    public static int count = 0;

    private static final String INSERT_SCRIPT_FILE = "D:\\0 - Java\\0 - projects\\javaKonang\\Misha_Onyshchenko\\student_home_works\\Misha_Onyshchenko\\src\\hw_19_05_18\\src\\main\\resources\\insert_student_db.sql";

    @Override
    public List<Student> readScriptAndFillCollection(List<Student> studList) {
        Student student = null;
        String[] studArray = null;
        String studentDataStr = null;

        try (BufferedReader br = new BufferedReader(new FileReader(INSERT_SCRIPT_FILE))) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                count++;
                studentDataStr = sCurrentLine.substring(sCurrentLine.indexOf("VALUES") + 8, sCurrentLine.length() - 3).replace("\'", "").replace(" ", "");
                studArray = studentDataStr.split(",");

                student = new Student(studArray[0], studArray[1], studArray[2], studArray[3]);

                studList.add(student);
            }
        } catch (IOException exc) {
            exc.getMessage();
        }
        return studList;
    }

    /*вывести в консоль: количество студентов в таблице*/
    public void howManyStudents() {
        System.out.println("\nThere are " + count + " students in the table.\n");
    }

    /*вывести в консоль: всех студентов которые имеют почту на домене gmail.com*/
    public void checkIfHasGmail(List<Student> studList) {
        Pattern p = Pattern.compile(".*@gmail.com");

        for (Student s : studList) {
            Matcher m = p.matcher(s.getEmail());
            if (m.matches()) {
                System.out.println(s.getName() + " " + s.getSer_name() + " is using gmail: " + s.getEmail());
            }
        }
    }

    /*вывести однофамильцев*/
    public void nameSake(List<Student> studList) {

        for (int i = 0; i < studList.size(); i++) {
            Student firstStudent = studList.get(i);
            for (int j = i + 1; j < studList.size(); j++) {
                Student secondStudent = studList.get(j);
                if (firstStudent.getSer_name().equals(secondStudent.getSer_name())) {
                    System.out.println("\nNamesakes: " + firstStudent.getName() + " " + firstStudent.getSer_name() + " and " + secondStudent.getName() + " " + secondStudent.getSer_name() + "!");
                }
            }
        }
    }

    /*выбрать имена студентов у которых оператор связи МТС*/
    public void showVodafoneClients(List<Student> studList){
        System.out.println("\nStudents use Vodafone +380(50|66|95|99): ");
        Pattern p = Pattern.compile("^\\+380(50|66|95|99)\\d{7}$");
        for (Student s : studList) {
            Matcher m = p.matcher(s.getPhone());
            if(m.matches()){
                System.out.println(s.getName() + " " + s.getSer_name() + ", tel: " + s.getPhone());
            }
        }
    }

    /*выбрать имена студентов у которых оператор связи МТС и лайф*/
    public void showVodafoneAndLifeClients(List<Student> studList){
        System.out.println("\nStudents use Vodafone and Life +380(50|66|95|99|63|73|93): ");
        Pattern p = Pattern.compile("^\\+380(50|66|95|99|63|73|93)\\d{7}$");
        for (Student s : studList) {
            Matcher m = p.matcher(s.getPhone());
            if(m.matches()){
                System.out.println(s.getName() + " " + s.getSer_name() + ", tel: " + s.getPhone());
            }
        }
    }

    /*выбрать имена студентов у которых оператор связи МТС или киевстар.*/
    public void showVodafoneAndKyivstarClients(List<Student> studList){
        System.out.println("\nStudents use Vodafone and Kyivstar +380(50|66|95|99|39|67|68|96|97|98): ");
        Pattern p = Pattern.compile("^\\+380(50|66|95|99|39|67|68|96|97|98)\\d{7}$");
        for (Student s : studList) {
            Matcher m = p.matcher(s.getPhone());
            if(m.matches()){
                System.out.println(s.getName() + " " + s.getSer_name() + ", tel: " + s.getPhone());
            }
        }
    }
}
