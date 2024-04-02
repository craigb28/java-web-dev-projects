package org.launchcode;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle: ");
        float length = input.nextFloat();

        System.out.println("What is the width of your rectangle: ");
        float width = input.nextFloat();
        input.close();

        float area = length*width;
        System.out.println("Your rectangle's area is "+area);
    }

}
