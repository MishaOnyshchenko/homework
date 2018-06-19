import java.io.*;
import java.nio.file.Files;

public class Runner {
    private static File work;
    private static File done;
    private static File error;

    public static void main(String[] args) {

        /*Написать программу которая создает 3 пустых папки.
        Их имена: "work", "done", "error".
        Сделать проверку - если в папке "done" или "error" есть
        какие то файлы перенести их в "work".
        Остальные две должны остаться пустыми.*/
        createFolders();
        moveToWork();
        /*Написать программку которая создает 3 текстовые файла в папке "work" .
        Каждый из которых содержит строку стихотворения.
        При чем, стихотворение берем из интернета любое и записываем в константу.
        После чего работаем с этой константой и пишем 1-ю строку в первый файл, вторую во второй и  т.д.*/
        createTextFiles();

    }

    public static void createFolders() {
        work = new File("D://demo//work");
        if (!work.exists()) {
            if (work.mkdir()) {
                System.out.println("Folder work created!");
            } else {
                System.out.println("Creating failed!");
            }
        }
        done = new File("D://demo//done");
        if (!done.exists()) {
            if (done.mkdir()) {
                System.out.println("Folder done created!");
            } else {
                System.out.println("Creating failed!");
            }
        }
        error = new File("D://demo//error");
        if (!error.exists()) {
            if (error.mkdir()) {
                System.out.println("Folder error created");
            } else {
                System.out.println("Creating failed");
            }
        }
    }

    public static void moveToWork() {
        for (File f : done.listFiles()) {
            f.renameTo(new File(work, f.getName()));
        }
        for (File f : error.listFiles()) {
            f.renameTo(new File(work, f.getName()));
        }
    }

    /*Написать программку которая создает 3 текстовые файла в папке "work" .
        Каждый из которых содержит строку стихотворения.
        При чем, стихотворение берем из интернета любое и записываем в константу.
        После чего работаем с этой константой и пишем 1-ю строку в первый файл, вторую во второй и  т.д.*/
    public static void createTextFiles() {

        try(FileWriter writer = new FileWriter("D://demo//acdc.txt", false))
        {
            // запись всей строки
            String ACDC = "She was a fast machine,\n" +
                    "She kept her motor clean,\n" +
                    "She was the best damn woman that I ever seen.\n";
            writer.write(ACDC);

            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(BufferedReader br = new BufferedReader(new FileReader("D://demo//acdc.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D://demo//acdcReWrite.txt")))
        {
            //чтение построчно
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
                bw.write(s + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}
