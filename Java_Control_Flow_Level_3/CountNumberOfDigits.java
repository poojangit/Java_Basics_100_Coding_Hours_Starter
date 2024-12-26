//todo : Create a program to count the number of digits in an integer.
//! Hint => 
//! Get an integer input for the number variable.
//! Create an integer variable count with value 0.
//! Use a loop to iterate until number is not equal to 0.
//! Remove the last digit from number in each iteration
//! Increase count by 1 in each iteration.
//! Finally display the count to show the number of digits

import java.util.Scanner;

public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                // int rem = num%10;
                count++;
                num /= 10;
            }
        }
        System.out.println(count);

    }
}