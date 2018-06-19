package Birds;
import Skills.CreateEggs;
import Skills.RunLikeAntelope;
import Skills.Sound;

public class Ostrich extends Bird implements RunLikeAntelope, Sound, CreateEggs {

    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.print("????????? ");
    }

    @Override
    public void run() {
        System.out.print("I can run like an antelope! ");
    }

    @Override
    public void createEggs() {
        System.out.print("I am creating big eggs! ");
    }
}
