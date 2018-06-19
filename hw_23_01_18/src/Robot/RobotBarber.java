package Robot;

public class RobotBarber extends Robot{
    private RobotBarber blade;

    public RobotBarber() {
    }

    public RobotBarber(Head head, Hands handL, Hands handR, Legs legL, Legs legR, Body body, RobotBarber blade) {
        super(head, handL, handR, legL, legR, body);
        this.blade = blade;
        shave();
    }

    public void shave (){
        System.out.println("I can shave!");
    }
}
