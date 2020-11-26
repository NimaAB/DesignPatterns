package statePattern;

import statePattern.states.CloseState;
import statePattern.states.GateState;

public class Gate {

    private GateState initialState = new CloseState(this);

    public void enter(){
        this.initialState.enter();
    }
    public void pay(){
        this.initialState.pay();
    }
    public void payOK(){
        this.initialState.payOK();
    }
    public void payFailed(){
        this.initialState.payFailed();
    }
    public void changeState(GateState newState){
        this.initialState = newState;
    }
}
