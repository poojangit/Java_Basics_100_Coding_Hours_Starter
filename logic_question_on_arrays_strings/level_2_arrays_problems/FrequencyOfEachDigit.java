package logic_question_on_arrays_strings.level_2_arrays_problems;
// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
// Hint => 
// Take the input for a number
// Find the count of digits in the number
// Find the digits in the number and save them in an array
// Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
// Display the frequency of each digit in the number

import java.util.Scanner;

public class FrequencyOfEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter the number : ");
        long number = sc.nextInt();
        String numberStr = String.valueOf(number);
        int[] frequency = new int[10];
        for(int i=0 ; i<numberStr.length(); i++){
            char digitChar = numberStr.charAt(i);
            int digit = digitChar - '0';
            frequency[digit]++;
        }
        System.out.println("Frequency of each digit: ");
        for(int i=0; i< 10; i++){
            if(frequency[i] > 0) {
                System.out.println("Digit " + i + " repeated " + frequency[i] + " times");
            }
        }
        sc.close();
    }
}
