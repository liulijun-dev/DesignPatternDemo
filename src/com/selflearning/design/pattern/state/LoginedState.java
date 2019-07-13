package com.selflearning.design.pattern.state;

public class LoginedState implements UserState {

    @Override
    public void forward() {
        System.out.println("forward microblog");
    }

    @Override
    public void comment() {
        System.out.println("add comment");
    }
}
