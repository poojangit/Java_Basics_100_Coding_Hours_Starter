package methods;

import java.util.Scanner;

public class RecursiveExample {
    public static int factorial(int n){
        if(n==0){
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial : ");
        int number = sc.nextInt();
        System.out.println("The factorial of " + number + " is: " + factorial(number));

        sc.close();
    }
}
