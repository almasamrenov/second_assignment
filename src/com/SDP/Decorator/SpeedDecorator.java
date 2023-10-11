package com.SDP.Decorator;

public class SpeedDecorator extends PlayerDecorator {

    public SpeedDecorator(IPlayer player) {
        super(player);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with the better speed";
    }

    @Override
    public int getRating() {
        return super.getRating() + 2;
    }

    @Override
    public double getCost() {
        return super.getCost() + 2500;
    }
}
