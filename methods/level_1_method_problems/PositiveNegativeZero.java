package methods.level_1_method_problems;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static int checkPositiveNegative(int number) {
        if(number < 0) {
            return -1;
        }
         else if(number > 0){
            return 1;
         }
         else {
            return 0;
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("The entered number is ");
       if (checkPositiveNegative(number)==0) {
        System.out.println("Zero");
       }
       else if(checkPositiveNegative(number) == 1){
        System.out.println("Positive number");
       }
       else {
        System.out.println("Negative number");
       }

        sc.close();
    }
}
