package Computer;

public class Computer {

    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        Keyboard keyboard = new Keyboard();
        Mouse mouse = new Mouse();

        PC computerCase = new PC(monitor, keyboard, mouse);
//        PC computerCase = new PC(keyboard, mouse);
//        PC computerCase = new PC(monitor, mouse);
//        PC computerCase = new PC(monitor, keyboard);
    }
}
