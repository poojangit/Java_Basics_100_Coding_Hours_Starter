//todo : Write a Program to check if the given number is a prime number or not
//! Hint => 
//! A number that can be divided exactly only by itself and 1 are Prime Numbers,
//! Prime Numbers checks are done for numbers greater than 1
//! Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
//! Use isPrime boolean variable to store the result

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num > 1) {
            if (num == 1) {
                isPrime = false;
            }
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                } 
            }
        }
        if (isPrime) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
