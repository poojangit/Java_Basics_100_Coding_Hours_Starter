//todo : Write a program that takes your height in centimeters and converts it into feet and inches
//! Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
//! I/P => height
//! O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;

public class CentiToFeetAndInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in centimeter : ");
        double heightInCenti = sc.nextDouble();
        sc.close();
        double heightInInches = heightInCenti/2.5;
        double heightInFeet = heightInInches/12;
        double inches = heightInInches%12;
        System.out.println("Your Height in cm is " + heightInCenti + " while in feet is " + heightInFeet + " and inches is " + inches);
    }
}
