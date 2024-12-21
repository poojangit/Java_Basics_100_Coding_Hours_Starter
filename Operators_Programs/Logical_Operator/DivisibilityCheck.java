//todo : Check if the number is divisible by both 5 and 7

import java.util.Scanner;
public class DivisibilityCheck {
    public static boolean checkDivisible(int n){
        return n%5 == 0 && n%7 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(checkDivisible(n)){
            System.out.println("This number is divisible by both 5 & 7");
        }
        else {
            System.out.println("This number is not divisible");
        }
    }
}
