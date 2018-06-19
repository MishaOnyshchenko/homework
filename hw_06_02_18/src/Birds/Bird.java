package Birds;

public abstract class Bird {

    private String name;

    public abstract void sound();

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}