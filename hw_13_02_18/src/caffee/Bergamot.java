package caffee;

public class Bergamot extends DrinkMixer {

    Drink drink;

    public Bergamot(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", bergamot";
    }

    @Override
    public double cost() {
        return .40 + drink.cost();
    }
}
