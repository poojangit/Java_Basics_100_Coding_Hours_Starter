//todo : Program to calculate area and circumference of a given circle

import java.util.Scanner;

public class CircleMeasurements {
    public static double areaOfCircle(int r){
        double area = Math.PI*Math.pow(r, r);
        return area;
    }
    public static double circumferenceOfCircle(int r){
        double circumference = 2*Math.PI*r;
        return circumference;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a radius : ");
        int r = sc.nextInt();
        System.out.println("Area of a circle : " + areaOfCircle(r));
        System.out.println("Circumference of a circle : " + circumferenceOfCircle(r));
        sc.close();
    }
    
}
