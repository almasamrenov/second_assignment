package com.SDP.Decorator;

public class BasketDecorator extends BikeDecorator {

    public BasketDecorator(IBike bike) {
        super(bike);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with the basket";
    }

    @Override
    public double getCost() {
        return super.getCost() + 29.99 * 100;
    }
}
