package com.SDP.Decorator;

public class BasicBike implements IBike  {

    @Override
    public String getDesc() {
        return "Basic bike";
    }

    @Override
    public double getCost() {
        return 200 * 100;
    }
}
