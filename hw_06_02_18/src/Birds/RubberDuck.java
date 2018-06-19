package Birds;

public class RubberDuck extends Bird {

    public RubberDuck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.print("Krya-krya! ");
    }
}