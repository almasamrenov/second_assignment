package com.SDP.Decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IBike bike = new BasicBike();

        System.out.println("Default: " + bike.getDesc() + ", Cost: " + bike.getCost() / 100);

        boolean continueAdding = true;
        while (continueAdding) {
            System.out.println("Available bike features (select 1-4):");
            System.out.println("1. Basket option (29.99)");
            System.out.println("2. Light option (18.99)");
            System.out.println("3. Bell option (4.99)");
            System.out.println("4. Complete Purchase");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bike = new BasketDecorator(bike);
                    System.out.println("Basket was added");
                    break;
                case 2:
                    bike = new LightDecorator(bike);
                    System.out.println("Light was added");
                    break;
                case 3:
                    bike = new BellDecorator(bike);
                    System.out.println("Bell was added");
                    break;
                case 4:
                    continueAdding = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }

        System.out.println("Description: " + bike.getDesc());
        System.out.println("Cost: " + bike.getCost() / 100);

        scanner.close();
    }
}
