public class Notepad {
    /*2. Реализовать блокнот, со следующими ф-циями:
добавить запись, удалить, редактировать.
В блокноте пишем:
ФИО, телефон, адрес, дату рождения, место работы, возврат, а также пол и страну проживания.*/

    String name;
    int age;
    String gender;

    public Notepad(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Notepad() {

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notepad notepad = (Notepad) o;
        return age == notepad.age &&
                Objects.equals(name, notepad.name) &&
                Objects.equals(gender, notepad.gender);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "Notepad{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
