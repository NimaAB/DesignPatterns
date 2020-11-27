package strategyAndCommandPat.strategy.offBehaviors;

public class CoffeeMachineTurnoffBehavior implements TurnoffBehavior {
    public void off() {
        System.out.println("Coffee machine turning off code");
    }
}
