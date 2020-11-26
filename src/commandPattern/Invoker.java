package commandPattern;
//example a control
public class Invoker {
    private ICommand on;
    private ICommand off;
    public Invoker(ICommand on,ICommand off){
        this.on = on;
        this.off = off;
    }
    public void clickOn(){
        this.on.execute();
    }
    public void clickOff(){
        this.off.execute();
    }
}
