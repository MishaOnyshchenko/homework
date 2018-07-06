/*Написать простую круд программу: Есть пустой список студентов.
Реализовать ф-ционал добавления, удаления, редактирования, чтения данного списка.
Использовать мавен. Протестировать методы с помощью junit.
Разобратся как запускать отдельно все тесты через мавен + из терминала. */

public class Student {

    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Student createStudent(Map <String, Student> studMap, String name, String gender, int age){
        Student student = new Student(name, gender, age);
        studMap.put(name, student);
        return student;
    }

    public void readStudent(Map <String, Student> studMap, String name){
        System.out.println(studMap.get(name));
    }

    public void updateStudent(Map <String, Student> studMap, String name, String newName, String gender, int age){
        Student student = new Student(newName, gender, age);
        studMap.replace(name, student);
    }

    public void deleteStudent(Map <String, Student> studMap, String name){
        studMap.remove(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name) &&
                Objects.equals(gender, student.gender);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, gender, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
