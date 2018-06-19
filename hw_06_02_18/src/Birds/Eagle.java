package Birds;

import Skills.CreateEggs;
import Skills.Fly;
import Skills.Sound;

public class Eagle extends Bird implements Fly, Sound, CreateEggs {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am flying in the sky");
    }

    @Override
    public void sound() {
        System.out.print("Eeeeaaaaaa! ");
    }

    @Override
    public void createEggs() {
        System.out.print("I have eggs! ");
    }
}