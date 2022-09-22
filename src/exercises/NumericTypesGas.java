package exercises;

import java.util.Scanner;

public class NumericTypesGas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed?");
        Double gasUsed = input.nextDouble();

        Double mpg = miles / gasUsed;

        System.out.println("You have traveled " + mpg + " miles per gallon of gas consumed.");
    }
}
