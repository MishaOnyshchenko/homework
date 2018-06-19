package Birds;
import Skills.CreateEggs;
import Skills.Fly;
import Skills.Sound;

public class Duck extends Bird implements CreateEggs, Fly, Sound {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    @Override
    public void sound() {
        System.out.print("Ga-ga-ga! ");
    }

    @Override
    public void createEggs() {
        System.out.print("I am a duck and I like to create eggs! ");
    }
}