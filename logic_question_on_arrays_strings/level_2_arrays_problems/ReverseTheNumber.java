package logic_question_on_arrays_strings.level_2_arrays_problems;
// Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
// Hint => 
// Take user input for a number. 
// Find the count of digits in the number. 
// Find the digits in the number and save them in an array
// Create an array to store the elements of the digits array in reverse order
// Finally, display the elements of the array in reverse order  

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        sc.close();
        if(number<0){
            System.out.println("Enter a positive integer");
            return;
        }
        int count = 0;
        int temp = number;
      
       
        while (temp!=0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int index = 0;
        while (number!=0) {
            digits[index++] = number%10;
            number /= 10;
        }
        System.out.println("Reversed number : ");
        for(int reversedNum : digits){
            System.out.print(reversedNum + " ");
        }
        System.out.println();
        
    }
}
