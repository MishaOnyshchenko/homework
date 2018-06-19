import Birds.*;
import Skills.CreateEggs;
import Skills.RunLikeAntelope;
import Skills.TalkLikeHuman;


public class Runner {



    public static void main(String[] args) {

        Duck duck1 = new Duck("Donald");
        Duck duck2 = new Duck("Howard");
        Eagle eagle1 = new Eagle("Orlando");
        Eagle eagle2 = new Eagle("Bloom");
        Parrot parrot1 = new Parrot("Harley");
        Parrot parrot2 = new Parrot("Pumpkin");
        Ostrich ostrich1 = new Ostrich("Emu");
        Ostrich ostrich2 = new Ostrich("Nemo");
        Penguin penguin1 = new Penguin("Little-Man");
        Penguin penguin2 = new Penguin("Fat-boy");
        RubberDuck rubberDuck1 = new RubberDuck("Willi");
        RubberDuck rubberDuck2 = new RubberDuck("Utya");

        Bird[] birds = new Bird[12];
        birds[0] = duck1;
        birds[1] = duck2;
        birds[2] = eagle1;
        birds[3] = eagle2;
        birds[4] = ostrich1;
        birds[5] = ostrich2;
        birds[6] = parrot1;
        birds[7] = parrot2;
        birds[8] = penguin1;
        birds[9] = penguin2;
        birds[10] = rubberDuck1;
        birds[11] = rubberDuck2;

        System.out.println("\nTask # 1\n");
        for (Bird b : birds) {
            if (b instanceof RunLikeAntelope) {
                System.out.println(b. getClass().getSimpleName() + " named " + b.getName() + " can run like an antelope!");
            }
        }
        System.out.println("\nTask # 2\n");
        for (Bird b : birds) {
            if (b instanceof TalkLikeHuman) {
                System.out.println(b. getClass().getSimpleName() + " named " + b.getName() + " can talk like a human!");
            }
        }
        System.out.println("\nTask # 3\n");
        for (Bird b : birds) {
            if (b instanceof CreateEggs) {
                System.out.println(b. getClass().getSimpleName() + " named " + b.getName() + " can create an eggs!");
            }
        }
        System.out.println("\nTask # 4");
        for (Bird b : birds) {
            System.out.print("\n" + b.getName() + " " + b. getClass().getSimpleName() +  " say: ");
            b.sound();
        }

        System.out.println("\n\nAll in one!");
        for (Bird b : birds) {
            System.out.print("\n" + b.getName() + " says: ");
            b.sound();
            if(b instanceof CreateEggs){
                ((CreateEggs) b).createEggs();
            }
            if(b instanceof RunLikeAntelope){
                System.out.print("Ya STRAUS, ");
                ((RunLikeAntelope)b).run();
            }
            if(b instanceof TalkLikeHuman){
                System.out.print("Vas, Vas, YA PAPUGAY! ");
                ((TalkLikeHuman)b).talk();
            }
        }
    }
}

