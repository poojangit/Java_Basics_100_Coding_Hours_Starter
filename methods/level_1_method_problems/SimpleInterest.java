package methods.level_1_method_problems;
// Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

// Hint => 
// Simple Interest = Principal * Rate * Time / 100
// Take user input for principal, rate, time
// Write a method to calculate the simple interest given principle, rate and time as parameters
// Output “The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___”

import java.util.Scanner;

public class SimpleInterest {
    public static double simpleInterest(double principal, double rate, double time) {
        double simpleInterestValue = principal * rate * time / 100;
        return simpleInterestValue;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("\nEnter a Principal amount: ");
        double principal = sc.nextInt();
        System.err.println("Enter the rate : ");
        double rate = sc.nextInt();
        System.out.println("Enter the time : ");
        double time = sc.nextInt();
        System.out.println("The simple interest is : " + simpleInterest(principal, rate, time));
        sc.close();
        
    }

}
