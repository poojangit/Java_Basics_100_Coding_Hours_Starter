// todo : Create a program to print odd and even numbers between 1 to the number entered by the user.
//! Hint => 
//! Get an integer input from the user, assign to a variable number and check for Natural Number
//! Using a for loop, iterate from 1 to the number
//! In each iteration of the loop, print the number is odd or even number

import java.util.Scanner;

public class OddEvenBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till the range: ");
        int n = sc.nextInt();
        String oddNum = "";
        String evenNum = "";
        if(n>=0){
            for(int i=1; i<=n ; i++){
               
                if (i%2==0) {
                    // System.out.println("Even numbers: " + i + " ");
                    evenNum += i + ",";
                }
                else if(i%2==1){
                    // System.out.println("Odd numbers: " + i + "");
                    oddNum += i+ ",";
                }
               
            }
        }
        System.out.println("oddnum: " + oddNum);
        System.out.println("evenNum: "+ evenNum);
    }
}
