package com.SDP.Decorator;

public class BellDecorator extends BikeDecorator {


    public BellDecorator(IBike bike) {
        super(bike);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with the bell";
    }

    @Override
    public double getCost() {
        return super.getCost() + 4.99 * 100;
    }
}
