//todo : Create a program to find the factors of a number taken as user input.
//! Hint => 
//! Get the input value for a variable named number.
//! Run a for loop from i = 1 to i < number.
//! In each iteration of the loop, check if number is perfectly divisible by i.
//! If true, print the value of i.

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check it's factors: ");
        int num = sc.nextInt();
        for(int i=1; i<num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
    }
}
