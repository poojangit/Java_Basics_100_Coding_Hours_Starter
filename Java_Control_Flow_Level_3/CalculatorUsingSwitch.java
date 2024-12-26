//todo : Write a program to create a calculator using switch...case.
//! Hint => 
//! Create two double variables named first and second and a String variable named op.
//! Get input values for all variables.
//! The input for the operator can only be one of the four values: "+", "-", "*" or "/".
//! Run a for loop from i = 1 to i < number.
//! Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
//! If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
//! If op is neither of those 4 values, print Invalid Operator.

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.println("Enter a operator: ");
        String op = sc.next();
        sc.close();
        int add = 0;
        int sub = 0;
        int mul = 1;
        int div = 1;
        switch (op) {
            case "+":
                add = first+second;
                System.out.println("Addition of two numbers is " + add);
                break;
            case "-":
                sub = first-second;
                System.out.println("Substraction of two numbers is " + sub);
                break;
            case "*":
                mul = first*second;
                System.out.println("multiplication of two numbers is " + mul);
                break;
            case "/":
                div = first/second;
                System.out.println("Division of two numbers is " + div);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}
