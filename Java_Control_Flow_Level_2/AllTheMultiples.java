//todo : Create a program to find all the multiple of a number taken as user input below 100.
//! Hint => 
//! Get input value for a variable named number.
//! Run a for loop backward: from i = 100 to i = 1.
//! Inside the loop, check if i perfectly divide the number.
//! If true, print the number and continue the loop.

import java.util.Scanner;

public class AllTheMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i= 100; i>=1; i--){
            if(i%num==0){
                System.out.println(i);
            }
        }
    }
}
