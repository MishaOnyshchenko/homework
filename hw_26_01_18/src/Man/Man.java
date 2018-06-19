package Man;

public class Man {

    protected String name;
    protected int age;
    protected boolean sex;
    protected float weight;

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

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }


    public static void main(String[] args) {

        Student student = new Student(5);
        student.setName("Petro");
        System.out.println(student.getName());

    }
}
