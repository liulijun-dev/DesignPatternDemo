package com.selflearning.main;

import com.selflearning.design.pattern.Facade;
import com.selflearning.design.pattern.MethodAroundExecute;
import com.selflearning.design.pattern.StaticProxy;

public class Main {

    public static void main(String[] args) {
        MethodAroundExecute.writeFile();

        Facade facade = new Facade();
        facade.activate();
        facade.deactivate();

        StaticProxy staticProxy = new StaticProxy();
        staticProxy.buyHouse();
    }
}
