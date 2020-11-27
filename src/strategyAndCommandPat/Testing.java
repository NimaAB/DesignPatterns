package strategyAndCommandPat;



import strategyAndCommandPat.client.*;
import strategyAndCommandPat.command.*;
import strategyAndCommandPat.strategy.offBehaviors.CoffeeMachineTurnoffBehavior;
import strategyAndCommandPat.strategy.offBehaviors.LightTurnoffBehavior;
import strategyAndCommandPat.strategy.onBehaviors.CoffeeMachineTurnonBehavior;
import strategyAndCommandPat.strategy.onBehaviors.LightTurnonBehavior;

public class Testing {
    public static void main(String[] args) {
        Light light = new Light(new LightTurnonBehavior(),new LightTurnoffBehavior());
        CoffeeMachine coffeeMachine = new CoffeeMachine(new CoffeeMachineTurnonBehavior(),new CoffeeMachineTurnoffBehavior());

        Invoker controller_for_light = new Invoker(new TurnonCommand(light),new TurnoffCommand(light));
        Invoker controller_for_coffeeMachine = new Invoker(new TurnonCommand(coffeeMachine),new TurnoffCommand(coffeeMachine));

        controller_for_coffeeMachine.BtnOn();
        controller_for_light.BtnOn();
        controller_for_coffeeMachine.BtnOff();
        controller_for_light.BtnOff();
    }
}
