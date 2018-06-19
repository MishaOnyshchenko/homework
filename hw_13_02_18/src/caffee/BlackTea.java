package caffee;

public class BlackTea extends Drink {

    public BlackTea() {
        description = "Black tea";
    }

    @Override
    public double cost() {
        return 1.49;
    }
}

