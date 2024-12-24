// todo : Create a program to convert weight in pounds to kilograms.
//! Hint => 1 pound = 2.2 kg
//! I/P => weight
//! O/P => The weight of the person in pound is ___ and in kg is ___.

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        double weightInKilograms = weightInPounds/2.2;
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKilograms);
        sc.close();
    }
    
}
