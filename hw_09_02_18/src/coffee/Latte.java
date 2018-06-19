package coffee;

import ingredients.Coffee;
import ingredients.Milk;
import ingredients.Sugar;
import ingredients.Water;

public class Latte extends Cappuccino implements Water, Coffee, Sugar, Milk {
    public Latte() {
        super();
        milkDose = 2;
    }

    public Latte(double sugarDose) {
        super(sugarDose);
        milkDose = 2;
    }

    public Latte(double waterDose, double coffeeDose, double milkDose, double sugarDose) {
        super(waterDose, coffeeDose, milkDose, sugarDose);
    }

    @Override
    public void getPrice() {
        super.getPrice();
    }

    @Override
    public double water() {
        return super.water();
    }

    @Override
    public double coffee() {
        return super.coffee();
    }

    @Override
    public double sugar() {
        return super.sugar();
    }

    @Override
    public double milk() {
        return super.milk();
    }
}
