package strategyPattern;
//IFlyBehavior and the classes that implements that interface are a family of algorithms.
public interface IFlyBehavior {
    void fly();
}

class FlyAsDuck implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("I fly normaly");
    }
}

class FlyAsJet implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I fly like a F-16");
    }
}

