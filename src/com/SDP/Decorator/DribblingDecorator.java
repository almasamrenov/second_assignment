package com.SDP.Decorator;

public class DribblingDecorator extends PlayerDecorator {


    public DribblingDecorator(IPlayer player) {
        super(player);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + ", with the better dribbling";
    }

    @Override
    public int getRating() {
        return super.getRating() + 4;
    }

    @Override
    public double getCost() {
        return super.getCost() + 3500;
    }
}
