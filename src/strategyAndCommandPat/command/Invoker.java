package strategyAndCommandPat.command;

public class Invoker {
    private CommandInterface on;
    private CommandInterface off;

    public Invoker(CommandInterface on, CommandInterface off){
        this.on=on;
        this.off=off;
    }
    public void BtnOn(){
        this.on.execute();
    }
    public void BtnOff(){
        this.off.execute();
    }
}
