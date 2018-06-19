package Birds;
import Skills.CreateEggs;
import Skills.Fly;
import Skills.Sound;
import Skills.TalkLikeHuman;

public class Parrot extends Bird implements Fly, Sound, CreateEggs, TalkLikeHuman {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.print("Queeeeeeee! ");
    }

    @Override
    public void createEggs() {
        System.out.print("I can to create eggs! ");
    }

    @Override
    public void fly() {
        System.out.print("I can fly! ");
    }

    @Override
    public void talk() {
        System.out.print("Also I can talk like a human! ");
    }
}
