package com.selflearning.design.pattern.state;

public class LogoutState implements UserState {
    @Override
    public void forward() {
        System.out.println("please login before forwarding microblog");
    }

    @Override
    public void comment() {
        System.out.println("please login before adding comment");
    }
}
