package statePattern.states;

import statePattern.Gate;

public class CloseState implements GateState {
    private Gate gate;
    public CloseState(Gate gate) {
        this.gate = gate;
    }

    @Override
    public void enter() {
        System.out.println("You haven't payed yet.");
        changeState(this);
    }

    @Override
    public void pay() {
        System.out.println("Your payment is in processing state, please wait.");
        changeState(new PaymentProcessingState(gate));
    }

    @Override
    public void payOK() {
        System.out.println("your payment hasn't been processed yet!");
        changeState(this);
    }

    @Override
    public void payFailed() {
        System.out.println("Sorry, the payment went wrong!");
        changeState(this);
    }

    @Override
    public void changeState(GateState newState) {
        this.gate.changeState(newState);
    }
}
