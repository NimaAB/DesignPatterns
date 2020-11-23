package statePattern.loginStatPattern;

public class User {
    UserState state = new LogedOutState(this);

    void loginRequest(){
        this.state.login();
    }
    void logoutRequest(){
        this.state.logout();
    }
    void verify(){
        this.state.verified();
    }
    void notVerify(){
        this.state.notVerified();
    }
    void changeUserState(UserState newState){
        this.state = newState;
    }

}
