//todo : Create a program to check if a number is an Abundant Number.
//! Hint => 
//! An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
//! Divisor of 12: 1, 2, 3, 4, 6
//! Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12
//! Get an integer input for the number variable.
//! Create an integer variable sum with initial value 0.
//! Run a for loop from i = 1 to i < number.
//! Inside the loop, check if number is divisible by i.
//! If true, add i to sum.
//! Outside the loop Check if sum is greater than number.
//! If the sum is greater than the number, print Abundant Number. Otherwise, print Not an Abundant Number.

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNumber = num;
        int sum = 0;
        for(int i=1; i<= num/2; i++){
            if(num%i==0){
                sum += i;
            }
        }
        System.out.println(sum);
        if(sum>originalNumber){
            System.out.println("It is a abundant number");
        } else{
            System.out.println("not a abundant number");
        }
        sc.close();
    }
}
