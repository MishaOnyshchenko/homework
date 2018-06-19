package coffee;

import ingredients.*;

public class Mocaccino extends Latte implements Water, Coffee, Sugar, Milk, Chocolate {

    protected double chocolatePrice = 0.7;
    protected double chocolateDose = 1;

    public Mocaccino() {
        super();
        chocolateDose = chocolateDose;
    }

    public Mocaccino(double sugarDose) {
        super(sugarDose);
        chocolateDose = chocolateDose;
    }

    public Mocaccino(double waterDose, double coffeeDose, double milkDose, double chocolateDose, double sugarDose) {
        super(waterDose, coffeeDose, milkDose, sugarDose);
        this.chocolateDose = chocolateDose;
    }

    @Override
    public void getPrice() {
        if (sugarDose == 0) {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + coffee (" + coffeeDose + ") " + coffee() + "$ + milk (" + milkDose + ") " + milk() + "$ + chocolate (" + chocolateDose + ") " + chocolate() + "$. Total: "+ (water() + coffee() + milk() + chocolate()) + "$");
        } else {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + coffee (" + coffeeDose + ") " + coffee() + "$ + milk (" + milkDose + ") " + milk() + "$ + chocolate (" + chocolateDose + ") " + chocolate() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + coffee() + milk() + chocolate() + sugar()) + "$");
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
        return super.milk();
    }

    @Override
    public double chocolate() {
        return chocolatePrice * chocolateDose;
    }
}
