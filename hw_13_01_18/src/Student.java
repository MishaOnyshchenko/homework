import java.util.concurrent.ThreadLocalRandom;
import java.util.*;

public class Student {

    private String name;
    private int age;
    private int size;


    public Student() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public int randomAge(){
        int min = 7;
        int max = 16;
        int randomAge = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomAge;
    }
    public String randomName (){
        String names [] = {"Kolya", "Sasha", "Petya", "Katya", "Olya", "Valera",
                "Anton", "Nina", "Kirill", "Bogdan","Taras", "Nazar", "Valya",
                "Vera", "Nadya", "Lyuba", "Ruslan", "Andrey", "Kostya", "Zina"};
        name = names[ThreadLocalRandom.current().nextInt(names.length)];
        return name;
    }
}
