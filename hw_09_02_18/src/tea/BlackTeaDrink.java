package tea;
import ingredients.BlackTea;
import ingredients.Sugar;

public class BlackTeaDrink extends BoildWater implements BlackTea{

    private double blackTeaPrice = 2;
    protected double blackTeaDose = 1;


    public BlackTeaDrink() {
        super();
    }

    public BlackTeaDrink(double sugarDose) {
        super(sugarDose);
    }

    public BlackTeaDrink(double waterDose, double blackTeaDose, double sugarDose) {
        this.waterDose = waterDose;
        this.blackTeaDose = blackTeaDose;
        this.sugarDose = sugarDose;
    }

    @Override
    public void getPrice() {
        if (sugarDose == 0) {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water() + "$ + tea (" + blackTeaDose + ") " + blackTea() + "$. Total: " + (water() + blackTea()) + "$");
        } else {
            System.out.println(getClass().getSimpleName() + ": water (" + waterDose + ") " + water()  + "$ + tea (" + blackTeaDose + ") " + blackTea() + "$ + sugar (" + sugarDose + ") " + sugar() + "$. Total: " + (water() + blackTea() + sugar()) + "$");
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
        return blackTeaPrice * blackTeaDose;
    }


}
