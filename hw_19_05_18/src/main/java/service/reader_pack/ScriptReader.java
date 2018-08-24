package service.reader_pack;

import domenObject.Student;

import java.io.*;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Нужно найти способ сгенерировать данные таблицы в файл любого расширения.
После чего программно считать его и вывести в консоль:
- количество студентов в таблице;
- всех студентов которые имеют почту на домене gmail.com;
- вывести однофамильцев.*/
public class ScriptReader implements ScriptReaderService {

    public static int count = 0;

    private static final String INSERT_SCRIPT_FILE = "D:\\0 - Java\\0_projects\\0_hw\\homework\\hw_19_05_18\\src\\main\\resources\\insert_student_db.sql";
    //old - "D:\\0 - Java\\0 - projects\\javaKonang\\Misha_Onyshchenko\\student_home_works\\Misha_Onyshchenko\\src\\hw_19_05_18\\src\\main\\resources\\insert_student_db.sql";
    //new - "D:\0 - Java\0_projects\0_hw\homework\hw_19_05_18\src\main\resources\insert_student_db.sql"

    @Override
    public List<Student> readScriptAndFillCollection(List<Student> studList) {
        Student student = null;
        String[] studArray = null;
        String studentDataStr = null;

        try (BufferedReader br = new BufferedReader(new FileReader(INSERT_SCRIPT_FILE))) {
            String sCurrentLine;


            while ((sCurrentLine = br.readLine()) != null ) {

                count++;
                studentDataStr = sCurrentLine.substring(sCurrentLine.indexOf("VALUES") + 8, sCurrentLine.length() - 3).replace("\'", "").replace(" ", "");
                studArray = studentDataStr.split(",");
                System.out.println("Substring is ___________> "  + studentDataStr);

                student = new Student(studArray[0], studArray[1], studArray[2], studArray[3]);

                studList.add(student);
            }
            System.out.println("Count is " + count);
        } catch (IOException exc) {
            exc.printStackTrace();
            return studList;
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
                System.out.println(s.getName() + " " + s.getSurname() + " is using gmail: " + s.getEmail());
            }
        }
    }

    /*вывести однофамильцев*/
    public void nameSake(List<Student> studList) {

        for (int i = 0; i < studList.size(); i++) {
            Student firstStudent = studList.get(i);
            for (int j = i + 1; j < studList.size(); j++) {
                Student secondStudent = studList.get(j);
                if (firstStudent.getSurname().equals(secondStudent.getSurname())) {
                    System.out.println("\nNamesakes: " + firstStudent.getName() + " " + firstStudent.getSurname() + " and " + secondStudent.getName() + " " + secondStudent.getSurname() + "!");
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
                System.out.println(s.getName() + " " + s.getSurname() + ", tel: " + s.getPhone());
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
                System.out.println(s.getName() + " " + s.getSurname() + ", tel: " + s.getPhone());
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
                System.out.println(s.getName() + " " + s.getSurname() + ", tel: " + s.getPhone());
            }
        }
    }
}
