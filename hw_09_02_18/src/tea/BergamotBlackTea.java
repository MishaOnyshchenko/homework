package tea;

import ingredients.Bergamot;

public class BergamotBlackTea extends BlackTeaDrink implements Bergamot {
    protected double bergamotPrice = 0.6;
    protected double bergamotDose = 1;

    public BergamotBlackTea() {
        super();
    }

    public BergamotBlackTea(double sugarDose) {
        super(sugarDose);
    }

    public BergamotBlackTea(double waterDose, double blackTeaDose, double bergamotDose, double sugarDose) {
        super(waterDose, blackTeaDose, sugarDose);
        this.bergamotDose = bergamotDose;
    }


    @Override
    public void getPrice() {
        {
            if (sugarDose == 0) {
                System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + tea (" + blackTeaDose + ") " + blackTea()  + "$ + bergamot (" + bergamotDose + ") " + bergamot() + "$. Total: " + (water() + blackTea() + bergamot()) + "$");
            } else {
                System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water()  + "$ + tea (" + blackTeaDose + ") " + blackTea() + "$ + bergamot (" + bergamotDose + ") " + bergamot() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + blackTea() + bergamot() + sugar()) + "$");
            }
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
    public double blackTea() {
        return super.blackTea();
    }

    @Override
    public double bergamot() {
        return bergamotPrice * bergamotDose;
    }
}
