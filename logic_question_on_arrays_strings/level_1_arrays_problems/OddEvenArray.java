package logic_question_on_arrays_strings.level_1_arrays_problems;
// Create a program to save odd and even numbers into odd and even arrays between 1 to the number entered by the user. Finally, print the odd and even numbers array
// Hint => 
// Get an integer input from the user, assign it to a variable number, and check for 	Number. If not a natural number then print an error and exit the program
// Create an integer array for even and odd numbers with size = number / 2 + 1
// Create index variables for odd and even numbers and initialize them to zero
// Using a for loop, iterate from 1 to the number, and in each iteration of the loop, save the odd or even number into the corresponding array
// Finally, print the odd and even numbers array using the odd and even index

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter a positive number: ");
        int number = sc.nextInt();
        sc.close();
        if (number < 0) {
            System.out.println("Please enter a natural number greater than 0");
            return;
        }
        int[] oddNumbers = new int[number/2+1];
        int[] evenNumbers = new int[number/2+1];
        int oddIndex = 0 ;
        int evenIndex = 0;
        for(int i=1; i<= number ; i++){
            if(i%2==0){
                evenNumbers[evenIndex++] = i; 
            }
            else {
                oddNumbers[oddIndex++] = i;
            }
        }
        System.out.println("Even Numbers : ");
        for(int i=0; i<evenIndex; i++){
            System.out.println(evenNumbers[i]);
        }
        System.out.println("Odd Numbers : ");
        for(int i=0; i<oddIndex; i++){
            System.out.println(oddNumbers[i]);
        }
        sc.close();
    }
}
