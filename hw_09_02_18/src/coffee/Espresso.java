package coffee;

import ingredients.Coffee;
import ingredients.Sugar;
import ingredients.Water;

public class Espresso implements Water, Coffee, Sugar {

    private double waterPrice = 0.3;
    private double coffeePrice = 3;
    private double sugarPrice = 0.2;

    protected double waterDose = 1;
    protected double coffeeDose = 1;
    protected double sugarDose = 0;

    public Espresso() {

    }

    public Espresso(double sugarDose) {
        this.sugarDose = sugarDose;
    }

    public Espresso(double waterDose, double coffeeDose, double sugarDose) {
        this.waterDose = waterDose;
        this.coffeeDose = coffeeDose;
        this.sugarDose = sugarDose;
    }

    public void getPrice() {
        if (sugarDose == 0) {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + coffee (" + coffeeDose + ") " + coffee() + "$. Total: " + (water() + coffee()) + "$");
        } else {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + coffee (" + coffeeDose + ") " + coffee() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + coffee() + sugar()) + "$");
        }
    }

    public double water() {
        return waterPrice * waterDose;
    }


    public double coffee() {
        return coffeePrice * coffeeDose;
    }

    public double sugar() {
        return sugarPrice * sugarDose;
    }
}
