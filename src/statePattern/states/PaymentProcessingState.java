package statePattern.states;

import statePattern.Gate;

public class PaymentProcessingState implements GateState {
    private Gate gate;
    public PaymentProcessingState(Gate gate){
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("can't enter while processing the payment");
        changeState(this);
    }

    @Override
    public void pay() {
        System.out.println("You have already payed. The system still processing it!");
        changeState(this);
    }

    @Override
    public void payOK() {
        System.out.println("Welcome! The payment went well.");
        changeState(new OpenState(gate));
    }

    @Override
    public void payFailed() {
        System.out.println("Sorry, the payment went wrong. please try again!");
        changeState(new CloseState(gate));
    }

    @Override
    public void changeState(GateState newState) {
        this.gate.changeState(newState);
    }
}
