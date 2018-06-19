package caffee;

public class Cappuccino extends Drink {

    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 2.89;
    }
}
