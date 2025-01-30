// Write a program to take user input for 5 numbers and check whether a number is positive,  negative, or zero. Further for positive numbers check if the number is even or odd. Finally compare the first and last elements of the array and display if they equal, greater or less
// Hint => 
// Define an integer array of 5 elements and get user input to store in the array.
// Loop through the array using the length If the number is positive, check for even or odd numbers and print accordingly
// If the number is negative, print negative. Else if the number is zero, print zero. 
// Finally compare the first and last element of the array and display if they equal, greater or less

import java.util.Scanner;

public class PositiveNegativeEvenOdd {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i =0 ; i<arr.length; i++){
            if (arr[i]<0) {
                System.out.println(arr[i] + " is a negative number");
            }
            else if(arr[i] > 0) {
                if(arr[i]%2 == 0){
                    System.out.println( arr[i] + " is a positive even number");
                }
                else {
                    System.out.println(arr[i] + " is a positive odd number");
                }
            }
            else {
                System.out.println("zero");
            }
           
        }
        System.out.println("\nComparison of the first and last elements of the array:");
        int first = arr[0];
        int last = arr[size - 1]; 
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
        
        if (first == last) {
            System.out.println("The first and last elements are equal.");
        } else if (first > last) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
        
        sc.close();
    }
}
