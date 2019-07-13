package com.selflearning.main;

import com.selflearning.design.pattern.*;
import com.selflearning.design.pattern.strategy.Context;
import com.selflearning.design.pattern.strategy.OperationAdd;
import com.selflearning.design.pattern.strategy.OperationMultiply;
import com.selflearning.design.pattern.strategy.OperationSubstract;

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

        System.out.println("--------------Strategy:---------------");
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
