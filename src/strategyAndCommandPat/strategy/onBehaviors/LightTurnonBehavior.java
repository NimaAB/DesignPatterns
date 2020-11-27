package strategyAndCommandPat.strategy.onBehaviors;

public class LightTurnonBehavior implements TurnonBehavior {
    public void on() {
        System.out.println("Light turning on code");
    }
}
