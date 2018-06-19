package caffee;

public class Americano extends Drink {

    public Americano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 2.49;
    }
}
