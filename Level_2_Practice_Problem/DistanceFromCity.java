//todo : Rewrite the Sample Program 2 with user inputs
//! Hint => 
//! Create variables and take user inputs for name, fromCity, viaCity, toCity
//! Create variables and take user inputs for distances fromToVia and viaToFinalCity in Miles
//! Create Variables and take time taken 
//! Finally, print the result and try to understand operator precedence.

import java.util.Scanner;

public class DistanceFromCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Enter from city");
        String fromCity = sc.nextLine();
        System.out.println("Enter via city");
        String viaCity = sc.nextLine();
        System.out.println("Enter final to city");
        String toCity = sc.nextLine();
        System.out.println("Enter the distance from " + fromCity + " to " + viaCity + " in miles");
        Double fromToVia = sc.nextDouble();
        System.out.println("Enter the distance from " + viaCity + " to " + toCity + " in miles");
        Double viaToFinal = sc.nextDouble();
        System.out.println("Enter the time taken from " + fromCity + " to " + viaCity + " in hrs");
        Double timeFromCityToVia = sc.nextDouble();
        System.out.println("Enter the time taken from " + viaCity + " to " + toCity  + " in hrs");
        Double timeFromeViaToFinal = sc.nextDouble();
        Double totalDistanceTaken = fromToVia + viaToFinal;
        Double totalTimeTaken = timeFromCityToVia + timeFromeViaToFinal;
        Double avgSpeed = totalDistanceTaken/totalTimeTaken;
        System.out.println(name + " Travelled from " + fromCity + " to " + toCity + " via " + viaCity  );
        System.out.println("Where the distance is " + totalDistanceTaken + " km");
        System.out.println("Total time taken is " + totalTimeTaken + " hrs");
        System.out.println("Average speed is " + avgSpeed + "km/hr");
    }
}
