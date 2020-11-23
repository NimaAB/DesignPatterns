package statePattern.loginStatPattern;

public class LogedOutState implements UserState {
    private User user;
    public LogedOutState(User user){
        this.user = user;
    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void verified() {

    }

    @Override
    public void notVerified() {

    }

    private void changeState(UserState newState){

    }
}
