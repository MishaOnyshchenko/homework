package coffee;

import ingredients.Coffee;
import ingredients.Sugar;
import ingredients.Water;

public class Americano extends Espresso implements Water, Coffee, Sugar {

    public Americano() {
        super.waterDose = 4;
        super.coffeeDose = 2;
        super.sugarDose = 0;
    }

    public Americano(double sugarDose) {
        super(sugarDose);
        super.waterDose = 4;
        super.coffeeDose = 2;
    }

    public Americano(double waterDose, double coffeeDose, double sugarDose) {
        super(waterDose, coffeeDose, sugarDose);
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
}
