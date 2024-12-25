
//todo : Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
//! Hint => 
//! Take the user input number and check whether it's a Natural number
//! If it's a natural number Compute using formulae as well as compute using while loop
//! Compare the two results and print the result

import java.util.Scanner;

public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range for natural numbers");
        int n = sc.nextInt();
        // boolean isNatural = false;
        double total = 0.0;
        double totalFormule = 0.0;
        if (n > 0) {
            totalFormule = n * (n + 1) / 2;
        }
        int i = 1;
        while (i <= n) {
            total += i;
            i++;
        }
        System.out.println(total);
        System.out.println(totalFormule);
    }
}