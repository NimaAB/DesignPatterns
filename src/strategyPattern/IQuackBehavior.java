package strategyPattern;
//IQuackBehavior and the classes that implements that interface are a family of algorithms.

public interface IQuackBehavior {
    void quack();
}

class QuackAsDuck implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack normaly");
    }
}

class QuackAsRare implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("I quack differently");
    }
}
