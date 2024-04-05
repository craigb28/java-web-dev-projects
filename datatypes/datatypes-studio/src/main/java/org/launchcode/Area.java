package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give me a radius of a circle: ");
        double radius;
        while (!input.hasNextDouble()) {
            System.out.println("Try a number this time: ");
            input.next();
            while (radius <= 0){
                System.out.println("Try a positive number: ");
                radius = input.nextDouble();
            }

            }
        double area = Circle.getArea(radius);
        System.out.println("The circle's area is " + area + ".");
    }
}
//radius.isNaN()