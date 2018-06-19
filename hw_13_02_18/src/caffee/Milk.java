package caffee;

public class Milk extends DrinkMixer {

    Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", milk";
    }

    @Override
    public double cost() {
        return .30 + drink.cost();
    }
}
