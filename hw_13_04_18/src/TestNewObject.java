import java.util.Objects;

public class TestNewObject {

    public String name = "IAmObject";
    public Integer age = 212;
    public Boolean isLive = true;
    public String nationality = "Honduran";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestNewObject that = (TestNewObject) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(age, that.age) &&
                Objects.equals(isLive, that.isLive) &&
                Objects.equals(nationality, that.nationality);
    }

    @Override
    public String toString() {
        return "TestNewObject{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", isLive = " + isLive +
                ", nationality = '" + nationality + '\'' +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, isLive, nationality);
    }
}
