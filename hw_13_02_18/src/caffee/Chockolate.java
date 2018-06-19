package caffee;

public class Chockolate extends DrinkMixer {

    Drink drink;

    public Chockolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", chokolate";
    }

    @Override
    public double cost() {
        return .20 + drink.cost();
    }
}
