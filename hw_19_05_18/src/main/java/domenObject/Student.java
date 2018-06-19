package domenObject;

public class Student {

    private String name;
    private String ser_name;
    private String phone;
    private String email;

    public Student(String name, String ser_name, String phone, String email) {
        this.name = name;
        this.ser_name = ser_name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSer_name() {
        return ser_name;
    }

    public void setSer_name(String ser_name) {
        this.ser_name = ser_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ser_name='" + ser_name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
