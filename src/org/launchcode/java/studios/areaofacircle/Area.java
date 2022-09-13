package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        while (!input.hasNextDouble()) {
            System.out.println("Radius must be a number.");
            System.out.print("Enter a radius: ");
            input.nextLine();
        }
        radius = input.nextFloat();
        while (radius <0){
            System.out.println("Radius must be a non-negative.");
            System.out.print("Enter a radius: ");
            radius = input.nextDouble();
            while (!input.hasNextDouble()) {
                System.out.println("Radius must be a number.");
                System.out.print("Enter a radius: ");
                input.nextLine();
            }

        }
        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}