package caffee;

public abstract class Drink {

    String description = "Unknown Drink";

    public String getDescription(){
        return description;
    }
    public abstract double cost();
}


