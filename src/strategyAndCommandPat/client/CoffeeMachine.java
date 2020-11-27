package strategyAndCommandPat.client;

import strategyAndCommandPat.strategy.offBehaviors.TurnoffBehavior;
import strategyAndCommandPat.strategy.onBehaviors.TurnonBehavior;

public class CoffeeMachine extends Electronic {
    private TurnonBehavior onBeh;
    private TurnoffBehavior offBeh;

    public CoffeeMachine(TurnonBehavior onBehavior, TurnoffBehavior offBehavior) {
        super();
        this.onBeh = onBehavior;
        this.offBeh = offBehavior;
    }

    @Override
    public void on() {
        this.onBeh.on();
    }

    @Override
    public void off() {
        this.offBeh.off();
    }
}
