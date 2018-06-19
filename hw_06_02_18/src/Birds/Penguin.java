package Birds;

import Skills.CreateEggs;

public class Penguin extends Bird implements CreateEggs {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.print("Gui-gui! ");
    }

    @Override
    public void createEggs() {
        System.out.print("I like to sit on the eggs! ");
    }
}