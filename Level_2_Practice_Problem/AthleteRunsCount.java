//todo : An athlete runs in a triangular park with sides provided as input by the user in meters. If the athlete wants to complete a 5 km run, then how many rounds must the athlete complete
//! Hint => The perimeter of a triangle is the addition of all sides and rounds is distance/perimeter
//! I/P => side1, side2, side3
//! O/P => The total number of rounds the athlete will run is ___ to complete 5 km.

import java.util.Scanner;

public class AthleteRunsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of a triangle in meters");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        double perimeterOfaTriangle = side1 + side2 + side3;
        System.out.println("Enter the distance ");
        double distanceInMeter = sc.nextDouble();
        double totalRounds = distanceInMeter/perimeterOfaTriangle;
        System.out.println("The total number of rounds the athlete will run is " + totalRounds + " to complete 5 km"  );
    }  
}
