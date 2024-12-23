//todo : Write a program the find the distance in yards and miles for the distance provided by user in feets
//! Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//! I/P => distanceInFeet
//! O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a distamce in feet : ");
        double distanceInFeet = sc.nextDouble();
        double distanceInYard = distanceInFeet/3;
        double distanceInMiles = distanceInYard/1760;
        System.out.println("The distance Provide in feet is" + distanceInFeet + " while in yard : " + distanceInYard + " and miles : " + distanceInMiles);
    }
}
