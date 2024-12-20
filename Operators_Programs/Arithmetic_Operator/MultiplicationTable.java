//todo : program that prints the multiplication table for the given number

import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplication(int n){
        int r = 0;
        for(int i=1; i<=10; i++){
           r = n*i;
           System.out.println(n + "*"+i + "=" + r);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        multiplication(n);
        sc.close();
    }
}
