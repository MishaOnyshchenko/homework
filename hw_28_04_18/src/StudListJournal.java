import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class StudListJournal implements Journal {

    final static String FILENAME = "D://studlist.txt";

    Map<Integer, Student> studlist = new TreeMap<>();

    @Override
    public void addStudent(Student student) {
        studlist.put(student.getId(), student);
        writeToFile();
    }

    @Override
    public void getStudent(int id) {
        System.out.println("\nAsked student: " + studlist.get(id));
    }

    @Override
    public void getStudentList() {

        try(BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
            String s;
            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        }
        catch(IOException exc){
            exc.getMessage();
        }
    }

    public void writeToFile(){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))){

            for (Integer key: studlist.keySet()) {
                bw.write(studlist.get(key) + "\n");
            }
        }
        catch(IOException exc){
            exc.getMessage();
        }
    }
}
