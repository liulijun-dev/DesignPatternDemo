package com.selflearning.design.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements BuyHouse{

    private BuyHouse proxyBuyHouse;

    public DynamicProxy() {
        proxyBuyHouse = (BuyHouse)Proxy.newProxyInstance(
                BuyHouse.class.getClassLoader(),
                new Class[]{BuyHouse.class},
                new DynamicProxyHandler(new BuyHouseImpl()));
    }
    @Override
    public void buyHouse() {
        proxyBuyHouse.buyHouse();
    }
}

class DynamicProxyHandler implements InvocationHandler {

    private BuyHouse buyHouse;

    public DynamicProxyHandler(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Prepare to buy house");
        Object result =  method.invoke(buyHouse, args);
        System.out.println("Decorate the house");

        return result;
    }
}



