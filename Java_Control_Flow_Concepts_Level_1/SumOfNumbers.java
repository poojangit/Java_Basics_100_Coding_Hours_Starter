// todo : Write a program to find the sum of numbers until the user enters 0
//! Hint => 
//! Create a variable total of type double initialize to 0.0. Also, create a variable to store the double value the user enters
//! Use the while loop to check if the user entered is 0
//! The loop will continue till the user enters zero and outside the loop display the total value

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        double userValue = sc.nextDouble();
        double total = 0.0;
        while(userValue != 0){
            total += userValue;
            System.out.println(userValue);
            System.out.println("input the value again: ");
            userValue = sc.nextDouble();
        }
        System.out.println(total);
    }
}
