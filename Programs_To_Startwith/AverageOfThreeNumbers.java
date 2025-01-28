import java.util.Scanner;
// 4. Calculate Average of Three Numbers
// Write a program that takes three numbers as input from the user and prints
// their average.
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;
        double average = sum /3 ;
        System.out.println("the average is " + average);
        sc.close();
    }
}
