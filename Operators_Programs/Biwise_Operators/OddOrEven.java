//todo : program that determines if a number is odd or even using the bitwise AND operator

import java.util.Scanner;

public class OddOrEven {
    public static void checkOddEven(int n){
        if((n&1)==0){
            System.out.println(n + " is a even number");
        }
        else {
            System.out.println(n +  " is a odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        checkOddEven(n);
        sc.close();
    }
}