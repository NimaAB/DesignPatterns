package strategyAndCommandPat.strategy.offBehaviors;

public class LightTurnoffBehavior implements TurnoffBehavior {
    public void off() {
        System.out.println("Light turning off code");
    }
}
