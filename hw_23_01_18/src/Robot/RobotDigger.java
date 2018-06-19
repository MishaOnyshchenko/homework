package Robot;

public class RobotDigger extends Robot {
    private RobotDigger showel;

    public RobotDigger() {
    }

    public RobotDigger(Head head, Hands handL, Hands handR, Legs legL, Legs legR, Body body, RobotDigger showel) {
        super(head, handL, handR, legL, legR, body);
        this.showel = showel;
        dig();
    }

    void dig (){
        System.out.println("I can dig!");
    }
}
