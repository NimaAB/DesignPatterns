package strategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("the robot duck:");
        RobotDuck rd = new RobotDuck();
        rd.doFly();
        rd.doQuack();
        System.out.println("Changing the quak type:");
        rd.changeQuackType(new QuackAsDuck());
        rd.doQuack();
        System.out.println("the wild duck:");
        WildDuck wd = new WildDuck();
        wd.doFly();
        wd.doQuack();
    }
}
