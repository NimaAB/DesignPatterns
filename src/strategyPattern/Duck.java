package strategyPattern;
// The duck class and it is sub-classes are Client.
public class Duck {
    //Composition insteadof inheritance:
    // It will allow us to change code in the family algorithm without compiling and making
    //making problems for the Clinet classes.
    private IFlyBehavior flyBehavior;
    private IQuackBehavior quackBehavior;

    public Duck(IFlyBehavior flyBehavior, IQuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void doFly(){
        this.flyBehavior.fly();
    }

    public void changeFlyType(IFlyBehavior newFlyBehavior){
        flyBehavior = newFlyBehavior;
    }

    public void doQuack(){
        this.quackBehavior.quack();
    }

    public void changeQuackType(IQuackBehavior newQuackBehavior){
        quackBehavior = newQuackBehavior;
    }
}

class WildDuck extends Duck {
    public WildDuck() {
        super(new FlyAsDuck(), new QuackAsDuck());
    }
}
class RobotDuck extends Duck {
    public RobotDuck() {
        super(new FlyAsJet(), new QuackAsRare());
    }
}
