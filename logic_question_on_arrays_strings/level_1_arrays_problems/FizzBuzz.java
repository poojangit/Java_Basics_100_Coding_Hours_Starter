package logic_question_on_arrays_strings.level_1_arrays_problems;
// Write a program FizzBuzz, take a number as user input and if it is a positive integer loop from 0 to the number and save the number, but for multiples of 3 save "Fizz" instead of the number, for multiples of 5 save "Buzz", and for multiples of both save "FizzBuzz". Finally, print the array results for each index position in the format Position 1 = 1, …, Position 3 = Fizz,...
// Hint => 
// Create a String Array to save the results and 
// Finally, loop again to show the results of the array based on the index position

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        String[] results = new String[number+1];
        if(number>0){
            for(int i=0; i<=number; i++){
                if(i==0) {
                    results[i]="0";
                }
                else if(i%3 == 0 && i%5==0){
                    results[i] = "Fizzbuzz";
                }
                else if(i%3 == 0 ){
                    results[i] = "Fizz";
                }
                else if(i%5 == 0){
                    results[i] = "Buzz";
                }
                else {
                    results[i] = String.valueOf(i);
                }
            }
        } 
        System.out.println("Result : ");
      for(int i=0; i<number; i++){
        System.out.println(i + " = " + results[i]);
      }
        sc.close();
    }
}
