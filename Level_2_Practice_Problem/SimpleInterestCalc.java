//todo : Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.
//! Hint => Simple Interest = Principal * Rate * Time / 100
//! I/P => principal, rate, time
//! O/P => The Simple Interest is ___ for Principal ___, Rate of Interest ___ and Time ___


import java.util.Scanner;

public class SimpleInterestCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Principal amount: ");
        double principal = sc.nextDouble();
        System.out.println("Enter the rate: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the time taken");
        double time = sc.nextDouble();
        double simpleInterest = principal*rate*time/100;
        System.out.println("The simple interest is " + simpleInterest + " for principal " + principal +
                " rate of interest " + rate + " and time " + time );
        sc.close();
    }
}
