package com.SDP.Decorator;

abstract class PlayerDecorator implements IPlayer {
    protected IPlayer player;
    public PlayerDecorator(IPlayer player) {
        this.player = player;
    }

    @Override
    public String getDesc() {
        return player.getDesc();
    }

    @Override
    public int getRating() {
        return player.getRating();
    }
    @Override
    public double getCost() {
        return player.getCost();
    }
}
