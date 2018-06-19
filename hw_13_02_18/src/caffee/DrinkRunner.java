package caffee;

public class DrinkRunner {

    public static void main(String[] args) {

        Drink espresso = new Espresso();
        System.out.println(espresso.getDescription() + " = " + espresso.cost() + " $.");

        Drink americano = new Americano();
        americano = new Milk(americano);
        americano = new Chockolate(americano);
        System.out.println(americano.getDescription() + " = " + americano.cost() + " $.");

        Drink blackTea = new BlackTea();
        System.out.println(blackTea.getDescription() + " = " + blackTea.cost() + " $.");

        Drink greenTea = new GreenTea();
        greenTea = new Bergamot(greenTea);
        greenTea = new Milk(greenTea);
        greenTea = new Chockolate(greenTea);
        System.out.println(greenTea.getDescription() + " = " + greenTea.cost() + " $.");





    }
}
