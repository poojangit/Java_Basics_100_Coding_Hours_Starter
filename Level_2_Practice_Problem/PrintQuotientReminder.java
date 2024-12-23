//todo : Write a program to take 2 numbers and print their quotient and reminder
//! Hint => Use division operator (/) for quotient and moduli operator (%) for reminder
//! I/P => number1, number2
//! O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___

import java.util.Scanner;

public class PrintQuotientReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int quotient = num1/num2;
        int reminder = num1%num2;
        System.out.println("The quotient is " + quotient + " and Reminder is " + reminder + " of two numbers " + num1 + " and " + num2);
    }
}