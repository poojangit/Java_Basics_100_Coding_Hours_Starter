//todo: Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
//! Hint => 
//! Use infinite while loop as in while (true)
//! Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int userValue = sc.nextInt();
        double total = 0.0;
        while (true) {
            System.out.println("Enter 0 or negative to stop");
            userValue = sc.nextInt();
            
            if(userValue <= 0){
                break;
            }
            total += userValue;
        }
        System.out.println(total);
    }
}