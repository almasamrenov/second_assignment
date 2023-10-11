package com.SDP.Decorator;

public class BasicPlayer implements IPlayer  {

    @Override
    public String getDesc() {
        return "Basic player";
    }
    @Override
    public int getRating() {
        return 70;
    }

    @Override
    public double getCost() {
        return 20000;
    }
}
