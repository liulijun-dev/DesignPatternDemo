package com.selflearning.design.pattern.state;

public class LoginContext {
    private UserState userState = new LogoutState();

    public LoginContext() {}

    public LoginContext(UserState userState) {
        this.userState = userState;
    }

    public void setUserState(UserState userState) {
        this.userState = userState;
    }

    public void forward() {
        userState.forward();
    }

    public void comment() {
        userState.comment();
    }
}
