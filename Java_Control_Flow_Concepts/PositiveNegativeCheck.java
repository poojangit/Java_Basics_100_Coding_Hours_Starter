//todo : Write a program to check whether a number is positive, negative, or zero.
//! Hint => 
//! Get integer input from the user and store it in the number variable.
//! If the number is positive, print positive.
//! If the number is negative, print negative.
//! If the number is zero, print zero. 

import java.util.Scanner;

public class PositiveNegativeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("0");
        }
        else if(num > 0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
