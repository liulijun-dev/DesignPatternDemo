package com.selflearning.design.pattern;

public class StaticProxy implements BuyHouse{

    private BuyHouse buyHouse;

    public StaticProxy() {
        buyHouse = new BuyHouseImpl();
    }

    @Override
    public void buyHouse() {
        System.out.println("Prepare to buy house");
        buyHouse.buyHouse();
        System.out.println("Decorate the house");
    }
}

interface BuyHouse {
    void buyHouse();
}

class BuyHouseImpl implements BuyHouse {

    @Override
    public void buyHouse() {
        System.out.println("I want to buy a house");
    }
}

