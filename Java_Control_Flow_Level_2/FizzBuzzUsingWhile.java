//todo : Rewrite the program 5 FizzBuzz using while loop 

import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number range: ");
        int num = sc.nextInt();
        if (num>=0) {
            int i = 0;
            while (i<=num) {
                if(i%3==0 && i%5 == 0){
                    System.out.println("FizzBuzz");
                } else if(i%3 == 0){
                    System.out.println("Fizz");
                } else if(i%5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
    }
}
