package Robot;

import java.util.Objects;

public class Robot {
    private Head head;
    private Hands handL;
    private Hands handR;
    private Legs legL;
    private Legs legR;
    private Body body;


    public Robot() {
    }

    public Robot(Head head, Hands handL, Hands handR, Legs legL, Legs legR, Body body) {
        this.head = head;
        this.handL = handL;
        this.handR = handR;
        this.legL = legL;
        this.legR = legR;
        this.body = body;
        body.ready();
        head.talk();
        legL.walk();
        handL.write();
    }

    public Robot(Head head, Hands handL, Hands handR, Legs legL) {
        this.head = head;
        this.handL = handL;
        this.handR = handR;
        this.legL = legL;
        body.rework();
        legL.jump();
    }

    public Robot(Head head, Hands handL, Legs legL, Legs legR) {
        this.head = head;
        this.handL = handL;
        this.legL = legL;
        this.legR = legR;
        body.rework();
        handL.oneHand();
    }

    public Robot(Hands handL, Hands handR, Legs legL, Legs legR) {
        this.handL = handL;
        this.handR = handR;
        this.legL = legL;
        this.legR = legR;
        body.rework();
        body.cantTalk();
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hands getHandL() {
        return handL;
    }

    public void setHandL(Hands handL) {
        this.handL = handL;
    }

    public Hands getHandR() {
        return handR;
    }

    public void setHandR(Hands handR) {
        this.handR = handR;
    }

    public Legs getLegL() {
        return legL;
    }

    public void setLegL(Legs legL) {
        this.legL = legL;
    }

    public Legs getLegR() {
        return legR;
    }

    public void setLegR(Legs legR) {
        this.legR = legR;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(head, robot.head) &&
                Objects.equals(handL, robot.handL) &&
                Objects.equals(handR, robot.handR) &&
                Objects.equals(legL, robot.legL) &&
                Objects.equals(legR, robot.legR) &&
                Objects.equals(body, robot.body);
    }

    @Override
    public int hashCode() {

        return Objects.hash(head, handL, handR, legL, legR, body);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "head=" + head +
                ", handL=" + handL +
                ", handR=" + handR +
                ", legL=" + legL +
                ", legR=" + legR +
                ", body=" + body +
                '}';
    }
    public void compareRobots(Robot [] robotArr){
        for (int i = 0; i < robotArr.length; i++) {
            for (int j = i + 1; j < robotArr.length; j++) {
                System.out.println("Robot " + robotArr[i].getClass() + " is equals to robot " + robotArr[j].getClass() + ": "
                        + robotArr[i].toString().equals(robotArr[j].toString()));
            }
        }
    }
}
