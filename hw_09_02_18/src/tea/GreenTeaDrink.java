package tea;

import ingredients.GreenTea;

public class GreenTeaDrink extends BoildWater implements GreenTea{
    private double greenTeaPrice = 2;
    protected double greenTeaDose = 1;

    public GreenTeaDrink() {
        super();
    }

    public GreenTeaDrink(double sugarDose) {
        super(sugarDose);
    }

    public GreenTeaDrink(double waterDose, double greenTeaDose, double sugarDose) {
        super(waterDose, sugarDose);
        this.greenTeaDose = greenTeaDose;
    }

    @Override
    public void getPrice() {
        if (sugarDose == 0) {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + tea (" + greenTeaDose + ") " + greenTea() + "$. Total: " + (water() + greenTea()) + "$");
        } else {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water()  + "$ + tea (" + greenTeaDose + ") " + greenTea() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + greenTea() + sugar()) + "$");
        }
    }

    @Override
    public double water() {
        return super.water();
    }

    @Override
    public double sugar() {
        return super.sugar();
    }

    @Override
    public double greenTea() {
        return greenTeaPrice * greenTeaDose;
    }
}
