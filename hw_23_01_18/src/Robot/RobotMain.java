package Robot;

public class RobotMain {
    public static void main(String[] args) {
        Head head = new Head();
        Hands handL = new Hands();
        Hands handR = new Hands();
        Legs legL = new Legs();
        Legs legR = new Legs();
        Body body = new Body();

        RobotDigger showel = new RobotDigger();
        RobotAmbhibian paddle = new RobotAmbhibian();
        RobotBarber blade = new RobotBarber();

        Robot robot = new Robot(head, handL, handR, legL, legR, body);
        RobotDigger digger = new RobotDigger(head, handL, handR, legL, legR, body, showel);
        RobotAmbhibian amphibian = new RobotAmbhibian(head, handL, handR, legL, legR, body, paddle);
        RobotBarber barber = new RobotBarber(head, handL, handR, legL, legR, body, blade);

        Robot robotArr[] = new Robot[4];
        robotArr[0] = robot;
        robotArr[1] = digger;
        robotArr[2] = amphibian;
        robotArr[3] = barber;

        robot.compareRobots(robotArr);

    }
}

