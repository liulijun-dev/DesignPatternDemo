package com.selflearning.main;

import com.selflearning.design.pattern.*;
import com.selflearning.design.pattern.strategy.StrategyContext;
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
        StrategyContext strategyContext = new StrategyContext(new OperationAdd());
        System.out.println("10 + 5 = " + strategyContext.executeStrategy(10, 5));

        strategyContext = new StrategyContext(new OperationSubstract());
        System.out.println("10 - 5 = " + strategyContext.executeStrategy(10, 5));

        strategyContext = new StrategyContext(new OperationMultiply());
        System.out.println("10 * 5 = " + strategyContext.executeStrategy(10, 5));
    }
}
