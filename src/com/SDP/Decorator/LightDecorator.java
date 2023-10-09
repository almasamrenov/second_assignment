package com.SDP.Decorator;

public class LightDecorator extends BikeDecorator {

    public LightDecorator(IBike bike) {
        super(bike);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with the light";
    }

    @Override
    public double getCost() {
        return super.getCost() + 18.99 * 100;
    }
}
