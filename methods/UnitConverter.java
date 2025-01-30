package methods;
// Write a Program to convert from one unit to another unit and convert 
// kilometer to miles

import java.util.Scanner;

public class UnitConverter {
    public double convertKmToMiles(double km){
        double kmTomiles  = 0.621371;
        double miles = km * kmTomiles;

        return miles;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km : ");
        double km = sc.nextDouble();
        UnitConverter unitConverter = new UnitConverter();
        double miles = unitConverter.convertKmToMiles(km);
        System.out.println("The distance in miles : " + miles);
        sc.close();
    }
}
