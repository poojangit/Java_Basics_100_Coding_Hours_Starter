import java.util.Scanner;
// 3. Power Calculation
// Write a program that takes two numbers as input: a base and an exponent,
// and prints the result of base raised to the exponent (without using loops or
// conditionals).
public class PowerCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Base number : ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent : ");
        int expo = sc.nextInt();
        double result = Math.pow(base, expo);
        System.out.println("The result : " + result);
        sc.close();
    }
}