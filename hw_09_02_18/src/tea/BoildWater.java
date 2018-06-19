package tea;

import ingredients.Sugar;
import ingredients.Water;

public class BoildWater implements Water, Sugar{

    private double waterPrice = 0.5;
    protected double waterDose= 1;

    private double sugarPrice = 0.2;
    protected double sugarDose = 0;


    public BoildWater() {

    }

    public BoildWater(double sugarDose) {
        this.sugarDose = sugarDose;
    }

    public BoildWater(double waterDose, double sugarDose) {
        this.waterDose = waterDose;
        this.sugarDose = sugarDose;
    }

    public void getPrice(){
        if (sugarDose == 0) {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$. Total: " + water() + "$");
        } else {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + sugar()) + "$");
        }
    }

    @Override
    public double water() {
        return waterPrice * waterDose;
    }

    @Override
    public double sugar() {
        return sugarPrice * sugarDose;
    }


}
