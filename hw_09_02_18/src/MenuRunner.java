import coffee.*;
import tea.BergamotBlackTea;
import tea.BlackTeaDrink;
import tea.GreenTeaDrink;

public class MenuRunner {
    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        espresso.getPrice();
        Americano americano1 = new Americano(4);
        americano1.getPrice();
        Cappuccino cappuccino2 = new Cappuccino();
        cappuccino2.getPrice();
        Latte latte = new Latte(4);
        latte.getPrice();
        Mocaccino mocaccino1 = new Mocaccino(2,2,2,2,2);
        mocaccino1.getPrice();

        BlackTeaDrink tea = new BlackTeaDrink();
        tea.getPrice();
        BergamotBlackTea berg1 = new BergamotBlackTea(2.5);
        berg1.getPrice();
        GreenTeaDrink green2 = new GreenTeaDrink(3,3,4);
        green2.getPrice();

    }
}
