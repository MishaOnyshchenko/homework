package caffee;

import caffee.Drink;

public class GreenTea extends Drink {

    public GreenTea() {
        description = "Green tea";
    }

    @Override
    public double cost() {
        return 1.79;
    }
}
