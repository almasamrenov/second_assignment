package com.SDP.Decorator;

abstract class BikeDecorator implements IBike {
    protected IBike bike;
    public BikeDecorator(IBike bike) {
        this.bike = bike;
    }

    @Override
    public String getDesc() {
        return bike.getDesc();
    }

    public double getCost() {
        return bike.getCost();
    }
}
