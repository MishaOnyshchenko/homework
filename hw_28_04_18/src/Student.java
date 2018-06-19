import lombok.*;

@Data
@AllArgsConstructor


public class Student {

    private int id;
    private String name;
    private String secondName;
    private String keyName;

    public int getId() {
        return id;
    }

    public String getKeyName() {
        return keyName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return  id + ". " +
                keyName + ", " +
                name + " " +
                secondName + ".";

    }
}
