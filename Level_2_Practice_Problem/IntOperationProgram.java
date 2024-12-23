//todo : Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
//! Hint => 
//! Create variables a, b, c of int data type.
//! Take user input for a, b, and c.
//! Compute 3 integer operations and assign result to a variable
//! Finally print the result and try to understand operator precedence.
//! I/P => fee, discountPrecent
//! O/P => The results of Int Operations are —-, -—, and —-

import java.util.Scanner;

public class IntOperationProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int operation1 = a+b*c;
        int operation2 = a*b+c;
        int operation3 = c+a/b;
        int operation4 = a%b+c;
        System.out.println("The result of Int Operations are " + operation1 + "," + operation2 +"," + operation3 + "," + operation4);

    }
}
