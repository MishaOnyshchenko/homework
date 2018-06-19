package Robot;

public class RobotAmbhibian extends Robot {
    private RobotAmbhibian paddle;

    public RobotAmbhibian() {
    }

    public RobotAmbhibian(Head head, Hands handL, Hands handR, Legs legL, Legs legR, Body body, RobotAmbhibian paddle) {
        super(head, handL, handR, legL, legR, body);
        this.paddle = paddle;
        sail();
    }

    public void sail(){
        System.out.println("I can swim");
    }
}
