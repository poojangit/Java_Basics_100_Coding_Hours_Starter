package logic_question_on_arrays_strings.level_1_arrays_problems;
// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
// Hint => 
// Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
// Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
// Finally, display the result from the array in the format number * i = ___

import java.util.Scanner;

public class SixToTenMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for(int i=0; i<multiplicationResult.length; i++){
            multiplicationResult[i] = number*(6+i);
        }
        System.out.println("Result is : ");
        for(int i=0; i<multiplicationResult.length; i++){
            System.out.println(number + " * " + (6+i) + " = " + multiplicationResult[i]);
        }
        sc.close();
    }
}
