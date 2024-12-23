// todo : Reverse a number
// ! In Java, we can reverse a number either by using a for loop, a while loop, or using recursion. The simplest way to reverse a number is by using a for loop or a while loop. 
//! In order to reverse a number, we have to follow the following steps:
// ! a. We need to calculate the remainder of the number using the modulo
// ! b. After that, we need to multiply the variable reverse by 10 and add the remainder into it.
// ! c. We then divide the number by 10 and repeat the steps until the number becomes 0.

import java.util.Scanner;

public class reverseNumber {
    public static int reverse(int n){
        int rev = 0;
       while (n!=0) {
        int rem = n%10;
        rev = rev*10 + rem;
        n = n/10;
       }
       return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }
}