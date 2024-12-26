//todo : Create a program to check if a number taken from the user is a Harshad Number.
//! Hint => 
//! A Harshad number is an integer which is divisible by the sum of its digits. 
//! For example, 21 which is perfectly divided by 3 (sum of digits: 2 + 1).
//! Get an integer input for the number variable.
//! Create an integer variable sum with initial value 0.
//! Create a while loop to access each digit of the number.
//! Inside the loop, add each digit of the number to sum.
//! Check if the number is perfectly divisible by the sum.
//! If the number is divisible by the sum, print Harshad Number. Otherwise, print Not a Harshad Number.

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int originalNumber = num;
        while (num != 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        // boolean isHarshad = false;
        System.out.println(sum);
        System.out.println(num);
        boolean isHarshad = originalNumber%sum==0;
        System.out.println(isHarshad);
        if (isHarshad) {
            System.out.println("It is Harshad Number");
        } else {
            System.out.println("Not a Harshad number");
        }
        sc.close();
    }
}
