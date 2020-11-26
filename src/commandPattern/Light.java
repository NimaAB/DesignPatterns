package commandPattern;

//Receiver : it will be invoked by a invoker (let say a control).
public class Light {
    private String color;
    public Light(String color){
        this.color = color;
    }
    public void on(){
        System.out.printf("\nThe %s light is ON",this.color);
    }
    public void off(){
        System.out.printf("\nThe %s light is OFF",this.color);
    }
}
