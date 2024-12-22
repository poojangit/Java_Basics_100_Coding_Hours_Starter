// todo : Fibonacci series is a special type of series in which the next term is the sum of the previous two terms.
//! For example, if 0 and 1 are the two previous terms in a series, then the next term will be 1(0+1).

import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibo(int n){
        int first = 0, second = 1;
        System.out.print(first);
        if(n > 1){
            System.out.print("," + second);
        }
        for(int i=3; i<=n; i++){
            int next = first + second;
            System.out.print("," + next);
            first = second;
            second = next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to end the fibonacci");
        int n = sc.nextInt();
        printFibo(n);
        
    }
}