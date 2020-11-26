package commandPattern;

public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light("White");
        Invoker control = new Invoker(new TurnOnCommand(light), new TurnOffCommand(light));
        control.clickOn();
        control.clickOff();
    }
}
