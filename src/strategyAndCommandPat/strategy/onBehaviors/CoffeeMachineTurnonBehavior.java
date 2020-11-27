package strategyAndCommandPat.strategy.onBehaviors;

public class CoffeeMachineTurnonBehavior implements TurnonBehavior {
    public void on() {
        System.out.println("Coffee machine turning on code");
    }
}
