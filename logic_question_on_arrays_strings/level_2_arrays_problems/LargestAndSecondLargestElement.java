package logic_question_on_arrays_strings.level_2_arrays_problems;
// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
// Hint => 
// Create a number variable and take user input. 
// Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
// Create an integer variable index with the value 0 to reflect the array index.
// Use a loop to iterate until the number is not equal to 0.
// Remove the last digit from the number in each iteration and add it to the array.
// Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
// Define variable to store largest and second largest digit and initialize it to zero
// Loop through the array and use conditional statements to find the largest and second largest number in the array
// Finally display the largest  and second-largest number

import java.util.Scanner;

public class LargestAndSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        sc.close();
        int index = 0;
        if(number<0){
            System.out.println("Please enter a valid psotive numbers: ");
           return;
        }
        while(number != 0){
            if(index == maxDigit){
                System.out.println("Only the first 10 digits are considered.");
                break;
            }
            digits[index++] = number%10;
            number /= 10;
        }
        if(index == 0){
            System.out.println("No digits to operate");
            return;
        }
        int largest = -1, secondLargest = -1;
        for(int i=0; i<index; i++){
            if(digits[i]>largest){
                secondLargest = largest;
                largest = digits[i];
            } else if(digits[i]>secondLargest &&digits[i]!=0){
                secondLargest = digits[i];
            }
        }
        for(int i=0; i<index; i++){
            System.out.print(digits[i] + " ");
            
        }
        System.out.println();
        System.out.println("Largest digit : " +largest);
            System.out.println("Second largest : " + secondLargest);
        sc.close();
    }
}
