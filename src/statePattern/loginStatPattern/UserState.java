package statePattern.loginStatPattern;

public interface UserState {
    void login();
    void logout();
    void verified();
    void notVerified();
}
