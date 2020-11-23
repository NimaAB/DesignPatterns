package statePattern.states;

public interface GateState {
    void enter();
    void pay();
    void payOK();
    void payFailed();
    void changeState(GateState newState);
}
