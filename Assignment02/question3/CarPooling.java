//Q3. Create an application that calculates your daily driving
// cost, so that you can estimate how much money could be saved by
// car pooling, which also has other advantages such as reducing
// carbon emissions and reducing traffic congestion. The application
// should input the following information and display the user’s
// cost per day of driving to work:
// a) Total miles driven per day.
// b) Cost per gallon of gasoline.
// c) Average miles per gallon.
// d) Parking fees per day.
// e) Tolls per day.


package com.assignment02.question3;

import java.util.Scanner;

public class CarPooling {

    private double totalMilesDriven;
    private double gasolineCostPerGallon;
    private double averageMilesPerGallon;
    private double parkingFee;
    private double tollFee;

    public double averageCost(double totalMilesDriven,double averageMilesPerGallon, double gasolineCostPerGallon){
        return (totalMilesDriven/ averageMilesPerGallon) * gasolineCostPerGallon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarPooling drive1 = new CarPooling();

        System.out.print("Enter total miles driven per day. - ");
        drive1.totalMilesDriven = sc.nextDouble();
        System.out.print("Enter cost per gallon of gasoline. - ");
        drive1.gasolineCostPerGallon = sc.nextDouble();
        System.out.print("Enter average miles per gallon. - ");
        drive1.averageMilesPerGallon = sc.nextDouble();
        System.out.print("Enter parking fees per day. - ");
        drive1.parkingFee = sc.nextDouble();
        System.out.print("Enter tolls per day. - ");
        drive1.tollFee = sc.nextDouble();

        double finalCost = drive1.averageCost(drive1.totalMilesDriven,drive1.averageMilesPerGallon, drive1.gasolineCostPerGallon) + drive1.parkingFee + drive1.tollFee;
        System.out.print("Final cost. - " + finalCost);

    }
}
