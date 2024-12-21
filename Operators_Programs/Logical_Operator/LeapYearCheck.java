//todo : program to check if the given year is a leap year or not.

import java.util.Scanner;

public class LeapYearCheck {
    public static boolean checkLeap(int year){
        boolean isLeap = false;
       if((year % 4 == 0 && year % 100 != 0) || year %400 == 0){
        isLeap = true;
       }
     return isLeap;
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = sc.nextInt();
       if(checkLeap(year)){
        System.out.println(year + " is a leap year");
       } else {
        System.out.println(year + " is not a leap year");
       }
    }
}
