package statePattern.gateStatePattern.states;

import statePattern.gateStatePattern.Gate;
import statePattern.gateStatePattern.states.CloseState;
import statePattern.gateStatePattern.states.GateState;

public class OpenState implements GateState {
    private Gate gate;
    public OpenState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("Welcome! You can enter now...");
        changeState(new CloseState(gate));
    }

    @Override
    public void pay() {
        System.out.println("Welcome! You dont need to pay anymore");
        changeState(this);
    }

    @Override
    public void payOK() {
        System.out.println("Welcome! You dont need to pay anymore");
        changeState(this);
    }

    @Override
    public void payFailed() {
        System.out.println("Welcome! You dont need to pay anymore");
        changeState(this);
    }

    @Override
    public void changeState(GateState newState) {
        this.gate.changeState(newState);
    }
}
