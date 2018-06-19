package coffee;

import ingredients.Coffee;
import ingredients.Milk;
import ingredients.Sugar;
import ingredients.Water;

public class Cappuccino extends Espresso implements Water, Coffee, Sugar, Milk {
    protected double milkPrice = 1;
    protected double milkDose = 1;

    public Cappuccino() {
        super();
        milkDose = milkDose;
    }

    public Cappuccino(double sugarDose) {
        super(sugarDose);
        milkDose = milkDose;
    }

    public Cappuccino(double waterDose, double coffeeDose, double milkDose, double sugarDose) {
        super(waterDose, coffeeDose, sugarDose);
        this.milkDose = milkDose;
    }

    @Override
    public void getPrice() {
        if (sugarDose == 0) {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + coffee (" + coffeeDose + ") " + coffee() + "$ + milk (" + milkDose + ") " + milk() + "$. Total: " + (water() + coffee() + milk()) + "$");
        } else {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + coffee (" + coffeeDose + ") " + coffee() + "$ + milk (" + milkDose + ") " + milk() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + coffee() + milk() + sugar()) + "$");
        }
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
        return milkPrice * milkDose;
    }
}
