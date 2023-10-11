package com.SDP.Decorator;

public class StarPlayer implements IPlayer{


    @Override
    public String getDesc() {
        return "Star Player";
    }

    @Override
    public int getRating() {
        return 90;
    }

    @Override
    public double getCost() {
        return 40000;
    }
}
