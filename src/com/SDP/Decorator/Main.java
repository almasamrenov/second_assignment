package com.SDP.Decorator;

public class Main {
    public static void main(String[] args) {
        IPlayer player1 = new BasicPlayer();
        IPlayer player2 = new StarPlayer();

        System.out.println(player1.getDesc());
        System.out.println("Rating: " + player1.getRating());
        System.out.println("Cost: " + player1.getCost());

        System.out.println(player2.getDesc());
        System.out.println("Rating: " + player2.getRating());
        System.out.println("Cost: " + player2.getCost());

        player1 = new ShootingDecorator(new SpeedDecorator(player1));
        System.out.println(player1.getDesc());
        System.out.println("Rating: " + player1.getRating());
        System.out.println("Cost: " + player1.getCost());
        player2 = new DribblingDecorator(player2);
        System.out.println(player2.getDesc());
        System.out.println("Rating: " + player2.getRating());
        System.out.println("Cost: " + player2.getCost());
    }
}
