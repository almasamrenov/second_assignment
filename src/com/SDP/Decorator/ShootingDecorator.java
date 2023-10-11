package com.SDP.Decorator;

public class ShootingDecorator extends PlayerDecorator {

    public ShootingDecorator(IPlayer player) {
        super(player);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with the better shooting";
    }

    @Override
    public int getRating() {
        return super.getRating() + 3;
    }

    @Override
    public double getCost() {
        return super.getCost() + 3000;
    }
}
