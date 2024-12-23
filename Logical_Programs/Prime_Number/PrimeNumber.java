//  todo : Prime Number
//! Just like the Perfect number, the Prime number is also a special type of number. When
// ! the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
// ! number. 0 and 1 are not counted as prime numbers. All the even numbers can be
// ! divided by 2, so 2 is the only even prime minister.

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}