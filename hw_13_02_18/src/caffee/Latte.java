package caffee;

public class Latte extends Drink {

    public Latte() {
        description = "Latte";
    }

    @Override
    public double cost() {
        return 3.29;
    }
}
