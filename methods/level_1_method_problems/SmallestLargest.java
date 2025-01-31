package methods.level_1_method_problems;
// Write a program to find the smallest and the largest of the 3 numbers.
// Hint => 
// Take user input for 3 numbers
// Write a single method to find the smallest and largest of the three numbers
// public static int[] findSmallestAndLargest(int number1, int number2, int number3

import java.util.Scanner;

public class SmallestLargest {
    public static int[] findSmallestAndLargestNumber(int number1 , int number2, int number3){
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
            return new int[]{smallest, largest};  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter any three number ");
        // take the three inout values from the user
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int[] result =  findSmallestAndLargestNumber(number1, number2, number3);
        System.out.println("The smallest of Three numbers is : " + result[0]);
        System.out.println("The largest of Three numbers is : " + result[1]);
        sc.close();
    }
}
