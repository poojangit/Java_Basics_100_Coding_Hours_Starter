import java.util.Scanner;
// 5. Convert Kilometers to Miles
// Write a program that takes the distance in kilometers as input from the user
// and converts it into miles using the formula:
// Miles = Kilometers * 0.621371.
public class ConvertKilotoMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in km : ");
        double distanceInKm = sc.nextDouble();
        double distanceInMiles = distanceInKm*0.621371;
        System.out.println("The distance is " + distanceInMiles + " miles");
        sc.close();
    }
}
