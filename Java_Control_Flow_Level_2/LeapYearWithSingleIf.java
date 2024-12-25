//todo : Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

import java.util.Scanner;

public class LeapYearWithSingleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year greater than 1582: ");
        int year = sc.nextInt();
        if(year>=1582){
            if(year%4==0 && year%100 != 0 || year%400 == 0){
                System.out.println("It is a leap year");
            } else{
                System.out.println("Not a leap year");
            }
        } 
        else {
            System.out.println("Please enter a year greater than 1582.");
        }
    }
}
