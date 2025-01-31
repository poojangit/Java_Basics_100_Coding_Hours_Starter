package methods.level_1_method_problems;
// Write a program to take 2 numbers and print their quotient and reminder
// Hint => 
// Take user input as integer
// Use division operator (/) for quotient and moduli operator (%) for reminder
// Write Method to find the reminder and the quotient of a number 
// public static int[] findRemainderAndQuotient(int number, int divisor) 
import java.util.Scanner;

public class QuotientAndRemainder {
    // method to find the remainder and quotient 
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number/divisor;
        int reminder = number%divisor;
        return new int[] {quotient, reminder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nEnter any two numbers : ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int[] result = findRemainderAndQuotient(number1, number2);
        System.out.println("The quotient is : " + result[0]);
        System.out.println("The remainder is " + result[1]);
        System.out.println();

        sc.close();
    }
}
