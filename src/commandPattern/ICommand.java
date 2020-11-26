package commandPattern;
//Commands.
public interface ICommand {
    void execute();
    void unexecute();
}
class TurnOnCommand implements ICommand {
    private Light light;
    public TurnOnCommand(Light l){
        this.light = l;
    }
    @Override
    public void execute() {
        this.light.on();
    }
    @Override
    public void unexecute() {
        this.light.off();
    }
}
class TurnOffCommand implements ICommand {
    private Light light;
    public TurnOffCommand(Light l){
        this.light = l;
    }
    @Override
    public void execute() {
        this.light.off();
    }
    @Override
    public void unexecute() {
        this.light.on();
    }
}
