package methods.level_1_method_problems;
// Write a program to find the sum of n natural numbers using loop
// Hint => Get integer input from the user. Write a Method to find the sum of n natural numbers using loop 

import java.util.Scanner;

public class NaturalNumbers {
    public static int sumOfNaturalNum(int size){

        return size *(size+1)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the number upto which you want to sum5: ");
        int size = sc.nextInt();
        if(size <0){
            System.out.println("Enter the positive integer");
        } else{
            System.out.println("The sum of the first " + size + " natural numbers 5" + sumOfNaturalNum(size));
        }
        sc.close();

    }
}
