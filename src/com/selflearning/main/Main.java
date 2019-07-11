package com.selflearning.main;

import com.selflearning.design.pattern.DynamicProxy;
import com.selflearning.design.pattern.Facade;
import com.selflearning.design.pattern.MethodAroundExecute;
import com.selflearning.design.pattern.StaticProxy;

public class Main {

    public static void main(String[] args) {
        System.out.println("--------------MethodAroundExecute:---------------");
        MethodAroundExecute.writeFile();

        System.out.println("--------------Facade:---------------");
        Facade facade = new Facade();
        facade.activate();
        facade.deactivate();

        System.out.println("--------------StaticProxy:---------------");
        StaticProxy staticProxy = new StaticProxy();
        staticProxy.buyHouse();

        System.out.println("--------------DynamicProxy:---------------");
        DynamicProxy dynamicProxy = new DynamicProxy();
        dynamicProxy.buyHouse();
    }
}
