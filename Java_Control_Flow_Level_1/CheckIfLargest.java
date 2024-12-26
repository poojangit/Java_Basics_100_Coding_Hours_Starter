//todo : Write a program to check if the first, second, or third number is the largest of the three.
//! I/P => number1, number2, number3
//! O/P => 
//! Is the first number the largest? ____
//! Is the second number the largest? ___
//! Is the third number the largest? ___

import java.util.Scanner;

public class CheckIfLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
       boolean isFirst = num1 > num2 && num1 > num3;
       boolean isSecond = num2 > num1 && num2 > num3;
       boolean isThird = num3 > num1 && num3 > num2;
       System.out.println("Is the first number the largest: " + isFirst);
       System.out.println("Is the second number the larest? " + isSecond);
       System.out.println("is the third number the largest? " + isThird);
    }
}
