// todo : Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
//! Hint => 
//! Spring Season is from March 20 to June 20

import java.util.Scanner;

public class SpringSeasonCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
        int month = sc.nextInt();
        System.out.println("enter a day");
        int day = sc.nextInt();
     
        if(month == 3  && day >= 20 && day <= 31 ||
        month == 4  && day >= 1 && day <= 30 ||
        month == 5  && day >= 1 && day <= 31 ||
        month == 6  && day >= 1 && day <= 20 ){
            System.out.println("It is a spring season");
        }
        else {
           System.err.println("not a spring season");
        }
    }
}