package Computer;

public class PC {

    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;

    public PC(Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
        System.out.println("Your computer is ready for work!");
        monitor.useIt();
        keyboard.useIt();
        mouse.useIt();
    }

    public PC(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        System.out.println("Your computer isn't complete!");
        keyboard.notFull();
        mouse.notFull();
    }

    public PC(Monitor monitor, Mouse mouse) {
        this.monitor = monitor;
        this.mouse = mouse;
        System.out.println("Your computer isn't complete!");
        monitor.notFull();
        mouse.notFull();
    }

    public PC(Monitor monitor, Keyboard keyboard) {
        this.monitor = monitor;
        this.keyboard = keyboard;
        System.out.println("Your computer isn't complete!");
        monitor.notFull();
        keyboard.notFull();
    }
}
