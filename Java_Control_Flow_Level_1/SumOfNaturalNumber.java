//todo : Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
//! Hint => 
//! Take the user input number and check whether it's a Natural number
//! If it's a natural number Compute using formulae as well as compute using for loop
//! Compare the two results and print the result

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int num = sc.nextInt();
        double total = 0.0;
        double totalFor = 0.0;
        if (num > 0) {
            total = num * (num + 1) / 2;
        }
        for (int i = 1; i <= num; i++) {
            totalFor += i; 
        }
        System.out.println(total);
        System.out.println(totalFor);
    }
}
