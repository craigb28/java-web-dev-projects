package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used: ");
        double gas = input.nextDouble();
        input.close();

        double fuelEconomy = miles/gas;
        System.out.println("Your mileage is "+fuelEconomy+" miles per gallon.");
    }

}
