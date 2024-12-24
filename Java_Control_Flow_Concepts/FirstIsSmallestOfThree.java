//todo : Write a program to check if the first is the smallest of the 3 numbers.
// ! I/P => number1, number2, number3
// ! O/P => Is the first number the smallest? ____

import java.util.Scanner;

public class FirstIsSmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 numbers");
        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        if(firstNum < secondNum && firstNum < thirdNum){
            System.out.println("first number "+firstNum + " is the smallest");
        }
        else
        System.out.println("First number is not a smallest");
    }
}
